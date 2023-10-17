package AccesoADatos;

import Entidades.Historial;
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
 * @author alber
 */
public class HistorialData {

    private static final Connection CONN = ConexionData.getConnection();

    private HistorialData() {
    }

    public static void crearHistorial(Historial historial) {

        String sql = "INSERT INTO historial ( idPaciente, peso, fechaRegistro) "
                + "VALUES(?, ?, ?)";
        try {
            PreparedStatement ps = CONN.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, historial.getPaciente().getIdPaciente());
            ps.setDouble(2, historial.getPeso());
            ps.setDate(3, Date.valueOf(historial.getFechaRegistro()));

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                historial.setIdHistorial(rs.getInt(1));

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la tabla de historial" + ex.getMessage());

        }

    }

    public static void modificarHistorial(Historial historial) {

        String sql = "UPDATE historial SET peso=?  WHERE idHistorial=?";

        try {
            PreparedStatement ps = CONN.prepareStatement(sql);
            ps.setDouble(1, historial.getPeso());
            ps.setInt(2, historial.getIdHistorial());
            int rta = ps.executeUpdate();

            if (rta == 1) {
                JOptionPane.showMessageDialog(null, " Se modifico el historial de registros exitosamente");

            } else {
                JOptionPane.showMessageDialog(null, " No se encontro el historial");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " No se encontro el historial");

        }

    }

    public static void eliminarHisorial(Historial historial) {

        String sql = "DELETE FROM historial WHERE idHistorial = ? ";

        try {
            PreparedStatement ps = CONN.prepareStatement(sql);
            ps.setInt(1, historial.getIdHistorial());
            int rta = ps.executeUpdate();
            if (rta == 1) {
                JOptionPane.showMessageDialog(null, " Se elimino el historialexitosamente");

            } else {
                JOptionPane.showMessageDialog(null, " No se encontro el historial");
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se encontro el historial");
        }

    }

    public static List<Historial> getHistorialPaciente(int idPaciente) {
        String sql = "SELECT * FROM historial WHERE historial.idPaciente = ? ORDER BY historial.fechaRegistro ASC;";
        List<Historial> listHistorial = new ArrayList<>();
        try {
            PreparedStatement ps = CONN.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Historial historial = new Historial();
                historial.setIdHistorial(rs.getInt("idHistorial"));
                historial.setPaciente(PacienteData.buscarPacientePorId(idPaciente, Estado.TODOS));
                historial.setPeso(rs.getDouble("peso"));
                historial.setFechaRegistro(rs.getDate("fechaRegistro").toLocalDate());
                listHistorial.add(historial);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontro el historial");
        }
        return listHistorial;
    }

}
