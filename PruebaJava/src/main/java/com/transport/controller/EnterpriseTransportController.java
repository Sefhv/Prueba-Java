package com.transport.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;
import com.transport.model.EnterpriseTransport;

public class EnterpriseTransportController {

	public EnterpriseTransportController() {
		
	}

	public int saveOrUpdateEnterpriseTransport(EnterpriseTransport enterpriseTransport) {
		try {
			Transaction transaction = null;
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(enterpriseTransport);
			transaction.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	public List<EnterpriseTransport> getEnterpriseTransportListData() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			List<EnterpriseTransport> enterpriseTransportList = new ArrayList<EnterpriseTransport>(1);
			enterpriseTransportList = session.createQuery("from EnterpriseTransport", EnterpriseTransport.class).list();
			return enterpriseTransportList;
		} catch (Exception e) {
			System.out.println(e);
			throw e;
		}
	}
}
