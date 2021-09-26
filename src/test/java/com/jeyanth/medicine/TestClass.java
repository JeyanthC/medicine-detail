//package com.jeyanth.medicine;
//
//import com.fasterxml.jackson.databind.MappingIterator;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.*;
//import com.fasterxml.jackson.databind.SerializationFeature;
//import com.jeyanth.medicine.model.MedicineDetail;
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVParser;
//
//import com.fasterxml.jackson.dataformat.csv.*;
//
//import java.io.*;
//import java.util.List;
//import java.util.Map;
//import java.util.regex.Pattern;
//import java.util.stream.Collectors;
//
//public class TestClass {
//
//    public static void main(String[] args) throws IOException {
//
//
//        CsvSchema orderLineSchema = CsvSchema.emptySchema().withHeader();
//        CsvMapper csvMapper = new CsvMapper();
//        MappingIterator<MedicineDetail> orderLines = csvMapper.readerFor(MedicineDetail.class)
//                .with(orderLineSchema)
//                .readValues(new File("src/test/resources/__files/test.csv"));
//
//        List<MedicineDetail> medicineListFromCSV = orderLines.readAll();
//
//        System.out.println(medicineListFromCSV.get(0).getC_unique_code());
//
//
//    }
//}
