package com.capge.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.capge.springcore.beans.Animal;
import com.capge.springcore.beans.Pet;
import com.capge.springcore.config.ComponentScanConfig;

public class AnnotationComponentScanTest {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(ComponentScanConfig.class);
	
	Animal animal=context.getBean(Animal.class);
	animal.makeSound();
	
	Pet pet=context.getBean(Pet.class);
	pet.getAnimal().makeSound();
}
}
