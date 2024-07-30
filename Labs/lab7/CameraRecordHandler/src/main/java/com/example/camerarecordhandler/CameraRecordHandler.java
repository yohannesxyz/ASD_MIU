package com.example.camerarecordhandler;

public class CameraRecordHandler {

        protected CameraRecordHandler nextHandler;

        public CameraRecordHandler(CameraRecordHandler nextHandler) {
            this.nextHandler = nextHandler;
        }

        public void handleCameraRecords(CameraRecord cameraRecord) {
            if (nextHandler != null) {
                nextHandler.handleCameraRecords(cameraRecord);
            }
        }


}
