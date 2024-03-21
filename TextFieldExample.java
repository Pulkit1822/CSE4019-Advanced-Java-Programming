import java.awt.*;

public class TextFieldExample {
    public static void main(String[] args) {
        Frame frame = new Frame("TextField Example");
        frame.setLayout(new FlowLayout());

        Label label = new Label("Enter your name: ");
        TextField textField = new TextField(20);
        frame.add(label);
        frame.add(textField);

        frame.setSize(300,150);
        frame.setVisible(true);
    }
}

