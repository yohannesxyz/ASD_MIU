package miu.edu;

public class ClosedState implements GateState {
    @Override
    public void pressButton(GateController controller) {
        controller.setState(new OpeningState());
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
