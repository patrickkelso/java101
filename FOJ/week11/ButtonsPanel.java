import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonsPanel extends JPanel {
  private JButton addButton;
  private JButton subButton;
  private JButton mulButton;
  private JButton divButton;

  public ButtonsPanel() {
    setLayout(new FlowLayout());
    
    addButton = new JButton("+");
    add(addButton);
    addButton = new JButton("-");
    add(addButton);
    addButton = new JButton("*");
    add(addButton);
    addButton = new JButton("/");
    add(addButton);
  }
}
