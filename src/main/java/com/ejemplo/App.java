package com.ejemplo;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/pages/ejemplo.fxml"));
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root, 800, 600);
            stage.setTitle("Mi primera App :)");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo a cargar :C");
        }
    }

    public static void main(String[] args) {
        launch();
    }

}