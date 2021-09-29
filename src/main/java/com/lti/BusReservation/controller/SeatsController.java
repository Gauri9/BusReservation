package com.lti.BusReservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.BusReservation.beans.Driver;
import com.lti.BusReservation.beans.Seats;
import com.lti.BusReservation.beans.UserDetail;
import com.lti.BusReservation.services.DriverServiceImpl;
import com.lti.BusReservation.services.SeatsServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/seatshr")
public class SeatsController {
	@Autowired
	private SeatsServiceImpl seatsService;
	
	//http:localhost:8282/driverhr/hello
	
	
		@GetMapping("/hello")
		public String sayHello1(){
			
			return "hello check 1";
			
		}
		
		@GetMapping("/seats")
		public List<Seats> getSeatsList()
		{
		List<Seats> seatsList=seatsService.getSeatsList();
		
		System.out.println(seatsList);
		
		return seatsList;
			
		}
}