import java.awt.*;

public class AWTWindowDemo extends Frame {

    public AWTWindowDemo() {
        super("AWT Components Demo");
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));

        Button button = new Button("Click Me!");
        Label label = new Label("This is a label");
        Checkbox checkbox = new Checkbox("Check me");
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        List list = new List(3);
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        add(button);
        add(label);
        add(checkbox);
        add(choice);
        add(list);


        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTWindowDemo();
    }
}