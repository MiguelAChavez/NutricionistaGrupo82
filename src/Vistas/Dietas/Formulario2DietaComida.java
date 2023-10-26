/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Dietas;

import AccesoADatos.ComidaData;
import AccesoADatos.DietaComidaData;
import AccesoADatos.DietaData;
import Entidades.Comida;
import Entidades.Dieta;
import Entidades.DietaComida;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import utils.CargarComponente;
import utils.Estado;
import utils.Horario;

/**
 *
 * @author Lenovo
 */
public final class Formulario2DietaComida extends javax.swing.JPanel {

    /**
     * Creates new form Formulario2DietaComida
     */
    private final DefaultTableModel tablita = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int i, int i1) {
            switch (i1) {
                case 1:
                    return true;
                case 2:
                    return true;
                default:
                    return false;
            }
        }
    };
    private Dieta Mi_Dieta;
    private int cont = 0;
    private List<DietaComida> dietasComidas;

    public Formulario2DietaComida(Dieta dieta1) {
        initComponents();
        initTable();
        dietasComidas = new ArrayList<>();
        if (dieta1 == null) {
            iniciarComboDietas();
            this.Mi_Dieta = null;
        } else {
            this.Mi_Dieta = dieta1;
            this.jComboBoxDietaComida.setEnabled(Boolean.FALSE);
            jCBComidas.setEnabled(Boolean.TRUE);
            List<DietaComida> list = DietaComidaData.buscarDietaComidaPorIdDieta(this.Mi_Dieta.getIdDieta());
            cargarTabla(list);
        }
        this.cont++;
        iniciarComboComida();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTDietaComida = new javax.swing.JLabel();
        jComboBoxDietaComida = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDietaComida = new javax.swing.JTable();
        jCBComidas = new javax.swing.JComboBox<>();
        jBCrearDietaComida = new javax.swing.JButton();
        jBEliminarDietaComida = new javax.swing.JButton();
        jBAgregarComida = new javax.swing.JButton();

        setBackground(new java.awt.Color(35, 35, 35));
        setPreferredSize(new java.awt.Dimension(1100, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTDietaComida.setBackground(new java.awt.Color(51, 51, 51));
        jLTDietaComida.setFont(new java.awt.Font("Dialog", 1, 39)); // NOI18N
        jLTDietaComida.setForeground(new java.awt.Color(255, 255, 255));
        jLTDietaComida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTDietaComida.setText("Formulario dieta-comida");
        add(jLTDietaComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1080, -1));

        jComboBoxDietaComida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBoxDietaComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar la dieta" }));
        jComboBoxDietaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDietaComidaActionPerformed(evt);
            }
        });
        add(jComboBoxDietaComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 449, 28));

        jTableDietaComida.setBackground(new java.awt.Color(51, 51, 51));
        jTableDietaComida.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableDietaComida.setForeground(new java.awt.Color(255, 255, 255));
        jTableDietaComida.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null }
                },
                new String[] {
                        "Comida", "Porción", "Horario"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTableDietaComida.setGridColor(new java.awt.Color(0, 0, 0));
        jTableDietaComida.setRowHeight(40);
        jTableDietaComida.setSelectionBackground(new java.awt.Color(30, 150, 117));
        jTableDietaComida.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableDietaComida);
        if (jTableDietaComida.getColumnModel().getColumnCount() > 0) {
            jTableDietaComida.getColumnModel().getColumn(0).setResizable(false);
            jTableDietaComida.getColumnModel().getColumn(1).setResizable(false);
            jTableDietaComida.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 700, 380));

        jCBComidas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jCBComidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar comidas" }));
        jCBComidas.setEnabled(false);
        jCBComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBComidasActionPerformed(evt);
            }
        });
        add(jCBComidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 398, 30));

        jBCrearDietaComida.setBackground(new java.awt.Color(48, 255, 167));
        jBCrearDietaComida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBCrearDietaComida
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar-el-archivo.png"))); // NOI18N
        jBCrearDietaComida.setText("Guardar");
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
        add(jBCrearDietaComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 80, 40));

        jBEliminarDietaComida.setBackground(new java.awt.Color(247, 87, 87));
        jBEliminarDietaComida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBEliminarDietaComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jBEliminarDietaComida.setText("Eliminar");
        jBEliminarDietaComida.setBorder(null);
        jBEliminarDietaComida.setBorderPainted(false);
        jBEliminarDietaComida.setContentAreaFilled(false);
        jBEliminarDietaComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminarDietaComida.setDisabledIcon(null);
        jBEliminarDietaComida.setEnabled(false);
        jBEliminarDietaComida.setOpaque(true);
        jBEliminarDietaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarDietaComidaActionPerformed(evt);
            }
        });
        add(jBEliminarDietaComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 90, 40));

        jBAgregarComida.setBackground(new java.awt.Color(132, 181, 90));
        jBAgregarComida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBAgregarComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-agregar.png"))); // NOI18N
        jBAgregarComida.setText("Agregar");
        jBAgregarComida.setBorder(null);
        jBAgregarComida.setBorderPainted(false);
        jBAgregarComida.setContentAreaFilled(false);
        jBAgregarComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAgregarComida.setEnabled(false);
        jBAgregarComida.setOpaque(true);
        jBAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarComidaActionPerformed(evt);
            }
        });
        add(jBAgregarComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 90, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarDietaComidaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBEliminarDietaComidaActionPerformed

    }// GEN-LAST:event_jBEliminarDietaComidaActionPerformed

    private void jBCrearDietaComidaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBCrearDietaComidaActionPerformed

    }// GEN-LAST:event_jBCrearDietaComidaActionPerformed

    private void jComboBoxDietaComidaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxDietaComidaActionPerformed
        if (this.jComboBoxDietaComida.getSelectedItem().getClass() != String.class) {
            Dieta d = (Dieta) jComboBoxDietaComida.getSelectedItem();
            this.Mi_Dieta = d;
            List<DietaComida> comidas = DietaComidaData.buscarDietaComidaPorIdDieta(d.getIdDieta());
            this.jCBComidas.setEnabled(true);
            cargarTabla(comidas);
        } else {
            this.jCBComidas.setEnabled(false);
        }
    }// GEN-LAST:event_jComboBoxDietaComidaActionPerformed

    private void jBAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBAgregarComidaActionPerformed
        Comida comida = (Comida) jCBComidas.getSelectedItem();
        DietaComida dietaComida = new DietaComida();
        dietaComida.setDieta(this.Mi_Dieta);
        dietaComida.setComida(comida);
        dietaComida.setPorcion(0);
        dietaComida.setHorario(Horario.DESAYUNO);
        
        DietaComidaData.crearDietaComida(dietaComida);
        
        cargarTabla(dietaComida);
    }// GEN-LAST:event_jBAgregarComidaActionPerformed

    private void jCBComidasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCBComidasActionPerformed
        if (this.jCBComidas.getSelectedItem().getClass() != String.class) {
            jBAgregarComida.setEnabled(Boolean.TRUE);

        } else {
            jBAgregarComida.setEnabled(Boolean.FALSE);
        }
    }// GEN-LAST:event_jCBComidasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarComida;
    private javax.swing.JButton jBCrearDietaComida;
    private javax.swing.JButton jBEliminarDietaComida;
    private javax.swing.JComboBox<Object> jCBComidas;
    private javax.swing.JComboBox<Object> jComboBoxDietaComida;
    private javax.swing.JLabel jLTDietaComida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDietaComida;
    // End of variables declaration//GEN-END:variables

    private void initTable() {

        this.tablita.addColumn("Comida");
        this.tablita.addColumn("Porción");
        this.tablita.addColumn("Horario");

        this.jTableDietaComida.setModel(this.tablita);

        JTableHeader tableHeader = jTableDietaComida.getTableHeader();
        tableHeader.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setPreferredSize(new Dimension(c.getWidth(), 40));
                c.setBackground(Color.GRAY);
                c.setForeground(Color.WHITE);
                return c;
            }
        });

        setCombo();
    }

    private void setCombo() {
        TableColumn column = this.jTableDietaComida.getColumnModel().getColumn(2);
        JComboBox<Horario> comboBox = new JComboBox();
        comboBox.addItem(Horario.DESAYUNO);
        comboBox.addItem(Horario.ALMUERZO);
        comboBox.addItem(Horario.MERIENDA);
        comboBox.addItem(Horario.CENA);
        comboBox.addItem(Horario.SNACK);

        column.setCellEditor(new DefaultCellEditor(comboBox));
        column.setCellRenderer(new DefaultTableCellRenderer());
    }

    public void iniciarComboDietas() {
        List<Dieta> listaDietita = DietaData.buscarDietas(Estado.ACTIVO);
        if (listaDietita.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay dietas disponibles");
            return;
        }
        cargarCombo(this.jComboBoxDietaComida, listaDietita);
    }

    private void iniciarComboComida() {
        List<Comida> listaComidas = ComidaData.buscarComidas(Estado.ACTIVO);
        if (listaComidas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay comidas");
            return;
        }
        cargarCombo(this.jCBComidas, listaComidas);
    }

    private void cargarCombo(JComboBox<Object> comboBox, List<?> listita) {
        for (Object o : listita) {
            comboBox.addItem(o);
        }
    }

    public void invertirEstado() {
        this.jCBComidas.setEnabled(!jCBComidas.isEnabled());
    }

    private void cargarTabla(List<DietaComida> listita) {
        if (listita == null) {
            JOptionPane.showMessageDialog(this, "No hay ninguna comida cargada en la dieta");
        } else if (listita.isEmpty()) {
            if (this.cont > 0) {
                JOptionPane.showMessageDialog(this, "No hay ninguna comida cargada en la dieta");
            }
            CargarComponente.borrarFilas(this.jTableDietaComida, this.tablita);
        } else {
            this.dietasComidas = listita;
            CargarComponente.borrarFilas(this.jTableDietaComida, this.tablita);
            for (DietaComida dietaComida : listita) {
                this.tablita.addRow(new Object[]{
                    dietaComida.getComida().getNombre(),
                    dietaComida.getPorcion(),
                    dietaComida.getHorario()
                });
            }
        }
    }

    private void cargarTabla(DietaComida dietaComida) {
        this.dietasComidas.add(dietaComida);
        this.tablita.addRow(new Object[]{
            dietaComida.getComida(),
            dietaComida.getPorcion(),
            dietaComida.getHorario()
        });
    }

}
