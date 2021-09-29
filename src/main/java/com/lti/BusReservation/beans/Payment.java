package com.lti.BusReservation.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT")
public class Payment {

	@Id
	@Column(name="TRX_ID")
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PAYMENT_SEQ")
	//@SequenceGenerator(name="PAYMENT_SEQ",sequenceName="PAYMENT_SEQ",allocationSize=1)
	// create sequence payment_seq increment by 1 start with 70001;
	private int trxId;
	
	@Column(name="COST")
	private int cost;
	
	@Column(name="PAYMENT_MODE")
	private String paymentMode;
	
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int trxId, int cost, String paymentMode) {
		super();
		this.trxId = trxId;
		this.cost = cost;
		this.paymentMode = paymentMode;
	}
	
	public Payment(int cost, String paymentMode) {
		super();
		this.cost = cost;
		this.paymentMode = paymentMode;
	}
	public int getTrxId() {
		return trxId;
	}
	public void setTrxId(int trxId) {
		this.trxId = trxId;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "Payment [trxId=" + trxId + ", cost=" + cost + ", payment_mode=" + paymentMode + "]";
	}
	
	
	
}