package com.capgimini.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;


public class TestManyToMany {
public static void main(String[] args) {
	//copy paste the persisting emp
	EmployeeInfo emp=new EmployeeInfo();
	emp.setId(44);
	emp.setName("Aman");
	emp.setEmail("aman@gmail.com");
	
	EmployeeInfo emp1=new EmployeeInfo();
	emp1.setId(45);
	emp1.setName("Nikhil");
	emp1.setEmail("n@gmail.com");
	
	ArrayList<EmployeeInfo> aList=new ArrayList<EmployeeInfo>();
	aList.add(emp);
	aList.add(emp1);
	
	TrainingInfo t1=new TrainingInfo();
	
	
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	
	try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	 entityManager=entityManagerFactory.createEntityManager();
	 transaction=entityManager.getTransaction();
	transaction.begin();
	entityManager.persist(t1);
	System.out.println("Record saved.....");
	transaction.commit();
	}catch(Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	entityManager.close();
	
	}


}

