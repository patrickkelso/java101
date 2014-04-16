public abstract class Shape {
  private double x;
  private double y;

  public Shape(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void move(double dx, double dy) {
    x += dx;
    y += dy;
  }

  public void show() {
    System.out.println("Position: (" + x + "," + y + ")");
  }
  
  public abstract double getArea();
}
