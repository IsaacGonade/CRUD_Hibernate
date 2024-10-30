package org.example.crud_coches_hibernate_isaac_gonzalez.Util;

import javafx.scene.control.Alert;

public class Alerts {
    public static void mostrarError(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setContentText(mensaje);
        alerta.show();
    }
}
