package com.shimbhu.factory;

public class FactoryMethod {

	// Client code using the Factory pattern
	public static void main(String[] args) {
		// Create a DogFactory
		AnimalFactory dogFactory = new DogFactory();
		// Use the DogFactory to create a dog
		Animal dog = dogFactory.createAnimal();
		dog.sound();

		// Create a CatFactory
		AnimalFactory catFactory = new CatFactory();
		// Use the CatFactory to create a cat
		Animal cat = catFactory.createAnimal();
		cat.sound();
	}

}

//Define an interface for the animals
interface Animal {
	void sound();
}

//Define concrete implementations of the animal interface
class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("Woof!");
	}
}

class Cat implements Animal {
	@Override
	public void sound() {
		System.out.println("Meow!");
	}
}

//Define the Factory interface
interface AnimalFactory {
	Animal createAnimal();
}

//Define concrete implementations of the Factory interface
class DogFactory implements AnimalFactory {
	@Override
	public Animal createAnimal() {
		return new Dog();
	}
}

class CatFactory implements AnimalFactory {
	@Override
	public Animal createAnimal() {
		return new Cat();
	}
}
