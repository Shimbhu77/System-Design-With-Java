package com.shimbhu.factory.staticfactory;

public class StaticFactoryMethod {

	public static void main(String[] args) {
		Animal dog = Animal.createDog();
		Animal cat = Animal.createCat();
		Animal cow = Animal.createCow();

		System.out.println("Dog says: " + dog.getSound()); // Output: Dog says: Woof!
		System.out.println("Cat says: " + cat.getSound()); // Output: Cat says: Meow!
		System.out.println("Cow says: " + cow.getSound()); // Output: Cow says: Moo!
	}

}

class Animal {
	private String species;
	private String sound;

	private Animal() {
	}

	public static Animal createDog() {
		Animal dog = new Animal();
		dog.species = "Dog";
		dog.sound = "Woof!";
		return dog;
	}

	public static Animal createCat() {
		Animal cat = new Animal();
		cat.species = "Cat";
		cat.sound = "Meow!";
		return cat;
	}

	public static Animal createCow() {
		Animal cow = new Animal();
		cow.species = "Cow";
		cow.sound = "Moo!";
		return cow;
	}

	// Getters
	public String getSpecies() {
		return species;
	}

	public String getSound() {
		return sound;
	}
}
