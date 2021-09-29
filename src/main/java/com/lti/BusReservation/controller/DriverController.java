package com.lti.BusReservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.BusReservation.beans.Driver;
import com.lti.BusReservation.services.DriverServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/driverhr")
public class DriverController {
	@Autowired
	private DriverServiceImpl driverService;
	
	
	//http:localhost:8282/hr/hello
	
	
//	@GetMapping("/hello")
//	public String sayHello1()
//	{
//		
//		return "hello check 1";
//		
//	}
	
//	http://localhost:8040/driverhr/drivers
	@GetMapping("/drivers")
	public List<Driver>  getUserList()
	{
	List<Driver> driverList=driverService.getDriverList();
	
	System.out.println(driverList);
	
	return driverList;
		
	}
	
	@GetMapping("/driver/{id}")
	public Driver getUser(@PathVariable(value="id") int driverId)
	{
		
		return driverService.getDriverInfo(driverId);
	}
	
	@PostMapping("/addDriver")
	public void addDriverDetail(@RequestBody Driver d)
	{
		driverService.addDriver(d);	
	}
}