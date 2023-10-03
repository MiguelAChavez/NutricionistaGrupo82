
package nutricionistagrupo82;

/**
 *
 * @author alber
 */
public class Comida {
    
    private int idComida;
    private String nombre;
    private String datalle;
    private int cantCalorias;
    private boolean estado;

    public Comida() {
    }

    public Comida(String nombre, String datalle, int cantCalorias, boolean estado) {
        this.nombre = nombre;
        this.datalle = datalle;
        this.cantCalorias = cantCalorias;
        this.estado=estado;
    }

    public Comida(int idComida, String nombre, String datalle, int cantCalorias, boolean estado) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.datalle = datalle;
        this.cantCalorias = cantCalorias;
        this.estado=estado;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDatalle() {
        return datalle;
    }

    public void setDatalle(String datalle) {
        this.datalle = datalle;
    }
    
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Comida{" + "idComida=" + idComida + ", nombre=" + nombre + ", datalle=" + datalle + ", cantCalorias=" + cantCalorias + ", estado=" + estado + '}';
    }
    
    

    
    
    
   

    
    
    
}
