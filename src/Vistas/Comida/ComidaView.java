/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Comida;

import Vistas.DeskNutricionista;
import utils.*;

/**
 *
 * @author RAMON
 */
public class ComidaView extends javax.swing.JPanel {

    DeskNutricionista contenedor;
    public ComidaView(DeskNutricionista contenedor) {
        initComponents(); 
        this.contenedor = contenedor;
        System.out.println("Vistas.Comida.ComidaView.<init>()  " +this.contenedor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PRFondo = new utils.PanelRound();
        jBFormularioP = new javax.swing.JButton();
        jBListarP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        PRFondo1 = new utils.PanelRound();
        jBFormularioC = new javax.swing.JButton();
        jBListarComida = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>Abre el formulario para completar, modificar o eliminar los datos del paciente<html>");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 70));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html>Explora el listado de tus pacientes, activos y no activos<html>");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 70));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>Consulta el historial de cada paciente, con el registro cronológico de su dieta o dietas <html>");
        PRFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 210, 70));

        setPreferredSize(new java.awt.Dimension(1100, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(22, 22, 22));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 22, 22));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PRFondo1.setBackground(new java.awt.Color(219, 219, 219));
        PRFondo1.setRoundBottomLeft(40);
        PRFondo1.setRoundBottomRight(40);
        PRFondo1.setRoundTopLeft(40);
        PRFondo1.setRoundTopRight(40);
        PRFondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBFormularioC.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jBFormularioC.setText("Formulario");
        jBFormularioC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.black));
        jBFormularioC.setBorderPainted(false);
        jBFormularioC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBFormularioC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBFormularioC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jBFormularioCFocusGained(evt);
            }
        });
        jBFormularioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFormularioCActionPerformed(evt);
            }
        });
        PRFondo1.add(jBFormularioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 240, 70));

        jBListarComida.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jBListarComida.setText("Listar ");
        jBListarComida.setActionCommand("LISTADO PACIENTE");
        jBListarComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBListarComida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBListarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarComidaActionPerformed(evt);
            }
        });
        PRFondo1.add(jBListarComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 240, 70));

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html>Abre el formulario para completar, modificar o eliminar las comidas del paciente<html>");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 210, 70));

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html>Explora el listado de las comidas y sus calorias<html>");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 210, 70));

        jPanel1.add(PRFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 580, 330));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo paciente.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 60, 1270, 600));

        jLabel6.setFont(new java.awt.Font("Linux Libertine G", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Home Comida");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1055, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 670));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 670));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jBFormularioPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBFormularioPFocusGained
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jBFormularioPFocusGained

    private void jBFormularioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFormularioPActionPerformed
        
    }//GEN-LAST:event_jBFormularioPActionPerformed

    private void jBListarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarPActionPerformed
      
    }//GEN-LAST:event_jBListarPActionPerformed

    private void jBFormularioCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBFormularioCFocusGained
        CargarComponente.showComponents(new FormularioComidaView(), this.contenedor);
    }//GEN-LAST:event_jBFormularioCFocusGained

    private void jBFormularioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFormularioCActionPerformed
     
    }//GEN-LAST:event_jBFormularioCActionPerformed

    private void jBListarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarComidaActionPerformed
       CargarComponente.showComponents(new ListarComidaView(), this.contenedor);
    }//GEN-LAST:event_jBListarComidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.PanelRound PRFondo;
    private utils.PanelRound PRFondo1;
    private javax.swing.JButton jBFormularioC;
    private javax.swing.JButton jBFormularioP;
    private javax.swing.JButton jBListarComida;
    private javax.swing.JButton jBListarP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
