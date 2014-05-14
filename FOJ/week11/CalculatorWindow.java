import java.awt.*;
import javax.swing.*;
public class CalculatorWindow extends JFrame {
  private NumbersPanel numbersPanel;
  private ButtonsPanel buttonsPanel;
  public CalculatorWindow() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    numbersPanel = new NumbersPanel();
    buttonsPanel = new ButtonsPanel(numbersPanel);

    setLayout(new BorderLayout());
    add(numbersPanel, BorderLayout.CENTER);
    add(buttonsPanel, BorderLayout.SOUTH);
    pack();

  }
}



