package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.FlightDTO;
import com.example.model.Flight;
import com.example.service.FlightService;


@RestController
@RequestMapping(value = "/flight")
public class FlightController {
	@Autowired
	private FlightService service;

	public FlightController(FlightService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public FlightDTO create(@RequestBody Flight flight) {
		return this.service.addFlight(flight);
	}

	@GetMapping("/read")
	public List<FlightDTO> getList() {
		return this.service.getAllFlight();
	}
	@PutMapping("/update/{id}")
	public FlightDTO update(@PathVariable int id, @RequestBody Flight flight)
	{
		return this.service.updateFlight(id, flight);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		this.service.removeFlight(id);
	}
	
}

