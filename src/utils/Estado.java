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
    TODOS(2),
    DIETA_CULMINADA(3),
    DIETA_VIGENTE(4);
    

    int cod;

    private Estado(int cod) {
        this.cod = cod;
    }

    public int getEstado() {
        return cod;
    }

    @Override
    public String toString() {
        switch (this) {
            case INACTIVOS:
                return "Inactivos";
            case ACTIVO:
                return "Activos";
            case TODOS:
                return "Todos";
            case DIETA_CULMINADA:
                return "Dieta culminada";
            case DIETA_VIGENTE:
                return "Dieta vigente";
            default:
                return null;
        }
    }

}
