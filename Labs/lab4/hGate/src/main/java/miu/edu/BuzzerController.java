package miu.edu;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BuzzerController implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        GateState newState = (GateState) evt.getNewValue();
        switch (newState) {
            case OPENING:
            case CLOSING:
                start();
                break;
            case OPEN:
            case CLOSED:
                stop();
                break;
        }
    }

    public void start() {
        System.out.println("Buzzer: ON");
    }

    public void stop() {
        System.out.println("Buzzer: OFF");
    }
}

