
public class Circle extends Shape {
  private double radius;

  public Circle(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public void show() {
    super.show();
    System.out.println("Radius: " + radius); 
    System.out.println("Circumference: " + (radius * 2 * Math.PI));
  }
}
