package com.capge.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Pet {
	
 public Pet(String name, Animal animal) {
		super();
		this.name = name;
		this.animal = animal;
	}
 
 
 public Pet() {
	super();
}


 private String name;
@Autowired
@Qualifier("dog")
 private Animal animal;//Autowired

 
 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Animal getAnimal() {
	return animal;
}
public void setAnimal(Animal animal) {
	this.animal = animal;
}

 
}
