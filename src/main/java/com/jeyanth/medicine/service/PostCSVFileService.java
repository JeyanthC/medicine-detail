package com.jeyanth.medicine.service;

import com.jeyanth.medicine.model.MedicineDetail;
import com.jeyanth.medicine.repository.MedicineRepository;
import com.jeyanth.medicine.resource.PostCSVFileController;
import com.jeyanth.medicine.utils.CSVUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Objects;

@Service
public class PostCSVFileService {

    private static final String RETURN_RESPONSE = " records uploaded to database";

    Logger LOGGER = LoggerFactory.getLogger(PostCSVFileService.class);

    private StringBuilder responseToReturn = new StringBuilder();
    private long recordCount = 0;

    @Autowired
    private MedicineRepository repository;


    /**
     * @param csvFile - Input file for data upload
     * @return message containing number of records uploaded if successful
     */
    public String uploadFile(MultipartFile csvFile) {
        List<MedicineDetail> medicineDetailList;

        try {
            medicineDetailList = CSVUtils.read(MedicineDetail.class, csvFile.getInputStream());
            recordCount = medicineDetailList.stream().count();
            medicineDetailList.stream().filter(Objects::nonNull).forEach(medicineDetail -> repository.save(medicineDetail));
        } catch (Exception exp) {
            LOGGER.error("Unable to upload file to the database {}",exp.getMessage());
        }

        return responseToReturn.append(recordCount).append(RETURN_RESPONSE).toString();

    }


}