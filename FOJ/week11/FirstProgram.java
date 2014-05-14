import java.awt.*;
import javax.swing.*;

public class FirstProgram {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(300, 300);

    frame.setLayout(new FlowLayout());
    frame.add(new JButton("one"));
    frame.add(new JButton("two"));
    frame.add(new JButton("three"));
    frame.add(new JButton("four"));

    frame.pack();

    frame.setVisible(true);
  }
}
