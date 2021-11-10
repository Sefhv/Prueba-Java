package com.vehicle.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;
import com.vehicle.model.Vehicle;

public class VehicleController {

	public VehicleController() { 
		
	}
	
	public int saveOrUpdateVehicle(Vehicle vehicle) {
		try {
			Transaction transaction = null;
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(vehicle);
			transaction.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	public List<Vehicle> getVehicleListData() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			List<Vehicle> vehicleList  = new ArrayList<Vehicle>(1);
			vehicleList = session.createQuery("from Vehicle", Vehicle.class).list();
			return vehicleList;
		} catch (Exception e) {
			System.out.println(e);
			throw e;
		}
	}
}
