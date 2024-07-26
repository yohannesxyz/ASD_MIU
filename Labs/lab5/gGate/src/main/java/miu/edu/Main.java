package miu.edu;

public class Main {
    public static void main(String[] args) {
        GateController gateController = new GateController();
        BuzzerController buzzerController = new BuzzerController();
        LightController lightController = new LightController();

        gateController.addPropertyChangeListener(buzzerController);
        gateController.addPropertyChangeListener(lightController);

        // Simulate pressing the button on the remote control
        gateController.pressButton(); // Opening
        gateController.pressButton(); // Closing

        // Simulate the gate reaching fully open and closed states
        gateController.sensorOpenSignal(); // Open
        gateController.pressButton(); // Closing
        gateController.sensorClosedSignal(); // Closed


    }
}
