public class ProductLine
{
    private String productCode; // Format X9999
    private double recRetPrice;
    private double salePrice;
    private int quantity;
    private String description;

    public ProductLine(String productCode, double recRetPrice, double salePrice, int quantity, String description) {
      this.productCode = productCode;
      this.recRetPrice = recRetPrice;
      this.salePrice = salePrice;
      this.quantity = quantity;
      this.description = description;
    }

    public void setquantity(int num){
      quantity = num;
    }

    public void setrecRetPrice(double num){
      recRetPrice = num;
    }

    public void setsalePrice(double num){
      salePrice = num;
    }

    public void sell(int no) {
      setquantity(quantity - no);
    }
}

