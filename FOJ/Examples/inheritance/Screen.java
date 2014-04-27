public class Screen {
	public static int WIDTH = 38;
	public static int HEIGHT = 24;
	private static char[][] pixels = new char[HEIGHT][WIDTH];

	public static void clear() {
		for (int row = 0; row < HEIGHT; row++)
			for (int col = 0; col < WIDTH; col++)
				pixels[row][col] = ' ';
	}

	public static void setPixel(int x, int y, char color) {
		if (x < 0 || x >= WIDTH || y < 0 || y >= HEIGHT)
			return;
		pixels[y][x] = color;
	}

	public static void render() {
		for (int row = 0; row < HEIGHT; row++) {
			//print each row
			for (int col = 0; col < WIDTH; col++) {
				System.out.print(pixels[row][col] + " ");
			}
			System.out.println();
		}
	}
}
