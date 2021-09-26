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
public class GetMedicineDetailsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GetMedicineDetailsController.class);

    @Autowired
    private MedicineRepository repository;

    /**
     * @param uniqueId - unique id to fetch data from database
     * @return list of medicines corresponding to the unique id
     */
    @GetMapping("/getMedicineDetails/{uniqueId}")
    public ResponseEntity<List<MedicineDetail>> getMedicineDetails(@PathVariable  final String uniqueId) {
        LOGGER.info("Request for unique id {}",uniqueId);

        ResponseEntity<List<MedicineDetail>> responseEntity = ResponseEntity.ok(repository.findByCode(uniqueId));

        LOGGER.info("API Response for getMedicineDetails {}",responseEntity.toString());

        return responseEntity;
    }
}
