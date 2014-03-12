public class Circle
{
  private double radius;

  public Circle(double radius)
  {
    this.radius = radius;
  }

  public double getRadius()
  {
    return this.radius;
  }

  public double getDiameter()
  {
    return this.radius * 2.0;
  }

  public double getArea()
  {
    return 3.1415 * this.radius * this.radius;
  }

  public double getCircumference()
  {
    return 3.1415 * this.radius * 2;
  }
}
