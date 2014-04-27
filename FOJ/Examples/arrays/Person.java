public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + ", " + age + " years old";
	}

	public boolean equals(Object other) {
		if (other instanceof Person)
			return name.equals(((Person)other).name) && age == ((Person)other).age;
		else
			return false;
	}
}
