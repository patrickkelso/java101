
/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House
{
    public static void make()
    {
        Square fred;
        fred = new Square();
        fred.makeVisible();
        Triangle roof = new Triangle();
        roof.makeVisible();
        roof.moveHorizontal(25);
        roof.moveVertical(10);
    }
}
