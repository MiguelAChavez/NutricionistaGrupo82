/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paciente;

import AccesoADatos.DietaData;
import AccesoADatos.PacienteData;
import Entidades.Dieta;
import Entidades.Paciente;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import utils.CargarComponente;
import utils.Estado;
import utils.Validacion;

/**
 *
 * @author Pc Chavez
 */
public class ListarPacientes extends javax.swing.JPanel {

    /**
     * Creates new form ListarPacientes
     */
    private final DefaultTableModel MODEL_PACIENTE = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int i, int i1) {
            return Boolean.FALSE;
        }
    };

    private final DefaultTableModel MODEL_DIETA_PACIENTE = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int i, int i1) {
            return Boolean.FALSE;
        }
    };

    private Paciente mipaciente;
    private int cont = 0;

    public ListarPacientes() {
        initComponents();
        initTable();
        armarCombo();
        cont++;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBSelecionFiltro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPacientes = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jTTexto = new javax.swing.JTextField();
        jLTitulo = new javax.swing.JLabel();
        jLTexto = new javax.swing.JLabel();
        jLFiltro1 = new javax.swing.JLabel();
        jLCantidad = new javax.swing.JLabel();
        jTCant = new javax.swing.JTextField();

        setBackground(new java.awt.Color(35, 35, 35));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCBSelecionFiltro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jCBSelecionFiltro.setBorder(null);
        jCBSelecionFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSelecionFiltroActionPerformed(evt);
            }
        });
        add(jCBSelecionFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 140, 40));

        jTPacientes.setBackground(new java.awt.Color(51, 51, 51));
        jTPacientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTPacientes.setForeground(new java.awt.Color(255, 255, 255));
        jTPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jTPacientes.setGridColor(new java.awt.Color(0, 0, 0));
        jTPacientes.setRowHeight(40);
        jTPacientes.setSelectionBackground(new java.awt.Color(30, 150, 117));
        jTPacientes.setShowVerticalLines(false);
        jTPacientes.getTableHeader().setReorderingAllowed(false);
        JTableHeader theader = jTPacientes.getTableHeader();
        theader.setBackground(Color.red);
        theader.setForeground(new Color(13,13,13));
        theader.setFont(new java.awt.Font("Roboto", Font.BOLD, 16));
        jScrollPane1.setViewportView(jTPacientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 970, 450));

        jSeparator1.setOpaque(true);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 148, 480, 3));

        jTTexto.setBackground(new java.awt.Color(35, 35, 35));
        jTTexto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTTexto.setForeground(new java.awt.Color(255, 255, 255));
        jTTexto.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(2, 15, 2, 15), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jTTexto.setCaretColor(new java.awt.Color(0, 153, 255));
        jTTexto.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTTexto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTextoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTextoFocusLost(evt);
            }
        });
        jTTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTextoActionPerformed(evt);
            }
        });
        jTTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTTextoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTextoKeyTyped(evt);
            }
        });
        add(jTTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 480, 40));

        jLTitulo.setFont(new java.awt.Font("Roboto", 1, 39)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Tabla pacientes");
        add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1030, 50));

        jLTexto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLTexto.setForeground(new java.awt.Color(255, 255, 255));
        jLTexto.setText("Busque por apellido o nombre: ");
        add(jLTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 240, 50));

        jLFiltro1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLFiltro1.setForeground(new java.awt.Color(255, 255, 255));
        jLFiltro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFiltro1.setText("Filtro");
        jLFiltro1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLFiltro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 70, 20));

        jLCantidad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jLCantidad.setText("Cantidad:  ");
        add(jLCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, 130, 30));

        jTCant.setEditable(false);
        jTCant.setBackground(new java.awt.Color(35, 35, 35));
        jTCant.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jTCant.setForeground(new java.awt.Color(248, 245, 150));
        jTCant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCant.setBorder(null);
        jTCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCantActionPerformed(evt);
            }
        });
        add(jTCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 640, 40, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jTTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTextoActionPerformed

    private void jTTextoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTextoFocusGained
        this.jTTexto.setBackground(new Color(63, 63, 63));
    }//GEN-LAST:event_jTTextoFocusGained

    private void jTTextoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTextoFocusLost
        this.jTTexto.setBackground(new Color(35, 35, 35));
    }//GEN-LAST:event_jTTextoFocusLost

    private void jCBSelecionFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSelecionFiltroActionPerformed
      
        CargarComponente.borrarFilas(this.jTPacientes, (DefaultTableModel) this.jTPacientes.getModel());
        
        if (this.jCBSelecionFiltro.getSelectedItem().getClass() != String.class && cont != 0) {
            Estado estado = (Estado) jCBSelecionFiltro.getSelectedItem();
            List<Paciente> ListaPaciente = new ArrayList<>();
            List<Dieta> ListaPacienteDieta = new ArrayList<>();

            String texto = this.jTTexto.getText().trim();
            boolean isNoDieta = isEstadoNoDieta(estado);

            if (texto.isEmpty()) {
                
                if (isNoDieta) {
                    jTPacientes.setModel(MODEL_PACIENTE);
                    ListaPaciente = PacienteData.ListarPacientes(estado);
                    if (ListaPaciente.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "No hay pacientes regristados");
                        this.jTCant.setText("0");
                        return;
                    }
                } else if (estado == Estado.DIETA_CULMINADA_FALLIDA) {
                    jTPacientes.setModel(MODEL_DIETA_PACIENTE);
                    ListaPacienteDieta = DietaData.buscarDietasFallidas();
                } else {
                    jTPacientes.setModel(MODEL_DIETA_PACIENTE);
                    ListaPacienteDieta = DietaData.ListarPorNombreOApellidoYEstadoDieta(texto, estado);
                }
                
            } else if (Validacion.isValidoString(texto)) {
                if (isNoDieta) {
                    jTPacientes.setModel(MODEL_PACIENTE);
                    ListaPaciente = PacienteData.ListarPorNombreOApellido(texto, estado);
                    if (ListaPaciente.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "No hay pacientes regristados");
                        this.jTCant.setText("0");
                        return;
                    }
                    
                } else {                   
                    jTPacientes.setModel(MODEL_DIETA_PACIENTE);
                    ListaPacienteDieta = DietaData.ListarPorNombreOApellidoYEstadoDieta(texto, estado);
                    if (ListaPacienteDieta.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "No hay pacientes regristados");
                        this.jTCant.setText("0");
                        return;
                    }
                }
            }

            if (isNoDieta) {
                this.jTCant.setText(ListaPaciente.size() + "");
                for (Paciente paciente : ListaPaciente) {
                    cargarFila(paciente);
                }
            } else {
                this.jTCant.setText(ListaPacienteDieta.size() + "");
                for (Dieta dieta : ListaPacienteDieta) {
                    cargarFila(dieta);
                }
            }
        }
    }//GEN-LAST:event_jCBSelecionFiltroActionPerformed

    private boolean isEstadoNoDieta(Estado estado) {
        return estado != Estado.DIETA_CULMINADA && estado != Estado.DIETA_VIGENTE && estado != Estado.DIETA_CULMINADA_FALLIDA;
    }

    private void jTTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTextoKeyReleased
        CargarComponente.borrarFilas(this.jTPacientes, (DefaultTableModel) this.jTPacientes.getModel());
        String texto = this.jTTexto.getText().trim();
        Estado estado = (Estado) jCBSelecionFiltro.getSelectedItem();
        List<Paciente> listaPaciente;
        List<Dieta> listaPacienteDietas;

        if (texto.isEmpty()) {
            CargarComponente.borrarFilas(this.jTPacientes, (DefaultTableModel) this.jTPacientes.getModel());
            this.jTCant.setText("0");
        } else {
            if (Validacion.isValidoString(texto)) {
                if (isEstadoNoDieta(estado)) {
                    jTPacientes.setModel(MODEL_PACIENTE);
                    listaPaciente = PacienteData.ListarPorNombreOApellido(texto, estado);
                    this.jTCant.setText(listaPaciente.size() + "");
                    for (Paciente paciente : listaPaciente) {
                        cargarFila(paciente);
                    }
                } else {
                    jTPacientes.setModel(MODEL_DIETA_PACIENTE);
                    listaPacienteDietas = DietaData.ListarPorNombreOApellidoYEstadoDieta(texto, estado);
                    this.jTCant.setText(listaPacienteDietas.size() + "");
                    for (Dieta PacienteDieta : listaPacienteDietas) {
                        cargarFila(PacienteDieta);
                    }
                }
            }
        }
    }//GEN-LAST:event_jTTextoKeyReleased

    private void jTCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCantActionPerformed

    }//GEN-LAST:event_jTCantActionPerformed

    private void jTTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTextoKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter < 'a' || caracter > 'z') && (caracter < 'A' || caracter > 'Z') && caracter != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_jTTextoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Estado> jCBSelecionFiltro;
    private javax.swing.JLabel jLCantidad;
    private javax.swing.JLabel jLFiltro1;
    private javax.swing.JLabel jLTexto;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTCant;
    private javax.swing.JTable jTPacientes;
    private javax.swing.JTextField jTTexto;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        iniciarModel();
        this.jTPacientes.setModel(this.MODEL_PACIENTE);
        JTableHeader tableHeader = jTPacientes.getTableHeader();
        tableHeader.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setPreferredSize(new Dimension(c.getWidth(), 40));
                c.setBackground(Color.GRAY);
                c.setForeground(Color.WHITE);
                return this;
            }
        });

    }

    private void armarCombo() {
        this.jCBSelecionFiltro.removeAll();
        this.jCBSelecionFiltro.addItem(Estado.TODOS);
        this.jCBSelecionFiltro.addItem(Estado.ACTIVO);
        this.jCBSelecionFiltro.addItem(Estado.INACTIVOS);
        this.jCBSelecionFiltro.addItem(Estado.DIETA_VIGENTE);
        this.jCBSelecionFiltro.addItem(Estado.DIETA_CULMINADA);
        this.jCBSelecionFiltro.addItem(Estado.DIETA_CULMINADA_FALLIDA);
        this.jCBSelecionFiltro.setSelectedIndex(0);
    }

    private void cargarFila(Paciente paciente) {
        MODEL_PACIENTE.addRow(new Object[]{
            paciente.getApellido(),
            paciente.getNombre(),
            paciente.getDni(),
            paciente.getSexo(),
            paciente.getPeso(),
            paciente.getPesoBuscado()
        });
    }

    private void cargarFila(Dieta dietaPaciente) {
        MODEL_DIETA_PACIENTE.addRow(new Object[]{
            dietaPaciente.getPaciente().getApellido(),
            dietaPaciente.getPaciente().getNombre(),
            dietaPaciente.getPaciente().getDni(),
            dietaPaciente.getNombre(),
            dietaPaciente.getPaciente().getPesoBuscado(),
            dietaPaciente.getPesoFinal(),
            dietaPaciente.getFechaFinal()
        });
    }

    public void iniciarModel() {
        this.MODEL_PACIENTE.addColumn("Apellido");
        this.MODEL_PACIENTE.addColumn("Nombre");
        this.MODEL_PACIENTE.addColumn("Dni");
        this.MODEL_PACIENTE.addColumn("Sexo");
        this.MODEL_PACIENTE.addColumn("Peso");
        this.MODEL_PACIENTE.addColumn("Peso Buscado");

        this.MODEL_DIETA_PACIENTE.addColumn("Apellido");
        this.MODEL_DIETA_PACIENTE.addColumn("Nombre");
        this.MODEL_DIETA_PACIENTE.addColumn("Dni");
        this.MODEL_DIETA_PACIENTE.addColumn("Nombre de Dieta");
        this.MODEL_DIETA_PACIENTE.addColumn("Peso Buscado");
        this.MODEL_DIETA_PACIENTE.addColumn("Peso Final");
        this.MODEL_DIETA_PACIENTE.addColumn("Fecha Final");

    }
}
