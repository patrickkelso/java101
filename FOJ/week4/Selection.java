class Selection {
  public static void main (String[] args) { 
    int number = (2 + 3) * 46 - 53 + 47 * (2 + 3) - 1000;
    posNeg(number);
    winLose();
    teenager(14);
    teenager(11);
    showGrade(77);
    smallest(4,7,5);
  }
  public static void posNeg(int number){
    if (number < 0)
      System.out.println(number + " is negative");
    else if (number > 0)
      System.out.println(number + " is postitive");
    else 
      System.out.println(number + " neither");
  }

  public static void winLose(){
    double score = Math.random();
    if (score >= .5)
      System.out.println("Goal Imnida");
    else
      System.out.println("Goal Opseyo");
  }
  
  public static void teenager(int age){
    if (age >= 20 || age <= 12)
      System.out.println("You're not a teenager");
    else 
      System.out.println("You're a teenager");
  }

  public static void showGrade(int mark){
    if (mark >= 85)
      System.out.println("You're grade is a HD");
    else if (mark >=75)
      System.out.println("You're grade is a D");
    else if (mark >=65)
      System.out.println("You're grade is a C");
    else if (mark >=50)
      System.out.println("You're grade is a P");
    else
      System.out.println("You're grade is a Z");
  }

  public static void smallest(int a,int b,int c){
    if (a < b && a < c)
      System.out.println(a + " is the smallest");
    else if (b < a && b < c)
      System.out.println(b + " is the smallest");
    else
      System.out.println(c + " is the smallest");


  }

}
