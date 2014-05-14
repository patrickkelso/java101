public class PerishableProductLine extends ProductLine
{
    private int daysToExpiry;
    public PerishableProductLine(String productCode, double recRetPrice, double salePrice, int quantity, int daysToExpiry) {
      super(productCode, recRetPrice, salePrice, quantity);
      daysToExpiry = daysToExpiry;
    }

    public int getDaysToExpiry() {
      return daysToExpiry;
    }

    public void setDaysToExpiry(int days) {
      daysToExpiry = days;
    }

    public void decrementExpiry() {
      daysToExpiry--;
    }

}
