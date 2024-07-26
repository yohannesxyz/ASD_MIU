package miu.edu;

public class OpeningState implements GateState {
    @Override
    public void pressButton(GateController controller) {
        controller.setState(new StoppedState(this));
    }

    @Override
    public void sensorOpenSignal(GateController controller) {
        controller.setState(new OpenState());
    }

    @Override
    public void sensorClosedSignal(GateController controller) {
        // No action needed
    }
}
