package com.lti.BusReservation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.BusReservation.beans.Driver;
import com.lti.BusReservation.beans.UserDetail;

@Repository
public class DriverDaoImpl implements DriverDao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Transactional
	public String addDriver(Driver p) {
		// TODO Auto-generated method stub
		em.persist(p);
		return "record added";
		
	}

	
	@Transactional
	public Driver getDriverInfo(int driver_id) {
		// TODO Auto-generated method stub
		
		Driver driverObj=em.find(Driver.class,driver_id);
		return driverObj;
		
	}


	@Transactional
	public Driver updateDriverInfo(int driver_id, String mobile) {
		// TODO Auto-generated method stub
		
		Driver driverObj=em.find(Driver.class,driver_id);
		driverObj.setMobile(mobile);
		em.merge(driverObj);
		return driverObj;
	
	}


	@Transactional
	public String deleteDriver(Driver p) {
		// TODO Auto-generated method stub
		em.remove(p);
		return "deleted";
	}
	
	@Override
	public List<Driver> getDriverList() {
		// TODO Auto-generated method stub
		
		System.out.println("Dao Layer");
		String sql="select d from Driver d";
		Query qry=em.createQuery(sql); 
		List<Driver> driverList=qry.getResultList();
		return driverList;
	}


	public DriverDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DriverDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}


	public EntityManager getEm() {
		return em;
	}


	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	

}
