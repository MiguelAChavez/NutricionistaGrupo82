/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Pc Chavez
 */
public class Validacion {

    public static boolean isValidoString(String cadena) {
        return cadena != null && cadena.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ%,. ]*$");
    }

    public static boolean isValidoStringCNumero(String cadena) {
        return cadena != null && cadena.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ%,. 0-9]*$");
    }

    public static boolean isValidoNumero(String cadena) {
        return cadena != null && cadena.matches("^[0-9]$");
    }

    public static boolean isValidoNumero(int i) {
        return i > 9999 || i < 999999999;
    }
}
