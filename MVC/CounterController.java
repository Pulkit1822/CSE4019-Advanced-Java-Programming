import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterController {
    private Counter model;
    private CounterView view;

    public CounterController(Counter model, CounterView view) {
        this.model = model;
        this.view = view;

        view.getIncrementButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.increment();
                view.getLabel().setText("Counter: " + model.getCount());
            }
        });

        view.getDecrementButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.decrement();
                view.getLabel().setText("Counter: " + model.getCount());
            }
        });
    }
}
