package com.lti.BusReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.BusReservation.beans.Feedback;
import com.lti.BusReservation.beans.UserDetail;
import com.lti.BusReservation.services.FeedbackServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/hr")
public class FeedbackController {
	
	@Autowired
	private FeedbackServiceImpl feedbackService;
	
	
	@GetMapping("/feedback/{feedbackId}")
	public Feedback getFeedbackById(@PathVariable(value="feedbackId") int feedbackId)
	{
		
		return feedbackService.getFeedbackById(feedbackId);
	}
	
	@PostMapping("/addFeedback")
	public void addFeedback(@RequestBody Feedback f)
	{
		feedbackService.addFeedback(f);	
	}
	
	
}