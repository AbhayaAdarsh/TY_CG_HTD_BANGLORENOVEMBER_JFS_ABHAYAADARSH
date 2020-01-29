package com.capgemini.forestrymanagement.hibernatedao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.forestrymanagement.hibernatebean.LandBean;

public class LandDaoImpl implements LandDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Test");

	@Override
	public boolean addLand(LandBean bean) {
		boolean isAdded = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction;
		try {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return isAdded;
	}

	@Override
	public boolean deleteLand(int landNo) {
		boolean isDeleted = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = null;
		LandBean bean = manager.find(LandBean.class, landNo);
		if (bean != null) {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(bean);
			transaction.commit();
			isDeleted = true;
		}
		manager.close();
		return isDeleted;
	}

	@Override
	public boolean modifyLand(LandBean bean, int landNo) {
		boolean isUpdated = false;
		EntityManager manager = factory.createEntityManager();
		LandBean bean1 = manager.find(LandBean.class, landNo);
		EntityTransaction transaction = manager.getTransaction();
		if (bean1 != null) {
			try {
				transaction.begin();
				landNo = bean.getLandNo();
				if (landNo > 0) {
					bean1.setLandNo(landNo);
				}
				String landLordName = bean.getLandlordName();
				if (landNo > 0) {
					bean1.setLandlordName(landLordName);
				}
				String landdetails = bean.getLandDetails();
				if (landdetails != null) {
					bean1.setLandDetails(landdetails);
				}
				String tenantDetails = bean.getTenantDetails();
				if (tenantDetails != null) {
					bean1.setTenantDetails(tenantDetails);
				}
				transaction.commit();
				isUpdated = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		manager.close();
		return isUpdated;
	}
}// class ended
