package com.lti.BusReservation.services;

import java.util.List;

import com.lti.BusReservation.beans.Driver;
import com.lti.BusReservation.beans.UserDetail;

public interface DriverService {
	public abstract String addDriver(Driver p);
	public abstract Driver getDriverInfo(int driver_id);
	public abstract List<Driver> getDriverList(); 
	public abstract Driver updateDriverInfo(int driver_id,String mobile);
	public abstract String deleteDriver(Driver p);
}