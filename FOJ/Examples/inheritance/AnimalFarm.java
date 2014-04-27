import java.util.*;

public class AnimalFarm {
	private ArrayList<Animal> animals = new ArrayList<Animal>();

	public AnimalFarm() {
		animals.add(new Cat());
		animals.add(new Dog());
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		animals.add(new Cat());
	}

	public void feed() {
		System.out.println("Feeding animals...");
		for (Animal animal : animals)
			animal.eat();
	}

	public void checkAnimals() {
		System.out.println("Checking animals...");
		for (Animal animal : animals) {
			if (!animal.isAlive())
				System.out.println("Found dead animal");
		}
	}

	public void flood() {
		System.out.println("Flooding...");
		for (int i = 1; i <= 4; i++) {
			int pos = (int)(Math.random()*animals.size());
			Animal animal = animals.get(pos);
			animal.die();
		}
	}

	public static void main(String[] args) {
		AnimalFarm farm = new AnimalFarm();
		farm.checkAnimals();
		farm.feed();
		farm.flood();
		farm.checkAnimals();
	}
}
