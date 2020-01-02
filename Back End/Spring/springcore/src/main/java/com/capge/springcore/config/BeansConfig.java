package com.capge.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.capge.springcore.beans.Cat;
import com.capge.springcore.beans.Dog;
import com.capge.springcore.beans.Hello;
import com.capge.springcore.beans.Pet;

@Configuration
public class BeansConfig {

	@Bean("hello")
	@Scope("prototype")
	public Hello getHello() {
		Hello hello=new Hello();
		hello.setMessage("I Love C");
		hello.setCount(1000);
		return hello;
	}
	
	@Bean
	(name = "dog")
	public Dog getDog() {
		return new Dog();
	}
	
	//primary
	@Bean("cat")
	@Primary
	public Cat getCat()
	{
		return new Cat();
	}
	
	//WIREING
	
	@Bean("pet")
	public Pet getPet() {
		Pet pet= new Pet();
		pet.setName("Tufy");
		//pet.setAnimal(getDog()); //Atuowired annotation
		return pet;
		
}
}
