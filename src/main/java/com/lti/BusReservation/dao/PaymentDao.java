package com.lti.BusReservation.dao;

import java.util.List;

import com.lti.BusReservation.beans.Payment;

public interface PaymentDao {

	public abstract String addPayment(Payment p);
	public abstract Payment getPayment(int trx_id);
}