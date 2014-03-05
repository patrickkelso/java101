class Circle {
  double radius;

  Circle() {
    this.radius = 0;
    System.out.println("No sharp edges here");
  }


  void showRadius() {
    System.out.println("This circle has a radius of: " + this.radius + "cm");
  }

  void showDiameter() {
    System.out.println("This circle has a diameter of: " + 2 * this.radius + "cm");
  }

  void showCircumference() {
    System.out.println("This circle has a circumference of: " + Math.PI * 2 * this.radius + "cm");
  }

  void showArea() {
    System.out.println("The area of this circle is " + Math.PI * this.radius * this.radius + " square cm");
  }
}
