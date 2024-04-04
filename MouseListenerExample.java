
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends JFrame implements MouseListener 
{
    public MouseListenerExample() {
        setTitle("Mouse Listener Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.addMouseListener(this);
        add(panel);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e)
     {
        System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
       this.setTitle( "Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        System.out.println("Mouse Entered!");
        this.setTitle("Mouse Entered!");
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        System.out.println("Mouse Exited!");
        this.setTitle("Mouse Exited!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MouseListenerExample::new);
    }
}
