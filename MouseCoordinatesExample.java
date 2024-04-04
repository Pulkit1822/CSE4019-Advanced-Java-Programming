import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseCoordinatesExample extends JFrame implements MouseMotionListener {
    private JLabel coordinatesLabel;

    public MouseCoordinatesExample() 
    {
        setTitle("Mouse Coordinates Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        coordinatesLabel = new JLabel("Coordinates: (0, 0)");
        panel.add(coordinatesLabel);

        add(panel);

        addMouseMotionListener(this);

        setVisible(true);
    }

    @Override
    public void mouseMoved(MouseEvent e) 
    {
        int x = e.getX();
        int y = e.getY();
        coordinatesLabel.setText("Coordinates: (" + x + ", " + y + ")");
    }

    @Override
    public void mouseDragged(MouseEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MouseCoordinatesExample::new);
    }
}