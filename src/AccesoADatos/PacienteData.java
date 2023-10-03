/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc Chavez
 */
public class PacienteData {

    private static final Connection conn = ConexionData.getConnection();

    private PacienteData() {
    }

    public static void CrearPaciente(Paciente paciente) {
        String sql = "INSERT INTO `paciente`"
                + "(`nombre`, `apellido`, `dni`, `telefono`, `domicilio`, `fechaNac`, `sexo`, `pesoActual`, `altura`, `pesoDeseado`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getDni());
            ps.setString(4, paciente.getTelefono());
            ps.setString(5, paciente.getDomicilio());
            ps.setDate(6, Date.valueOf(paciente.getFechaNac()));
            ps.setInt(7, paciente.getSexo());
            ps.setDouble(8, paciente.getPeso());
            ps.setDouble(9, paciente.getAltura());
            ps.setDouble(10, paciente.getPesoDeseado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente creado con éxito");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la tabla paciente " + ex.getMessage());
        }
    }
    
    
    public static void modificarPaciente(Paciente paciente){
         String sql = "UPDATE paciente set dni=?, apellido=?,  nombre=?, telefono=?, domicilio=?, fechaNac=?, sexo=?, pesoActual=?, altura=?, pesoDeseado=? WHERE idPaciente=? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getNombre());
            ps.setString(4, paciente.getTelefono());
            ps.setString(5, paciente.getDomicilio());
            ps.setDate(6, Date.valueOf(paciente.getFechaNac()));
            ps.setInt(7, paciente.getSexo());
            ps.setDouble(8, paciente.getPeso());
            ps.setDouble(9, paciente.getAltura());
            ps.setDouble(10, paciente.getPesoDeseado());


            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "El paciente fué modificado exitoxamente");
            } else {
                JOptionPane.showMessageDialog(null, "El paciente no existe");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la tabla paciente " + ex.getMessage());
        }
    
    
    }
    
    public static void eliminarPaciente(int id){
         String sql = "UPDATE paciente SET estado = 0 WHERE idPaciente = ? ";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int res = ps.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el paciente.");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Paciente." + e.getMessage());
        }
    
    
    }
    
    public  Paciente buscarPacientePorDni(int dni){
     String sql = "SELECT dni, apellido,  nombre, telefono, domicilio, fechaNac,  sexo, pesoActual, altura, pesoDeseado FROM paciente  WHERE idPaciente=? AND estado=1 ";
     Paciente paciente = null;
     PreparedStatement ps;

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setDni(dni);
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                //paciente.setSexo(rs.getCharacterStream("sexo"));
                paciente.setPeso(rs.getDouble("pesoActual"));
                paciente.setAltura(rs.getDouble("altura"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));




               
                paciente.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
        }
        return paciente;
    
    
    }

}
