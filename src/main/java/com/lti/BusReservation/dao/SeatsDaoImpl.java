package com.lti.BusReservation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.BusReservation.beans.Seats;
import com.lti.BusReservation.beans.UserDetail;

@Repository
public class SeatsDaoImpl implements SeatsDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public String addSeats(Seats p) {
		em.persist(p);
		return "record added";
	}

	@Override
	@Transactional
	public List<Seats> getSeatsList() {
		System.out.println("Dao Layer");
//		String sql = "select s from Seats s where ticketNo=" + ticketNo;
		String sql = "select s from Seats s";
		Query qry = em.createQuery(sql);
		List<Seats> seatsList = qry.getResultList();
		return seatsList;
	}

}