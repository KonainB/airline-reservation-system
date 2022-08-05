package com.example.dto;


public class FlightDTO {
	private int Id;
    private String flightNumber;
    private String departureDate;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;
    private String arrivalTime;
    
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public FlightDTO(int id, String flightNumber, String departureDate, String departureAirport,
			String destinationAirport, String departureTime, String arrivalTime) {
		super();
		Id = id;
		this.flightNumber = flightNumber;
		this.departureDate = departureDate;
		this.departureAirport = departureAirport;
		this.destinationAirport = destinationAirport;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	public FlightDTO() {
		super();
	}

}
