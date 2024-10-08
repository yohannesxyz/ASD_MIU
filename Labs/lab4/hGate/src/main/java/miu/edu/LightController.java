package miu.edu;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class LightController implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        GateState newState = (GateState) evt.getNewValue();
        if (newState instanceof OpeningState) {
            flashOrange();
        } else if (newState instanceof ClosingState) {
            flashRed();
        } else {
            off();
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
