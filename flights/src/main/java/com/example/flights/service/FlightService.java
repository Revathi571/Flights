package com.example.flights.service;

import java.util.List;

import com.example.flights.model.FlightModel;
import com.example.flights.repository.FlightRepository;

public class FlightService {

	private FlightRepository flightrepository;

	public List<FlightModel> searchservice(FlightModel requestModel) 
		throws Exception{
			List<FlightModel>fltsearch=flightrepository.fltsearch(requestModel);
			return null;
		}

	public List<FlightModel> deleteservice(FlightModel requestModel) throws Exception{
		List<FlightModel>fltsearch=flightrepository.Delflight(requestModel);
		return null;
	}

	public List<FlightModel> createservice(FlightModel requestModel) 
		throws Exception{
			List<FlightModel>fltsearch=flightrepository.fltcreate(requestModel);
			return null;
		}

	
	public List<FlightModel> saveservice(FlightModel requestModel) 
		throws Exception{
			List<FlightModel>fltsearch=flightrepository.fltsave(requestModel);
			return null;
		}
	}

