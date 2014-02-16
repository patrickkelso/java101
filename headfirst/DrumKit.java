class DrumKit {
  boolean tophat = true;
  boolean snare = true;
  void playsnare() {
    System.out.println("bang bang ba-bang");
  }
  void playtophat () {
    System.out.println("ding ding da-ding");
  }
}  
class DrumKitTestDrive {
  public static void main(String [] args) {
  DrumKit d = new DrumKit();
  d.playsnare();
  d.snare = false;
  d.playtophat();

  if (d.snare == true ) {
    d.playsnare();
  }
 }
} 
