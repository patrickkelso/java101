import java.awt.*;
import javax.swing.*;

public class FirstProgram {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel toolbar = new JPanel();
    toolbar.add(new JButton("File"));
    toolbar.add(new JButton("Edit"));
    toolbar.add(new JButton("Tools"));
    toolbar.add(new JButton("View"));
    toolbar.add(new JButton("Help"));

    frame.setLayout(new BorderLayout());
    frame.add(toolbar, BorderLayout.NORTH);
    frame.add(new JButton("two"), BorderLayout.WEST);
    frame.add(new JButton("three"), BorderLayout.EAST);
    frame.add(new JButton("four"), BorderLayout.SOUTH);
    frame.add(new JButton("five"), BorderLayout.CENTER);

    frame.pack();

    frame.setVisible(true);
  }
}
