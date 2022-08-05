package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.FlightDTO;
import com.example.model.Flight;
import com.example.repo.FlightRepo;

@Service
public class FlightService {
	@Autowired
	private FlightRepo repo;
	private ModelMapper mapper;
	
	public FlightService(FlightRepo repo,ModelMapper mapper) {
		super();
		this.repo=repo;
		this.mapper = mapper;
	}
	private FlightDTO mapToDTO(Flight flight) {
		return this.mapper.map(flight, FlightDTO.class);
	}

	public FlightDTO addFlight(Flight flight) {
		Flight saved = this.repo.save(flight);
		return this.mapToDTO(saved);
	}

	public List<FlightDTO> getAllFlight() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}

	public FlightDTO updateFlight(int id, Flight newFlight) {
		Optional<Flight> existingOptional = this.repo.findById(id);
		Flight existing = existingOptional.get();

		existing.setFlightNumber(newFlight.getFlightNumber());
		existing.setDepartureDate(newFlight.getDepartureDate());
		existing.setDepartureAirport(newFlight.getDepartureAirport());
		existing.setDestinationAirport(newFlight.getDestinationAirport());
		existing.setDepartureTime(newFlight.getDepartureTime());
		existing.setArrivalTime(newFlight.getArrivalTime());

		Flight updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}

	public boolean removeFlight(int id) {
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}

}

