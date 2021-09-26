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
public class GetSearchMedicineController {


    @Autowired
    private MedicineRepository repository;

    /**
     * @param medicineName - Medicine name to fetch records from DB
     * @return Response with fetched data in response body
     */
    @GetMapping("/searchMedicine/{medicineName}")
    public ResponseEntity<List<MedicineDetail>> searchMedicines(@PathVariable String medicineName) {
        return ResponseEntity.ok(repository.findByName(medicineName));
    }

}