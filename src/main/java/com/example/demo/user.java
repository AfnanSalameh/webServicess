package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Table ;
import javax.persistence.Entity;
import javax.persistence.Id;

@Table
@Entity
public class user {

    @Id
    private int userID;
    @Column
    private int phone_number;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String address;
    @Column
    private int visa_card;


    public user(int userID, int phone_number, String password, String email, String first_name, String last_name, String address, int visa_card) {
        this.userID = userID;
        this.phone_number = phone_number;
        this.password = password;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.visa_card = visa_card;
    }

    public user() {

    }

    public int getUserID() {
        return userID;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAddress() {
        return address;
    }

    public int getVisa_card() {
        return visa_card;
    }
}






