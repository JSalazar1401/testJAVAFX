package com.ejemplo.controllers;
import  javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class MainController {
    @FXML
    public  void saludar(){
        Alert notification = new Alert(AlertType.INFORMATION);
        notification.setTitle("Holiwis maniwis");
        notification.setContentText("Este saludo se ejecuto desde el controlador de Main Controller UWU");
        notification.showAndWait();
    }

    @FXML
    private void initialize() {
        // Hint: initialize() will be called when the associated FXML has been completely loaded.
    }
}
