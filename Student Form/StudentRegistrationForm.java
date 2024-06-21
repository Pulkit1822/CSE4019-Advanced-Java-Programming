import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegistrationForm extends JFrame implements ActionListener {

    // Components of the Form
    private JTextField nameField, rollField, courseField;
    private JPasswordField passwordField;
    private JTextArea addressArea, resultArea;
    private JButton submitButton;

    // Constructor to setup GUI components and event handling
    public StudentRegistrationForm() {
        // Set up the frame
        setTitle("Student Course Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2));

        // Add components
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Roll Number:"));
        rollField = new JTextField();
        add(rollField);

        add(new JLabel("Course:"));
        courseField = new JTextField();
        add(courseField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel("Address:"));
        addressArea = new JTextArea();
        add(new JScrollPane(addressArea));

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JLabel("Form Details:"));
        add(new JScrollPane(resultArea));

        setVisible(true);
    }

    // Handle the submit button action
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String roll = rollField.getText();
            String course = courseField.getText();
            String password = new String(passwordField.getPassword());
            String address = addressArea.getText();

            resultArea.setText("Name: " + name + "\n"
                    + "Roll Number: " + roll + "\n"
                    + "Course: " + course + "\n"
                    + "Password: " + password + "\n"
                    + "Address: " + address);
        }
    }

    // Main method to create the GUI
    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
