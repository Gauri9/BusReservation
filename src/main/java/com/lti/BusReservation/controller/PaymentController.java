package com.lti.BusReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.BusReservation.beans.Driver;
import com.lti.BusReservation.beans.Payment;
import com.lti.BusReservation.services.PaymentServiceImpl;
import com.lti.BusReservation.services.SeatsServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/paymentshr")
public class PaymentController {
	@Autowired
	private PaymentServiceImpl paymentService;
	
	//http:localhost:8282/paymentshr/hello
	@GetMapping("/hello")
	public String sayHello1()
	{
		
		return "hello check 1";
		
	}
	
	@PostMapping("/addPayment")
	public void addPayment(@RequestBody Payment p)
	{
		paymentService.addPayment(p);	
	}
	
	@GetMapping("/payment/{id}")
	public Payment getUser(@PathVariable(value="id") int trxId)
	{
		
		return paymentService.getPayment(trxId);
	}

}