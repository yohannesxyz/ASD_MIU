package miu.edu;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class GateController {
    private GateState state;
    private final PropertyChangeSupport support;

    public GateController() {
        this.state = GateState.CLOSED;
        this.support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void pressButton() {
        switch (state) {
            case OPEN:
                setState(GateState.CLOSING);
                break;
            case CLOSED:
                setState(GateState.OPENING);
                break;
            case OPENING:
                setState(GateState.CLOSING);
                break;
            case CLOSING:
                setState(GateState.OPENING);
                break;
        }
    }

    public void sensorOpenSignal() {
        setState(GateState.OPEN);
    }

    public void sensorClosedSignal() {
        setState(GateState.CLOSED);
    }

    private void setState(GateState newState) {
        GateState oldState = this.state;
        this.state = newState;
        support.firePropertyChange("state", oldState, newState);
    }

    public GateState getState() {
        return state;
    }
}
