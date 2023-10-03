
package Entidades;

import utils.Horario;

/**
 *
 * @author alber
 */
public class DietaComida {
    
    
    private int idDietaComida;
    private Comida comida;
    private Dieta dieta;
    private Horario horario;
    private double porcion;
   

    public DietaComida() {
    }
     

    public DietaComida(int idDietaComida, Comida comida, Dieta dieta , Horario horario, double porcion) {
        this.idDietaComida = idDietaComida;
        this.comida = comida;
        this.dieta = dieta;
        this.horario=horario;
        this.porcion=porcion;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public int getIdDietaComida() {
        return idDietaComida;
    }

    public void setIdDietaComida(int idDietaComida) {
        this.idDietaComida = idDietaComida;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public double getPorcion() {
        return porcion;
    }

    public void setPorcion(double porcion) {
        this.porcion = porcion;
    }
    
    
    
    
}
