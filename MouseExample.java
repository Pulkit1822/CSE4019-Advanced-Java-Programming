import java.awt.*;
import java.awt.event.*;

public class MouseExample extends Frame implements MouseListener, MouseMotionListener {
    Label l;

    MouseExample() {
        l = new Label();
        l.setBounds(20, 50, 300, 20); // Increased width to display mouse motion events
        addMouseListener(this); // Register MouseListener
        addMouseMotionListener(this); // Register MouseMotionListener
        add(l);
        setSize(400, 300); // Increased size to accommodate mouse motion events
        setLayout(null);
        setVisible(true);
    }

    // MouseListener methods
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

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged at (" + e.getX() + "," + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved at (" + e.getX() + "," + e.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseExample();
    }
}
