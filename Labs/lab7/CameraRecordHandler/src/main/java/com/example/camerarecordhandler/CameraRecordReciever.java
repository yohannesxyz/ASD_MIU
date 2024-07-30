package com.example.camerarecordhandler;

public class CameraRecordReciever {

    private CameraRecordHandler Firsthandler;

    public void recieveCameraRecord(CameraRecord cameraRecord) {
        Firsthandler.handleCameraRecord(cameraRecord);
    }

    public void setFirstHandler(CameraRecordHandler handler) {
        this.Firsthandler = firsthandler;
    }
}
