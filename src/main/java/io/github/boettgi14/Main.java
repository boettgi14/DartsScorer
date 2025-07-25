package io.github.boettgi14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // FXMLLoader konfigurieren und laden
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("DartsScorerFXML.fxml"));
            AnchorPane root = loader.load();
            // Scene mit FXMLLoader verknuepfen
            Scene scene = new Scene(root);
            // Stage konfigurieren und anzeigen
            primaryStage.setTitle("Darts Scorer");
            primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("icon.png")));
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
