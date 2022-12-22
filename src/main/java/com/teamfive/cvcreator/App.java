package com.teamfive.cvcreator;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Views/homepage.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root,1080,720);
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);

        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
