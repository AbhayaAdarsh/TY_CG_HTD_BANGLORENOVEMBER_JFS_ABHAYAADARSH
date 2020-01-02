package com.capgemini.jpawithhibernate1.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete1 
{
public static void main(String[] args){
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	transaction.begin();
	
	String jpql="delete from Movie where movie_id=:id";//hardcoded value
	Query query=entityManager.createQuery(jpql);
	query.setParameter("id", 101);
	
	
	query.executeUpdate();
	transaction.commit();
	entityManager.close();
}
}
