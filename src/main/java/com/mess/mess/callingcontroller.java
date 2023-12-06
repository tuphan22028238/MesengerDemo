package com.mess.mess;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class callingcontroller implements Initializable {
    @FXML
    private Button endButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        endButton.setOnMouseClicked(mouseEvent -> Platform.runLater(() -> {
            main.switch_Scene("chat.fxml");
        }));
    }
}
