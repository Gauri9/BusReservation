package com.lti.BusReservation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.BusReservation.beans.BusDetail;


@Repository
public class BusDetailDaoImpl implements BusDetailDao{
	
	@PersistenceContext
	private EntityManager em;
	

	public BusDetailDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public BusDetailDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public EntityManager getEm() {
		return em;
	}


	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Transactional
	@Override
	public String addBusDetail(BusDetail p) {
		System.out.println("DAO LAYER");
		em.persist(p);
		System.out.println("added: " + p);
		return "record added";
	}

	@Override
	public BusDetail getBusDetail(int bus_id) {
		System.out.println("DAO LAYER");
		BusDetail busObj=em.find(BusDetail.class,bus_id);
		System.out.println(busObj);
		return busObj;
	}

	@Override
	public BusDetail updateBusDetail(int bus_id, int no_of_seats) {
		return null;
	}

	@Override
	public String deleteBusDetail(BusDetail p) {
		return null;
	}

	@Override
	public List<BusDetail> getAllBuses() {
		System.out.println("DAO LAYER");
		String sql = "select b from BusDetail b";
		Query qry = em.createQuery(sql);
		List<BusDetail> busList = qry.getResultList();
		System.out.println(busList);
		return busList;
	}

	@Transactional
	@Override
	public List<BusDetail> getBusList(String from, String to) {
		System.out.println("DAO LAYER");
//		System.out.println("to=\n"+ to + "from=" + from);
		
		String sql = "select b from BusDetail b where b.source=:from and b.destination=:to " ;
		TypedQuery<BusDetail> tqry = em.createQuery(sql, BusDetail.class);
		tqry.setParameter("from", from);
		tqry.setParameter("to",to);
		List<BusDetail> busList = tqry.getResultList();
		
//		Query qry= em.createQuery("select b from BusDetail b where b.source=?1 and b.destination =?2 ");
//		qry.setParameter(1, from);
//		qry.setParameter(2, to);
//		List<BusDetail> busList = qry.getResultList();
		
		System.out.println(busList);
		return busList;
	}

}
