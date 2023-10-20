/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import Vistas.DeskNutricionista;
import java.awt.BorderLayout;
import javax.swing.JPanel;

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

}
