package com.example.camerarecordhandler;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application {


    public static void main(String[] args) {

        CameraRecordReciever cameraRecordReciever = new CameraRecordReciever();
        Camera camera = new Camera(cameraRecordReciever);
        SpeedingCarHandler speedingCarHandler = new SpeedingCarHandler(StolenCarHandler);
        StolenCarHandler stolenCarHandler = new StolenCarHandler(CarOwnerHandler);
        CarOwnerHandler carOwnerHandler = new CarOwnerHandler(null);
        CarRegistrationHandler carRegistrationHandler = new CarRegistrationHandler(SpeedingCarHandler);

        cameraRecordReciever.setFirstHandler(carRegistrationHandler);

        camera.generateCameraRecords();



}
}