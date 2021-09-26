package com.jeyanth.medicine.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "OrderDetail")
public class OrderDetail {


    private String c_unique_id;
    private String c_name;
    private String quantity;


    public String getC_unique_id() {
        return c_unique_id;
    }

    public void setC_unique_id(String c_unique_id) {
        this.c_unique_id = c_unique_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "c_unique_id='" + c_unique_id + '\'' +
                ", c_name='" + c_name + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
