public class Screen {
	private static char[][] pixels = new char[Game.HEIGHT][Game.WIDTH];

	public static void clear() {
		for (int row = 0; row < Game.HEIGHT; row++)
			for (int col = 0; col < Game.WIDTH; col++)
				pixels[row][col] = ' ';
	}

	public static void setPixel(int x, int y, char color) {
		if (x < 0 || x >= Game.WIDTH || y < 0 || y >= Game.HEIGHT)
			return;
		pixels[y][x] = color;
	}

	public static void render() {
		for (int row = 0; row < Game.HEIGHT; row++) {
			//print each row
			for (int col = 0; col < Game.WIDTH; col++) {
				System.out.print(pixels[row][col]);
			}
			System.out.println();
		}
	}
}
