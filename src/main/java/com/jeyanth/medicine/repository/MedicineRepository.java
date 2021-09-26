package com.jeyanth.medicine.repository;

import com.jeyanth.medicine.model.MedicineDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface MedicineRepository extends MongoRepository<MedicineDetail, String> {

    @Query("{'c_name': /.*?0.*/} ")
    List<MedicineDetail> findByName(String name);

    @Query("{'c_unique_code': ?0}")
    List<MedicineDetail> findByCode(String uniqueId);



}
