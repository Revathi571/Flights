package com.example.flights.repository;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.example.flights.model.FlightModel;
@Repository
public class FlightRepository {

//	public  FlightRepository (SqlSession sqlSession) {
//	super(sqlSession, "flight.mapper.flightmapper");
//		
//	}
	
	public List<FlightModel> fltsearch(FlightModel requestModel) throws  Exception{
		return (List<FlightModel>) requestModel ;
	}

	public List<FlightModel> Delflight(FlightModel requestModel) throws  Exception{
		return fetchList("delerefltdata",requestModel);
	}

	private List<FlightModel> fetchList(String string, FlightModel requestModel) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<FlightModel> fltsave(FlightModel requestModel) throws  Exception{ 
		return fetchList("",requestModel);
	}

	public List<FlightModel> fltcreate(FlightModel requestModel) throws  Exception{ 
		return fetchList("",requestModel);
	}

}
