package com.shimbhu.factory.abstractfactory;

public class AbstractFactoryMethod {

	// Step 5: Define the Client class to use the factories
	public static void main(String[] args) {
		// Create a pet animal factory
		AnimalFactory petFactory = new PetAnimalFactory();

		// Create pet animals using the pet factory
		Animal petDog = petFactory.getDog();
		Animal petTiger = petFactory.getTiger();
		System.out.println(petDog.speak()); // Output: Woof
		System.out.println(petTiger.speak()); // Output: Roar (pet)

		// Create a wild animal factory
		AnimalFactory wildFactory = new WildAnimalFactory();

		// Create wild animals using the wild factory
		Animal wildDog = wildFactory.getDog();
		Animal wildTiger = wildFactory.getTiger();
		System.out.println(wildDog.speak()); // Output: Growl
		System.out.println(wildTiger.speak()); // Output: Roar (wild)
	}
}

/**
 * This is an example of the Abstract Factory design pattern. It demonstrates
 * how to create families of related objects (pet animals and wild animals)
 * without being coupled to the concrete classes.
 */

// Step 1: Define the Animal interface
interface Animal {
	String speak();
}

// Step 2: Define concrete Animal classes
class PetDog implements Animal {
	@Override
	public String speak() {
		return "Woof";
	}
}

class WildDog implements Animal {
	@Override
	public String speak() {
		return "Growl";
	}
}

class PetTiger implements Animal {
	@Override
	public String speak() {
		return "Roar (pet)";
	}
}

class WildTiger implements Animal {
	@Override
	public String speak() {
		return "Roar (wild)";
	}
}

// Step 3: Define the AnimalFactory interface
interface AnimalFactory {
	Animal getDog();

	Animal getTiger();
}

// Step 4: Define concrete AnimalFactory classes
class PetAnimalFactory implements AnimalFactory {
	@Override
	public Animal getDog() {
		return new PetDog();
	}

	@Override
	public Animal getTiger() {
		return new PetTiger();
	}
}

class WildAnimalFactory implements AnimalFactory {
	@Override
	public Animal getDog() {
		return new WildDog();
	}

	@Override
	public Animal getTiger() {
		return new WildTiger();
	}
}
