package com.jeyanth.medicine.service;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.jeyanth.medicine.model.MedicineDetail;
import com.jeyanth.medicine.repository.MedicineRepository;
import com.jeyanth.medicine.utils.CSVUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;
import java.util.Objects;

@Service
public class PostCSVFileService {

    List<MedicineDetail> medicineDetailList;

    private static final String STRING_TO_RETURN = "Pls return fine";

    @Autowired
    private MedicineRepository repository;



    public String uploadFile(InputStream csvFile){
        medicineDetailList = CSVUtils.read(MedicineDetail.class,csvFile);

        medicineDetailList.stream().filter(Objects::nonNull).forEach(medicineDetail -> repository.save(medicineDetail));

        return STRING_TO_RETURN;

    }


//    private List<MedicineDetail> fetchMedicineDetailsFromFile(MultipartFile filename) throws Exception {
//        CsvSchema orderLineSchema = CsvSchema.emptySchema().withHeader();
//        CsvMapper csvMapper = new CsvMapper();
//        MappingIterator<MedicineDetail> orderLines = csvMapper.readerFor(MedicineDetail.class)
//                .with(orderLineSchema)
//                .readValues(filename.getBytes());
//
//        return orderLines.readAll();
//
//    }


}
