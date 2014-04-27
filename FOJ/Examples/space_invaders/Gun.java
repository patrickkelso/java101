public class Gun {
	private int energy;
	private int x;
	private int y;

	public Gun(int x, int y, int energy) {
		this.x = x;
		this.y = y;
		this.energy = energy;
	}

	public void move(int dx) {
		x += dx;
	}

	public void fire(EnemyShip enemy) {
		enemy.takeBullet(x, energy);
	}
}
