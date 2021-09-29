package com.lti.BusReservation.dao;

import java.util.List;

import com.lti.BusReservation.beans.UserDetail;

public interface UserDetailDao {
	public abstract String addUserDetail(UserDetail p);
	public abstract List<UserDetail> getUserList(); 
	public abstract UserDetail getUser(String email);
	public abstract UserDetail updateUserDetail(String email,String password);
}