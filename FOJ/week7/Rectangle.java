public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double x, double y, double width, double height) {
    super(x, y);
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return width * height;
  }

  public void show() {
    super.show();
    System.out.println("Dimensions: " + width + "x" + height);
  }
}
