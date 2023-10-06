package AccesoADatos;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DietaData {

    private static final Connection CONN = ConexionData.getConnection();

    private DietaData() {
    }

    public static void crearDieta(Dieta dieta) {

        String sql = "INSERT INTO dieta ( idPaciente, nombre, fechaInicial, pesoInicial, fechaFinal, pesoBuscado) "
                + "VALUES(?, ?, ?, ? ,?,?)";
        try {
            PreparedStatement ps = CONN.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, dieta.getPaciente().getIdPaciente());
            ps.setString(2, dieta.getNombre());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDate(5, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(6, dieta.getPesoBuscado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                dieta.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La dieta ha sido creada con exito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la tabla dieta " + ex.getMessage());

        }

    }

    public static void modificar(Dieta dieta) {

        String sql = "UPDATE dieta SET nombre=?, fechaFinal=?, pesoBuscado=? WHERE idDieta=?";

        try {
            PreparedStatement ps = CONN.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setDate(2, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(3, dieta.getPesoBuscado());

            int diet = ps.executeUpdate();

            if (diet == 1) {
                JOptionPane.showMessageDialog(null, " Se modifico la dieta exitosamente");

            } else {
                JOptionPane.showMessageDialog(null, " No se encontro la dieta");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " No se encontro la dieta");

        }

    }

    public static void eliminar(Dieta dieta) {

        String sql = "DELETE FROM dieta WHERE idDieta = ? AND idDieta IN (SELECT idDieta FROM dietacomida) ";

        try {
            PreparedStatement ps = CONN.prepareStatement(sql);
            ps.setInt(1, dieta.getIdDieta());
            int diet = ps.executeUpdate();
            if (diet == 1) {
                JOptionPane.showMessageDialog(null, " Se elimino la dieta exitosamente");

            } else {
                JOptionPane.showMessageDialog(null, " No se encontro la dieta");
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se encontro la dieta");
        }

    }

}
