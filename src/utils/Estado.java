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
public enum Estado {
    INACTIVOS(0),
    ACTIVO(1),
    TODOS(2);

    int cod;

    private Estado(int cod) {
        this.cod = cod;
    }

    public int getEstado() {
        return cod;
    }
}
