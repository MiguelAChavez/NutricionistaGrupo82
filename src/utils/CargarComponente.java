/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import Vistas.DeskNutricionista;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAMON
 */
public class CargarComponente {
    
    private CargarComponente() {
    }
    
    public static void showComponents(JPanel panel, DeskNutricionista contenedor) {
        contenedor.getjPSetup().removeAll();
        contenedor.getjPSetup().add(panel, BorderLayout.CENTER);
        contenedor.getjPSetup().validate();
        contenedor.getjPSetup().repaint();
    }
    
    public static void borrarFilas(JTable tabla, DefaultTableModel tablita) {
        int filas = tabla.getRowCount() - 1;
        for (int i = filas; i >= 0; i --) {
            tablita.removeRow(i);
        }
    }
    
}
