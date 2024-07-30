package com.example.camerarecordhandler;

import java.util.Map;

public class CarOwnerHandler extends CameraRecordHandler{

    Map<String, CarOwner> carOwners = new HashMap<String, CarOwner>();

    public CarOwnerHandler(CameraRecordHandler nextHandler) {
        super(nextHandler);
        carOwners.put("ABC123", new CarOwner("John", 220.3));
        carOwners.put("DEF456", new CarOwner("Jane", 170.6));
    }
    @Override
    public void handleCameraRecords(CameraRecord cameraRecord) {
      if(carOwners.containsKey(cameraRecord.getLicensePlate())){
          System.out.println("car with unpaid tickets:"+cameraRecord+"owner:"+carOwners.get(cameraRecord.getLicensePlate()));

        }
        if(nextHandler != null){
            nextHandler.handleCameraRecords(cameraRecord);
        }
      }
}
