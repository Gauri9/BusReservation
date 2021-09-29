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

import com.lti.BusReservation.beans.BusDetail;
import com.lti.BusReservation.services.BusDetailService;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/bus")
public class BusDetailController {
	
	@Autowired
	BusDetailService busDetailService;
	
//	http://localhost:8040/bus/hello
		@GetMapping("/hello")
		public String sayHello() {
			return "HELLO";
		}
	
//		http://localhost:8040/bus/busdetail/101
		@GetMapping("/busdetail/{id}")
		public BusDetail getBusDetail(@PathVariable(value="id") int bus_id) {
			return busDetailService.getBusDetail(bus_id);
		}
		
//			http://localhost:8040/bus/allbuses
			@GetMapping("/allbuses")
			public List<BusDetail> getAllBuses() {
				System.out.println("\ncontroller=====" + busDetailService.getAllBuses() + "\n");
				return busDetailService.getAllBuses();
			}
			
//			http://localhost:8040/bus/addbusdetail
			@PostMapping("/addbusdetail")
			public String addBusDetail(@RequestBody BusDetail b) {
				return busDetailService.addBusDetail(b);
			}
	
//			http://localhost:8040/bus/search/Mumbai/Goa
			@GetMapping("/search/{from}/{to}")
			public List<BusDetail> searchBuses(@PathVariable(value="from") String src, @PathVariable(value="to") String dest){
		
				List<BusDetail> busList=busDetailService.getBusList(src,dest);
				System.out.println(busList);
				return busList;
			}
	
}
