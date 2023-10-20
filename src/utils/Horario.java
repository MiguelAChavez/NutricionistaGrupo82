/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author alber
 */
public enum Horario {
    
    DESAYUNO("Desayuno"),
    ALMUERZO("Almuerzo"),
    MERIENDA("Merienda"),
    CENA("Cena"),
    SNACK("Snack");

    private final String name;

    private Horario(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
