package com.lti.BusReservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.BusReservation.beans.BusDetail;
import com.lti.BusReservation.dao.BusDetailDao;


@Service("busDetailService")
public class BusDetailServiceImpl implements BusDetailService{
	
	@Autowired
	private BusDetailDao busDetailDao;
	

	public BusDetailServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public BusDetailServiceImpl(BusDetailDao busDetaildao) {
		super();
		this.busDetailDao = busDetaildao;
	}


	public BusDetailDao getBusDetaildao() {
		return busDetailDao;
	}


	public void setBusDetaildao(BusDetailDao busDetaildao) {
		this.busDetailDao = busDetaildao;
	}


	@Override
	public String addBusDetail(BusDetail p) {
		return busDetailDao.addBusDetail(p);
	}

	@Override
	public BusDetail getBusDetail(int bus_id) {
		return busDetailDao.getBusDetail(bus_id);
	}

	@Override
	public BusDetail updateBusDetail(int bus_id, int no_of_seats) {
		return busDetailDao.updateBusDetail(bus_id, no_of_seats);
	}

	@Override
	public String deleteBusDetail(BusDetail p) {
		return busDetailDao.deleteBusDetail(p);
	}


	@Override
	public List<BusDetail> getAllBuses() {
		System.out.println("service layer");
		List<BusDetail> busList = busDetailDao.getAllBuses();
		System.out.println(busList);
		return busList;
	}


	@Override
	public List<BusDetail> getBusList(String from, String to) {
		System.out.println("service layer");	
		return busDetailDao.getBusList(from,to);
	}

}
