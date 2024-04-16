import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizApp extends JFrame {
    private JLabel questionLabel;
    private JButton showAnswerButton;
    private JButton resetButton;

    public QuizApp() {
        setLayout(new FlowLayout());

        questionLabel = new JLabel("Which Swing methods are thread-safe ?");
        showAnswerButton = new JButton("Show Answer");
        resetButton = new JButton("Reset");

        showAnswerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                questionLabel.setText("There are only three thread-safe methods: repaint, revalidate, and invalidate.");
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                questionLabel.setText("Which Swing methods are thread-safe ?");
            }
        });

        add(questionLabel);
        add(showAnswerButton);
        add(resetButton);

        setTitle("Quiz App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuizApp();
            }
        });
    }
}
