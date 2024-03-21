import java.awt.*;
import java.awt.event.*;

public class TextFieldCopy extends Frame {
    TextField textField1, textField2;

    public TextFieldCopy() {
        super("TextField");
        setLayout(new FlowLayout());

        textField1 = new TextField(20);
        textField2 = new TextField(20);

        Button copyButton = new Button("Copy");
        copyButton.addActionListener(e -> textField2.setText(textField1.getText()));

        add(textField1);
        add(textField2);
        add(copyButton);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldCopy();
    }
}
