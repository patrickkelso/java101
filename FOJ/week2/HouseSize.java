public class HouseSize {
  public static void main (String[] args) {
    int houselength = 10;
    int housewidth = 5;
    int househeight = 3;
    double roofheight = 2.5;
    int housevolume = houselength * housewidth * househeight;
    double roofvolume = .5 * houselength * housewidth * roofheight;
    double totalvolume = housevolume + roofvolume;
    System.out.println("The house size is " + totalvolume + "m cubed");
 }
}
