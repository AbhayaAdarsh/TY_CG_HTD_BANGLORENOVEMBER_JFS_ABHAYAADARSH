package com.capgemini.jpawithhibernate1.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class Delete{
public static void main(String[] args){

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	transaction.begin();
	
	String jpql="update Movie set movie_name='DDLJ' where movie_id=1";
	Query query=entityManager.createQuery(jpql);
	query.executeUpdate();
	transaction.commit();
	entityManager.close();
	
}
}
