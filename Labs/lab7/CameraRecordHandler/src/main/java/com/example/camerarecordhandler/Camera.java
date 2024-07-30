package com.example.camerarecordhandler;

public class Camera {

    CameraRecordReciever cameraRecordReciever;

    public Camera(CameraRecordReciever cameraRecordReciever) {
        super();
        this.cameraRecordReciever = cameraRecordReciever;
    }

    public void generateCameraRecords() {
        System.out.println("Camera: generating camera record");
        cameraRecordReciever.recieveCameraRecord(new CameraRecord("bb 1111", 55, 2));
        cameraRecordReciever.recieveCameraRecord(new CameraRecord("aa 2222", 55, 2));
        cameraRecordReciever.recieveCameraRecord(new CameraRecord("cc 3333", 55, 2));
        cameraRecordReciever.recieveCameraRecord(new CameraRecord("dd 4444", 55, 2));
        cameraRecordReciever.recieveCameraRecord(new CameraRecord("ee 5555", 55, 2));
    }

}
