public class RectangleBuilder {
  public static void main (String[] args) {
    Rectangle rect = new Rectangle();
    rect.width = 5.0;
    rect.height = 4.0;
    rect.showDimensions();
    rect.shrink();
    rect.showDimensions();
    rect.showArea();
 }
}
