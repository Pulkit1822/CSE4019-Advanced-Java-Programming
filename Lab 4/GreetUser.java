import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class GreetUser {
    public static void main(String[] args) {
        Frame frame = new Frame("Greet User");
        frame.setLayout(new FlowLayout());

        Label label = new Label("Enter your name: ");
        final TextField textField = new TextField(20);
        frame.add(label);
                frame.add(textField);

                textField.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String name = textField.getText();
                        if (name.length() > 0) {
                            String greeting = "Hello, " + name;
                            JOptionPane.showMessageDialog(frame, greeting);
                        }
                    }
                });

                frame.setSize(300,150);
                frame.setVisible(true);
    }
}

