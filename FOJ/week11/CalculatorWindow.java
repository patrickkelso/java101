import java.awt.*;
import javax.swing.*;
public class CalculatorWindow extends JFrame {
  private NumbersPanel numbersPanel;
  private ButtonsPanel buttonsPanel;
  public CalculatorWindow() {
    numbersPanel = new NumbersPanel();
    buttonsPanel = new ButtonsPanel();

    setLayout(new BorderLayout());
    add(numbersPanel, BorderLayout.CENTER);
    add(buttonsPanel, BorderLayout.SOUTH);
    pack();

  }
}



