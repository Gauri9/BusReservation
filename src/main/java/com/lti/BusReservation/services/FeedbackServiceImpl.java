package com.lti.BusReservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.BusReservation.beans.Feedback;
import com.lti.BusReservation.dao.FeedbackDao;

@Service("feedbackService")
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired
	private FeedbackDao feedbackdao;
	


	@Override
	public String addFeedback(Feedback f) {
		// TODO Auto-generated method stub
		return feedbackdao.addFeedback(f);
	}


	@Override
	public Feedback getFeedbackById(int feedbackId) {
		// TODO Auto-generated method stub
		return feedbackdao.getFeedbackById(feedbackId);
	}

}