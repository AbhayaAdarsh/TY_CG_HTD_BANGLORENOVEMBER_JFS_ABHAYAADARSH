package com.capgemini.jpawithhibernate1.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhybernate.dto.Movie;

public class Retrive
{
public static void main(String[] args)
{
	EntityManager entityManager=null;
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	 entityManager=entityManagerFactory.createEntityManager();
	//String jpql="from Movie";
	 String jpql="select movie_name from Movie";
	Query query=entityManager.createQuery(jpql);
	//List<Movie> record=query.getResultList();
	List<String> record=query.getResultList();
	for(String movie:record)
	{
		//System.out.println("MovieId:"+movie.getMovie_id());
		//System.out.println("Movie Name:"+movie.getMovie_name());
		//System.out.println("Movie Rating:"+movie.getRatings());
		System.out.println(movie);
	}
entityManager.close();
}
}