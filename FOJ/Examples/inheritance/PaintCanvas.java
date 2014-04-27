import java.util.*;

public class PaintCanvas {
	private ArrayList<Shape> shapes = new ArrayList<Shape>();

	public PaintCanvas() {
		shapes.add(new Rectangle('X', 15, 5, 10, 12));
		shapes.add(new Triangle('o', 4, 8, 14, 12));
	}

	public void paint() {
		Screen.clear();

		for (Shape shape : shapes) {
			shape.paint();
		}

		Screen.render();
	}

	public void animate() {
		Shape shape = shapes.get(1);

		for (int i = 0; i < 30; i++) {
			shape.move(1, 0);
			paint();
			try { Thread.sleep(100); } catch (Exception e) { e.printStackTrace(); }
		}
	}

	public static void main(String[] args) {
		PaintCanvas canvas = new PaintCanvas();
		canvas.animate();
	}
}
