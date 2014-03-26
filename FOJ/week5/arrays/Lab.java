public class Lab
{
    private static int[] DAYS_IN_MONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // add all 12 months to this array!
    public static int getDayOfYear(int day, int month)
    {
       int totalDays = day;
       for (int i = (month - 2); i >= 0; i--)
         totalDays += DAYS_IN_MONTH[i]; 
       return totalDays;
    }
    public static void main (String[] args) { 
      System.out.println(getDayOfYear(20,6));
    }
}
