import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components");
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton button = new JButton("Click Me!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });

        JButton colorButton = new JButton("Choose Color");
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Choose color", Color.WHITE);
                panel.setBackground(color);
            }
        });

        String[] columnNames = {"Name", "Age"};
        Object[][] data = {
                {"Pulkit", 20,},
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane tableScrollPane = new JScrollPane(table);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", new JLabel("This is Tab 1"));
        tabbedPane.addTab("Tab 2", new JLabel("This is Tab 2"));

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Swings Component");
        JMenuItem menuItem = new JMenuItem("Exit");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(menuItem);
        menuBar.add(menu);

        JDialog dialog = new JDialog(frame, "Dialog Example", true);
        dialog.setSize(200, 100);
        dialog.setLayout(new FlowLayout());
        dialog.add(new JLabel("This is a dialog"));
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        dialog.add(closeButton);

        panel.add(scrollPane);
        panel.add(button);
        panel.add(colorButton);
        panel.add(tableScrollPane);
        panel.add(tabbedPane);

        frame.setJMenuBar(menuBar);
        frame.add(panel);

        frame.setVisible(true);
    }
}

