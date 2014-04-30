import java.util.*;

public class ItemisedProductLine extends ProductLine {

  public ItemisedProductLine(String productCode, double recRetPrice, double salePrice, int quantity, String serialNumber){
    super(productCode, recRetPrice, salePrice, quantity);
    serialNumber = serialNumber;
  }


    // one possibility for storing SerialNumbers
    private ArrayList<String> serialNumbers; // Format X[10]

    public void sell(int no) {
    }
}
