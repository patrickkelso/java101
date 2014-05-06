import java.util.*;
public class Application {
    public static void main(String[] args) {
      Application application = new Application();
      application.start();
    }

    private Inventory inventory;
    private Scanner keyboard = new Scanner(System.in);

    public Application() {
      inventory = new Inventory();
    }
    public void start() {
      while (true) {
        mainMenu();
      }
    }

    private void mainMenu() {
      System.out.println("               Options :");
      System.out.println("                  1.    Point of Sale");
      System.out.println("                  2.    Inventory Control");
      System.out.println("                  3.    Price Control");
      System.out.println("                  4.    End of Day");
      System.out.println("");
      System.out.println("                  X.    Exit");
      System.out.println("");
      System.out.print("Enter a choice: ");
      String selection = keyboard.nextLine();
      switch (selection) {
      case "1": pointOfSale(); break;
      case "2": inventoryControl(); break;
      case "3": priceControl(); break;
      case "4": endOfDay(); break;
      case "X": exit(); break;
      case "x": exit(); break;
        default: error(selection); break;
      }
        

    }
    private void pointOfSale() {
      System.out.print("Enter product code: ");
      String enteredcode = keyboard.nextLine();

      ProductLine product = inventory.getProduct(enteredcode);
      if (product == null)
        System.out.println("Invalid code");
      else
        System.out.print("Enter quantity: ");
        int enterquantity = keyboard.nextInt();
        String blankspace = keyboard.nextLine();
    }
    private void inventoryControl() {
    }
    private void priceControl() {
    }
    private void endOfDay() {
    }
    private void error(String selection) {
      System.err.println("Invalid Choice: " + selection);
    }
    private void exit() {
      System.exit(0);
    }
}
