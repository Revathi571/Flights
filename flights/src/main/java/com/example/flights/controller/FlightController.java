package com.example.flights.controller;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.flights.model.FlightModel;
import com.example.flights.service.FlightService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class FlightController {
	//constructor we have to initilize
	
	private FlightService flightservice;

//search api
	@PostMapping("/flight/search")
	public FlightModel search(
		@RequestBody @Validated FlightModel requestModel)throws Exception{
		//log.info("Search api");
	List<FlightModel> resultlist=this.flightservice.searchservice(requestModel)	;
	return (FlightModel) resultlist;
	}
	
//DELETE api
		@PostMapping("/flight/delete")
		public FlightModel Delete(
			@RequestBody @Validated FlightModel requestModel, FlightModel Boolean)throws Exception{
			//log.info("delete api");
		List<FlightModel> resultlist=this.flightservice.deleteservice(requestModel)	;
		return Boolean;
		}
		
	
//create api
		@PostMapping("/flight/create")
		public FlightModel create(
			@RequestBody @Validated FlightModel requestModel, FlightModel Boolean)throws Exception{
			//log.info("create api");
		List<FlightModel> resultlist=this.flightservice.createservice(requestModel)	;
		return (FlightModel) resultlist;
		}	
		
// save api
		@PostMapping("/flight/save")
		public FlightModel save(
			@RequestBody @Validated FlightModel requestModel, FlightModel Boolean)throws Exception{
			//log.info("save api");
		List<FlightModel> resultlist=this.flightservice.saveservice(requestModel)	;
		return (FlightModel) resultlist;
		}
		
}
		
		
