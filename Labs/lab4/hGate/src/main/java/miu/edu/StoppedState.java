package miu.edu;

public class StoppedState implements GateState {
    private final GateState previousState;

    public StoppedState(GateState previousState) {
        this.previousState = previousState;
    }

    @Override
    public void pressButton(GateController controller) {
        controller.setState(previousState);
    }

    @Override
    public void sensorOpenSignal(GateController controller) {
        // No action needed
    }

    @Override
    public void sensorClosedSignal(GateController controller) {
        // No action needed
    }
}
