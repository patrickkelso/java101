public class PlayerShip {
	private int x;
	private int y;
	private Gun gun1;
	private Gun gun2;

	public PlayerShip(int x, int y) {
		this.x = x;
		this.y = y;
		gun1 = new Gun(x - 1, y, 10);
		gun2 = new Gun(x + 1, y, 10);
	}

	public void move(int dx) {
		int newX = x + dx;
		if (newX < 1 || newX >= Game.WIDTH - 1) {
			return;
		}
		x = newX;
		gun1.move(dx);
		gun2.move(dx);
	}

	public void print() {
		Screen.setPixel(x, y, '^');
		Screen.setPixel(x-1, y, 'i');
		Screen.setPixel(x+1, y, 'i');
	}

	public void fire(EnemyShip enemy) {
		gun1.fire(enemy);
		gun2.fire(enemy);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
