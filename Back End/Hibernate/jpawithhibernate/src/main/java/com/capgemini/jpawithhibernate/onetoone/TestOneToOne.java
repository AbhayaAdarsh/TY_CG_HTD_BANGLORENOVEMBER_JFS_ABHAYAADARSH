package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOne 
{
public static void main(String[] args) {
//EmployeeInfo emp=new EmployeeInfo();
//emp.setId(1);
//emp.setName("ABC");
//emp.setEmail("xyz@gmail.com");
//emp.setPwd("abc");
//EmployeeOther other=new EmployeeOther();
//other.setId(11);
//other.setPancard("ABCD");
//other.setFname("ABC");

EntityManager entityManager=null;
EntityTransaction transaction=null;

try {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
 entityManager=entityManagerFactory.createEntityManager();
 transaction=entityManager.getTransaction();
transaction.begin();
EmployeeInfo empi=entityManager.find(EmployeeInfo.class, 3);
System.out.println(empi.getOther().getClass());
System.out.println("Record saved.....");
transaction.commit();
}catch(Exception e) {
	e.printStackTrace();
	transaction.rollback();
}
entityManager.close();

}


}

