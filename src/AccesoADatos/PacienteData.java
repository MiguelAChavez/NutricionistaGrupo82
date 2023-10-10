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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import utils.Estado;

/**
 *
 * @author Pc Chavez
 */
public class PacienteData {

    private static final Connection CONN = ConexionData.getConnection();

    private PacienteData() {
    }

    public static void CrearPaciente(Paciente paciente) {
        String sql = "INSERT INTO `paciente`"
                + "(`nombre`, `apellido`, `dni`, `telefono`, `domicilio`, `fechaNac`, `sexo`, `pesoActual`, `altura`, `pesoDeseado`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps;
        try {
            ps = CONN.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getDni());
            ps.setString(4, paciente.getTelefono());
            ps.setString(5, paciente.getDomicilio());
            ps.setDate(6, Date.valueOf(paciente.getFechaNac()));
            ps.setString(7, paciente.getSexo());
            ps.setDouble(8, paciente.getPeso());
            ps.setDouble(9, paciente.getAltura());
            ps.setDouble(10, paciente.getPesoDeseado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
                return;
                // JOptionPane.showMessageDialog(null, "Paciente creado con éxito");
            }
            ps.close();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la tabla paciente " + ex.getMessage());
        }
    }

    public static void modificarPaciente(Paciente paciente) {
        String sql = "UPDATE paciente set dni=?, apellido=?,  nombre=?, telefono=?, domicilio=?, fechaNac=?, sexo=?, pesoActual=?, altura=?, pesoDeseado=? WHERE idPaciente=? ";
        try {
            PreparedStatement ps = CONN.prepareStatement(sql);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getNombre());
            ps.setString(4, paciente.getTelefono());
            ps.setString(5, paciente.getDomicilio());
            ps.setDate(6, Date.valueOf(paciente.getFechaNac()));
            ps.setString(7, paciente.getSexo());
            ps.setDouble(8, paciente.getPeso());
            ps.setDouble(9, paciente.getAltura());
            ps.setDouble(10, paciente.getPesoDeseado());
            ps.setInt(11, paciente.getIdPaciente());

            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                return;
                // JOptionPane.showMessageDialog(null, "El paciente fué modificado exitoxamente");
            } else {
                JOptionPane.showMessageDialog(null, "El paciente no existe");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la tabla paciente " + ex.getMessage());
        }

    }

    public static void eliminarPaciente(int id) {
        String sql = "UPDATE paciente SET estado = 0 WHERE idPaciente = ? ";
        PreparedStatement ps;
        try {
            ps = CONN.prepareStatement(sql);
            ps.setInt(1, id);

            int res = ps.executeUpdate();
            if (res == 1) {
                return;
               // JOptionPane.showMessageDialog(null, " Se eliminó el paciente.");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Paciente." + e.getMessage());
        }

    }

    public static Paciente buscarPacientePorDni(int dni, boolean isActivo) {
        String sql;
        sql = "SELECT * FROM paciente "
                + " WHERE dni=? " + (isActivo ? " AND estado = 1" : " AND estado = 0 ");
        Paciente paciente = null;
        PreparedStatement ps;

        try {
            ps = CONN.prepareStatement(sql);
            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setDni(dni);
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                paciente.setSexo(rs.getString("sexo"));
                paciente.setPeso(rs.getDouble("pesoActual"));
                paciente.setAltura(rs.getDouble("altura"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El Paciente no existe");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
        }

        return paciente;
    }

    public static List<Paciente> ListarPorNombreOApellido(String cadena, Estado buscar) {
        List<Paciente> pacientes = new ArrayList<>();
        
        String estado = getEstadoCondition(buscar.getEstado());
        
        String sql = "SELECT * FROM paciente "
                + "WHERE ( paciente.apellido LIKE '" + cadena + "%' OR paciente.nombre LIKE '" + cadena + "%' )"
                + estado
                + " ORDER BY apellido ASC, nombre ASC;";
        
        PreparedStatement ps;
        
        try {
            ps = CONN.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                paciente.setSexo(rs.getString("sexo"));
                paciente.setPeso(rs.getDouble("pesoActual"));
                paciente.setAltura(rs.getDouble("altura"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setEstado(rs.getBoolean("estado"));

                pacientes.add(paciente);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
        }
        return pacientes;
    }

    public static List<Paciente> ListarPacientes(Estado estado) {      
        List<Paciente> pacientes = new ArrayList<>();    
        String estado1;
        
        switch (estado.getEstado()) {
            case 0:
                estado1 = " WHERE estado = 0";
                break;
            case 1:
                estado1 = " WHERE estado = 1";
                break;
            default:
                estado1 = "";
                break;
        }
        
        String sql = "SELECT * FROM paciente " + estado1 + ";";
        
        PreparedStatement ps;
        try {
            ps = CONN.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                paciente.setSexo(rs.getString("sexo"));
                paciente.setPeso(rs.getDouble("pesoActual"));
                paciente.setAltura(rs.getDouble("altura"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setEstado(rs.getBoolean("estado"));

                pacientes.add(paciente);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
        }
        return pacientes;
    }

    private static String getEstadoCondition(int estadoBusqueda) {
        switch (estadoBusqueda) {
            case 0:
                return " AND estado = 0";
            case 1:
                return " AND estado = 1";
            default:
                return "";
        }
    }

}