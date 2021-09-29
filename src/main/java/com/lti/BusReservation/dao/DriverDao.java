package com.lti.BusReservation.dao;

import java.util.List;

import com.lti.BusReservation.beans.Driver;
import com.lti.BusReservation.beans.UserDetail;

public interface DriverDao {

	public abstract String addDriver(Driver p);
	public abstract Driver getDriverInfo(int driver_id);
	public abstract Driver updateDriverInfo(int driver_id,String mobile);
	public abstract String deleteDriver(Driver p);
	public abstract List<Driver> getDriverList(); 
}