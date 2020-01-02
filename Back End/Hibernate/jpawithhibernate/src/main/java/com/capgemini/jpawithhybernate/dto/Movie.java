package com.capgemini.jpawithhybernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//add 1 class with database we use entity here
@Table(name="Movie")//we write table name
public class Movie
{
@Id
@Column(name="movie_id")//we write column name inside name if column name is diffrent

private int movieid;

@Column(name="movie_name")//we write column name inside name if column name is diffrent

private String moviename;

@Column//here we are not writing name because if column name is same as anotation name then we only write @Column 
private String ratings;

public int getMovie_id() {
	return movieid;
}
public void setMovie_id(int movie_id) {
	this.movieid = movie_id;
}
public String getMovie_name() {
	return moviename;
}
public void setMovie_name(String movie_name) {
	this.moviename = movie_name;
}
public String getRatings() {
	return ratings;
}
public void setRatings(String ratings) {
	this.ratings = ratings;
}


	

}
