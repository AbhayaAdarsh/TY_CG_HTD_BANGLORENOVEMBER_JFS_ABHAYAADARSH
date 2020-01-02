package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhybernate.dto.Movie;

public class GetReference
{
public static void main(String[] args)
{
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
EntityManager entityManager=entityManagerFactory.createEntityManager();

Movie record=entityManager.getReference(Movie.class, 101);

System.out.println(record.getClass());
System.out.println("Id---"+record.getMovie_id());
System.out.println("Name---"+record.getMovie_name());
System.out.println("Rating---"+record.getRatings());
entityManager.close();
}
}
