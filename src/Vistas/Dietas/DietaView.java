/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Dietas;

/**
 *
 * @author Lenovo
 */
public class DietaView extends javax.swing.JPanel {

    /**
     * Creates new form DietaView
     */
    public DietaView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        PRFondo1 = new utils.PanelRound();
        jBFormularioP1 = new javax.swing.JButton();
        jBListarP1 = new javax.swing.JButton();
        jBHistorialPaciente1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(22, 22, 22));

        jLabel10.setFont(new java.awt.Font("Linux Libertine G", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText(" Home Dietas");
        jPanel5.add(jLabel10);

        PRFondo1.setBackground(new java.awt.Color(219, 219, 219));
        PRFondo1.setRoundBottomLeft(40);
        PRFondo1.setRoundBottomRight(40);
        PRFondo1.setRoundTopLeft(40);
        PRFondo1.setRoundTopRight(40);
        PRFondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBFormularioP1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jBFormularioP1.setText("Formulario");
        jBFormularioP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.black));
        jBFormularioP1.setBorderPainted(false);
        jBFormularioP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBFormularioP1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo1.add(jBFormularioP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 240, 70));

        jBListarP1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jBListarP1.setText("Listar ");
        jBListarP1.setActionCommand("LISTADO PACIENTE");
        jBListarP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBListarP1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo1.add(jBListarP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 240, 70));

        jBHistorialPaciente1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jBHistorialPaciente1.setText("Historial");
        jBHistorialPaciente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBHistorialPaciente1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo1.add(jBHistorialPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 240, 70));

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html>Abre el formulario para completar, modificar o eliminar los datos del paciente<html>");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 70));

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html>Explora el listado de tus pacientes, activos y no activos<html>");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRFondo1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 70));

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<html>Consulta el historial de cada paciente, con el registro cronológico de su dieta o dietas <html>");
        PRFondo1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 210, 70));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(PRFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(598, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(PRFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, -1, 510));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo paciente.png"))); // NOI18N
        jLabel11.setText("jLabel3");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.PanelRound PRFondo1;
    private javax.swing.JButton jBFormularioP1;
    private javax.swing.JButton jBHistorialPaciente1;
    private javax.swing.JButton jBListarP1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
