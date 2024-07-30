package com.example.camerarecordhandler;

public class CarRegistrationHandler extends CameraRecordHandler {
    List<String> notRegisteredCars = new ArrayList<String>();

    public CarRegistrationHandler(CameraRecordHandler nextHandler) {
        super(nextHandler);
        notRegisteredCars.add("ABC123");
        notRegisteredCars.add("DEF456");
    }

    @Override
    public void handleCameraRecords(CameraRecord cameraRecord) {
        if (notRegisteredCars.contains(record.getLicensePlate())) {
            System.out.println("Carnot registered: " + cameraRecord);
        } if(nextHandler != null){
            nextHandler.handleCameraRecords(cameraRecord);

        }
    }

}
