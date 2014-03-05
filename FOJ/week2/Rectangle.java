class Rectangle {
  double height;
  double width;
  double area;

  Rectangle() {
    this.height = 0;
    this.width = 0;
    System.out.println("I'm no square");
  }


  void showDimensions() {
    System.out.println("The dimensions of this rectangle are " + this.width + "cm wide" + "x" + this.height + "cm high");
  }

  void shrink() {
    this.height = this.height - 1;
    this.width = this.width - 1;
  }

  void showArea() {
    this.area = this.height * this.width;
    System.out.println("The area of this rectangle is " + this.area + " square cm");
  }
}
