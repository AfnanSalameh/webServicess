package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Table ;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table
public class product {
    @Id
    private int prodectID;
    @Column
    private int userID;
    @Column
    private int price;
    @Column
    private String catogery;
    @Column
    private int zip_code;
    @Column
    private String product_name;
    @Column
    private String description;

    public product(){

    }
    public product(int prodectID, int userID, int price, String catogery, int zip_code, String product_name, String description) {
        this.prodectID = prodectID;
        this.userID = userID;
        this.price = price;
        this.catogery = catogery;
        this.zip_code = zip_code;
        this.product_name = product_name;
        this.description = description;
    }

    public int getProdectID() {
        return prodectID;
    }

    public void setProdectID(int prodectID) {
        this.prodectID = prodectID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCatogery() {
        return catogery;
    }

    public void setCatogery(String catogery) {
        this.catogery = catogery;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
