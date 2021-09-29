package com.lti.BusReservation.services;

import java.util.List;

import com.lti.BusReservation.beans.Seats;

public interface SeatsService {
	public abstract String addSeats(Seats s);
	public abstract List<Seats> getSeatsList();
}