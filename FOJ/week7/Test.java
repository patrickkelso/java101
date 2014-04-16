import java.util.*;

public class Test {
//  public static void main(String[] args) {
//    Rectangle r = new Rectangle(3, 2, 5, 6);
//    r.show();
//    Shape c = new Circle(5, 4, 5);
//    c.show();
//    System.out.println("Circle area is: " + c.getArea());
//}
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public Test() {

      shapes.add(new Rectangle(4, 5, 7, 9));
      shapes.add(new Rectangle(9, 7, 5, 4));
      shapes.add(new Circle(3, 3, 3));


  }
  public void printAreas() {
    System.out.println("Calculating matrices");
    for (Shape shape : shapes)
      shape.getArea();
      }
}
