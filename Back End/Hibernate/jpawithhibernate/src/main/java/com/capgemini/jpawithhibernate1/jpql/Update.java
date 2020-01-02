package com.capgemini.jpawithhibernate1.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.capgemini.jpawithhybernate.dto.Movie;

public class Update 
{

public static void main(String[] args)
{
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test")	;
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction transection=entityManager.getTransaction();
transection.begin();

//String jpql="update Movie set movie_name='DDLJ' where movie_id=1";
String jpql="update Movie set movie_name=:mn where movie_id=:id";//hardcoded value
Query query=entityManager.createQuery(jpql);
query.setParameter("id",101);//hcd
query.setParameter("mn","ABCD");//hcd
int result=query.executeUpdate();//hcd
System.out.println(result);
transection.commit();
entityManager.close();
}

}

