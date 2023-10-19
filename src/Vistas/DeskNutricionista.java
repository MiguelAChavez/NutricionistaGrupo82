package Vistas;

import Vistas.Comida.ComidaView;
import Vistas.Dietas.DietaView;
import Vistas.Paciente.*;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
import utils.AnimationPanel;
import utils.PanelRound;
import utils.cargarComponente;

/**
 *
 * @author Pc Chavez
 */
public class DeskNutricionista extends javax.swing.JFrame {

    utils.AnimationPanel mover = new AnimationPanel();

    static CardLayout cardLayout;
    private final PacientesView pacientesView;
    private int ingreso = 0;

    public DeskNutricionista() {
        initComponents();
        this.pacientesView = new PacientesView(this);
        cardLayout = (CardLayout) this.jPSetup.getLayout();
        this.setIconImage(this.getIconImage());
        showComponents(new BienvenidaView());
    }

    @Override
    public final Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo-universidad-de-la-punta.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        PRBarraMenu = new utils.PanelRound();
        jBPacientes = new javax.swing.JButton();
        jBDientas = new javax.swing.JButton();
        jBComida = new javax.swing.JButton();
        jBPlegar = new javax.swing.JButton();
        jPRFondoImagen = new utils.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jPSetup = new javax.swing.JPanel();
        jBDesplegar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nutricionista");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPFondo.setBackground(new java.awt.Color(35, 35, 35));
        jPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PRBarraMenu.setBackground(new java.awt.Color(51, 51, 51));
        PRBarraMenu.setRoundBottomRight(40);
        PRBarraMenu.setRoundTopRight(40);

        jBPacientes.setBackground(new java.awt.Color(58, 58, 58));
        jBPacientes.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jBPacientes.setForeground(new java.awt.Color(204, 204, 204));
        jBPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente (2).png"))); // NOI18N
        jBPacientes.setText("  Pacientes");
        jBPacientes.setBorder(null);
        jBPacientes.setBorderPainted(false);
        jBPacientes.setContentAreaFilled(false);
        jBPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBPacientes.setFocusable(false);
        jBPacientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBPacientes.setInheritsPopupMenu(true);
        jBPacientes.setOpaque(true);
        jBPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBPacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBPacientesMouseExited(evt);
            }
        });
        jBPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPacientesActionPerformed(evt);
            }
        });

        jBDientas.setBackground(new java.awt.Color(58, 58, 58));
        jBDientas.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jBDientas.setForeground(new java.awt.Color(204, 204, 204));
        jBDientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta (1).png"))); // NOI18N
        jBDientas.setText("  Dietas");
        jBDientas.setBorder(null);
        jBDientas.setBorderPainted(false);
        jBDientas.setContentAreaFilled(false);
        jBDientas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBDientas.setFocusable(false);
        jBDientas.setOpaque(true);
        jBDientas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDientasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDientasMouseExited(evt);
            }
        });
        jBDientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDientasActionPerformed(evt);
            }
        });

        jBComida.setBackground(new java.awt.Color(58, 58, 58));
        jBComida.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jBComida.setForeground(new java.awt.Color(204, 204, 204));
        jBComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comida.png"))); // NOI18N
        jBComida.setText("  Comidas");
        jBComida.setBorder(null);
        jBComida.setBorderPainted(false);
        jBComida.setContentAreaFilled(false);
        jBComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBComida.setFocusable(false);
        jBComida.setOpaque(true);
        jBComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBComidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBComidaMouseExited(evt);
            }
        });
        jBComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComidaActionPerformed(evt);
            }
        });

        jBPlegar.setBackground(new java.awt.Color(153, 153, 153));
        jBPlegar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jBPlegar.setForeground(new java.awt.Color(234, 234, 234));
        jBPlegar.setText("x");
        jBPlegar.setBorder(null);
        jBPlegar.setBorderPainted(false);
        jBPlegar.setContentAreaFilled(false);
        jBPlegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBPlegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPlegar.setOpaque(true);
        jBPlegar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBPlegar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBPlegarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBPlegarMouseExited(evt);
            }
        });
        jBPlegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPlegarActionPerformed(evt);
            }
        });

        jPRFondoImagen.setBackground(new java.awt.Color(255, 255, 255));
        jPRFondoImagen.setToolTipText("");
        jPRFondoImagen.setRoundBottomLeft(30);
        jPRFondoImagen.setRoundBottomRight(30);
        jPRFondoImagen.setRoundTopLeft(30);
        jPRFondoImagen.setRoundTopRight(30);
        jPRFondoImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPRFondoImagenMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-universidad-de-la-punta.png"))); // NOI18N
        jLabel2.setToolTipText("Inicio");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPRFondoImagenLayout = new javax.swing.GroupLayout(jPRFondoImagen);
        jPRFondoImagen.setLayout(jPRFondoImagenLayout);
        jPRFondoImagenLayout.setHorizontalGroup(
            jPRFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRFondoImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPRFondoImagenLayout.setVerticalGroup(
            jPRFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRFondoImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PRBarraMenuLayout = new javax.swing.GroupLayout(PRBarraMenu);
        PRBarraMenu.setLayout(PRBarraMenuLayout);
        PRBarraMenuLayout.setHorizontalGroup(
            PRBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRBarraMenuLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jPRFondoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBPlegar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRBarraMenuLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(PRBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBDientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        PRBarraMenuLayout.setVerticalGroup(
            PRBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRBarraMenuLayout.createSequentialGroup()
                .addGroup(PRBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PRBarraMenuLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPRFondoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PRBarraMenuLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jBPlegar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jBPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBDientas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBComida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPFondo.add(PRBarraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 670));

        jPSetup.setBackground(new java.awt.Color(35, 35, 35));
        jPSetup.setLayout(new java.awt.CardLayout());
        jPFondo.add(jPSetup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 670));

        jBDesplegar.setBackground(new java.awt.Color(153, 153, 153));
        jBDesplegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N
        jBDesplegar.setBorder(null);
        jBDesplegar.setBorderPainted(false);
        jBDesplegar.setContentAreaFilled(false);
        jBDesplegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBDesplegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBDesplegar.setOpaque(true);
        jBDesplegar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDesplegarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDesplegarMouseExited(evt);
            }
        });
        jBDesplegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesplegarActionPerformed(evt);
            }
        });
        jPFondo.add(jBDesplegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComidaActionPerformed
        this.mover.animateScroll(PRBarraMenu);
        showComponents(new ComidaView(this));
    }//GEN-LAST:event_jBComidaActionPerformed

    private void jBComidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBComidaMouseExited
        this.jBComida.setBackground(new Color(58, 58, 58));
    }//GEN-LAST:event_jBComidaMouseExited

    private void jBComidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBComidaMouseEntered
        this.jBComida.setBackground(new Color(45, 45, 45));
    }//GEN-LAST:event_jBComidaMouseEntered

    private void jBDientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDientasActionPerformed
        // TODO add your handling code here:
        cargarComponente.showComponents(new DietaView(), this);
            this.mover.animateScroll(PRBarraMenu);
    }//GEN-LAST:event_jBDientasActionPerformed

    private void jBDientasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDientasMouseExited
        this.jBDientas.setBackground(new Color(58, 58, 58));
    }//GEN-LAST:event_jBDientasMouseExited

    private void jBDientasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDientasMouseEntered
        this.jBDientas.setBackground(new Color(45, 45, 45));
    }//GEN-LAST:event_jBDientasMouseEntered

    private void jBPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPacientesActionPerformed
        showComponents(this.pacientesView);
        this.mover.animateScroll(PRBarraMenu);
    }//GEN-LAST:event_jBPacientesActionPerformed

    private void jBPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPacientesMouseExited
        this.jBPacientes.setBackground(new Color(58, 58, 58));
    }//GEN-LAST:event_jBPacientesMouseExited

    private void jBPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPacientesMouseEntered
        this.jBPacientes.setBackground(new Color(45, 45, 45));
    }//GEN-LAST:event_jBPacientesMouseEntered

    private void jBDesplegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesplegarActionPerformed
        this.jBDesplegar.setVisible(false);
        this.mover.animateScroll(PRBarraMenu);
    }//GEN-LAST:event_jBDesplegarActionPerformed

    private void jBPlegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPlegarActionPerformed
        this.mover.animateScroll(PRBarraMenu);
        this.jBDesplegar.setVisible(true);
    }//GEN-LAST:event_jBPlegarActionPerformed

    private void jBDesplegarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDesplegarMouseEntered
        this.jBDesplegar.setBackground(new Color(73, 73, 73));
    }//GEN-LAST:event_jBDesplegarMouseEntered

    private void jBPlegarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPlegarMouseEntered
        this.jBPlegar.setBackground(new Color(13, 13, 13));
    }//GEN-LAST:event_jBPlegarMouseEntered

    private void jBDesplegarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDesplegarMouseExited
        this.jBDesplegar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_jBDesplegarMouseExited

    private void jBPlegarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPlegarMouseExited
        this.jBPlegar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_jBPlegarMouseExited

    private void jPRFondoImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPRFondoImagenMouseClicked

    }//GEN-LAST:event_jPRFondoImagenMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (this.ingreso > 1) {
            this.mover.animateScroll(PRBarraMenu);
            showComponents(new BienvenidaView());
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeskNutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeskNutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeskNutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeskNutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DeskNutricionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.PanelRound PRBarraMenu;
    private javax.swing.JButton jBComida;
    private javax.swing.JButton jBDesplegar;
    private javax.swing.JButton jBDientas;
    private javax.swing.JButton jBPacientes;
    private javax.swing.JButton jBPlegar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPFondo;
    private utils.PanelRound jPRFondoImagen;
    private javax.swing.JPanel jPSetup;
    // End of variables declaration//GEN-END:variables

    private void showComponents(JPanel panel) {
        this.ingreso++;
        this.jPSetup.removeAll();
        this.jPSetup.add(panel, BorderLayout.CENTER);
        this.jPSetup.revalidate();
        this.jPSetup.repaint();
        this.jBDesplegar.setVisible(Boolean.TRUE);
    }

    public PanelRound getPRBarraMenu() {
        return PRBarraMenu;
    }

    public JPanel getjPSetup() {
        return jPSetup;
    }

}
