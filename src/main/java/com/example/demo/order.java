package com.example.demo;
import javax.persistence.Table ;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Date;

public class order {
    private int OrderID;
    private int userID;
    private int total_price;
    private Date order_date;
    private Date received_date;

    public order(int orderID, int userID, int total_price, Date order_date, Date received_date) {
        OrderID = orderID;
        this.userID = userID;
        this.total_price = total_price;
        this.order_date = order_date;
        this.received_date = received_date;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getReceived_date() {
        return received_date;
    }

    public void setReceived_date(Date received_date) {
        this.received_date = received_date;
    }
}
