import javax.swing.*;
import java.awt.*;

public class CounterView extends JFrame {
    private JLabel label = new JLabel("Counter: 0");
    private JButton incrementButton = new JButton("Increment");
    private JButton decrementButton = new JButton("Decrement");

    public CounterView() {
        this.setTitle("Counter MVC Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 100);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label);
        panel.add(incrementButton);
        panel.add(decrementButton);

        this.add(panel);
    }

    public JLabel getLabel() {
        return label;
    }

    public JButton getIncrementButton() {
        return incrementButton;
    }

    public JButton getDecrementButton() {
        return decrementButton;
    }
}
