import java.util.*;
public class Inventory
{
  
  // One possibility for storing Product Lines
  private static Scanner keyboard = new Scanner(System.in); 
  public static ArrayList<ProductLine> products;
  private static int enterquantity;

  public Inventory() {
    products = new ArrayList<ProductLine>();
    products.add(new ProductLine("A0001", 10.90, 9.90, 100));
    products.add(new PerishableProductLine("B0010", 12.00, 7.50, 125, 5));
    products.add(new PerishableProductLine("C0100", 3.00, 2.30, 1000, 16));
    products.add(new ItemisedProductLine("D1000", 2600, 2490, 2, "AAA111111"));
    products.add(new ItemisedProductLine("D1000", 2600, 2490, 2, "BBB222222"));
    products.add(new ItemisedProductLine("E0001", 699, 509, 3, "CCCC333333"));
    products.add(new ItemisedProductLine("E0001", 699, 509, 3, "DDDD444444"));
    products.add(new ItemisedProductLine("E0001", 699, 509, 3, "AAAA222222"));
  }

  public static void pointOfSale() {
    String enteredcode = IO.readLine("Enter product code: ");
    ProductLine product = getProduct(enteredcode);
    if (product == null)
      System.out.println("Invalid code"); 
    else
      enterquantity = Integer.parseInt(IO.readLine("Enter the quantity: "));
    double totalprice = product.getSalePrice() * enterquantity;
    System.out.println("Total Price: " + totalprice);
    
  }

  public static ProductLine getProduct(String enteredcode) {
    for (ProductLine product : products)
      if (product.getProductCode().equals(enteredcode))
        return product;
    return null;
 } 

  public void addProduct(ProductLine pl) {
  }
  public void sellProduct(String productCode, int no) {
  }
  public void increaseStock(String productCode, int no) {
  }
}

