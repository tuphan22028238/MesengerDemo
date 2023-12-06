module com.mess.mess {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mess.mess to javafx.fxml;
    exports com.mess.mess;
}