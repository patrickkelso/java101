import java.util.*;

public class PersonStuff {
	public static void main(String[] args) {

		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person("Jack Smith", 43));
		people.add(new Person("Sally Jane", 22));
		people.add(new Person("Joe Bloggs", 18));
		people.add(new Person("Marge Simpson", 38));

		Scanner keyboard = new Scanner(System.in);

		print(people);
		sortByAge(people);
		print(people);

		System.out.print("Enter a name: ");
		String name = keyboard.nextLine();

		Person person = searchByName(people, name);
		if (person == null)
			System.out.println("Person not found");
		else
			System.out.println("Found " + person);
	}

	public static void print(ArrayList<Person> people) {
		System.out.println("People:");
		for (Person person : people)
			System.out.println(person);
	}

	public static void sortByAge(ArrayList<Person> people) {
		for (int right = people.size() - 1; right > 0; right--)
			for (int i = 0; i < right; i++)
				if (people.get(i).getAge() > people.get(i+1).getAge())
					swap(people, i, i+1);
	}

	private static void swap(ArrayList<Person> people, int pos1, int pos2) {
		Person temp = people.get(pos1);
		people.set(pos1, people.get(pos2));
		people.set(pos2, temp);
	}

	private static Person searchByName(ArrayList<Person> people, String name) {
		for (Person person : people)
			if (person.getName().equals(name))
				return person;
		return null;
	}
}
