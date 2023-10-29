package Vistas;

import AccesoADatos.DietaData;
import Vistas.Comida.ComidaView;
import Vistas.Dietas.DietaView;
import Vistas.Paciente.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;
import utils.AnimationPanel;
import utils.PanelRound;

/**
 *
 * @author Pc Chavez
 */
public class DeskNutricionista extends javax.swing.JFrame {

    public utils.AnimationPanel mover = new AnimationPanel();

    private final PacientesView pacientesView;
    private final DietaView dietaView;
    private final ComidaView comidaView;
    private int ingreso = 0;

    public DeskNutricionista() {
        initComponents();
        this.pacientesView = new PacientesView(this);
        this.dietaView = new DietaView(this);
        this.comidaView = new ComidaView(this);

        this.setIconImage(this.getIconImage());
        this.jBDesplegar.setVisible(Boolean.FALSE);
        showComponents(new BienvenidaView());
    }

    @Override
    public final Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit()
                .getImage(ClassLoader.getSystemResource("Imagenes/logo-universidad-de-la-punta.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        PRBarraMenu = new utils.PanelRound();
        jBPacientes = new javax.swing.JButton();
        jBDientas = new javax.swing.JButton();
        jBComida = new javax.swing.JButton();
        jBPlegar = new javax.swing.JButton();
        jPRFondoImagen = new utils.PanelRound();
        jLImagen = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
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
        PRBarraMenu.setOpaque(true);
        PRBarraMenu.setRoundBottomRight(40);
        PRBarraMenu.setRoundTopRight(40);
        PRBarraMenu.setVerifyInputWhenFocusTarget(false);

        jBPacientes.setBackground(new java.awt.Color(58, 58, 58));
        jBPacientes.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jBPacientes.setForeground(new java.awt.Color(255, 255, 255));
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
        jBDientas.setForeground(new java.awt.Color(255, 255, 255));
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
        jBComida.setForeground(new java.awt.Color(255, 255, 255));
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPRFondoImagenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPRFondoImagenMouseExited(evt);
            }
        });

        jLImagen.setBackground(new java.awt.Color(255, 255, 255));
        jLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-universidad-de-la-punta.png"))); // NOI18N
        jLImagen.setToolTipText("Inicio");
        jLImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLImagenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLImagenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLImagenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPRFondoImagenLayout = new javax.swing.GroupLayout(jPRFondoImagen);
        jPRFondoImagen.setLayout(jPRFondoImagenLayout);
        jPRFondoImagenLayout.setHorizontalGroup(
            jPRFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRFondoImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPRFondoImagenLayout.setVerticalGroup(
            jPRFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRFondoImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jBSalir.setBackground(new java.awt.Color(122, 122, 122));
        jBSalir.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(23, 36, 50));
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida (1).png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setBorder(null);
        jBSalir.setBorderPainted(false);
        jBSalir.setContentAreaFilled(false);
        jBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalir.setFocusable(false);
        jBSalir.setOpaque(true);
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSalirMouseExited(evt);
            }
        });
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PRBarraMenuLayout = new javax.swing.GroupLayout(PRBarraMenu);
        PRBarraMenu.setLayout(PRBarraMenuLayout);
        PRBarraMenuLayout.setHorizontalGroup(
            PRBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRBarraMenuLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jPRFondoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jBPlegar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PRBarraMenuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jBPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PRBarraMenuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jBDientas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PRBarraMenuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PRBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBComida, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PRBarraMenuLayout.setVerticalGroup(
            PRBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRBarraMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PRBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PRBarraMenuLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPRFondoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBPlegar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jBPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBDientas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBComida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        jPFondo.add(PRBarraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 670));

        jPSetup.setBackground(new java.awt.Color(35, 35, 35));
        jPSetup.setLayout(new java.awt.CardLayout());
        jPFondo.add(jPSetup, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1060, 670));

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

    private void jBSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseEntered
        this.jBSalir.setBackground(new Color(0, 145, 218));
    }//GEN-LAST:event_jBSalirMouseEntered

    private void jBSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseExited
        this.jBSalir.setBackground(new Color(122, 122, 122));
    }//GEN-LAST:event_jBSalirMouseExited

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jPRFondoImagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPRFondoImagenMouseEntered
        this.jPRFondoImagen.setBackground(new Color(76, 76, 76));
    }//GEN-LAST:event_jPRFondoImagenMouseEntered

    private void jPRFondoImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPRFondoImagenMouseExited
        this.jPRFondoImagen.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPRFondoImagenMouseExited

    private void jLImagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLImagenMouseEntered
        this.jPRFondoImagen.setBackground(new Color(76, 76, 76));
    }//GEN-LAST:event_jLImagenMouseEntered

    private void jLImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLImagenMouseExited
        this.jPRFondoImagen.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLImagenMouseExited

    private void jBComidaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBComidaActionPerformed
        showComponents(this.comidaView);
    }// GEN-LAST:event_jBComidaActionPerformed

    private void jBComidaMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBComidaMouseExited
        this.jBComida.setBackground(new Color(58, 58, 58));
    }// GEN-LAST:event_jBComidaMouseExited

    private void jBComidaMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBComidaMouseEntered
        this.jBComida.setBackground(new Color(0, 145, 218));
    }// GEN-LAST:event_jBComidaMouseEntered

    private void jBDientasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBDientasActionPerformed
        // TODO add your handling code here:
        showComponents(this.dietaView);
    }// GEN-LAST:event_jBDientasActionPerformed

    private void jBDientasMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBDientasMouseExited
        this.jBDientas.setBackground(new Color(58, 58, 58));
    }// GEN-LAST:event_jBDientasMouseExited

    private void jBDientasMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBDientasMouseEntered
        this.jBDientas.setBackground(new Color(0, 145, 218));
    }// GEN-LAST:event_jBDientasMouseEntered

    private void jBPacientesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBPacientesActionPerformed
        showComponents(this.pacientesView);
    }// GEN-LAST:event_jBPacientesActionPerformed

    private void jBPacientesMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBPacientesMouseExited
        this.jBPacientes.setBackground(new Color(58, 58, 58));
    }// GEN-LAST:event_jBPacientesMouseExited

    private void jBPacientesMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBPacientesMouseEntered
        this.jBPacientes.setBackground(new Color(0, 145, 218));
    }// GEN-LAST:event_jBPacientesMouseEntered

    private void jBDesplegarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBDesplegarActionPerformed
        if (PRBarraMenu.getX() == 0) {
            jBDesplegar.setVisible(Boolean.FALSE);
            PRBarraMenu.setVisible(Boolean.TRUE);
        }
        this.mover.animateVisibleScroll(PRBarraMenu, this.jBDesplegar);
    }// GEN-LAST:event_jBDesplegarActionPerformed

    private void jBPlegarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBPlegarActionPerformed
        this.mover.animateHiddenScroll(PRBarraMenu, this.jBDesplegar);
    }// GEN-LAST:event_jBPlegarActionPerformed

    private void jBDesplegarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBDesplegarMouseEntered
        this.jBDesplegar.setBackground(new Color(73, 73, 73));
    }// GEN-LAST:event_jBDesplegarMouseEntered

    private void jBPlegarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBPlegarMouseEntered
        this.jBPlegar.setBackground(new Color(13, 13, 13));
    }// GEN-LAST:event_jBPlegarMouseEntered

    private void jBDesplegarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBDesplegarMouseExited
        this.jBDesplegar.setBackground(new Color(153, 153, 153));
    }// GEN-LAST:event_jBDesplegarMouseExited

    private void jBPlegarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBPlegarMouseExited
        this.jBPlegar.setBackground(new Color(153, 153, 153));
    }// GEN-LAST:event_jBPlegarMouseExited

    private void jPRFondoImagenMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPRFondoImagenMouseClicked

    }// GEN-LAST:event_jPRFondoImagenMouseClicked

    private void jLImagenMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel2MouseClicked
        if (this.ingreso > 1) {
            showComponents(new BienvenidaView());
        }
    }// GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeskNutricionista.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DeskNutricionista deskNutricionista = new DeskNutricionista();
                deskNutricionista.setVisible(true);
                //Actualizo el estado de las dietas que ya concluyeron
                DietaData.actualizarEstadoYFinalDeDieta();
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
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLImagen;
    private javax.swing.JPanel jPFondo;
    private utils.PanelRound jPRFondoImagen;
    private javax.swing.JPanel jPSetup;
    // End of variables declaration//GEN-END:variables

    private void showComponents(JPanel panel) {
        if (this.ingreso > 0) {
            this.mover.animateHiddenScroll(PRBarraMenu, this.jBDesplegar);
        }
        this.jPSetup.removeAll();
        this.jPSetup.add(panel, BorderLayout.CENTER);
        this.jPSetup.revalidate();
        this.jPSetup.repaint();
        this.ingreso++;
    }

    public PanelRound getPRBarraMenu() {
        return PRBarraMenu;
    }

    public JPanel getjPSetup() {
        return jPSetup;
    }

    public JButton getjBDesplegar() {
        return jBDesplegar;
    }

}
