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
        case "1": Inventory.pointOfSale(); break;
        case "2": inventoryControl(); break;
        case "3": priceControl(); break;
        case "4": endOfDay(); break;
        case "X": exit(); break;
        case "x": exit(); break;
        default: error(selection); break;
      }


    }
    private void inventoryControl() {
    }
    private void priceControl() {
    String enteredcode = IO.readLine("Enter product code: ");
     ProductLine product = Inventory.getProduct(enteredcode);
     while (product != null) {
        System.out.println("Current RRP is: " + product.getRecRetPrice());
        Double enterRRP = Double.parseDouble(IO.readLine("Enter the new recommended price: "));
        System.out.println("Current sale price is: " + product.getSalePrice());
        Double enterSale = Double.parseDouble(IO.readLine("Enter the new sale price: "));
        product.setrecRetPrice(enterRRP);
        product.setsalePrice(enterSale);
        product = null;
      }

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
