public class MVCTest {
    public static void main(String[] args) {
        Counter model = new Counter();
        CounterView view = new CounterView();
        CounterController controller = new CounterController(model, view);
        view.setVisible(true);
    }
}
