package com.example.camerarecordhandler;

import java.util.ArrayList;
import java.util.List;

public class StolenCarHandler extends CameraRecordHandler{

    List<String> stolenCars = new ArrayList<String>();

    public StolenCarHandler(CameraRecordHandler nextHandler) {
        super(nextHandler);
        stolenCars.add("ABC123");
        stolenCars.add("DEF456");
    }

    @Override
    public void handleCameraRecords(CameraRecord cameraRecord) {
        if (stolenCars.contains(cameraRecord.getLicensePlate())) {
            System.out.println("Stolen car: " + cameraRecord);
        } if(nextHandler != null){
            nextHandler.handleCameraRecords(cameraRecord);
        }
    }
}
