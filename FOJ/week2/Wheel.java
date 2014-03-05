import java.util.*;

public class Wheel {
  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please enter the radius of the circle: ");
    int radius = keyboard.nextInt();
    System.out.print("Please enter the width of the circle: ");
    int wheelwidth = keyboard.nextInt();
    double wheelvolume = Math.PI * radius * radius * wheelwidth;
    double wheelcircumference = 2 * Math.PI * radius;
    System.out.println("The wheel size is " + wheelvolume + "cm cubed");
    System.out.println("The wheel circumference is " + wheelcircumference + "cm");
 }
}
