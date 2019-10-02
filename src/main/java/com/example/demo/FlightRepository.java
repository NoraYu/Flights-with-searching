package com.example.demo;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Long> {
    ArrayList<Flight> findByAirline(String airline);
    ArrayList<Flight> findByArrival_airport(String arrival_airport);
    ArrayList<Flight> findByLeaving_airport(String leaving_airport);
    //ArrayList<Flight> findByLeaving_airportAndArrival_airport(String leaving_airportString, arrival_airport);


}