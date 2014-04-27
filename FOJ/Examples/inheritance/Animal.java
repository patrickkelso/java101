public abstract class Animal {
	private int stomach;

	public Animal(int stomach) {
		this.stomach = stomach;
	}

	public void eat() {
		System.out.println("Slurp slurp");
		stomach++;
	}

	public void show() {
		System.out.println("Stomach level is " + stomach);
	}

	public int getStomach() {
		return stomach;
	}

	public abstract boolean isAlive();

	public abstract void die();
}
