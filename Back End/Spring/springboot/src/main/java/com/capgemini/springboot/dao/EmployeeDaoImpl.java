package com.capgemini.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.capgemini.springboot.dto.EmployeeBean;
import com.capgemini.springboot.exception.EmployeeException;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO{
	
	@PersistenceUnit //this is for this line private EntityManagerFactory factory=Persistence.createEntityManagerFactory();
	private EntityManagerFactory factory;//by making it private we can access it in complete class
	
	@Override
	public EmployeeBean auth(String email, String password) {
		
		EntityManager manager=factory.createEntityManager();
		String jpql="from EmployeeBean where email=:email ";
		//Instead of down casting both side we write TypedQuery otherwise it give error if we don't downcast it.
		TypedQuery<EmployeeBean> query=manager.createQuery(jpql,EmployeeBean.class);//instead for writing Query query we write TypedQuery to avoid downcasting 
		query.setParameter("email",email);
		//query.setParameter("password",password);
		
		try {
			EmployeeBean bean=query.getSingleResult();
			
			//encryption method
			BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
			if(encoder.matches(password, bean.getPassword())) {
				return bean;
			}else {
				throw new EmployeeException("Password Invalid");
			}
			//return bean;
		}catch(Exception e) {
			throw new EmployeeException("Email Invalid");
		}
	
	}

	@Override
	public boolean register(EmployeeBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
		manager.persist(bean);
		transaction.commit();
		return true;
		}catch(Exception e) {
			e.printStackTrace();
			throw new EmployeeException("");
		}
	}

	//IN PLACE OF THIS WE WRITE KEY IN public List<EmployeeBean> getEmployees(String key)
//	@Override
//	public EmployeeBean getEmployee(String email) {
//		String jpql="from EmployeeBean where email=:email";
//		EntityManager manager=factory.createEntityManager();
//		TypedQuery<EmployeeBean> query=manager.createQuery(jpql,EmployeeBean.class);
//		query.setParameter("email", email);
//		try {
//			return query.getSingleResult();
//			}catch(Exception e) {
//				e.printStackTrace();
//				return null;
//						}
//	}

	@Override
	public List<EmployeeBean> getEmployees(String key) { //in place of name we write key
		String jpql="from EmployeeBean where name=:name or email=:email";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<EmployeeBean> query=manager.createQuery(jpql,EmployeeBean.class);
		query.setParameter("name",key);
		query.setParameter("email",key);
		return query.getResultList();
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		EmployeeBean bean=manager.find(EmployeeBean.class,id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		EmployeeBean bean=manager.find(EmployeeBean.class,id);
		if(bean!=null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		return false;
	}

}
