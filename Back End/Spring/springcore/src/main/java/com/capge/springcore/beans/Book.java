package com.capge.springcore.beans;

public class Book {

	private String name;
	private Author author;
	public Book(String name, Author author) {
		super();
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}
