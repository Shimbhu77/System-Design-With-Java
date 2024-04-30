package com.shimbhu;

public class SimpleFactoryMethod {

	// Client code using the factory method
	public static void main(String[] args) {
		// Create a dog
		Animal dog = AnimalFactory.createAnimal("Dog");
		dog.sound();

		// Create a cat
		Animal cat = AnimalFactory.createAnimal("Cat");
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

//Define the Factory class responsible for creating instances of the animals
class AnimalFactory {
	public static Animal createAnimal(String type) {
		// Logic to create and return instances of different animals
		if (type.equals("Dog")) {
			return new Dog();
		} else if (type.equals("Cat")) {
			return new Cat();
		} else {
			throw new IllegalArgumentException("Invalid animal type: " + type);
		}
	}
}
