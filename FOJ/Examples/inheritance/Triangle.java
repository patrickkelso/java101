public class Triangle extends Shape{
	private int base;
	private int height;

	public Triangle(char color, int x, int y, int base, int height) {
		super(color, x, y);
		this.base = base;
		this.height = height;
	}

	public void paint() {
		for (int row = 0; row < height; row++) {
			double fraction = (double)row / (double)(height - 1);
			int rowWidth = (int)(fraction * base);
			for (int col = 0; col < rowWidth; col++)
				Screen.setPixel(col + x, row + y, color);
		}
	}
}
