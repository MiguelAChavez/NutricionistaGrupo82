/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Dietas;

import Vistas.DeskNutricionista;
import utils.CargarComponente;

/**
 *
 * @author Lenovo
 */
public class DietaView extends javax.swing.JPanel {

    /**
     * Creates new form DietaView
     *
     */
    private final DeskNutricionista d1;

    public DietaView(DeskNutricionista d1) {
        initComponents();
        this.d1 = d1;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PRFondo1 = new utils.PanelRound();
        jBFormularioD1 = new javax.swing.JButton();
        jBListarP1 = new javax.swing.JButton();
        jBHistorialPaciente1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PRFondo1.setBackground(new java.awt.Color(219, 219, 219));
        PRFondo1.setRoundBottomLeft(40);
        PRFondo1.setRoundBottomRight(40);
        PRFondo1.setRoundTopLeft(40);
        PRFondo1.setRoundTopRight(40);
        PRFondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBFormularioD1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jBFormularioD1.setText("Formulario");
        jBFormularioD1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.black));
        jBFormularioD1.setBorderPainted(false);
        jBFormularioD1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBFormularioD1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBFormularioD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFormularioD1ActionPerformed(evt);
            }
        });
        PRFondo1.add(jBFormularioD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 240, 70));

        jBListarP1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jBListarP1.setText("Listar ");
        jBListarP1.setActionCommand("LISTADO PACIENTE");
        jBListarP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBListarP1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo1.add(jBListarP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 240, 70));

        jBHistorialPaciente1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jBHistorialPaciente1.setText("Historial");
        jBHistorialPaciente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBHistorialPaciente1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBHistorialPaciente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHistorialPaciente1ActionPerformed(evt);
            }
        });
        PRFondo1.add(jBHistorialPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 240, 70));

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html>Abre el formulario para completar, modificar o eliminar los datos de las dietas, luego con el botón continuar abre el registro de comidas de cada dieta.<html>");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 220, 80));

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html>Selecciona una dieta y explora el listado de las comidas, selecciona un horario y porción para cada una.<html>");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 220, 70));

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<html>Consulta el historial de cada dieta, si ésta se encuentra terminada o vigente, modificando el estado si fuese necesario. <html>");
        PRFondo1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 220, 70));

        add(PRFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 570, 400));

        jPanel5.setBackground(new java.awt.Color(22, 22, 22));

        jLabel10.setFont(new java.awt.Font("Linux Libertine G", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText(" Home Dietas");
        jPanel5.add(jLabel10);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo paciente.png"))); // NOI18N
        jLabel11.setText("jLabel3");
        jPanel5.add(jLabel11);

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jBFormularioD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFormularioD1ActionPerformed
        // TODO add your handling code here:       
        CargarComponente.showComponents(new FormularioDietaView(d1), this.d1);

    }//GEN-LAST:event_jBFormularioD1ActionPerformed

    private void jBHistorialPaciente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHistorialPaciente1ActionPerformed
        // TODO add your handling code here:
        CargarComponente.showComponents(new ListadoDietas(), d1);
    }//GEN-LAST:event_jBHistorialPaciente1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.PanelRound PRFondo1;
    private javax.swing.JButton jBFormularioD1;
    private javax.swing.JButton jBHistorialPaciente1;
    private javax.swing.JButton jBListarP1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
