package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhybernate.dto.Movie;

public class RemoveDemo 
{
public static void main(String[] args)
{
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	
	try {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
EntityManager entityManager1=entityManagerFactory.createEntityManager();
EntityTransaction transaction1=entityManager1.getTransaction();
transaction1.begin();
Movie record=entityManager1.find(Movie.class, 101);
entityManager1.remove(record);
System.out.println("record remove");
transaction1.commit();
}catch(Exception e) {
	e.printStackTrace();
	transaction.rollback();
}

transaction.commit();
entityManager.close();

}
}

