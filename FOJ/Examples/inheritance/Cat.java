public class Cat extends Animal {
	private int lives;

	public Cat() {
		super(0);
		lives = 9;
	}

	public void show() {
		System.out.println("This cat has " + lives
				+ " lives remaining and has stomach " + getStomach() + ".");
	}

	public boolean isAlive() {
		return lives > 0;
	}

	public void die() {
		if (lives > 0) {
				lives--;
		}
	}

	public void makeNoise() {
		System.out.println("Meeeoooooowww...");
	}
}
