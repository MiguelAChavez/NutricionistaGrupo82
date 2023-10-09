package AccesoADatos;

import Entidades.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author RAMON
 */
public class ComidaData {

    private static final Connection CONN = ConexionData.getConnection();

    private ComidaData() {
    }

    public static void crearComida(Comida comida) {
        String sql = "INSERT INTO `comida`( nombre, detalle, cantidadCalorias, estado) "
                + "VALUES(?,?,?,?)";

        try {
            PreparedStatement ps = CONN.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDatalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setBoolean(4, comida.isEstado());
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {

                comida.setIdComida(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida creada con éxito");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la tabla comida " + ex.getMessage());
        }

    }

    public static void modificarComida(Comida comida) {
        String sql = "UPDATE comida set nombre=?, detalle=?, cantidadCalorias=? WHERE idComida=?";
        try {
            PreparedStatement ps = CONN.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDatalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setInt(4, comida.getIdComida());
            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "La comida fué modificada exitoxamente");
            } else {
                JOptionPane.showMessageDialog(null, "La comida no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la tabla comida " + ex.getMessage());
        }
    }

    public static void eliminarComida(int id) {
        String sql = "UPDATE comida SET estado = 0 WHERE idComida = ? ";
        PreparedStatement ps;
        try {
            ps = CONN.prepareStatement(sql);
            ps.setInt(1, id);

            int res = ps.executeUpdate();
            if (res == 1) {

                JOptionPane.showMessageDialog(null, " Se eliminó la comida.");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Comida." + e.getMessage());
        }

    }

}
