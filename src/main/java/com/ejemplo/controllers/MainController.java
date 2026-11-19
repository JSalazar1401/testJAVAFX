package com.ejemplo.controllers;
import  javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class MainController {
    @FXML
    private  void saludar(){
        Alert notification = new Alert(AlertType.INFORMATION);
        notification.setTitle("Holiwis maniwis");
        notification.setContentText("Este saludo se ejecuto desde el controlador de Main Controller UWU");
        notification.showAndWait();
    }
}
