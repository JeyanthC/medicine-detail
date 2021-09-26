package com.jeyanth.medicine.resource;

import com.jeyanth.medicine.model.MedicineDetail;
import com.jeyanth.medicine.repository.MedicineRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetSearchMedicineController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GetSearchMedicineController.class);

    @Autowired
    private MedicineRepository repository;

    /**
     * @param medicineName - Medicine name to fetch records from DB
     * @return Response with fetched data in response body
     */
    @GetMapping("/searchMedicine/{medicineName}")
    public ResponseEntity<List<MedicineDetail>> searchMedicines(@PathVariable final String medicineName) {
        LOGGER.info("Request for medicineName {}",medicineName);

        ResponseEntity<List<MedicineDetail>> responseEntity = ResponseEntity.ok(repository.findByName(medicineName));
        LOGGER.info("API Response for searchMedicines {}",responseEntity.toString());

        return responseEntity;
    }

}