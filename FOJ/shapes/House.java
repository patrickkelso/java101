
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
        Square fred = new Square();
            fred.makeVisible();
            fred.moveVertical(90);
        Triangle roof = new Triangle();
            roof.makeVisible();
            roof.moveHorizontal(25);
            roof.moveVertical(100);
            roof.changeColor("black");
        Square doorbottom = new Square();
            doorbottom.changeSize(5);
            doorbottom.moveHorizontal(12);
            doorbottom.moveVertical(115);
            doorbottom.makeVisible();
            doorbottom.changeColor("black");
        Square doortop = new Square();
            doortop.changeSize(5);
            doortop.moveHorizontal(12);
            doortop.moveVertical(110);
            doortop.makeVisible();
            doortop.changeColor("black");
        Square win1 = new Square();
            win1.makeVisible();
            win1.changeSize(6);
            win1.changeColor("blue");
            win1.moveHorizontal(5);
            win1.moveVertical(100);
        Square win2 = new Square();
            win2.makeVisible();
            win2.changeSize(6);
            win2.changeColor("blue");
            win2.moveHorizontal(20);
            win2.moveVertical(100);
        Circle sun = new Circle();
            sun.makeVisible();
            sun.moveHorizontal(80);
            sun.moveVertical(-40);
            sun.changeSize(100);
            sun.changeColor("yellow");
        Square tree0 = new Square();
            tree0.changeSize(7);
            tree0.moveHorizontal(52);
            tree0.moveVertical(115);
            tree0.makeVisible();
            tree0.changeColor("black");
        Square tree1 = new Square();
            tree1.changeSize(7);
            tree1.moveHorizontal(52);
            tree1.moveVertical(110);
            tree1.makeVisible();
            tree1.changeColor("black");
        Triangle tree2 = new Triangle();
            tree2.changeSize(10,15);       
            tree2.moveHorizontal(65);
            tree2.moveVertical(135);
            tree2.changeColor("green");
            tree2.makeVisible();
        Triangle tree3 = new Triangle();
            tree3.changeSize(10,15);       
            tree3.moveHorizontal(65);
            tree3.moveVertical(130);
            tree3.changeColor("green");
            tree3.makeVisible();
        Triangle tree4 = new Triangle();
            tree4.changeSize(10,15);       
            tree4.moveHorizontal(65);
            tree4.moveVertical(125);
            tree4.changeColor("green");
            tree4.makeVisible();
        Square grass = new Square();
            grass.changeSize(300);
            grass.changeColor("green");
            grass.moveVertical(120);
            grass.moveHorizontal(-60);
            grass.makeVisible();
            
    }
}
