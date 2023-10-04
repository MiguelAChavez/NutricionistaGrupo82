package Entidades;

import java.time.LocalDate;

/**
 *
 * @author alber
 */
public class Paciente {

    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private String telefono;
    private int idPaciente;
    private String sexo;
    private double pesoActual;
    private double pesoDeseado;
    private double altura;
    private LocalDate fechaNac;
    private boolean estado;

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, int dni, String domicilio, String telefono, String sexo, LocalDate fechaNac, boolean estado, double peso, double pesoDeseado, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.estado = estado;
        this.pesoActual = peso;
        this.pesoDeseado = pesoDeseado;
        this.altura = altura;
    }

    public Paciente(String nombre, String apellido, int dni, String domicilio, String telefono, int idPaciente, String sexo, LocalDate fechaNac, boolean estado, double peso,double pesoDeseado, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.idPaciente = idPaciente;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.estado = estado;
        this.pesoActual = peso;
        this.pesoDeseado = pesoDeseado;
        this.altura = altura;

    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setPeso(double peso) {
        this.pesoActual = peso;
    }

    public double getPeso() {
        return pesoActual;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getPesoDeseado() {
        return pesoDeseado;
    }

    public void setPesoDeseado(double pesoDeseado) {
        this.pesoDeseado = pesoDeseado;
    }

    
    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio + ", telefono=" + telefono + ", idPaciente=" + idPaciente + ", sexo=" + sexo + ", peso=" + pesoActual + ", altura=" + altura + ", fechaNac=" + fechaNac + ", estado=" + estado + '}';
    }

}
