import java.awt.*;
import java.awt.event.*;

public class ButtonClickExample implements ActionListener {
    ButtonClickExample() {
        Frame f = new Frame("ActionListener Example");
        Button b = new Button("Click Me");
        b.setBounds(50, 100, 80, 30);

        // Registering ActionListener with the button
        b.addActionListener(this);

        f.add(b);
        f.setSize(200, 200);
        f.setLayout(null);
        f.setVisible(true);
    }

    // Implementing actionPerformed method
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");
    }

    public static void main(String[] args) {
        new ButtonClickExample();
    }
}
