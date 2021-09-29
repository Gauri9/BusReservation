package com.lti.BusReservation.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BUS_DETAIL")
public class BusDetail {
	
	@Id
	@Column(name="BUS_ID")
	private int busId;
	
	@Column(name="NO_OF_SEATS")
	private int noOfSeats;
	
	@Column(name="SOURCE")
	private String source;
	
	@Column(name="DESTINATION")
	private String destination;
	
	@Column(name="DAY")
	private String day;
	
	@Column(name="TIME")
	private String time;
	
	@Column(name="TICKET_PRICE")
	private int ticketPrice;
	
	@Column(name="DRIVER_ID")
	private int driverId;

	public BusDetail() {
		super();
	}

	public BusDetail(int busId, int noOfSeats, String source, String destination, String day, String time,
			int ticketPrice, int driverId) {
		super();
		this.busId = busId;
		this.noOfSeats = noOfSeats;
		this.source = source;
		this.destination = destination;
		this.day = day;
		this.time = time;
		this.ticketPrice = ticketPrice;
		this.driverId = driverId;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	@Override
	public String toString() {
		return "BusDetail [busId=" + busId + ", noOfSeats=" + noOfSeats + ", source=" + source + ", destination="
				+ destination + ", day=" + day + ", time=" + time + ", ticketPrice=" + ticketPrice + ", driverId="
				+ driverId + "]";
	}
	
	

}
