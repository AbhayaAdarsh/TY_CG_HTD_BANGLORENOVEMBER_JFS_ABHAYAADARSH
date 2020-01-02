package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.capgemini.jpawithhybernate.dto.Movie;

public class Reattach 
{
public static void main(String[] args) {
	
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	
	try {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
entityManager=entityManagerFactory.createEntityManager();
transaction= entityManager.getTransaction();
transaction.begin();

Movie record=entityManager.find(Movie.class,101);
System.out.println(entityManager.contains(record));
entityManager.detach(record);
System.out.println(entityManager.contains(record));
//for reattach file 

Movie reattachMovie=entityManager.merge(record);
reattachMovie.setMovie_name("DDLJ");
System.out.println("recoed update");

transaction.commit();
	}catch(Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	
	entityManager.close();
	
	}
}

