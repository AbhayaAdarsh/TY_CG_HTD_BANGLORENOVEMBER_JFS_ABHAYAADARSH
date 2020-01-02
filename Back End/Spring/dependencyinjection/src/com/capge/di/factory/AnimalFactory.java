package com.capge.di.factory;

import com.capge.di.dao.Animal;
import com.capge.di.dao.Dog;

public class AnimalFactory {

	public static Animal getAnimal(){
		return new Dog();
	}
}
