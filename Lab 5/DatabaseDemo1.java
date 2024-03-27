import java.io.File;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;


public class DatabaseDemo1 extends Frame implements ActionListener {
    private TextField nameField, ageField, idField;
    private Button addButton, updateButton, deleteButton;
    private Label messageLabel;
    private Connection connection;

    public DatabaseDemo1() {
        super("Database Demo");

        // Create text fields
        nameField = new TextField(10);
        ageField = new TextField(10);
        idField = new TextField(10);

        // Create buttons
        addButton = new Button("Add");
        addButton.addActionListener(this);
        updateButton = new Button("Update");
        updateButton.addActionListener(this);
        deleteButton = new Button("Delete");
        deleteButton.addActionListener(this);

        // Create message label
        messageLabel = new Label("");

        // Add components to window
        setLayout(new FlowLayout());
        add(new Label("Name:"));
        add(nameField);
        add(new Label("Age:"));
        add(ageField);
        add(new Label("ID:"));
        add(idField);
        add(addButton); 
        add(updateButton);
        add(deleteButton);
        add(messageLabel);

        // Connect to MySQL database
        try {
            File file = new File("mysql-connector-java-8.0.26/mysql-connector-java-8.0.26.jar");
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "Pulkit18");
            messageLabel.setText("Connected to database successfully");
        } catch (ClassNotFoundException | SQLException ex) {
            messageLabel.setText("Error connecting to database: " + ex.getMessage());
        }

        // Set window size and visibility
        setSize(500, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Statement statement = connection.createStatement();
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            int id = Integer.parseInt(idField.getText());

            if (e.getSource() == addButton) {
                String sql = "INSERT INTO mytable (name, age, id) VALUES ('" + name + "', " + age + ", " + id + ")";
                System.out.println(sql);
                statement.executeUpdate(sql);
                messageLabel.setText("Record added successfully");
            } else if (e.getSource() == updateButton) {
                String sqlUpdate = "UPDATE mytable SET name = '" + name + "', age = " + age + " WHERE id = " + id;
                System.out.println(sqlUpdate);
                statement.executeUpdate(sqlUpdate);
                messageLabel.setText("Record updated successfully");
            } else if (e.getSource() == deleteButton) {
                String sqlDelete = "DELETE FROM mytable WHERE id = " + id;
                System.out.println(sqlDelete);
                statement.executeUpdate(sqlDelete);
                messageLabel.setText("Record deleted successfully");
            }
        } catch (SQLException ex) {
            messageLabel.setText("Error performing operation: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new DatabaseDemo1();
    }
}
