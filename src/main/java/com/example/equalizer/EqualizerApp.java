package com.example.equalizer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class EqualizerApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Equalizer");
        scene.getStylesheets().add
                (EqualizerApp.class.getResource("style.css").toExternalForm());
        stage.show();
    }


    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        launch(args);
    }

    public void stop(){
        System.out.println("STOP");
    }

}