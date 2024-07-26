package miu.edu;

public class ClosingState implements GateState {
    @Override
    public void pressButton(GateController controller) {
        controller.setState(new StoppedState(this));
    }

    @Override
    public void sensorOpenSignal(GateController controller) {
        // No action needed
    }

    @Override
    public void sensorClosedSignal(GateController controller) {
        controller.setState(new ClosedState());
    }
}
