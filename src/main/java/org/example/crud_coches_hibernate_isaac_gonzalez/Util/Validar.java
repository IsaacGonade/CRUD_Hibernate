package org.example.crud_coches_hibernate_isaac_gonzalez.Util;

public class Validar {
    //validacion para que la matricula cumpla unos requisitos
    public static boolean comprobarMatricula (String matricula){
        if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
            return true;
        }else{
            return false;
        }
    }
}
