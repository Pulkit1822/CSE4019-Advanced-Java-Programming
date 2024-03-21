import java.awt.*;

public class HelloVITWindow extends Frame {
	public HelloVITWindow() {
		super("Hello, VIT");
		Label label = new Label("Hello, VIT");
		add(label);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		HelloVITWindow w = new HelloVITWindow();
	}
}

