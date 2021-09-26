package com.jeyanth.medicine.resource;


import com.jeyanth.medicine.model.MedicineDetail;
import com.jeyanth.medicine.service.PostCSVFileService;
import com.jeyanth.medicine.utils.CSVUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

@RestController
public class PostCSVFileController {

    private ResponseEntity responseEntity;

    @Autowired
    private PostCSVFileService fileService;

    @PostMapping(value = "/uploadCsV/", consumes = "text/csv")

    public ResponseEntity addCsvToDB(@RequestParam InputStream csvFile) {

        return ResponseEntity.ok(fileService.uploadFile(csvFile));

    }
}
