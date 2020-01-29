package com.capgemini.forestrymanagement.springbootdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.forestrymanagement.springbootdto.AdminBean;
import com.capgemini.forestrymanagement.springbootexception.AdminException;

@Repository
public class AdminDaoImpl implements AdminDao {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean register(AdminBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new AdminException("Id already exists");
		}
	}

	@Override
	public AdminBean login(int adminId, String password) {
		EntityManager manager = factory.createEntityManager();
		AdminBean bean=manager.find(AdminBean.class, adminId);
		return bean;
	}

}