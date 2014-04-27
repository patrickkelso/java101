public class Dog extends Animal {
	private boolean alive;

	public Dog() {
		super(8);
		alive = true;
	}

	public void show() {
		super.show();
		if (alive)
			System.out.println("This dog is alive");
		else
			System.out.println("This dog is dead");
	}

	public void eat() {
		wagTail();
		super.eat();
	}

	public boolean isAlive() {
		return alive;
	}

	public void die() {
		alive = false;
	}

	public void wagTail() {
		System.out.println("Woosshhh wwoooshhh");
	}

	public void makeNoise() {
		System.out.println("Ruffffff");
	}
}
