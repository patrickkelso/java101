public class EnemyShip {
	private int x;
	private int y;
	private int direction;
	private int energy;

	// direction is either -1 or 1
	public EnemyShip(int x, int y, int direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
		energy = 20;
	}

	public void print() {
		if (isAlive()) {
			if (energy > 10)
				Screen.setPixel(x, y, 'e');
			else
				Screen.setPixel(x, y, 'x');
		}
	}

	public void move() {
		x += direction;
		if (x < 0 || x >= Game.WIDTH) {
			direction *= -1;
			x += 2*direction;
			y++;
		}
	}

	public void takeBullet(int x, int energy) {
		if (this.x == x) {
			this.energy -= energy;
		}
	}

	public boolean isAlive() {
		return energy > 0;
	}

	public boolean hasLanded() {
		return y == Game.HEIGHT - 1;
	}
}
