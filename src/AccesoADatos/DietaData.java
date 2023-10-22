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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utils.Estado;

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

    public static void modificarDieta(Dieta dieta) {

        String sql = "UPDATE dieta SET nombre=?, fechaFinal=?, pesoBuscado=? WHERE idDieta=?";

        try {
            PreparedStatement ps = CONN.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setDate(2, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(3, dieta.getPesoBuscado());
            ps.setInt(4, dieta.getIdDieta());

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

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se encontro la dieta");
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

        sql = "SELECT * FROM dieta WHERE nombre=? " + estado;

        Dieta dieta = null;
        PreparedStatement ps;

        try {
            ps = CONN.prepareStatement(sql);
            ps.setString(1, cadena);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dieta = new Dieta();
                dieta.setIdDieta(rs.getInt("idComida"));
                dieta.setNombre(cadena);
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setPesoInicial(rs.getDouble("pesoInical"));
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setPesoFinal(rs.getDouble("pesoBuscado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "La dieta no existe");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
        }

        return dieta;
    }
    
    public static List<Dieta> buscarPorNombreDieta(Estado isActivo) {
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
        sql = "SELECT * FROM dieta WHERE  nombre=? "+ estado ;

        List listadieta=new ArrayList();
        PreparedStatement ps;

        try {
            ps = CONN.prepareStatement(sql);
            //ps.setString(1, cadena);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                //dieta.setPaciente(rs.getInt("idPaciente")+"");
	        dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
	        dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setPesoInicial(rs.getDouble("PesoInicial"));
	        dieta.setPesoFinal(rs.getDouble("PesoFinal"));
                dieta.setEstado(rs.getBoolean("estado"));
                listadieta.add(dieta);
            }   
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
        }
        return listadieta;
    }


}
