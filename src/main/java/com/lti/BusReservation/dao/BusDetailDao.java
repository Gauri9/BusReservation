package com.lti.BusReservation.dao;

import java.util.List;

import com.lti.BusReservation.beans.BusDetail;

public interface BusDetailDao {
	
	public abstract String addBusDetail(BusDetail p);
	public abstract BusDetail getBusDetail(int bus_id);
	public abstract BusDetail updateBusDetail(int bus_id,int no_of_seats);
	public abstract String deleteBusDetail(BusDetail p);
	public abstract List<BusDetail> getAllBuses();
	public abstract List<BusDetail> getBusList(String from, String to);
	
	
//	public abstract List<BusDetail> getBusList(String src, String dest);
//	public abstract BusDetail getbusInfo(int ticket_no);

}
