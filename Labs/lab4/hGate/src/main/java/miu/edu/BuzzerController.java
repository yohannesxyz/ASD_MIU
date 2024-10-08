package miu.edu;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BuzzerController implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        GateState newState = (GateState) evt.getNewValue();
        if (newState instanceof OpeningState || newState instanceof ClosingState) {
            start();
        } else {
            stop();
        }
    }

    public void start() {
        System.out.println("Buzzer: ON");
    }

    public void stop() {
        System.out.println("Buzzer: OFF");
    }
}
