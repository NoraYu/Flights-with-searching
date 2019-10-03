package com.example.demo;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Long> {
    ArrayList<Flight> findByAirline(String airline);
    ArrayList<Flight> findByArrivalairport(String arrivalairport);
    ArrayList<Flight> findByLeavingairport(String leavingairport);
    //ArrayList<Flight> findByLeaving_airportAndarrivalairport(String leavingairportString, arrivalairport);


}