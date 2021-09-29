package com.lti.BusReservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.BusReservation.beans.Payment;
import com.lti.BusReservation.dao.PaymentDao;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentDao paydao;
	
	
	public String addPayment(Payment p) {
		// TODO Auto-generated method stub
		return paydao.addPayment(p);
	}

	
	public Payment getPayment(int trx_id) {
		// TODO Auto-generated method stub
		return paydao.getPayment(trx_id);
	}

}