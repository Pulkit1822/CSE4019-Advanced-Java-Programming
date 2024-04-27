import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginFrame extends JFrame {
    private JTextField loginUsernameField;
    private JPasswordField loginPasswordField;
    private JTextField registerUsernameField;
    private JPasswordField registerPasswordField;

    public LoginFrame() {
        setTitle("Login/Register Form");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        Border border = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        panel.setBorder(border);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel loginUsernameLabel = new JLabel("Username:");
        loginUsernameField = new JTextField();
        JLabel loginPasswordLabel = new JLabel("Password:");
        loginPasswordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        JLabel registerUsernameLabel = new JLabel("New Username:");
        registerUsernameField = new JTextField();
        JLabel registerPasswordLabel = new JLabel("New Password:");
        registerPasswordField = new JPasswordField();
        JButton registerButton = new JButton("Register");

        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(loginUsernameLabel, constraints);

        constraints.gridx = 1;
        panel.add(loginUsernameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(loginPasswordLabel, constraints);

        constraints.gridx = 1;
        panel.add(loginPasswordField, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(loginButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(registerUsernameLabel, constraints);

        constraints.gridx = 1;
        panel.add(registerUsernameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(registerPasswordLabel, constraints);

        constraints.gridx = 1;
        panel.add(registerPasswordField, constraints);

        constraints.gridx = 1;
        constraints.gridy = 5;
        panel.add(registerButton, constraints);

        add(panel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = loginUsernameField.getText();
                String password = new String(loginPasswordField.getPassword());

                if (checkLogin(username, password)) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Logged in successfully!");
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Incorrect username or password.");
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = registerUsernameField.getText();
                String password = new String(registerPasswordField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Please enter both username and password.");
                    return;
                }

                if (registerUser(username, password)) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "User registered successfully!");
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Failed to register user. Please try again.");
                }
            }
        });
    }

    private boolean checkLogin(String username, String password) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String pass = "Pulkit18";
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean registerUser(String username, String password) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String pass = "Pulkit18";
        String query = "INSERT INTO users (username, password) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
