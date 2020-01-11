package com.capgemini.retailermaintenancesystemapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintenancesystemapplication.dto.ProductInfoBean;
import com.capgemini.retailermaintenancesystemapplication.dto.UserInfoBean;
import com.capgemini.retailermaintenancesystemapplication.exception.ProductInfoException;

@Repository
public class UserInfoDaoImpl implements UserInfoDao{

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addUserInfoProfile(UserInfoBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		ProductInfoBean productInfoBean = new ProductInfoBean();
		
		productInfoBean.setId(bean.getId());
		productInfoBean.setUserid(bean.getUserid());
		productInfoBean.setName(bean.getName());
		
		
		transaction.begin();
		try {
			manager.persist(productInfoBean);
			transaction.commit();
			return true;
		}catch (Exception e){
		
			e.printStackTrace();
			throw new ProductInfoException("product already exists");
		}
	
		return false;
	}

	@Override
	public UserInfoBean getUserInfo(int id) {
		String jpql1="from ProductBean where id=:id";
		EntityManager manager1=factory.createEntityManager();
		TypedQuery<ProductInfoBean> query1=manager1.createQuery(jpql1,ProductInfoBean.class);
		query1.setParameter("id",userid);
		try {
			return query1.getSingleResult();
		}catch(Exception e) {
			e.printStackTrace();
			throw new ProductInfoException("User not found");
		}
		return null;
	}

	@Override
	public boolean updatePassword(int email, String password) {
		EntityManager manager1=factory.createEntityManager();
		EntityTransaction transaction=manager1.getTransaction();
		transaction.begin();
		ProductInfoBean bean1= manager1.find(ProductInfoBean.class,userid);
		bean1.setPassword(bean1.getPassword());
		bean1.setName(bean1.getName());
		transaction.commit();
		return true;
	
	}

	@Override
	public List<UserInfoBean> getAllUser(int id) {
		String jpql="from ProductInfoBean where id=:id";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<ProductInfoBean> query=manager.createQuery(jpql,ProductInfoBean.class);
		query.setParameter("id",id);
		return query.getResultList();
	}

}
