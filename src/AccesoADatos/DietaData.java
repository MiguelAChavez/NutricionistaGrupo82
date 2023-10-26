package AccesoADatos;

import Entidades.Dieta;
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
        System.out.println(dieta);
        try {
            PreparedStatement ps = CONN.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setDate(2, Date.valueOf(dieta.getFechaFinal()));
            ps.setInt(3, dieta.getIdDieta());

            int diet = ps.executeUpdate();

            if (diet == 1) {
                JOptionPane.showMessageDialog(null, " Se modifico la dieta exitosamente");

            } else {
                JOptionPane.showMessageDialog(null, " No se encontro la dieta");
            }

            ps.close();
        } catch (NullPointerException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Dieta. " + ex.getMessage());
        }

    }

    public static void eliminarDieta(Dieta dieta) {

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

        } catch (NullPointerException | SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Dieta.");
        }

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
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
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
                dietita.setIdDieta(rs.getInt("idComida"));
                dietita.setNombre(cadena);
                dietita.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dietita.setPesoInicial(rs.getDouble("pesoInical"));
                dietita.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dietita.setPesoFinal(rs.getDouble("pesoBuscado"));
                listadoDieta.add(dietita);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
        }

        return listadoDieta;
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
            JOptionPane.showConfirmDialog(null, "Error al acceder a la tabla Dieta.");
        }
    }

    public static void eliminarDieta(int id) {
        String sql = "UPDATE dieta SET estado = 0 WHERE idDieta = ? ";
        PreparedStatement ps;
        try {
            ps = CONN.prepareStatement(sql);
            ps.setInt(1, id);

            int res = ps.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la dieta.");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla dieta." + e.getMessage());
        }

    }

}
