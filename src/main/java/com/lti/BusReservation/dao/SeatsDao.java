package com.lti.BusReservation.dao;

import java.util.List;


import com.lti.BusReservation.beans.Seats;

public interface SeatsDao {

	public abstract String addSeats(Seats p);
	public abstract List<Seats> getSeatsList();
}