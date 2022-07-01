package com.jeyanth.medicine.repository;

import com.jeyanth.medicine.model.MedicineDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MedicineRepository extends MongoRepository<MedicineDetail, String> {

    /**
     * @param name - Medicine name that has to be queried
     * @return the list of medicines that match the medicine name parameter input
     */
    @Query("{'c_name': /.*?0.*/} ")
    List<MedicineDetail> findByName(String name); // Fetch list of medicines by medicine name  - allows for partial strings

    @Query("{'c_unique_code': ?0}")
    List<MedicineDetail> findByCode(String uniqueId); //Fetch list of medicines from database using Unique IDs


}