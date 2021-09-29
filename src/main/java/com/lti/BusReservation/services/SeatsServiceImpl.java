package com.lti.BusReservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.BusReservation.beans.Seats;
import com.lti.BusReservation.dao.SeatsDao;
import com.lti.BusReservation.dao.UserDetailDao;

@Service("seatbookingService")
public class SeatsServiceImpl implements SeatsService {

	@Autowired
	private SeatsDao paydao;
	
	@Override
	public String addSeats(Seats p) {
		System.out.println("inside service layer");
		return paydao.addSeats(p);
	}

	@Override
	public List<Seats> getSeatsList() {
		return paydao.getSeatsList();
	}

}