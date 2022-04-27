package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Table ;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Table
public class supplier {
    @Id
    @Column
    private int supplier_id;
    @Column
    private String email;
    @Column
    private String s_name;
    @Column
    private int phone;

    public supplier(int supplier_id, String email, String s_name, int phone) {
        this.supplier_id = supplier_id;
        this.email = email;
        this.s_name = s_name;
        this.phone = phone;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
