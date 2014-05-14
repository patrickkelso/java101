import java.awt.*;
import javax.swing.*;

public class NumbersPanel extends JPanel {
  private JLabel number1Label;
  private JTextField number1Field;
  private JLabel number2Label;
  private JTextField number2Field;
  private JLabel resultLabel;
  private JTextField resultField;

  public NumbersPanel() {
    setLayout(new GridLayout(3, 2));

    number1Label = new JLabel("Number 1:");
    add(number1Label);
    number1Field = new JTextField(5);
    add(number1Field);
    number2Label = new JLabel("Number 1:");
    add(number2Label);
    number2Field = new JTextField(5);
    add(number2Field);
    resultLabel = new JLabel("Number 1:");
    add(resultLabel);
    resultField = new JTextField(5);
    add(resultField);
  }

  public double getNumber1() {
   return Double.parseDouble(number1Field.getText());
  }
  public double getNumber2() {
   return Double.parseDouble(number2Field.getText());
  }
  public void setResult(double result) {
    resultField.setText(String.valueOf(result));
  }
}
