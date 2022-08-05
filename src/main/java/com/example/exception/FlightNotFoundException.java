package com.example.exception;

import javax.persistence.EntityNotFoundException;

public class FlightNotFoundException extends EntityNotFoundException{
	public FlightNotFoundException( ) {}
	public FlightNotFoundException(String msg) {
		super(msg);
	}
}
