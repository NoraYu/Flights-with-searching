package com.example.demo;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Long> {
    ArrayList<Flight> findByAirline(String airline);
}
