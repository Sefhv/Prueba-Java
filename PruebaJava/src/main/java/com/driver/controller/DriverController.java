package com.driver.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.driver.model.Driver;
import com.hibernate.util.HibernateUtil;

public class DriverController {

	public DriverController() { 
		
	}
	
	public int saveOrUpdateDriver(Driver driver) {
		try {
			Transaction transaction = null;
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(driver);
			transaction.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	public List<Driver> getDriverListData() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			List<Driver> driverList  = new ArrayList<Driver>(1);
			driverList = session.createQuery("from Driver", Driver.class).list();
			return driverList;
		} catch (Exception e) {
			System.out.println(e);
			throw e;
		}
	}
}
