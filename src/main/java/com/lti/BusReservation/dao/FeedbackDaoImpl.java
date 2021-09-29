package com.lti.BusReservation.dao;

import javax.persistence.*;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.BusReservation.beans.Feedback;

@Repository
public class FeedbackDaoImpl implements FeedbackDao {

	@PersistenceContext
	private EntityManager em;
	

	@Override
	@Transactional
	public String addFeedback(Feedback f) {
		// TODO Auto-generated method stub
		em.persist(f);
		return "record added";
	}


	@Override
	@Transactional
	public Feedback getFeedbackById(int feedbackId) {
		// TODO Auto-generated method stub
		Feedback fbObj=em.find(Feedback.class,feedbackId);
		return fbObj;
	}

}