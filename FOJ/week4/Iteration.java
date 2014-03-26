class Iteration {

  public static void main (String[] args) { 
  ten();
  odd();
  nstars(15);
  sum(12);
  atob(4,9);
  buyChips();
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
    System.out.println();
  }

  public static void nstars(int numstars){
    for (int i = 1; i <=numstars; i++) {
      System.out.print("*");
    }
    System.out.println("");
  }

  public static void sum(int max){
    int x = 0;
    int i = 1;

    while (i <= max) {
      x =  x + i;
      i++;
    }
    System.out.println(x);
  }

  public static void atob(int min,int max){
    int x = 0;
    int i = min;

    while (i <= max) {
      x =  x + i;
      i++;
    }
    System.out.println(x);
  }

  public static void buyChips(){
    VendingMachine mach1 = new VendingMachine();
    do {
    mach1.insertCoin();
    }
    while (!mach1.chipsReleased()); 
    Chips chips = mach1.getChips();
    System.out.println("I got the chips: " + chips);
    
  }

  public static int fac(int n) {
    if (n == 0)
        return 1;
    else
      return n * fac(n - 1);
  }

}
