import java.awt.*;

public class ColorChoice extends Frame {
    public ColorChoice() {
        super("Color Choice Demo");
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));

        Label label = new Label("Select a color:");
        CheckboxGroup colorGroup = new CheckboxGroup();
        Checkbox red = new Checkbox("Red", colorGroup, false);
        Checkbox green = new Checkbox("Green", colorGroup, false);
        Checkbox blue = new Checkbox("Blue", colorGroup, false);

        add(label);
        add(red);
        add(green);
        add(blue);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChoice();
    }
}

