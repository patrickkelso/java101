public class Wheel {
  public static void main (String[] args) {
    int radius = 30;
    int wheelwidth = 18;
    double wheelvolume = Math.PI * radius * radius * wheelwidth;
    double wheelcircumference = 2 * Math.PI * radius;
    System.out.println("The wheel size is " + wheelvolume + "cm cubed");
    System.out.println("The wheel circumference is " + wheelcircumference + "cm");
 }
}
