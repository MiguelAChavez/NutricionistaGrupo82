/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Dieta;
import Entidades.DietaComida;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author RAMON
 */
public class DietaComidaData {
     private static final Connection CONN = ConexionData.getConnection();

    public DietaComidaData() {
    }

     public static void crearDietaComida(DietaComida dietaComida) {

        String sql = "INSERT INTO dieta ( idComida, idDieta, horario, porcion) "
                + "VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement ps = CONN.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, dietaComida.getComida().getIdComida());
            ps.setInt(2, dietaComida.getDieta().getIdDieta());
            ps.setString(3, dietaComida.getHorario().toString());
            ps.setDouble(4, dietaComida.getPorcion());
            

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                dietaComida.setIdDietaComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La dietaComida ha sido creada con exito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la tabla dietacomida " + ex.getMessage());

        }

    }
     
     
      public static void modificarDietaComida(DietaComida dietaComida) {

        String sql = "UPDATE dieta SET horario=?, porcion=?  WHERE idDietaComida=?";

        try {
            PreparedStatement ps = CONN.prepareStatement(sql);
            ps.setString(1, dietaComida.getHorario().toString());
            ps.setDouble(2, dietaComida.getPorcion());
            ps.setInt(3, dietaComida.getIdDietaComida());

            int resultado = ps.executeUpdate();

            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, " Se modifico la dietacomida exitosamente");

            } else {
                JOptionPane.showMessageDialog(null, " No se encontro la dietacomida");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " No se encontro la dietacomida");

        }

    }
      
      
      public static void eliminarDietaComida(DietaComida dietaComida) {

        String sql = "DELETE FROM dietacomida WHERE idDieta = ? ) ";

        try {
            PreparedStatement ps = CONN.prepareStatement(sql);
            ps.setInt(1, dietaComida.getDieta().getIdDieta());
            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, " Se elimino la dietacomida exitosamente");

            } else {
                JOptionPane.showMessageDialog(null, " No se encontro la dietacomida");
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se encontro la dietacomida");
        }

    }
    
}
