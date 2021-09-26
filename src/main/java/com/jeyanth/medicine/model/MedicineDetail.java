package com.jeyanth.medicine.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MedicineDetail")
public class MedicineDetail {

    private String c_name;
    private String c_batch_no;
    private String d_expiry_date;
    private String n_balance_qty;
    private String c_packaging;
    private String c_unique_code;
    private String c_schemes;
    private String n_mrp;
    private String c_manufacturer;
    private String hsn_code;

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_batch_no() {
        return c_batch_no;
    }

    public void setC_batch_no(String c_batch_no) {
        this.c_batch_no = c_batch_no;
    }

    public String getD_expiry_date() {
        return d_expiry_date;
    }

    public void setD_expiry_date(String d_expiry_date) {
        this.d_expiry_date = d_expiry_date;
    }

    public String getN_balance_qty() {
        return n_balance_qty;
    }

    public void setN_balance_qty(String n_balance_qty) {
        this.n_balance_qty = n_balance_qty;
    }

    public String getC_packaging() {
        return c_packaging;
    }

    public void setC_packaging(String c_packaging) {
        this.c_packaging = c_packaging;
    }

    public String getC_unique_code() {
        return c_unique_code;
    }

    public void setC_unique_code(String c_unique_code) {
        this.c_unique_code = c_unique_code;
    }

    public String getC_schemes() {
        return c_schemes;
    }

    public void setC_schemes(String c_schemes) {
        this.c_schemes = c_schemes;
    }

    public String getN_mrp() {
        return n_mrp;
    }

    public void setN_mrp(String n_mrp) {
        this.n_mrp = n_mrp;
    }

    public String getC_manufacturer() {
        return c_manufacturer;
    }

    public void setC_manufacturer(String c_manufacturer) {
        this.c_manufacturer = c_manufacturer;
    }

    public String getHsn_code() {
        return hsn_code;
    }

    public void setHsn_code(String hsn_code) {
        this.hsn_code = hsn_code;
    }

    @Override
    public String toString() {
        return "MedicineDetail{" +
                "c_name='" + c_name + '\'' +
                ", c_batch_no='" + c_batch_no + '\'' +
                ", d_expiry_date='" + d_expiry_date + '\'' +
                ", n_balance_qty='" + n_balance_qty + '\'' +
                ", c_packaging='" + c_packaging + '\'' +
                ", c_unique_code='" + c_unique_code + '\'' +
                ", c_schemes='" + c_schemes + '\'' +
                ", n_mrp='" + n_mrp + '\'' +
                ", c_manufacturer='" + c_manufacturer + '\'' +
                ", hsn_code='" + hsn_code + '\'' +
                '}';
    }
}
