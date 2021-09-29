package com.lti.BusReservation.dao;

import com.lti.BusReservation.beans.Feedback;

public interface FeedbackDao {
	
	public abstract String addFeedback(Feedback f);
	public abstract Feedback getFeedbackById(int feedbackId);

}
