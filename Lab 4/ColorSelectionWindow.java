import java.awt.*;
import java.awt.event.*;

public class ColorSelectionWindow extends Frame implements ActionListener {
    private CheckboxGroup checkboxGroup;
    private Button button;

    public ColorSelectionWindow() {
        setLayout(new FlowLayout());
        add(new Label("Select a color:"));
        checkboxGroup = new CheckboxGroup();
        add(new Checkbox("Red", checkboxGroup, false));
        add(new Checkbox("Green", checkboxGroup, false));
        add(new Checkbox("Blue", checkboxGroup, false));
        button = new Button("Change Color");
        add(button);
        button.addActionListener(this);
        setTitle("Color Selection Window");
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Checkbox selectedCheckbox = checkboxGroup.getSelectedCheckbox();
        if (selectedCheckbox.getLabel().equals("Red")) {
            setBackground(Color.RED);
        } else if (selectedCheckbox.getLabel().equals("Green")) {
            setBackground(Color.GREEN);
        } else if (selectedCheckbox.getLabel().equals("Blue")) {
            setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new ColorSelectionWindow();
    }
}