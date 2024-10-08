package miu.edu;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class GateController {
    private GateState state;
    private final PropertyChangeSupport support;

    public GateController() {
        this.state = new ClosedState();
        this.support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void pressButton() {
        state.pressButton(this);
    }

    public void sensorOpenSignal() {
        state.sensorOpenSignal(this);
    }

    public void sensorClosedSignal() {
        state.sensorClosedSignal(this);
    }

    public void setState(GateState newState) {
        GateState oldState = this.state;
        this.state = newState;
        support.firePropertyChange("state", oldState, newState);
    }

    public GateState getState() {
        return state;
    }
}
