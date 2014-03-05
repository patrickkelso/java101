import java.util.*;

public class HouseSize {
   public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("What is the house length? ");
    int houselength = keyboard.nextInt();
    System.out.print("What is the house width? ");
    int housewidth = keyboard.nextInt();
    System.out.print("What is the house height? ");
    int househeight = keyboard.nextInt();
    System.out.print("What is the roof height? ");
    double roofheight = keyboard.nextDouble();
    int housevolume = houselength * housewidth * househeight;
    double roofvolume = .5 * houselength * housewidth * roofheight;
    double totalvolume = housevolume + roofvolume;
    System.out.println("The house size is " + totalvolume + "m cubed");
 }
}
