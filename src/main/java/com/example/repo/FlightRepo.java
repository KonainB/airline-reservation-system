package com.example.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Flight;


@Repository
public interface FlightRepo extends JpaRepository<Flight,Integer>{


	

}

