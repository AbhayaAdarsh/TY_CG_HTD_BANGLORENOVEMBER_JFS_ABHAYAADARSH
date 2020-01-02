package com.capge.di;

import com.capge.di.dao.Animal;
import com.capge.di.factory.AnimalFactory;

public class App {
public static void main(String[] args) {
	Animal animal=AnimalFactory.getAnimal();//getAnimal use to injecting the dependency of dog
	animal.makeSound();
}
}
