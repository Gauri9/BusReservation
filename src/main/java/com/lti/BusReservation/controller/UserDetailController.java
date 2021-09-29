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

import com.lti.BusReservation.beans.UserDetail;
import com.lti.BusReservation.services.UserDetailServiceImpl;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/hr")
public class UserDetailController {
	
	@Autowired
	private UserDetailServiceImpl userDetailService;
	
	
	//http:localhost:8282/hr/hello
	
	
	@GetMapping("/hello")
	public String sayHello1()
	{
		
		return "hello check 1";
		
	}
	
	@GetMapping("/users")
	public List<UserDetail>  getUserList()
	{
	List<UserDetail> userList=userDetailService.getUserList();
	
	System.out.println(userList);
	
	return userList;
		
	}
	
	@GetMapping("/user/{email}")
	public UserDetail getUser(@PathVariable(value="email") String email)
	{
		
		return userDetailService.getUser(email);
	}
	
	@PostMapping("/addUser")
	public void addUserDetail(@RequestBody UserDetail p)
	{
		userDetailService.addUserDetail(p);	
	}	
	
	@PostMapping(path="/updateUser/{email}/{password}")
	public UserDetail updateUserDetail(@PathVariable(value="email") String email,@PathVariable(value="password") String password) {
		
		return userDetailService.updateUserDetail(email,password);

	}
}