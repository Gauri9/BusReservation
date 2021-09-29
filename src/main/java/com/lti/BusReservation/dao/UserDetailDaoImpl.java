package com.lti.BusReservation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.BusReservation.beans.UserDetail;

@Repository
public class UserDetailDaoImpl implements UserDetailDao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Transactional
	public String addUserDetail(UserDetail p) {
		// TODO Auto-generated method stub
		em.persist(p);
		return "record added";
		
	}

	
	@Transactional
	public UserDetail getUser(String email) {
		// TODO Auto-generated method stub
		
		UserDetail paymentObj=em.find(UserDetail.class,email);
		return paymentObj;
		
	}


	@Transactional
	public UserDetail updateUserDetail(String email, String password) {
		// TODO Auto-generated method stub
		UserDetail userObj=em.find(UserDetail.class,email);
		userObj.setPassword(password);
		em.merge(userObj);
		return userObj;
	}


	@Override
	public List<UserDetail> getUserList() {
		// TODO Auto-generated method stub
		
		System.out.println("Dao Layer");
		String sql="select u from UserDetail u";
		Query qry=em.createQuery(sql); 
		List<UserDetail> empList=qry.getResultList();
		return empList;
	}


	public UserDetailDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserDetailDaoImpl(EntityManager em) {
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