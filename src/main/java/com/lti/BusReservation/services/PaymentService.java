package com.lti.BusReservation.services;

import java.util.List;

import com.lti.BusReservation.beans.Payment;

public interface PaymentService {
	public abstract String addPayment(Payment p);
	public abstract Payment getPayment(int trx_id);
}