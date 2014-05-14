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

    AddListener addListener = new AddListener();
    SubListener subListener = new SubListener();
    MulListener mulListener = new MulListener();
    DivListener divListener = new DivListener();
    
    addButton = new JButton("+");
    addButton.addActionListener(addListener);
    add(addButton);
    addButton = new JButton("-");
    addButton.addActionListener(subListener);
    add(addButton);
    addButton = new JButton("*");
    addButton.addActionListener(mulListener);
    add(addButton);
    addButton = new JButton("/");
    addButton.addActionListener(divListener);
    add(addButton);
  }

  public class AddListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      System.out.println("Yay! Plus was clicked");
    }
  }
  public class SubListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      System.out.println("Yay! Subtract was clicked");
    }
  }
  public class MulListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      System.out.println("Yay! Multiply was clicked");
    }
  }
  public class DivListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      System.out.println("Yay! Divide was clicked");
    }
  }
}
