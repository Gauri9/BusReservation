package com.lti.BusReservation.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="FEEDBACKS")
public class Feedback {

	@Id
	@Column(name="FEEDBACK_ID")
	private int feedbackId;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="RATING")
	private int rating;
	
	//@OneToOne(fetch=FetchType.EAGER)
//	@JoinColumn(name="email")
//	private UserDetail ud;

//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="ticket_no")
//	private Booking booking;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Feedback(int feedbackId, String description, int rating) {
		super();
		this.feedbackId = feedbackId;
		this.description = description;
		this.rating = rating;
	
	}


	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	

	
	
}