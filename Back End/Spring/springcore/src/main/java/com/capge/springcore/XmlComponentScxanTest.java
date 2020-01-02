package com.capge.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capge.springcore.beans.Animal;
import com.capge.springcore.beans.Pet;

public class XmlComponentScxanTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		
		Animal animal= context.getBean(Animal.class);
		animal.makeSound();
		
		Pet pet=context.getBean(Pet.class);//auto-wired //By using getBean() we create the object of that class
		pet.getAnimal().makeSound();
	}

}
