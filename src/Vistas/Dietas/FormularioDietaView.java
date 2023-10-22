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
public class FormularioDietaView extends javax.swing.JPanel {

    /**
     * Creates new form NewJdd
     */
    private final DeskNutricionista nutricionistaDesk;

    public FormularioDietaView(DeskNutricionista nutricionistaDesk) {
        initComponents();
        this.nutricionistaDesk = nutricionistaDesk;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PRSeccion = new utils.PanelRound();
        jSNombre = new javax.swing.JSeparator();
        jTFNombrePaciente = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jLDni = new javax.swing.JLabel();
        jSDni = new javax.swing.JSeparator();
        jLFechaNac = new javax.swing.JLabel();
        jLPeso = new javax.swing.JLabel();
        jSPeso = new javax.swing.JSeparator();
        jLPesoDeseado = new javax.swing.JLabel();
        jTFPesoIncialDieta = new javax.swing.JTextField();
        jSNombre6 = new javax.swing.JSeparator();
        jBEditarDieta = new javax.swing.JButton();
        jBCrearDieta = new javax.swing.JButton();
        jBEliminarDieta = new javax.swing.JButton();
        jLKg = new javax.swing.JLabel();
        jLFechaNac1 = new javax.swing.JLabel();
        jDFechaInicioDieta = new com.toedter.calendar.JDateChooser();
        jLFechaNac2 = new javax.swing.JLabel();
        jDFechaFinDieta = new com.toedter.calendar.JDateChooser();
        jTFPesoBuscadoDieta = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonSiguienteDieta = new javax.swing.JButton();
        jSNombre7 = new javax.swing.JSeparator();
        jSNombre8 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSNombre9 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTFNombreDieta1 = new javax.swing.JTextField();
        jLKg2 = new javax.swing.JLabel();
        jSDni1 = new javax.swing.JSeparator();
        jBBuscarD = new javax.swing.JButton();
        jBCancelarD = new javax.swing.JButton();
        jLTdieta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(35, 35, 35));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PRSeccion.setBackground(new java.awt.Color(51, 51, 51));
        PRSeccion.setRoundBottomLeft(50);
        PRSeccion.setRoundBottomRight(50);
        PRSeccion.setRoundTopLeft(50);
        PRSeccion.setRoundTopRight(50);
        PRSeccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSNombre.setForeground(new java.awt.Color(255, 255, 255));
        jSNombre.setToolTipText("");
        jSNombre.setOpaque(true);
        jSNombre.setPreferredSize(new java.awt.Dimension(50, 2));
        PRSeccion.add(jSNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 172, 300, 0));

        jTFNombrePaciente.setBackground(new java.awt.Color(35, 35, 35));
        jTFNombrePaciente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTFNombrePaciente.setForeground(new java.awt.Color(204, 204, 204));
        jTFNombrePaciente.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(2, 15, 2, 15), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jTFNombrePaciente.setCaretColor(new java.awt.Color(51, 153, 255));
        jTFNombrePaciente.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTFNombrePaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFNombrePacienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNombrePacienteFocusLost(evt);
            }
        });
        jTFNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombrePacienteActionPerformed(evt);
            }
        });
        PRSeccion.add(jTFNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 40));

        jLNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLNombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLNombre.setText("Paciente");
        PRSeccion.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 20));

        jLDni.setBackground(new java.awt.Color(255, 255, 255));
        jLDni.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLDni.setForeground(new java.awt.Color(255, 255, 255));
        jLDni.setText("Registrar nombre");
        PRSeccion.add(jLDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 170, -1));

        jSDni.setForeground(new java.awt.Color(255, 255, 255));
        jSDni.setToolTipText("");
        jSDni.setOpaque(true);
        PRSeccion.add(jSDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, -1));

        jLFechaNac.setBackground(new java.awt.Color(255, 255, 255));
        jLFechaNac.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaNac.setText("Fecha de inicio");
        PRSeccion.add(jLFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLPeso.setBackground(new java.awt.Color(255, 255, 255));
        jLPeso.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLPeso.setForeground(new java.awt.Color(255, 255, 255));
        jLPeso.setText("Peso Inicial");
        PRSeccion.add(jLPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 20));

        jSPeso.setForeground(new java.awt.Color(255, 255, 255));
        jSPeso.setToolTipText("");
        jSPeso.setOpaque(true);
        jSPeso.setPreferredSize(new java.awt.Dimension(50, 2));
        PRSeccion.add(jSPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 110, -1));

        jLPesoDeseado.setBackground(new java.awt.Color(255, 255, 255));
        jLPesoDeseado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLPesoDeseado.setForeground(new java.awt.Color(255, 255, 255));
        jLPesoDeseado.setText("Peso Buscado");
        PRSeccion.add(jLPesoDeseado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 130, 20));

        jTFPesoIncialDieta.setBackground(new java.awt.Color(35, 35, 35));
        jTFPesoIncialDieta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTFPesoIncialDieta.setForeground(new java.awt.Color(204, 204, 204));
        jTFPesoIncialDieta.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(2, 15, 2, 15), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jTFPesoIncialDieta.setCaretColor(new java.awt.Color(51, 153, 255));
        jTFPesoIncialDieta.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTFPesoIncialDieta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFPesoIncialDietaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFPesoIncialDietaFocusLost(evt);
            }
        });
        jTFPesoIncialDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPesoIncialDietaActionPerformed(evt);
            }
        });
        jTFPesoIncialDieta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPesoIncialDietaKeyTyped(evt);
            }
        });
        PRSeccion.add(jTFPesoIncialDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, 40));

        jSNombre6.setForeground(new java.awt.Color(255, 255, 255));
        jSNombre6.setToolTipText("");
        jSNombre6.setOpaque(true);
        jSNombre6.setPreferredSize(new java.awt.Dimension(50, 2));
        PRSeccion.add(jSNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 110, -1));

        jBEditarDieta.setBackground(new java.awt.Color(0, 204, 255));
        jBEditarDieta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBEditarDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-editar.png"))); // NOI18N
        jBEditarDieta.setText("Editar");
        jBEditarDieta.setBorder(null);
        jBEditarDieta.setBorderPainted(false);
        jBEditarDieta.setContentAreaFilled(false);
        jBEditarDieta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEditarDieta.setDisabledIcon(null);
        jBEditarDieta.setEnabled(false);
        jBEditarDieta.setOpaque(true);
        jBEditarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarDietaActionPerformed(evt);
            }
        });
        PRSeccion.add(jBEditarDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 80, 40));

        jBCrearDieta.setBackground(new java.awt.Color(48, 255, 167));
        jBCrearDieta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBCrearDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar-el-archivo.png"))); // NOI18N
        jBCrearDieta.setText("Crear");
        jBCrearDieta.setBorder(null);
        jBCrearDieta.setBorderPainted(false);
        jBCrearDieta.setContentAreaFilled(false);
        jBCrearDieta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCrearDieta.setDisabledIcon(null);
        jBCrearDieta.setOpaque(true);
        jBCrearDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearDietaActionPerformed(evt);
            }
        });
        PRSeccion.add(jBCrearDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 80, 40));

        jBEliminarDieta.setBackground(new java.awt.Color(247, 87, 87));
        jBEliminarDieta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBEliminarDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jBEliminarDieta.setText("Eliminar");
        jBEliminarDieta.setBorder(null);
        jBEliminarDieta.setBorderPainted(false);
        jBEliminarDieta.setContentAreaFilled(false);
        jBEliminarDieta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminarDieta.setDisabledIcon(null);
        jBEliminarDieta.setEnabled(false);
        jBEliminarDieta.setOpaque(true);
        jBEliminarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarDietaActionPerformed(evt);
            }
        });
        PRSeccion.add(jBEliminarDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 90, 40));

        jLKg.setBackground(new java.awt.Color(255, 255, 255));
        jLKg.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLKg.setForeground(new java.awt.Color(255, 255, 255));
        jLKg.setText("(Kg.)");
        PRSeccion.add(jLKg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 40, 40));

        jLFechaNac1.setBackground(new java.awt.Color(255, 255, 255));
        jLFechaNac1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLFechaNac1.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaNac1.setText("Fecha de inicio");
        PRSeccion.add(jLFechaNac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jDFechaInicioDieta.setBackground(new java.awt.Color(102, 102, 102));
        jDFechaInicioDieta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        PRSeccion.add(jDFechaInicioDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 160, 35));

        jLFechaNac2.setBackground(new java.awt.Color(255, 255, 255));
        jLFechaNac2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLFechaNac2.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaNac2.setText("Fecha de fin");
        PRSeccion.add(jLFechaNac2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        jDFechaFinDieta.setBackground(new java.awt.Color(102, 102, 102));
        jDFechaFinDieta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        PRSeccion.add(jDFechaFinDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 160, 35));

        jTFPesoBuscadoDieta.setBackground(new java.awt.Color(35, 35, 35));
        jTFPesoBuscadoDieta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTFPesoBuscadoDieta.setForeground(new java.awt.Color(204, 204, 204));
        jTFPesoBuscadoDieta.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(2, 15, 2, 15), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jTFPesoBuscadoDieta.setCaretColor(new java.awt.Color(51, 153, 255));
        jTFPesoBuscadoDieta.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTFPesoBuscadoDieta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFPesoBuscadoDietaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFPesoBuscadoDietaFocusLost(evt);
            }
        });
        jTFPesoBuscadoDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPesoBuscadoDietaActionPerformed(evt);
            }
        });
        jTFPesoBuscadoDieta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPesoBuscadoDietaKeyTyped(evt);
            }
        });
        PRSeccion.add(jTFPesoBuscadoDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 110, 40));

        jComboBox1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        PRSeccion.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 210, 40));

        jButtonSiguienteDieta.setBackground(new java.awt.Color(153, 204, 255));
        jButtonSiguienteDieta.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButtonSiguienteDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/s⁫iguiente.png"))); // NOI18N
        jButtonSiguienteDieta.setText("Siguiente");
        jButtonSiguienteDieta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 42, 63)));
        jButtonSiguienteDieta.setContentAreaFilled(false);
        jButtonSiguienteDieta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSiguienteDieta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonSiguienteDieta.setInheritsPopupMenu(true);
        jButtonSiguienteDieta.setOpaque(true);
        jButtonSiguienteDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteDietaActionPerformed(evt);
            }
        });
        PRSeccion.add(jButtonSiguienteDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 90, 40));
        jButtonSiguienteDieta.getAccessibleContext().setAccessibleName(" Siguiente");

        jSNombre7.setBackground(new java.awt.Color(204, 204, 204));
        jSNombre7.setForeground(new java.awt.Color(255, 255, 255));
        jSNombre7.setToolTipText("");
        jSNombre7.setOpaque(true);
        jSNombre7.setPreferredSize(new java.awt.Dimension(50, 2));
        PRSeccion.add(jSNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 450, -1));

        jSNombre8.setForeground(new java.awt.Color(255, 255, 255));
        jSNombre8.setToolTipText("");
        jSNombre8.setOpaque(true);
        jSNombre8.setPreferredSize(new java.awt.Dimension(50, 2));
        PRSeccion.add(jSNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 450, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escriba apellido y nombre del sujeto para buscar ");
        PRSeccion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Especificar comienzo y finalización del tratamiento ");
        PRSeccion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jSNombre9.setForeground(new java.awt.Color(255, 255, 255));
        jSNombre9.setToolTipText("");
        jSNombre9.setOpaque(true);
        jSNombre9.setPreferredSize(new java.awt.Dimension(50, 2));
        PRSeccion.add(jSNombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 450, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese un título ");
        PRSeccion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTFNombreDieta1.setBackground(new java.awt.Color(35, 35, 35));
        jTFNombreDieta1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTFNombreDieta1.setForeground(new java.awt.Color(204, 204, 204));
        jTFNombreDieta1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(2, 15, 2, 15), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jTFNombreDieta1.setCaretColor(new java.awt.Color(51, 153, 255));
        jTFNombreDieta1.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTFNombreDieta1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFNombreDieta1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNombreDieta1FocusLost(evt);
            }
        });
        jTFNombreDieta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreDieta1ActionPerformed(evt);
            }
        });
        jTFNombreDieta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombreDieta1KeyTyped(evt);
            }
        });
        PRSeccion.add(jTFNombreDieta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 220, 40));

        jLKg2.setBackground(new java.awt.Color(255, 255, 255));
        jLKg2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLKg2.setForeground(new java.awt.Color(255, 255, 255));
        jLKg2.setText("(Kg.)");
        PRSeccion.add(jLKg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 40, 40));

        jSDni1.setForeground(new java.awt.Color(255, 255, 255));
        jSDni1.setToolTipText("");
        jSDni1.setOpaque(true);
        PRSeccion.add(jSDni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 190, -1));

        jBBuscarD.setBackground(new java.awt.Color(51, 153, 255));
        jBBuscarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jBBuscarD.setToolTipText("Buscar por nombre");
        jBBuscarD.setBorder(null);
        jBBuscarD.setBorderPainted(false);
        jBBuscarD.setContentAreaFilled(false);
        jBBuscarD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBBuscarD.setOpaque(true);
        jBBuscarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarDActionPerformed(evt);
            }
        });
        PRSeccion.add(jBBuscarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 80, 40));

        jBCancelarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        jBCancelarD.setToolTipText("");
        jBCancelarD.setBorder(null);
        jBCancelarD.setBorderPainted(false);
        jBCancelarD.setContentAreaFilled(false);
        jBCancelarD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCancelarD.setOpaque(true);
        jBCancelarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarDActionPerformed(evt);
            }
        });
        PRSeccion.add(jBCancelarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 40, 40));

        add(PRSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 54, 479, 582));

        jLTdieta.setBackground(new java.awt.Color(51, 51, 51));
        jLTdieta.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLTdieta.setForeground(new java.awt.Color(255, 255, 255));
        jLTdieta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTdieta.setText("Formulario dieta");
        add(jLTdieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 0, 479, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNombrePacienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNombrePacienteFocusGained

    }//GEN-LAST:event_jTFNombrePacienteFocusGained

    private void jTFNombrePacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNombrePacienteFocusLost

    }//GEN-LAST:event_jTFNombrePacienteFocusLost

    private void jTFNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombrePacienteActionPerformed

    }//GEN-LAST:event_jTFNombrePacienteActionPerformed

    private void jTFPesoIncialDietaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPesoIncialDietaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesoIncialDietaFocusGained

    private void jTFPesoIncialDietaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPesoIncialDietaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesoIncialDietaFocusLost

    private void jTFPesoIncialDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesoIncialDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesoIncialDietaActionPerformed

    private void jTFPesoIncialDietaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesoIncialDietaKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter < '0' || caracter > '9') && caracter != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_jTFPesoIncialDietaKeyTyped

    private void jBEditarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarDietaActionPerformed

    }//GEN-LAST:event_jBEditarDietaActionPerformed

    private void jBCrearDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearDietaActionPerformed

    }//GEN-LAST:event_jBCrearDietaActionPerformed

    private void jBEliminarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarDietaActionPerformed

    }//GEN-LAST:event_jBEliminarDietaActionPerformed

    private void jTFPesoBuscadoDietaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPesoBuscadoDietaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesoBuscadoDietaFocusGained

    private void jTFPesoBuscadoDietaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPesoBuscadoDietaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesoBuscadoDietaFocusLost

    private void jTFPesoBuscadoDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesoBuscadoDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesoBuscadoDietaActionPerformed

    private void jTFPesoBuscadoDietaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesoBuscadoDietaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesoBuscadoDietaKeyTyped

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonSiguienteDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteDietaActionPerformed
        // TODO add your handling code here:
        CargarComponente.showComponents(new Formulario2DietaComida(), this.nutricionistaDesk);

    }//GEN-LAST:event_jButtonSiguienteDietaActionPerformed

    private void jTFNombreDieta1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNombreDieta1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreDieta1FocusGained

    private void jTFNombreDieta1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNombreDieta1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreDieta1FocusLost

    private void jTFNombreDieta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreDieta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreDieta1ActionPerformed

    private void jTFNombreDieta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreDieta1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreDieta1KeyTyped

    private void jBBuscarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarDActionPerformed
        //Llamamos a buscarPaciente y guardamos el resultado en el atributo miPaciente

        //verificamos que miPaciente no sea nulo y cargamos sus atributos en los campos

    }//GEN-LAST:event_jBBuscarDActionPerformed

    private void jBCancelarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarDActionPerformed
        //Llamamos al metodo limpiarCampos

        //Llamamos invertirEstados para regresar al modo de crear un paciente
        //igualamos a nulo el atributo miPaciente

    }//GEN-LAST:event_jBCancelarDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.PanelRound PRSeccion;
    private javax.swing.JButton jBBuscarD;
    private javax.swing.JButton jBCancelarD;
    private javax.swing.JButton jBCrearDieta;
    private javax.swing.JButton jBEditarDieta;
    private javax.swing.JButton jBEliminarDieta;
    private javax.swing.JButton jButtonSiguienteDieta;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDFechaFinDieta;
    private com.toedter.calendar.JDateChooser jDFechaInicioDieta;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLFechaNac;
    private javax.swing.JLabel jLFechaNac1;
    private javax.swing.JLabel jLFechaNac2;
    private javax.swing.JLabel jLKg;
    private javax.swing.JLabel jLKg2;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPeso;
    private javax.swing.JLabel jLPesoDeseado;
    private javax.swing.JLabel jLTdieta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSDni;
    private javax.swing.JSeparator jSDni1;
    private javax.swing.JSeparator jSNombre;
    private javax.swing.JSeparator jSNombre6;
    private javax.swing.JSeparator jSNombre7;
    private javax.swing.JSeparator jSNombre8;
    private javax.swing.JSeparator jSNombre9;
    private javax.swing.JSeparator jSPeso;
    private javax.swing.JTextField jTFNombreDieta1;
    private javax.swing.JTextField jTFNombrePaciente;
    private javax.swing.JTextField jTFPesoBuscadoDieta;
    private javax.swing.JTextField jTFPesoIncialDieta;
    // End of variables declaration//GEN-END:variables
}
