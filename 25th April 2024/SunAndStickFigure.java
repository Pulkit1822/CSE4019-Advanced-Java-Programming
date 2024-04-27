import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SunAndStickFigure extends JPanel {
    public SunAndStickFigure() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int cX = getWidth() / 2, cY = getHeight() / 2;
        g.setColor(Color.YELLOW);
        g.fillOval(cX - 5, cY - 5, 10, 10);
        g.setColor(Color.BLACK);
        g.fillRect(getMousePosition().x - 10, getMousePosition().y - 20, 20, 40);
        g.setColor(Color.RED);
        g.drawString("Distance from Sun: " + Math.abs(getMousePosition().x - cX) + ", " + Math.abs(getMousePosition().y - cY), getMousePosition().x + 10, getMousePosition().y + 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sun and Stick Figure");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SunAndStickFigure());
        frame.setSize(1000, 500);
        frame.setVisible(true);
    }
}
