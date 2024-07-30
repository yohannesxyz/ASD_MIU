module com.example.camerarecordhandler {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.camerarecordhandler to javafx.fxml;
    exports com.example.camerarecordhandler;
}