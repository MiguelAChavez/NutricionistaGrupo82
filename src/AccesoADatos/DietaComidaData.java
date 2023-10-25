/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Dieta;
import Entidades.DietaComida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import utils.Estado;
import utils.Horario;

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
            
        } catch (NullPointerException | SQLException ex) {
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
        } catch (NullPointerException | SQLException ex) {
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
            
        } catch (NullPointerException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro la dietacomida");
        }
        
    }
    
    public static DietaComida buscarDietaComidaPorId(int id, Estado isActivo) {
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
        
        DietaComida dietacomida = null;
        PreparedStatement ps;
        
        try {
            ps = CONN.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dietacomida = new DietaComida();
                dietacomida.setIdDietaComida(rs.getInt("idDietaComida"));
                //dietaComida.setHorario(rs.getString("horario"));
                dietacomida.setPorcion(rs.getDouble("porcion"));
                
            } else {
                JOptionPane.showMessageDialog(null, "La dieta no existe");
            }
            ps.close();
        } catch (NullPointerException | SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
        }
        
        return dietacomida;
    }
    
    public static List<DietaComida> buscarDietaComidaPorIdDieta(int IdDieta) {
        String sql;
        
        sql = "SELECT * FROM dietacomida WHERE idDieta = ?";
        
        List<DietaComida> Listadietacomida = new ArrayList<>();
        PreparedStatement ps;
        
        try {
            ps = CONN.prepareStatement(sql);
            ps.setInt(1, IdDieta);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DietaComida dietacomida = new DietaComida();
                dietacomida.setIdDietaComida(rs.getInt("idDietaComida"));
                dietacomida.setComida(ComidaData.buscarComidaPorId(rs.getInt("idComida")));
                dietacomida.setHorario(mapHorario(rs.getString("horario")));
                dietacomida.setPorcion(rs.getDouble("porcion"));
                
                Listadietacomida.add(dietacomida);
            }
            
            ps.close();
        } catch (NullPointerException | SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
        }
        System.err.println("paso");
        Listadietacomida.forEach((comida) -> System.out.println(comida));
        return Listadietacomida;
    }
    
    private static Horario mapHorario(String horarioString) {
        Horario horario = null;
        for (Horario h : Horario.values()) {
            if (h.toString().equalsIgnoreCase(horarioString)) {
                horario = h;
            }
        }
        return horario;
    }
}
