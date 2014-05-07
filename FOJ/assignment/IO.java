import java.util.*;
public class IO {
  public static final Scanner keyboard = new Scanner(System.in);
  public static String readLine(String prompt) {
    System.out.println(prompt);
    String answer = keyboard.nextLine();
    return answer;
  }

  public static char readChar(String prompt) {
    return readLine(prompt).charAt(0);
  }

  public static boolean ask(String question) {
    return readLine(question).equalsIgnoreCase("Y");
  }

}

