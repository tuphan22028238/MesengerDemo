package com.mess.mess;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class main extends Application {
    private static Stage _stage;
    public static void switch_Scene(String s) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource(s));
            Scene scene = new Scene(fxmlLoader.load());
            main._stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage stage) throws IOException {
        main._stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        main._stage.setTitle("messenger");
        main._stage.setScene(scene);
        main._stage.initStyle(StageStyle.UNDECORATED);
        main._stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}