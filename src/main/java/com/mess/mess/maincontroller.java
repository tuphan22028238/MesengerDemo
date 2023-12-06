package com.mess.mess;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class maincontroller  implements Initializable {
    @FXML
    private Button offButton;
    @FXML
    private Button chatButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        offButton.setOnMouseClicked(mouseEvent -> Platform.runLater(() -> {
            System.exit(0);
        }));

        chatButton.setOnMouseClicked(mouseEvent -> Platform.runLater(() -> {
            main.switch_Scene("chat.fxml");
        }));
    }
}
