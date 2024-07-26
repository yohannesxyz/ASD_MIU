package miu.edu;

public class OpenState implements GateState {
    @Override
    public void pressButton(GateController controller) {
        controller.setState(new ClosingState());
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
