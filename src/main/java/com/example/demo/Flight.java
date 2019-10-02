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
    private Date leaving_date;
    private String leaving_airport;
    private String arrival_airport;
    private double price;
    private String airline;

    public Flight(){}
    public Flight(Date leaving_date, String leaving_airport, String arrival_airport, double price,String airline){
     this.leaving_date=leaving_date;
     this.arrival_airport=arrival_airport;
     this.leaving_airport=leaving_airport;
     this.price=price;
     this.airline=airline;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getLeaving_date() {
        return leaving_date;
    }

    public void setLeaving_date(Date leaving_date) {
        this.leaving_date = leaving_date;
    }

    public String getLeaving_airport() {
        return leaving_airport;
    }

    public void setLeaving_airport(String leaving_airport) {
        this.leaving_airport = leaving_airport;
    }

    public String getArrival_airport() {
        return arrival_airport;
    }

    public void setArrival_airport(String arrival_airport) {
        this.arrival_airport = arrival_airport;
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
