public class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle(char color, int x, int y, int width, int height) {
		super(color, x, y);
		this.width = width;
		this.height = height;
	}

	public void paint() {
		for (int row = 0; row < height; row++) {
			// paint one row
			for (int col = 0; col < width; col++) {
				Screen.setPixel(col + x, row + y, color);
			}
		}
	}
}
