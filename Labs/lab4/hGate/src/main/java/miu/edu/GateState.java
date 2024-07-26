package miu.edu;

public interface GateState {
    void pressButton(GateController controller);
    void sensorOpenSignal(GateController controller);
    void sensorClosedSignal(GateController controller);
}
