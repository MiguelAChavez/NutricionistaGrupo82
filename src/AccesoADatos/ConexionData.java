/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alber
 */
public class ConexionData {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String BD = "nutricionista";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection = null;     //variable de tipo Connection que es las que va a usar nuestras clases Data 
    //  a traves de un objeto de tipo connection para generar los PreparedStatement

    private ConexionData() {        //constructor
    }

    public static Connection getConnection() {
        if (connection == null) {                       //verifica que es la primera vez que se realiza la conexion atraves de la variable Connection
            try {
                Class.forName("org.mariadb.jdbc.Driver");      //carga los driver de conexion
                connection = DriverManager.getConnection(URL + BD, USUARIO, PASSWORD);      //se crear el objeto connection

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No se puedo encontrar el Driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puedo encontrar la base de datos");
            }
        }
        return connection;      //fin conexion

    }
}
