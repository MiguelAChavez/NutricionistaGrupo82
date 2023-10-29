/*
 * To change this license header, choose Lic    @Override
    public boolean keyDown(Event event, int i) {
        return super.keyDown(event, i); //To change body of generated methods, choose Tools | Templates.
    }
ense Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Dietas;

import AccesoADatos.DietaData;
import AccesoADatos.PacienteData;
import Entidades.*;
import Vistas.DeskNutricionista;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import utils.CargarComponente;
import utils.Estado;
import utils.Validacion;

/**
 *
 * @author Lenovo
 */
public class FormularioDietaView extends javax.swing.JPanel {

    private Dieta dietaD = new Dieta();
    /**
     * Creates new form NewJdd
     */
    private final DeskNutricionista nutricionistaDesk;

    public FormularioDietaView(DeskNutricionista nutricionistaDesk) {
        initComponents();
        this.nutricionistaDesk = nutricionistaDesk;
        this.jBBuscarPaciente.setToolTipText("Buscar");
        this.jDFechaInicioDieta.setMinSelectableDate(new Date());

        date();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTdieta = new javax.swing.JLabel();
        PRSeccion = new utils.PanelRound();
        jSNombre = new javax.swing.JSeparator();
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
        jDFechaInicioDieta = new com.toedter.calendar.JDateChooser();
        jLFechaNac2 = new javax.swing.JLabel();
        jDFechaFinDieta = new com.toedter.calendar.JDateChooser();
        jTFPesoBuscadoDieta = new javax.swing.JTextField();
        jCBPacientes = new javax.swing.JComboBox<>();
        jBSiguienteDieta = new javax.swing.JButton();
        jSNombre7 = new javax.swing.JSeparator();
        jSNombre8 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSNombre9 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTFNombreDieta1 = new javax.swing.JTextField();
        jLKg2 = new javax.swing.JLabel();
        jBBuscarPaciente = new javax.swing.JButton();
        jBCancelarD = new javax.swing.JButton();
        jBBuscarD1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(35, 35, 35));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTdieta.setBackground(new java.awt.Color(51, 51, 51));
        jLTdieta.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLTdieta.setForeground(new java.awt.Color(255, 255, 255));
        jLTdieta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTdieta.setText("Formulario dieta");
        add(jLTdieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 479, -1));

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

        jLNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLNombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLNombre.setText("Pacientes");
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
        PRSeccion.add(jLPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 90, 20));

        jSPeso.setForeground(new java.awt.Color(255, 255, 255));
        jSPeso.setToolTipText("");
        jSPeso.setOpaque(true);
        jSPeso.setPreferredSize(new java.awt.Dimension(50, 2));
        PRSeccion.add(jSPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, -1));

        jLPesoDeseado.setBackground(new java.awt.Color(255, 255, 255));
        jLPesoDeseado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLPesoDeseado.setForeground(new java.awt.Color(255, 255, 255));
        jLPesoDeseado.setText("Peso Buscado");
        PRSeccion.add(jLPesoDeseado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 130, 20));

        jTFPesoIncialDieta.setEditable(false);
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
        PRSeccion.add(jTFPesoIncialDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 110, 40));

        jSNombre6.setForeground(new java.awt.Color(255, 255, 255));
        jSNombre6.setToolTipText("");
        jSNombre6.setOpaque(true);
        jSNombre6.setPreferredSize(new java.awt.Dimension(50, 2));
        PRSeccion.add(jSNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 110, -1));

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
        PRSeccion.add(jBEditarDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 80, 40));

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
        PRSeccion.add(jBCrearDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 80, 40));

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
        PRSeccion.add(jBEliminarDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 90, 40));

        jLKg.setBackground(new java.awt.Color(255, 255, 255));
        jLKg.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLKg.setForeground(new java.awt.Color(255, 255, 255));
        jLKg.setText("(Kg.)");
        PRSeccion.add(jLKg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 40, 40));

        jDFechaInicioDieta.setBackground(new java.awt.Color(255, 255, 255));
        jDFechaInicioDieta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jDFechaInicioDieta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jDFechaInicioDietaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        PRSeccion.add(jDFechaInicioDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 160, 35));

        jLFechaNac2.setBackground(new java.awt.Color(255, 255, 255));
        jLFechaNac2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLFechaNac2.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaNac2.setText("Fecha de fin");
        PRSeccion.add(jLFechaNac2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        jDFechaFinDieta.setBackground(new java.awt.Color(255, 255, 255));
        jDFechaFinDieta.setEnabled(false);
        jDFechaFinDieta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        PRSeccion.add(jDFechaFinDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 160, 35));

        jTFPesoBuscadoDieta.setEditable(false);
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
        PRSeccion.add(jTFPesoBuscadoDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 110, 40));

        jCBPacientes.setEditable(true);
        jCBPacientes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jCBPacientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCBPacientesFocusLost(evt);
            }
        });
        jCBPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPacientesActionPerformed(evt);
            }
        });
        jCBPacientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCBPacientesKeyTyped(evt);
            }
        });
        PRSeccion.add(jCBPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 250, 40));

        jBSiguienteDieta.setBackground(new java.awt.Color(153, 204, 255));
        jBSiguienteDieta.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBSiguienteDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/s⁫iguiente.png"))); // NOI18N
        jBSiguienteDieta.setText("Siguiente");
        jBSiguienteDieta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 42, 63)));
        jBSiguienteDieta.setContentAreaFilled(false);
        jBSiguienteDieta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSiguienteDieta.setEnabled(false);
        jBSiguienteDieta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBSiguienteDieta.setInheritsPopupMenu(true);
        jBSiguienteDieta.setOpaque(true);
        jBSiguienteDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiguienteDietaActionPerformed(evt);
            }
        });
        PRSeccion.add(jBSiguienteDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 90, 40));
        jBSiguienteDieta.getAccessibleContext().setAccessibleName(" Siguiente");

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
        PRSeccion.add(jLKg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 40, 40));

        jBBuscarPaciente.setBackground(new java.awt.Color(51, 153, 255));
        jBBuscarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jBBuscarPaciente.setToolTipText("Buscar por nombre");
        jBBuscarPaciente.setBorder(null);
        jBBuscarPaciente.setBorderPainted(false);
        jBBuscarPaciente.setContentAreaFilled(false);
        jBBuscarPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBBuscarPaciente.setOpaque(true);
        jBBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarPacienteActionPerformed(evt);
            }
        });
        PRSeccion.add(jBBuscarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 70, 40));

        jBCancelarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        jBCancelarD.setToolTipText("");
        jBCancelarD.setBorder(null);
        jBCancelarD.setBorderPainted(false);
        jBCancelarD.setContentAreaFilled(false);
        jBCancelarD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCancelarD.setEnabled(false);
        jBCancelarD.setOpaque(true);
        jBCancelarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarDActionPerformed(evt);
            }
        });
        PRSeccion.add(jBCancelarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 40, 40));

        jBBuscarD1.setBackground(new java.awt.Color(51, 153, 255));
        jBBuscarD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jBBuscarD1.setToolTipText("Buscar por nombre");
        jBBuscarD1.setBorder(null);
        jBBuscarD1.setBorderPainted(false);
        jBBuscarD1.setContentAreaFilled(false);
        jBBuscarD1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBBuscarD1.setOpaque(true);
        jBBuscarD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarD1ActionPerformed(evt);
            }
        });
        PRSeccion.add(jBBuscarD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 80, 40));

        add(PRSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 46, 479, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void jTFPesoIncialDietaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPesoIncialDietaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesoIncialDietaFocusGained

    private void jTFPesoIncialDietaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPesoIncialDietaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesoIncialDietaFocusLost

    private void jTFPesoIncialDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesoIncialDietaActionPerformed

    }//GEN-LAST:event_jTFPesoIncialDietaActionPerformed

    private void jTFPesoIncialDietaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesoIncialDietaKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter < '0' || caracter > '9') && caracter != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_jTFPesoIncialDietaKeyTyped

    private void jBEditarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarDietaActionPerformed
        editar();
    }//GEN-LAST:event_jBEditarDietaActionPerformed

    private void jBCrearDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearDietaActionPerformed
        this.dietaD = crearDieta(this.dietaD, Boolean.TRUE);
        if (this.dietaD != null) {
            DietaData.crearDieta(dietaD);
            limpiarCampos();
            invertirEstado();
        }
    }//GEN-LAST:event_jBCrearDietaActionPerformed

    private void jBEliminarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarDietaActionPerformed

        int option = JOptionPane.showOptionDialog(
                this,
                "¿Desea eliminar o dar de baja la dieta?", // mensaje
                "Confirmación", // titulo
                JOptionPane.YES_NO_CANCEL_OPTION, // botones
                JOptionPane.QUESTION_MESSAGE,
                null, // Icon 
                new String[]{"Eliminar", "Dar de Baja", "Cancelar"}, // texto de los botones
                "Cancelar" // boton por default
        );

        switch (option) {
            case 0:
                if (DietaData.eliminarDietaFisica(this.dietaD) > 0) {
                    invertirEstado();
                    this.jBBuscarD1.setEnabled(!this.jBBuscarD1.isEnabled());
                    this.jBCancelarD.setEnabled(!this.jBCancelarD.isEnabled());
                    limpiarCampos();
                }
                break;
            case 1:
                if (DietaData.eliminarDietaLogica(this.dietaD.getIdDieta()) > 0) {
                    invertirEstado();
                    this.jBBuscarD1.setEnabled(!this.jBBuscarD1.isEnabled());
                    this.jBCancelarD.setEnabled(!this.jBCancelarD.isEnabled());
                    limpiarCampos();
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jBEliminarDietaActionPerformed

    private void jTFPesoBuscadoDietaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPesoBuscadoDietaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesoBuscadoDietaFocusGained

    private void jTFPesoBuscadoDietaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPesoBuscadoDietaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesoBuscadoDietaFocusLost

    private void jTFPesoBuscadoDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesoBuscadoDietaActionPerformed

    }//GEN-LAST:event_jTFPesoBuscadoDietaActionPerformed

    private void jTFPesoBuscadoDietaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesoBuscadoDietaKeyTyped

    }//GEN-LAST:event_jTFPesoBuscadoDietaKeyTyped

    private void jCBPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPacientesActionPerformed

        if (jCBPacientes.getSelectedItem() != null) {
            if (jCBPacientes.getSelectedItem().getClass() != String.class) {
                Paciente paciente = (Paciente) this.jCBPacientes.getSelectedItem();
                this.dietaD.setPaciente(paciente);
                this.jTFPesoIncialDieta.setText(paciente.getPeso() + "");
                this.jTFPesoBuscadoDieta.setText(paciente.getPesoBuscado() + "");
            }
        }
    }//GEN-LAST:event_jCBPacientesActionPerformed

    private void jBSiguienteDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiguienteDietaActionPerformed
        CargarComponente.showComponents(new Formulario2DietaComida(this.dietaD), nutricionistaDesk);
    }//GEN-LAST:event_jBSiguienteDietaActionPerformed

    private void jTFNombreDieta1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNombreDieta1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreDieta1FocusGained

    private void jTFNombreDieta1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNombreDieta1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreDieta1FocusLost

    private void jTFNombreDieta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreDieta1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, ui);
    }//GEN-LAST:event_jTFNombreDieta1ActionPerformed

    private void jTFNombreDieta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreDieta1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreDieta1KeyTyped

    private void jBBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarPacienteActionPerformed
        String filtro = this.jCBPacientes.getEditor().getItem().toString();
        if (Validacion.isValidoString(filtro)) {
            List<Paciente> pacientes = PacienteData.ListarPorNombreOApellido(filtro, Estado.ACTIVO);
            if (pacientes != null) {
                if (pacientes.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No se a encontrado ningun paciente");
                    return;
                }
                jCBPacientes.removeAllItems();
                for (Paciente paciente : pacientes) {
                    jCBPacientes.addItem(paciente);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Caracteres invalido, por favor ingrese solo letras.");
        }
    }//GEN-LAST:event_jBBuscarPacienteActionPerformed

    private void jBCancelarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarDActionPerformed
        this.jBBuscarD1.setEnabled(!this.jBBuscarD1.isEnabled());
        this.jBCancelarD.setEnabled(!this.jBCancelarD.isEnabled());
        limpiarCampos();
        invertirEstado();
    }//GEN-LAST:event_jBCancelarDActionPerformed

    private void jCBPacientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBPacientesKeyTyped

    }//GEN-LAST:event_jCBPacientesKeyTyped

    private void jCBPacientesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCBPacientesFocusLost
        this.jCBPacientes.removeAll();
    }//GEN-LAST:event_jCBPacientesFocusLost

    private void jBBuscarD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarD1ActionPerformed
        String nombre = this.jTFNombreDieta1.getText().trim();
        if (Validacion.isValidoString(nombre) || !nombre.isEmpty()) {
            this.dietaD = DietaData.buscarDietaPorNombre(nombre, Estado.TODOS);
            if (this.dietaD != null) {
                cargarCampos(this.dietaD);
                this.jBBuscarD1.setEnabled(!this.jBBuscarD1.isEnabled());
                this.jBCancelarD.setEnabled(!this.jBCancelarD.isEnabled());
                ZoneId defaultZoneId = ZoneId.systemDefault();
                this.jDFechaInicioDieta.setMinSelectableDate(Date.from(this.dietaD.getFechaInicial().atStartOfDay(defaultZoneId).toInstant()));
                invertirEstado();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre valido.");
        }

    }//GEN-LAST:event_jBBuscarD1ActionPerformed

    private void jDFechaInicioDietaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDFechaInicioDietaAncestorAdded

    }//GEN-LAST:event_jDFechaInicioDietaAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.PanelRound PRSeccion;
    private javax.swing.JButton jBBuscarD1;
    private javax.swing.JButton jBBuscarPaciente;
    private javax.swing.JButton jBCancelarD;
    private javax.swing.JButton jBCrearDieta;
    private javax.swing.JButton jBEditarDieta;
    private javax.swing.JButton jBEliminarDieta;
    private javax.swing.JButton jBSiguienteDieta;
    private javax.swing.JComboBox<Paciente> jCBPacientes;
    private com.toedter.calendar.JDateChooser jDFechaFinDieta;
    private com.toedter.calendar.JDateChooser jDFechaInicioDieta;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLFechaNac;
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
    private javax.swing.JSeparator jSNombre;
    private javax.swing.JSeparator jSNombre6;
    private javax.swing.JSeparator jSNombre7;
    private javax.swing.JSeparator jSNombre8;
    private javax.swing.JSeparator jSNombre9;
    private javax.swing.JSeparator jSPeso;
    private javax.swing.JTextField jTFNombreDieta1;
    private javax.swing.JTextField jTFPesoBuscadoDieta;
    private javax.swing.JTextField jTFPesoIncialDieta;
    // End of variables declaration//GEN-END:variables

    private Dieta crearDieta(Dieta dieta, boolean isPesoEditable) {
        try {
            String nombre = this.jTFNombreDieta1.getText().trim();
            if (!Validacion.isValidoString(nombre) || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error en el campo nombre");
                return null;
            }

            Date date = this.jDFechaInicioDieta.getDate();
            Date dateFin = this.jDFechaFinDieta.getDate();
            if (date == null) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese la fecha de inicio.");
                return null;
            } else if (dateFin == null) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese la fecha de finalizacion.");
                return null;
            }

            LocalDate fechaInicio = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFinal = dateFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (fechaFinal.isEqual(fechaInicio) || fechaFinal.isBefore(fechaInicio)) {
                JOptionPane.showMessageDialog(this, "La fecha no puede ser anterior a la fecha de inicio");
                return null;
            }

            if (this.dietaD.getPaciente() == null) {
                JOptionPane.showMessageDialog(this, "Seleccione un paciente");
                return null;
            }

            dieta.setNombre(nombre);
            dieta.setFechaInicial(fechaInicio);
            dieta.setFechaFinal(fechaFinal);

            if (isPesoEditable) {
                dieta.setPesoInicial(dieta.getPaciente().getPeso());
            }

            return dieta;

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error " + e.getMessage());
        }
        return null;
    }

    private void date() {
        this.jDFechaInicioDieta.addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName()) && evt.getNewValue() != null) {

                    Date selectedDate = (java.util.Date) evt.getNewValue();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(selectedDate);
                    calendar.add(Calendar.DATE, 1);

                    selectedDate = calendar.getTime();

                    jDFechaFinDieta.setMinSelectableDate(selectedDate);
                    jDFechaFinDieta.setEnabled(Boolean.TRUE);

                }
            }
        });
    }

    private void invertirEstado() {
        this.jBCrearDieta.setEnabled(!this.jBCrearDieta.isEnabled());
        this.jBEditarDieta.setEnabled(!this.jBEditarDieta.isEnabled());
        this.jBEliminarDieta.setEnabled(!this.jBEliminarDieta.isEnabled());
        this.jBSiguienteDieta.setEnabled(!this.jBSiguienteDieta.isEnabled());
    }

    private void cargarCampos(Dieta dieta) {
        this.jTFNombreDieta1.setText(dieta.getNombre());
        this.jCBPacientes.addItem(dieta.getPaciente());
        this.jCBPacientes.setEnabled(Boolean.FALSE);
        ZoneId defaultZoneId = ZoneId.systemDefault();
        this.jTFPesoIncialDieta.setText(dieta.getPesoInicial() + "");
        this.jTFPesoBuscadoDieta.setText(dieta.getPaciente().getPesoBuscado() + "");
        this.jDFechaInicioDieta.setDate(Date.from(dieta.getFechaInicial().atStartOfDay(defaultZoneId).toInstant()));
        this.jDFechaInicioDieta.setEnabled(false);
        this.jDFechaFinDieta.setDate(Date.from(dieta.getFechaFinal().atStartOfDay(defaultZoneId).toInstant()));
    }

    private void limpiarCampos() {
        this.jTFNombreDieta1.setText("");
        this.jCBPacientes.removeAllItems();
        this.jCBPacientes.setEnabled(Boolean.TRUE);
        this.jTFPesoIncialDieta.setText("");
        this.jTFPesoBuscadoDieta.setText("");
        this.jDFechaInicioDieta.setDate(null);
        this.jDFechaInicioDieta.setEnabled(true);
        this.jDFechaFinDieta.setDate(null);
    }

    private void editar() {
        Dieta dieta = crearDieta(new Dieta(), false);
        if (dieta != null) {
            dieta.setIdDieta(this.dietaD.getIdDieta());
            dieta.setPesoInicial(this.dietaD.getPesoInicial());
            dieta.setPaciente(this.dietaD.getPaciente());
            this.dietaD = dieta;
            DietaData.modificarDieta(this.dietaD);
        }
    }

}
