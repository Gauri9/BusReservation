package com.lti.BusReservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.BusReservation.beans.UserDetail;
import com.lti.BusReservation.dao.UserDetailDao;

@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailService{

	@Autowired
	private UserDetailDao paydao;
	
	
	public UserDetailServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserDetailDao getPaydao() {
		return paydao;
	}


	public void setPaydao(UserDetailDao paydao) {
		this.paydao = paydao;
	}


	public UserDetailServiceImpl(UserDetailDao paydao) {
		super();
		this.paydao = paydao;
	}


	public String addUserDetail(UserDetail p) {
		// TODO Auto-generated method stub
		return paydao.addUserDetail(p);
	}

	
	public UserDetail getUser(String email) {
		// TODO Auto-generated method stub
		return paydao.getUser(email);
	}


	public UserDetail updateUserDetail(String email, String password) {
		// TODO Auto-generated method stub
		return paydao.updateUserDetail(email, password);
	}


	@Override
	public List<UserDetail> getUserList() {
		// TODO Auto-generated method stub
		return paydao.getUserList();
	}

}