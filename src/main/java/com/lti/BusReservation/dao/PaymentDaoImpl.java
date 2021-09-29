package com.lti.BusReservation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.BusReservation.beans.Payment;

@Repository
public class PaymentDaoImpl implements PaymentDao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Transactional
	public String addPayment(Payment p) {
		em.persist(p);
		return "record added";
		
	}

	
	@Transactional
	public Payment getPayment(int trxId) {
		Payment paymentObj=em.find(Payment.class,trxId);
		return paymentObj;
		
	}

}