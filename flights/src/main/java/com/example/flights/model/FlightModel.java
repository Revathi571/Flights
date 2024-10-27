package com.example.flights.model;

import java.time.LocalDate;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;

@SpringBootApplication
@Data

public class FlightModel {

	
	private int id;
	private String fltno;
	private int fltcost;
	private LocalDate scheduledFromdate;
	private LocalDate scheduledTomdate;
	private double luggage;
}
