package AccesoADatos;

import Entidades.Dieta;
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

public class DietaData {

    private static final Connection CONN = ConexionData.getConnection();

    private DietaData() {
    }

    public static void crearDieta(Dieta dieta) {

        String sql = "INSERT INTO dieta ( idPaciente, nombre, fechaInicial, pesoInicial ,fechaFinal) "
                + "VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = CONN.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, dieta.getPaciente().getIdPaciente());
            ps.setString(2, dieta.getNombre());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDate(5, Date.valueOf(dieta.getFechaFinal()));

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                dieta.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La dieta ha sido creada con exito");
            }
            ps.close();

        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El nombre de la dieta ya existe.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la tabla dieta " + ex.getMessage());
            }
        } catch (NullPointerException E) {

        }

    }

    public static void modificarDieta(Dieta dieta) {

        String sql = "UPDATE dieta SET nombre=?, fechaFinal=? WHERE idDieta=?";

        try {
            PreparedStatement ps = CONN.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setDate(2, Date.valueOf(dieta.getFechaFinal()));
            ps.setInt(3, dieta.getIdDieta());

            int diet = ps.executeUpdate();

            if (diet == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó la dieta exitosamente");

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la dieta");
            }

            ps.close();
        } catch (NullPointerException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla dieta. " + ex.getMessage());
        }

    }

    public static int eliminarDietaFisica(Dieta dieta) {
        String deleteDietacomidaSQL = "DELETE FROM dietacomida WHERE idDieta = ?";
        String deleteDietaSQL = "DELETE FROM dieta WHERE idDieta = ?";
        PreparedStatement ps1;
        PreparedStatement ps2;
        try {
            ps1 = CONN.prepareStatement(deleteDietacomidaSQL);
            ps1.setInt(1, dieta.getIdDieta());
            int dietacomidaDeleted = ps1.executeUpdate();
            ps1.close();

            if (dietacomidaDeleted > 0) {
                ps2 = CONN.prepareStatement(deleteDietaSQL);
                ps2.setInt(1, dieta.getIdDieta());
                int dietaDeleted = ps2.executeUpdate();
                ps2.close();

                if (dietaDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Se eliminó la dieta.");
                    ps2.close();
                    return 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar la dieta.");
                    ps2.close();
                    return 0;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron comidas para eliminar de la dieta.");
            }
        } catch (NullPointerException | SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla dieta.");
        }
        return 0;
    }

    public static int eliminarDietaLogica(int id) {
        String sql = "UPDATE dieta as d "
                + "INNER JOIN paciente as p ON (d.idPaciente = p.idPaciente) "
                + "SET d.estado = 0, d.pesoFinal = p.pesoActual,"
                + "d.esExitosa = CASE WHEN (d.pesoFinal >= p.pesoBuscado - 2 AND d.pesoFinal <= p.pesoBuscado + 2) THEN 1 ELSE 0 END "
                + "WHERE idDieta = ? ;";
        PreparedStatement ps;
        try {
            ps = CONN.prepareStatement(sql);
            ps.setInt(1, id);

            int res = ps.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "La dieta se ha dado de baja.");
                ps.close();
                return 1;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la dieta.");
                ps.close();
                return 0;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla dieta." + e.getMessage());
        }
        return 0;
    }

    public static Dieta buscarDietaPorNombre(String cadena, Estado isActivo) {
        String sql;

        String estado = "";

        switch (isActivo) {
            case ACTIVO:
                estado = " AND estado = 1";
                break;
            case INACTIVOS:
                estado = " AND estado = 0 ";
            default:
                break;
        }

        sql = "SELECT * FROM dieta WHERE nombre LIKE ? " + estado;

        Dieta dieta = new Dieta();
        PreparedStatement ps;

        try {
            ps = CONN.prepareStatement(sql);
            ps.setString(1, cadena);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setPaciente(PacienteData.buscarPacientePorId(rs.getInt("idPaciente"), isActivo));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));

            } else {
                JOptionPane.showMessageDialog(null, "La dieta no existe");
            }
            ps.close();
        } catch (NullPointerException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla dieta. ");
        }

        return dieta;
    }

    public static Dieta buscarDietaPorId(int id) {
        String sql;

        sql = "SELECT * FROM dieta WHERE idDieta = ?;";

        Dieta dieta = new Dieta();
        PreparedStatement ps;

        try {
            ps = CONN.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setPaciente(PacienteData.buscarPacientePorId(rs.getInt("idPaciente"), Estado.TODOS));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));

            } else {
                JOptionPane.showMessageDialog(null, "La dieta no existe");
            }
            ps.close();
        } catch (NullPointerException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla dieta. ");
        }

        return dieta;
    }

    public static List<Dieta> buscarListadodeDietaPorNombre(String cadena, Estado isActivo) {
        String sql;

        String estado = "";

        switch (isActivo) {
            case ACTIVO:
                estado = " AND estado = 1";
                break;
            case INACTIVOS:
                estado = " AND estado = 0 ";
            default:
                break;
        }

        sql = "SELECT * FROM dieta WHERE nombre=? " + estado;

        List<Dieta> listadoDieta = new ArrayList();
        PreparedStatement ps;

        try {
            ps = CONN.prepareStatement(sql);
            ps.setString(1, cadena);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Dieta dietita = new Dieta();
                dietita.setIdDieta(rs.getInt("idDieta"));
                dietita.setNombre(cadena);
                dietita.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dietita.setPesoInicial(rs.getDouble("pesoInical"));
                dietita.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dietita.setPesoFinal(rs.getDouble("pesoFinal"));
                listadoDieta.add(dietita);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla dieta. " + e.getMessage());
        }

        return listadoDieta;
    }

    public static List<Dieta> buscarDietasFallidas() {
        String sql;
        PreparedStatement ps;
        List<Dieta> dietas = new ArrayList<>();

        sql = "SELECT * FROM dieta as d "
                + "WHERE d.esExitosa = 0 AND d.estado = 0 "
                + "GROUP BY d.idPaciente "
                + "ORDER BY d.idPaciente, d.nombre ASC;";

        try {
            ps = CONN.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                Paciente p = PacienteData.buscarPacientePorId(rs.getInt("idPaciente"), Estado.TODOS);
                dieta.setPaciente(p);
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));

                dietas.add(dieta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no " + ex);
        }

        return dietas;
    }

    public static List<Dieta> ListarPorNombreOApellidoYEstadoDieta(String cadena, Estado buscar) {
        List<Dieta> dietas = new ArrayList<>();
        int estado = 0;
        switch (buscar) {
            case DIETA_CULMINADA:
                estado = 0;
                break;
            case DIETA_VIGENTE:
                estado = 1;
                break;
            default:
                break;
        }

        String sql = "SELECT * FROM dieta AS d INNER JOIN paciente AS p ON (d.idPaciente=p.idPaciente) "
                + "WHERE ((CONCAT(p.nombre, ' ', p.apellido) LIKE ?) OR "
                + "(CONCAT(p.apellido, ' ', p.nombre) LIKE ?)) AND"
                + " d.estado = ?;";

        PreparedStatement ps;

        try {
            ps = CONN.prepareStatement(sql);
            ps.setString(1, "%" + cadena + "%");
            ps.setString(2, "%" + cadena + "%");
            ps.setInt(3, estado);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                Paciente p = PacienteData.buscarPacientePorId(rs.getInt("idPaciente"), Estado.TODOS);
                dieta.setPaciente(p);
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));

                dietas.add(dieta);
            }
            ps.close();
        } catch (NullPointerException | SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo conectar a la tabla dieta, error: " + e.getMessage());
        }

        return dietas;
    }

    public static List<Dieta> buscarDietas(Estado isActivo) {
        String sql;

        String estado = "";

        switch (isActivo) {
            case ACTIVO:
                estado = "WHERE estado = 1";
                break;
            case INACTIVOS:
                estado = "WHERE estado = 0 ";
            default:
                break;
        }
        sql = "SELECT * FROM dieta " + estado;

        List listadieta = new ArrayList();
        PreparedStatement ps;
        try {

            ps = CONN.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setPaciente(PacienteData.buscarPacientePorId(rs.getInt("idPaciente"), Estado.TODOS));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setPesoInicial(rs.getDouble("PesoInicial"));
                dieta.setPesoFinal(rs.getDouble("PesoFinal"));
                dieta.setEstado(rs.getBoolean("estado"));
                listadieta.add(dieta);
            }
            ps.close();
        } catch (NullPointerException | SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
        }
        return listadieta;
    }

    public static void activar(Dieta dieta) {
        String SQL = "UPDATE dieta SET estado= 1 WHERE idDieta = ?;";
        try {
            PreparedStatement ps = CONN.prepareStatement(SQL);
            ps.setInt(1, dieta.getIdDieta());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Fue dada de alta nuevamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "No se pudo acceder a la tabla dieta. " + e.getMessage());
        }
    }

    public static void actualizarEstadoYFinalDeDieta() {
        String sql = "UPDATE dieta AS d INNER JOIN paciente AS p ON (d.idPaciente = p.idPaciente) "
                + "SET d.estado = 0, d.pesoFinal = p.pesoActual, "
                + "d.esExitosa = CASE WHEN (d.pesoFinal >= p.pesoBuscado - 2 AND d.pesoFinal <= p.pesoBuscado + 2) THEN 1 ELSE 0 END "
                + "WHERE d.fechaFinal <= CURDATE() AND d.estado = 1;";
        PreparedStatement ps;
        try {
            ps = CONN.prepareStatement(sql);

            ps.executeUpdate();

            ps.close();
        } catch (NullPointerException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar las dietas. " + ex.getMessage());
        }
    }

}
