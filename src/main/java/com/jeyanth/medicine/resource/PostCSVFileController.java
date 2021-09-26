package com.jeyanth.medicine.resource;


import com.jeyanth.medicine.service.PostCSVFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class PostCSVFileController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PostCSVFileController.class);
    private ResponseEntity responseEntity;
    @Autowired
    private PostCSVFileService fileService;

    /**
     * @param file - CSV file containing the list of records to be uplaaded to the database
     * @return - respone with count of records uploaded
     */
    @PostMapping(value = "/uploadCsV", consumes = "multipart/form-data")

    public ResponseEntity addCsvToDB(@RequestPart("file") MultipartFile file) {

        LOGGER.info("Begin Upload file to DB");
        return ResponseEntity.ok(fileService.uploadFile(file));

    }
}
