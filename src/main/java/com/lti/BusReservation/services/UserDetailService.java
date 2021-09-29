package com.lti.BusReservation.services;

import java.util.List;

import com.lti.BusReservation.beans.UserDetail;

public interface UserDetailService {
	public abstract String addUserDetail(UserDetail p);
	public abstract List<UserDetail> getUserList(); 
	public abstract UserDetail getUser(String email);
	public abstract UserDetail updateUserDetail(String email,String password);

}