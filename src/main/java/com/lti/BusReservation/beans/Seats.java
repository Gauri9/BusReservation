package com.lti.BusReservation.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SEATS")
public class Seats {
	
	@Id
	@Column(name="SEAT_ID")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEATS_SEQ")
//	@SequenceGenerator(name="SEAT_BOOKING_SEQ",sequenceName="SEATS_SEQ",allocationSize=1)
	private int seatId;
	
	@Column(name="SEAT_NO")
	private int seatNo;
	
	@Column(name="SEAT_TYPE")
	private String seatType;
	
	//@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="ticket_no")
	@Column(name="ticket_no")
	private int ticketNo;
	
	public Seats(int seat_no, String seat_type, int ticket_no) {
		super();
		this.seatNo = seat_no;
		this.seatType = seat_type;
		this.ticketNo = ticket_no;
	}

	public Seats() {
		super();
	}

	public Seats(int seat_id, int seat_no, String seat_type, int ticket_no) {
		super();
		this.seatId = seat_id;
		this.seatNo = seat_no;
		this.seatType = seat_type;
		this.ticketNo = ticket_no;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seat_id) {
		this.seatId = seat_id;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seat_no) {
		this.seatNo = seat_no;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seat_type) {
		this.seatType = seat_type;
	}

	public int getTicketNo() {
		return this.ticketNo;
	}

	public void setTicketNo(int ticket_no) {
		this.ticketNo = ticket_no;
	}
	
	

}