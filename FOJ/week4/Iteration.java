class Iteration {

  public static void main (String[] args) { 
  ten();
  odd();
  nstars(15);
  sum(12);
  }

  public static void ten(){
    for (int i = 1; i <=10; i++)
      System.out.println(i);
  }

  public static void odd(){
    for (int i = 7; i <=25; i+=2) {
      System.out.print(i);
      if (i < 25)
    System.out.print(", ");
    }
    System.out.println("");
  }

  public static void nstars(int numstars){
    for (int i = 1; i <=numstars; i++) {
      System.out.print("*");
    }
    System.out.println("");
  }

  public static void sum(int max){
    int x = 0;
    int i = 0;

    while (i <= max) {
      x += i;
    }
    System.out.println(x);
  }

}
