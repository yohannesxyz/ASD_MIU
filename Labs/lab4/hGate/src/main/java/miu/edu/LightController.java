package miu.edu;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class LightController implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        GateState newState = (GateState) evt.getNewValue();
        switch (newState) {
            case OPENING:
                flashOrange();
                break;
            case CLOSING:
                flashRed();
                break;
            case OPEN:
            case CLOSED:
                off();
                break;
        }
    }

    public void flashOrange() {
        System.out.println("Light: FLASHING ORANGE");
    }

    public void flashRed() {
        System.out.println("Light: FLASHING RED");
    }

    public void off() {
        System.out.println("Light: OFF");
    }
}
