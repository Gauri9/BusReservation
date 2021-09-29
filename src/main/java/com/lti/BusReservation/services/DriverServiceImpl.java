package com.lti.BusReservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.BusReservation.beans.Driver;
import com.lti.BusReservation.beans.UserDetail;
import com.lti.BusReservation.dao.DriverDao;

@Service("driverService")
public class DriverServiceImpl implements DriverService{

	@Autowired
	private DriverDao driverDao;
	
	
	public String addDriver(Driver p) {
		// TODO Auto-generated method stub
		return driverDao.addDriver(p);
	}

	
	public Driver getDriverInfo(int driver_id) {
		// TODO Auto-generated method stub
		return driverDao.getDriverInfo(driver_id);
	}


	public Driver updateDriverInfo(int driver_id, String mobile) {
		// TODO Auto-generated method stub
		return driverDao.updateDriverInfo(driver_id, mobile);
	}


	public String deleteDriver(Driver p) {
		// TODO Auto-generated method stub
		
		return driverDao.deleteDriver(p);
	}

	@Override
	public List<Driver> getDriverList() {
		// TODO Auto-generated method stub
		return driverDao.getDriverList();
	}
}