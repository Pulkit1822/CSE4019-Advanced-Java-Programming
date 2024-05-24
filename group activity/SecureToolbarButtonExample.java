import javax.swing.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SecureToolbarButtonExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Secure Toolbar Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("File");
            JMenuItem secureMenuItem = new JMenuItem("Secure Item");

            secureMenuItem.addActionListener(e -> {
                String enteredUsername = JOptionPane.showInputDialog(null, "Enter username:", "Authentication", JOptionPane.QUESTION_MESSAGE);
                char[] enteredPassword = JOptionPane.showInputDialog(null, "Enter password:", "Authentication", JOptionPane.QUESTION_MESSAGE).toCharArray();

                try {
                    if ("admin".equals(enteredUsername) && hash(new String(enteredPassword)).equals(hash("admin"))) {
                        performSecureOperation();
                    } else {
                        showAuthenticationError();
                    }
                } catch (NoSuchAlgorithmException ex) {
                    ex.printStackTrace();
                }
            });

            fileMenu.add(secureMenuItem);
            menuBar.add(fileMenu);
            frame.setJMenuBar(menuBar);
            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }
    private static void performSecureOperation() {
        System.out.println("Performing secure operation...");
        JOptionPane.showMessageDialog(null, "Secure operation performed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void showAuthenticationError() {
        System.out.println("Authentication failed!");
        JOptionPane.showMessageDialog(null, "Authentication failed!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private static String hash(String input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(input.getBytes());

        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
