package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

import lombok.Data;

@Data
@Entity
@Table(name="emp_exp")
public class TestManyToOne {
	public static void main(String[] args) {
	EmployeeInfo empi=new EmployeeInfo();
	empi.setempid(5);
	empi.setempname("Nia");
	empi.setEmail("nia@gmail.com");
	empi.setPassword("nia123");
	
	EmployeeExp exp=new EmployeeExp();
	exp.setexpid(111);
	exp.setCompany("Cgnizant");
	exp.setNoOfYear(2);
	exp.setEmployee(empi);
	
	EmployeeExp exp1=new EmployeeExp();
	exp1.setexpid(111);
	exp1.setCompany("IBM");
	exp1.setNoOfYear(1);
	exp1.setEmployee(empi);
	
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	
	try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	 entityManager=entityManagerFactory.createEntityManager();
	 transaction=entityManager.getTransaction();
	transaction.begin();
	entityManager.persist(exp1);
	System.out.println("Record saved.....");
	transaction.commit();
	}catch(Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	
	transaction.commit();
	entityManager.close();
	
	}
	}

