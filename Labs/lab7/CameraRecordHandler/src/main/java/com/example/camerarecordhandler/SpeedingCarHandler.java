package com.example.camerarecordhandler;

public class SpeedingCarHandler extends CameraRecordHandler{

    public SpeedingCarHandler(CameraRecordHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleCameraRecords(CameraRecord cameraRecord) {
        if (cameraRecord.getSpeed() > 70) {
            System.out.println("Speeding car: " + cameraRecord);
        } if(nextHandler != null){
            nextHandler.handleCameraRecords(cameraRecord);
        }
    }
}
