package com.mess.mess;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class chatcontroller implements Initializable {
    @FXML
    private Button backButton;
    @FXML
    private Button videoButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        backButton.setOnMouseClicked(mouseEvent -> Platform.runLater(() -> {
            main.switch_Scene("main.fxml");
        }));

        videoButton.setOnMouseClicked(mouseEvent -> Platform.runLater(() -> {
            main.switch_Scene("calling.fxml");
        }));
    }
}
