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
            ps.setDate(6, Date.valueOf(paciente.getFechaNat()));
            ps.setInt(7, paciente.getSexo());
            ps.setDouble(8, paciente.getPeso());
            ps.setDouble(9, paciente.getAltura());
            ps.setDouble(10, paciente.getPesoDeseado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "");
        }
    }

}
