import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame {
    private JTextField inputField1;
    private JTextField inputField2;
    private JButton calculateButton;
    private JTextField resultField;

    public CalculatorApp() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = inputField1.getText();
                String input2 = inputField2.getText();

                int num1 = Integer.parseInt(input1);
                int num2 = Integer.parseInt(input2);

                int result = num1 + num2;

                resultField.setText(String.valueOf(result));
            }
        });

        resultField = new JTextField(10);
        resultField.setEditable(false);

        add(inputField1);
        add(inputField2);
        add(calculateButton);
        add(resultField);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorApp();
            }
        });
    }
}
