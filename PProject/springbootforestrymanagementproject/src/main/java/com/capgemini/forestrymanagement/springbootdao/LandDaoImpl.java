package com.capgemini.forestrymanagement.springbootdao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.capgemini.forestrymanagement.springbootdto.LandBean;
import com.capgemini.forestrymanagement.springbootexception.LandException;

@Repository
public class LandDaoImpl implements LandDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addLand(LandBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		LandBean landBean = new LandBean();
		landBean.setLandNo(bean.getLandNo());
		landBean.setLandOwner(bean.getLandOwner());
		landBean.setLandPrice(bean.getLandPrice());
		landBean.setLandMark(bean.getLandMark());
		transaction.begin();
		try {
			manager.persist(landBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new LandException("Land already exists");
		}
	}

	@Override
	public boolean deleteLand(int landno) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
		LandBean bean = manager.find(LandBean.class, landno);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		return false;
	}catch (Exception e) {
		throw new LandException("Land already exists");
	}
}

	@Override
	public boolean updateLand(int landno, LandBean bean) {
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			LandBean bean1 = manager.find(LandBean.class, landno);
			bean1.setLandNo(bean.getLandNo());
			bean1.setLandOwner(bean.getLandOwner());
			transaction.commit();
			return true;
		} catch (LandException e) {
			throw new LandException("Land already exists");
		}
	}

	@Override
	public List<LandBean> getAllLand() {
		try {
		String jpql = "from LandBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<LandBean> query = manager.createQuery(jpql, LandBean.class);
		return query.getResultList();
	}catch (LandException e) {
		throw new LandException("Land already exists");
	}
  }
}
