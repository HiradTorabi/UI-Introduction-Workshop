package org.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class PricingApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pricing-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // add darck mode css
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        // icon
        stage.getIcons().add(new Image("file:icon.jpg"));

        stage.setTitle("Pricing Plans");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
