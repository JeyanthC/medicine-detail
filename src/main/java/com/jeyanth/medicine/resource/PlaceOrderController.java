package com.jeyanth.medicine.resource;

import com.jeyanth.medicine.model.OrderDetail;
import com.jeyanth.medicine.repository.MedicineRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PlaceOrderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlaceOrderController.class);

    @Autowired
    private MedicineRepository repository;

    @PostMapping(value = "/placeOrder ", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void placeNewOrderForMedicine(@RequestBody final OrderDetail orderDetail){
        /*
         * Receive input as json
         * Sample input {
         * "c_unique_id": "XXX",
         * "quantity" : "10",
         * "c_name": "XXXX"
         * }
         *
         * Serialize JSON to OrderDetail object
         *
         * Check for item in the MedicineDetail document using c_unique_id
         *
         * Throw exception / bad request if medicine not found or quantity insufficient
         *
         * Insert new entry into OrderDetail document
         * Update MedicineDetail document to reduce the ordered quantity
         * Return autogenerated id which is the order id
         *
         */
    }


}