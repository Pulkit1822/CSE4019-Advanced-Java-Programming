import java.awt.*;
import java.awt.event.*;

public class EventHandlingExample extends Frame implements ActionListener, MouseListener, MouseMotionListener {
    Label l;
    Button b;

    EventHandlingExample() {
        // Frame setup
        setTitle("Event Handling Example");
        setSize(400, 300);
        setLayout(null);
        
        // Button setup
        b = new Button("Click Me");
        b.setBounds(50, 50, 80, 30);
        b.addActionListener(this); // Registering ActionListener with the button
        
        // Label setup
        l = new Label();
        l.setBounds(20, 100, 300, 20); // Increased width to display mouse motion events
        
        // Registering MouseListener and MouseMotionListener with the frame
        addMouseListener(this);
        addMouseMotionListener(this);
        
        // Adding components to the frame
        add(b);
        add(l);
        setVisible(true);
    }

    // Implementing actionPerformed method for ActionListener
    public void actionPerformed(ActionEvent e) {
        l.setText("Button Clicked");
    }

    // Implementing MouseListener methods
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    // Implementing MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged at (" + e.getX() + "," + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved at (" + e.getX() + "," + e.getY() + ")");
    }

    public static void main(String[] args) {
        new EventHandlingExample();
    }
}
