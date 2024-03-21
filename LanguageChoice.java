import java.awt.*;

public class LanguageChoice {
    public static void main(String[] args) {
        Frame frame = new Frame("Programming Language Choice");

        Label label = new Label("Choose your favorite programming language:");
        label.setBounds(50, 50, 300, 30);

        Choice choice = new Choice();
        choice.setBounds(50, 100, 100, 75);
        choice.add("Java");
        choice.add("Python");
        choice.add("C#");
        choice.add("C/C++");

        frame.add(label);
        frame.add(choice);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}