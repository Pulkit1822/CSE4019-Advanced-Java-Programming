import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LanguageChoiceDialog extends Frame implements ActionListener {
    Button button;
    Choice language;

    LanguageChoiceDialog() {
        super("Programming Language Choice");

        setLayout(new FlowLayout());

        Label label = new Label("Choose your favorite programming language:");
        language = new Choice();
        language.add("Java");
        language.add("Python");
        language.add("C#");
        language.add("C/C++");

        button = new Button("OK");
        button.addActionListener(this);

        add(label);
        add(language);
        add(button);

        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String choice = language.getItem(language.getSelectedIndex());
        String message = "You chose: " + choice;
        JOptionPane.showMessageDialog(this, message, "Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new LanguageChoiceDialog();
    }
}
