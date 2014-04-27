public abstract class Shape {
	protected char color;
	protected int x;
	protected int y;

	public Shape(char color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public abstract void paint();
}
