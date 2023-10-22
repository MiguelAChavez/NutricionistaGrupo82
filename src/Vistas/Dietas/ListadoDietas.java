/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Dietas;

import AccesoADatos.DietaData;
import Entidades.Dieta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.CargarComponente;
import utils.Estado;

/**
 *
 * @author Lenovo
 */
public class ListadoDietas extends javax.swing.JPanel {

   private final DefaultTableModel model = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int i, int i1) {
            return Boolean.FALSE;
        }
    };
   
   private Dieta miDieta;
    public ListadoDietas() {
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

        jPanel1 = new javax.swing.JPanel();
        jLTituloD = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDietas = new javax.swing.JTable();
        jComboBoxDietasTabla = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jBEliminarDietaTabla = new javax.swing.JButton();
        jBCrearDietaComida = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLTituloD.setFont(new java.awt.Font("Roboto", 1, 39)); // NOI18N
        jLTituloD.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloD.setText("Historial de dietas");

        jTableDietas.setBackground(new java.awt.Color(51, 51, 51));
        jTableDietas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableDietas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Paciente", "Fecha Inicio", "Fecha Final", "Peso Inicial", "Peso Buscado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDietas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableDietas);
        if (jTableDietas.getColumnModel().getColumnCount() > 0) {
            jTableDietas.getColumnModel().getColumn(0).setResizable(false);
        }

        jComboBoxDietasTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDietasTablaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione estado:");

        jBEliminarDietaTabla.setBackground(new java.awt.Color(247, 87, 87));
        jBEliminarDietaTabla.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBEliminarDietaTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jBEliminarDietaTabla.setText("Eliminar");
        jBEliminarDietaTabla.setBorder(null);
        jBEliminarDietaTabla.setBorderPainted(false);
        jBEliminarDietaTabla.setContentAreaFilled(false);
        jBEliminarDietaTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminarDietaTabla.setDisabledIcon(null);
        jBEliminarDietaTabla.setEnabled(false);
        jBEliminarDietaTabla.setOpaque(true);
        jBEliminarDietaTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarDietaTablaActionPerformed(evt);
            }
        });

        jBCrearDietaComida.setBackground(new java.awt.Color(48, 255, 167));
        jBCrearDietaComida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBCrearDietaComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar-el-archivo.png"))); // NOI18N
        jBCrearDietaComida.setText("Activar");
        jBCrearDietaComida.setBorder(null);
        jBCrearDietaComida.setBorderPainted(false);
        jBCrearDietaComida.setContentAreaFilled(false);
        jBCrearDietaComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCrearDietaComida.setDisabledIcon(null);
        jBCrearDietaComida.setOpaque(true);
        jBCrearDietaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearDietaComidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLTituloD, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(606, 606, 606)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDietasTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jBCrearDietaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(286, 286, 286)
                        .addComponent(jBEliminarDietaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLTituloD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDietasTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCrearDietaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminarDietaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarDietaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarDietaTablaActionPerformed

    }//GEN-LAST:event_jBEliminarDietaTablaActionPerformed

    private void jBCrearDietaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearDietaComidaActionPerformed

    }//GEN-LAST:event_jBCrearDietaComidaActionPerformed

    private void jComboBoxDietasTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDietasTablaActionPerformed
      CargarComponente.borrarFilas(jTableDietas, model);
        if ( this.jComboBoxDietasTabla.getSelectedItem().getClass() != String.class ) {
            Dieta dieta = (Dieta) jComboBoxDietasTabla.getSelectedItem();
       List<Dieta> ListaDieta =    DietaData.buscarPorNombreDieta(Estado.TODOS);
            if (ListaDieta.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay ninguna dieta creada");
                return;
            }
            //for (Dieta dieta : ListaDieta) {
                model.addRow(new Object[]{
                    dieta.getIdDieta(),
                    dieta.getNombre (),
                    dieta.getFechaInicial(),
                    dieta.getFechaFinal(),
                    dieta.getPesoInicial(),
                    dieta.getPesoInicial()
                });
            //}
        }

    }//GEN-LAST:event_jComboBoxDietasTablaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCrearDietaComida;
    private javax.swing.JButton jBEliminarDietaTabla;
    private javax.swing.JComboBox<Object> jComboBoxDietasTabla;
    private javax.swing.JLabel jLTituloD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDietas;
    // End of variables declaration//GEN-END:variables

      private void armarCombo() {
        this.jComboBoxDietasTabla.removeAll();
        this.jComboBoxDietasTabla.addItem("--Seleccione--");
        this.jComboBoxDietasTabla.setSelectedIndex(0);

        ArrayList<Dieta> listaDieta = (ArrayList<Dieta>) DietaData.buscarPorNombreDieta(Estado.TODOS);
        for (Dieta dieta : listaDieta) {
            this.jComboBoxDietasTabla.addItem(dieta);
        }
                
    }






}
