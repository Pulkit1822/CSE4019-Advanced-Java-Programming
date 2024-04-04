import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerExample extends JFrame implements MouseMotionListener 
{
    private int mouseX, mouseY;

    public MouseMotionListenerExample() {
        setTitle("Funny Mouse Motion Listener Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add mouse motion listener to the frame
        addMouseMotionListener(this);

        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        // Draw smiley face
        g.setColor(Color.YELLOW);
        g.fillOval(mouseX - 50, mouseY - 50, 100, 100); // Face
        
        g.setColor(Color.BLACK);
        g.fillOval(mouseX - 20, mouseY - 20, 15, 15); // Left eye
        g.fillOval(mouseX + 5, mouseY - 20, 15, 15); // Right eye
        
        g.drawArc(mouseX - 20, mouseY + 10, 40, 30, 180, 180); // Mouth
    }

    public static void main(String[] args)
     {
        SwingUtilities.invokeLater(MouseMotionListenerExample::new);
     }
}