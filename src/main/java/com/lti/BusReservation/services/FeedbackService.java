package com.lti.BusReservation.services;

import com.lti.BusReservation.beans.Feedback;

public interface FeedbackService {
	public abstract String addFeedback(Feedback f);
	public abstract Feedback getFeedbackById(int feedbackId);

}
