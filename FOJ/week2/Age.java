import java.util.*;

public class Age {
  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please enter your age: ");
    int age = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("Please enter your name: ");
    String name = keyboard.nextLine();
    System.out.println("Hello " + name + " you are " + age + " years old.");
 }
}
