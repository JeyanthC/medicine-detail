package com.jeyanth.medicine.resource;

import com.jeyanth.medicine.model.MedicineDetail;
import com.jeyanth.medicine.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetMedicineDetailsController {

    @Autowired
    private MedicineRepository repository;

    /**
     * @param uniqueId - unique id to fetch data from database
     * @return list of medicines corresponding to the unique id
     */
    @GetMapping("/getMedicineDetails/{uniqueId}")
    public ResponseEntity<List<MedicineDetail>> searchMedicines(@PathVariable String uniqueId) {

        return ResponseEntity.ok(repository.findByCode(uniqueId));
    }
}
