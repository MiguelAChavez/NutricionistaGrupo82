/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paciente;

import Vistas.*;
import utils.CargarComponente;

/**
 *
 * @author Pc Chavez
 */
public class PacientesView extends javax.swing.JPanel {

    /**
     * Creates new form PacientesView
     */
   
    private final DeskNutricionista contenedor;
    public PacientesView(DeskNutricionista ContentPanel) {
        initComponents();
        this.contenedor = ContentPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PRFondo = new utils.PanelRound();
        jBFormularioP = new javax.swing.JButton();
        jBListarP = new javax.swing.JButton();
        jBHistorialPaciente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(java.awt.Color.lightGray);
        setMinimumSize(new java.awt.Dimension(1030, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PRFondo.setBackground(new java.awt.Color(219, 219, 219));
        PRFondo.setRoundBottomLeft(40);
        PRFondo.setRoundBottomRight(40);
        PRFondo.setRoundTopLeft(40);
        PRFondo.setRoundTopRight(40);
        PRFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBFormularioP.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jBFormularioP.setText("Formulario");
        jBFormularioP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.black));
        jBFormularioP.setBorderPainted(false);
        jBFormularioP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBFormularioP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBFormularioP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jBFormularioPFocusGained(evt);
            }
        });
        jBFormularioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFormularioPActionPerformed(evt);
            }
        });
        PRFondo.add(jBFormularioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 240, 70));

        jBListarP.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jBListarP.setText("Listar ");
        jBListarP.setActionCommand("LISTADO PACIENTE");
        jBListarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBListarP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBListarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarPActionPerformed(evt);
            }
        });
        PRFondo.add(jBListarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 240, 70));

        jBHistorialPaciente.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jBHistorialPaciente.setText("Historial");
        jBHistorialPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBHistorialPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBHistorialPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHistorialPacienteActionPerformed(evt);
            }
        });
        PRFondo.add(jBHistorialPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 240, 70));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>Abre el formulario para completar, modificar o eliminar los datos del paciente<html>");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 70));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html>Explora el listado de tus pacientes, activos y no activos<html>");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 70));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>Consulta el historial de cada paciente, con el registro cronológico de su dieta o dietas <html>");
        PRFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 210, 70));

        add(PRFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 560, 400));

        jPanel1.setBackground(new java.awt.Color(22, 22, 22));

        jLabel6.setFont(new java.awt.Font("Linux Libertine G", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Home Paciente");
        jPanel1.add(jLabel6);
        jLabel6.getAccessibleContext().setAccessibleName("");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo paciente.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void jBHistorialPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHistorialPacienteActionPerformed
        // TODO add your handling code here:
        CargarComponente.showComponents(new HistorialPacientesView(),this.contenedor);
    }//GEN-LAST:event_jBHistorialPacienteActionPerformed

    private void jBListarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarPActionPerformed
        CargarComponente.showComponents(new ListarPacientes(),this.contenedor);
    }//GEN-LAST:event_jBListarPActionPerformed

    private void jBFormularioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFormularioPActionPerformed
       CargarComponente.showComponents(new FormularioPacienteView(),this.contenedor);
    }//GEN-LAST:event_jBFormularioPActionPerformed

    private void jBFormularioPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBFormularioPFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jBFormularioPFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.PanelRound PRFondo;
    private javax.swing.JButton jBFormularioP;
    private javax.swing.JButton jBHistorialPaciente;
    private javax.swing.JButton jBListarP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
