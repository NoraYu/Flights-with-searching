package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date leavingdate;
    private String leavingairport;
    private String arrivalairport;
    private double price;
    private String airline;

    public Flight(){}
    public Flight(Date leavingdate, String leavingairport, String arrivalairport, double price,String airline){
     this.leavingdate=leavingdate;
     this.arrivalairport=arrivalairport;
     this.leavingairport=leavingairport;
     this.price=price;
     this.airline=airline;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getLeavingdate() {
        return leavingdate;
    }

    public void setLeavingdate(Date leavingdate) {
        this.leavingdate = leavingdate;
    }

    public String getLeavingairport() {
        return leavingairport;
    }

    public void setLeavingairport(String leavingairport) {
        this.leavingairport = leavingairport;
    }

    public String getArrivalairport() {
        return arrivalairport;
    }

    public void setArrivalairport(String arrivalairport) {
        this.arrivalairport = arrivalairport;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
}
