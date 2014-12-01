/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

import funes.model.Model;
import funes.controller.ControladorRegistroPersonaFisica;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Trei
 */
public class RegistroPersonaFisica extends javax.swing.JFrame implements IRegistroPersonaFisica {

    private ControladorRegistroPersonaFisica Controlador;
    private String cedulaActual = null;
    private boolean busquedaExitosa = false;

    public RegistroPersonaFisica(Model Modelo) {
        initComponents();
        buttonGroupGeneroDenunciado.add(jRadioButtonGeneroFemeninoPersonaDenunciada);
        buttonGroupGeneroDenunciado.add(jRadioButtonGeneroMasculino);
        Controlador = new ControladorRegistroPersonaFisica(Modelo, this);
        vincularEventos();
    }

    public RegistroPersonaFisica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGeneroDenunciado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelProvinciaDenunciado = new javax.swing.JLabel();
        jComboBoxProvincia = new javax.swing.JComboBox();
        jLabelcedulaDenunciado = new javax.swing.JLabel();
        jTextFieldcedulaDenunciado = new javax.swing.JTextField();
        jButtonBuscarDenunciado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelNombreDenunciado = new javax.swing.JLabel();
        jTextFieldNombreDenunciado = new javax.swing.JTextField();
        jLabelApellido1Denunciado = new javax.swing.JLabel();
        jTextFieldApellido1Denunciado = new javax.swing.JTextField();
        jLabelApellido1Denunciado1 = new javax.swing.JLabel();
        jLabelGeneroDenunciado = new javax.swing.JLabel();
        jTextFieldApellido2Denunciado1 = new javax.swing.JTextField();
        jRadioButtonGeneroFemeninoPersonaDenunciada = new javax.swing.JRadioButton();
        jRadioButtonGeneroMasculino = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelLugarTrabDen = new javax.swing.JLabel();
        jTextFieldLugTrabDen = new javax.swing.JTextField();
        jLabelCargo = new javax.swing.JLabel();
        jTextFieldcargoDenunciado = new javax.swing.JTextField();
        jLabelFotoPersonaDenunciada = new javax.swing.JLabel();
        jButtonSubirFotoPersonaDenunciada = new javax.swing.JButton();
        jLabelRutaFotoPersonaDenunciada = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonRegistrarDenunciado = new javax.swing.JButton();
        jLabelCategoria = new javax.swing.JLabel();
        jComboBoxCategoriasAEscoger = new javax.swing.JComboBox();
        jTextFieldCategoriaRegistrada = new javax.swing.JTextField();
        jButtonIntroducirCategoria = new javax.swing.JButton();
        jButtonRegistrarNuevaCategoria = new javax.swing.JButton();
        jLabelCategoriasDePersona = new javax.swing.JLabel();
        jComboBoxCategoriasEscogidas = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSalirRegistroPersona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelProvinciaDenunciado.setText("Provincia:");

        jComboBoxProvincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "San José", "Heredia", "Cartago", "Alajuela", "Puntarenas", "Guanacaste", "Limón" }));

        jLabelcedulaDenunciado.setText("Cédula:");

        jTextFieldcedulaDenunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcedulaDenunciadoActionPerformed(evt);
            }
        });

        jButtonBuscarDenunciado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/AbuscarPeque.png"))); // NOI18N
        jButtonBuscarDenunciado.setBorder(null);
        jButtonBuscarDenunciado.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelcedulaDenunciado)
                    .addComponent(jLabelProvinciaDenunciado))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldcedulaDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscarDenunciado))
                    .addComponent(jComboBoxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProvinciaDenunciado)
                    .addComponent(jComboBoxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelcedulaDenunciado)
                    .addComponent(jTextFieldcedulaDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarDenunciado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelNombreDenunciado.setText("Nombre:");

        jTextFieldNombreDenunciado.setEnabled(false);

        jLabelApellido1Denunciado.setText("Primer Apellido: ");

        jTextFieldApellido1Denunciado.setEnabled(false);
        jTextFieldApellido1Denunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido1DenunciadoActionPerformed(evt);
            }
        });

        jLabelApellido1Denunciado1.setText("Segundo Apellido:");

        jLabelGeneroDenunciado.setText("Género:");

        jTextFieldApellido2Denunciado1.setEnabled(false);

        jRadioButtonGeneroFemeninoPersonaDenunciada.setText("F");
        jRadioButtonGeneroFemeninoPersonaDenunciada.setEnabled(false);
        jRadioButtonGeneroFemeninoPersonaDenunciada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGeneroFemeninoPersonaDenunciadaActionPerformed(evt);
            }
        });

        jRadioButtonGeneroMasculino.setText("M");
        jRadioButtonGeneroMasculino.setEnabled(false);
        jRadioButtonGeneroMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGeneroMasculinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGeneroDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApellido1Denunciado)
                            .addComponent(jLabelNombreDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelApellido1Denunciado1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldApellido1Denunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldApellido2Denunciado1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButtonGeneroFemeninoPersonaDenunciada)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonGeneroMasculino))
                            .addComponent(jTextFieldNombreDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreDenunciado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelApellido1Denunciado)
                    .addComponent(jTextFieldApellido1Denunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido1Denunciado1)
                    .addComponent(jTextFieldApellido2Denunciado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGeneroDenunciado)
                    .addComponent(jRadioButtonGeneroFemeninoPersonaDenunciada)
                    .addComponent(jRadioButtonGeneroMasculino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelLugarTrabDen.setText("Lugar de Trabajo: ");

        jLabelCargo.setText("Cargo:");

        jLabelFotoPersonaDenunciada.setText("Foto:");

        jButtonSubirFotoPersonaDenunciada.setText("Browse");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelLugarTrabDen, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jLabelFotoPersonaDenunciada)
                    .addComponent(jLabelCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonSubirFotoPersonaDenunciada)
                        .addGap(48, 48, 48)
                        .addComponent(jLabelRutaFotoPersonaDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldLugTrabDen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                        .addComponent(jTextFieldcargoDenunciado, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLugarTrabDen)
                    .addComponent(jTextFieldLugTrabDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCargo)
                    .addComponent(jTextFieldcargoDenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFotoPersonaDenunciada)
                    .addComponent(jButtonSubirFotoPersonaDenunciada)
                    .addComponent(jLabelRutaFotoPersonaDenunciada))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonRegistrarDenunciado.setText("Registrar");

        jLabelCategoria.setText("Categoría:");

        jComboBoxCategoriasAEscoger.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chofer", "Dueño de mascota", "Diputado", "Enfermera", "Inquilino" }));
        jComboBoxCategoriasAEscoger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriasAEscogerActionPerformed(evt);
            }
        });

        jTextFieldCategoriaRegistrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaRegistradaActionPerformed(evt);
            }
        });

        jButtonIntroducirCategoria.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonIntroducirCategoria.setText("Agregar Categoría");

        jButtonRegistrarNuevaCategoria.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonRegistrarNuevaCategoria.setText("Nueva Categoría");

        jLabelCategoriasDePersona.setText("Categoría (s) ingresada (s)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCategoriasDePersona)
                    .addComponent(jLabelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCategoriasAEscoger, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCategoriaRegistrada, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCategoriasEscogidas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRegistrarNuevaCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonIntroducirCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonRegistrarDenunciado)
                        .addGap(13, 13, 13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoria)
                    .addComponent(jComboBoxCategoriasAEscoger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIntroducirCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCategoriaRegistrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrarNuevaCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoriasDePersona)
                    .addComponent(jComboBoxCategoriasEscogidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrarDenunciado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 0, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro Persona");

        jButtonSalirRegistroPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/Button-Close-icon_1.png"))); // NOI18N
        jButtonSalirRegistroPersona.setBorder(null);
        jButtonSalirRegistroPersona.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalirRegistroPersona)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalirRegistroPersona)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldcedulaDenunciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcedulaDenunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcedulaDenunciadoActionPerformed

    private void jComboBoxCategoriasAEscogerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriasAEscogerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriasAEscogerActionPerformed

    private void jRadioButtonGeneroFemeninoPersonaDenunciadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGeneroFemeninoPersonaDenunciadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonGeneroFemeninoPersonaDenunciadaActionPerformed

    private void jRadioButtonGeneroMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGeneroMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonGeneroMasculinoActionPerformed

    private void jTextFieldCategoriaRegistradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaRegistradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriaRegistradaActionPerformed

    private void jTextFieldApellido1DenunciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellido1DenunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellido1DenunciadoActionPerformed

    public JButton getjButtonBuscarDenunciado() {
        return jButtonBuscarDenunciado;
    }

    public JButton getjButtonRegistrarDenunciado() {
        return jButtonRegistrarDenunciado;
    }

    public JComboBox getjComboBoxProvincia() {
        return jComboBoxProvincia;
    }

    public JTextField getjTextFieldcedulaDenunciado() {
        return jTextFieldcedulaDenunciado;
    }

    public JButton getjButtonSubirFotoPersonaDenunciada() {
        return jButtonSubirFotoPersonaDenunciada;
    }

    public JButton getjButtonSalirRegistroPersona() {
        return jButtonSalirRegistroPersona;
    }

    public JButton getjButtonRegistrarCategoria() {
        return jButtonIntroducirCategoria;
    }

    public JButton getjButtonIntroducirCategoria() {
        return jButtonIntroducirCategoria;
    }

    public JTextField getjTextFieldCategoriaRegistrada() {
        return jTextFieldCategoriaRegistrada;
    }

    public JButton getjButtonRegistrarNuevaCategoria() {
        return jButtonRegistrarNuevaCategoria;
    }

    public JComboBox getjComboBoxCategoriasEscogidas() {
        return jComboBoxCategoriasEscogidas;
    }

    public JComboBox getjComboBoxCategoriasAEscoger() {
        return jComboBoxCategoriasAEscoger;
    }

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
            java.util.logging.Logger.getLogger(RegistroPersonaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPersonaFisica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGeneroDenunciado;
    private javax.swing.JButton jButtonBuscarDenunciado;
    private javax.swing.JButton jButtonIntroducirCategoria;
    private javax.swing.JButton jButtonRegistrarDenunciado;
    private javax.swing.JButton jButtonRegistrarNuevaCategoria;
    private javax.swing.JButton jButtonSalirRegistroPersona;
    private javax.swing.JButton jButtonSubirFotoPersonaDenunciada;
    private javax.swing.JComboBox jComboBoxCategoriasAEscoger;
    private javax.swing.JComboBox jComboBoxCategoriasEscogidas;
    private javax.swing.JComboBox jComboBoxProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellido1Denunciado;
    private javax.swing.JLabel jLabelApellido1Denunciado1;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCategoriasDePersona;
    private javax.swing.JLabel jLabelFotoPersonaDenunciada;
    private javax.swing.JLabel jLabelGeneroDenunciado;
    private javax.swing.JLabel jLabelLugarTrabDen;
    private javax.swing.JLabel jLabelNombreDenunciado;
    private javax.swing.JLabel jLabelProvinciaDenunciado;
    private javax.swing.JLabel jLabelRutaFotoPersonaDenunciada;
    private javax.swing.JLabel jLabelcedulaDenunciado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButtonGeneroFemeninoPersonaDenunciada;
    private javax.swing.JRadioButton jRadioButtonGeneroMasculino;
    private javax.swing.JTextField jTextFieldApellido1Denunciado;
    private javax.swing.JTextField jTextFieldApellido2Denunciado1;
    private javax.swing.JTextField jTextFieldCategoriaRegistrada;
    private javax.swing.JTextField jTextFieldLugTrabDen;
    private javax.swing.JTextField jTextFieldNombreDenunciado;
    private javax.swing.JTextField jTextFieldcargoDenunciado;
    private javax.swing.JTextField jTextFieldcedulaDenunciado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarMensajeError(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void vincularEventos() {
        jButtonBuscarDenunciado.addActionListener(Controlador);
        jButtonRegistrarDenunciado.addActionListener(Controlador);
        jButtonSalirRegistroPersona.addActionListener(Controlador);
        jButtonRegistrarNuevaCategoria.addActionListener(Controlador);
        jButtonIntroducirCategoria.addActionListener(Controlador);
        jButtonSubirFotoPersonaDenunciada.addActionListener(Controlador);

    }

    @Override
    public void mostrarVentana() {
        setVisible(true);
    }

    @Override
    public void ocultarVentana() {
        setVisible(false);
    }

    @Override
    public void setCedula(String cedula) {
        jTextFieldcedulaDenunciado.setText(cedula);
    }

    @Override
    public void setSexo(String sexo) {

        if (sexo.equals(Constantes.MASCULINO)) {
            jRadioButtonGeneroMasculino.setSelected(true);
            jRadioButtonGeneroFemeninoPersonaDenunciada.setSelected(false);
        } else {
            jRadioButtonGeneroMasculino.setSelected(false);
            jRadioButtonGeneroFemeninoPersonaDenunciada.setSelected(true);
        }
    }

    public void setNombre(String nombre) {
        jTextFieldNombreDenunciado.setText(nombre);
    }

    @Override
    public void setPrimerApellido(String apellido) {
        jTextFieldApellido1Denunciado.setText(apellido);

    }

    @Override
    public void setSegundoApellido(String apellido) {
        jTextFieldApellido2Denunciado1.setText(apellido);
    }

    @Override
    public void setLugarDeTrabajo() {
        jTextFieldLugTrabDen.setText("");
    }

    @Override
    public void setCargo() {
        jTextFieldcargoDenunciado.setText("");
    }

    @Override
    public void setBusquedaExitosa(boolean exitoso) {
        busquedaExitosa = exitoso;
    }

    @Override
    public String getNombre() {
        return jTextFieldNombreDenunciado.getText();
    }

    @Override
    public String getPrimerApellido() {
        return jTextFieldApellido1Denunciado.getText();
    }

    @Override
    public String getSegundoApellido() {
        return jTextFieldApellido2Denunciado1.getText();
    }

    @Override
    public String getCedula() {
        return jTextFieldcedulaDenunciado.getText();
    }

    @Override
    public String getProvincia() {
        return jComboBoxProvincia.getSelectedItem().toString();
    }

    @Override
    public String getGenero() {
        return buttonGroupGeneroDenunciado.getSelection().toString();
    }

    @Override
    public String getLugarDeTrabajo() {
        return jTextFieldLugTrabDen.getText();
    }

    @Override
    public String getCargo() {
        return jTextFieldcargoDenunciado.getText();
    }

    @Override
    public String getCategoria() {
        return jComboBoxCategoriasAEscoger.getSelectedItem().toString();
    }

    public String getCategoriaEscogida() {
        return jComboBoxCategoriasAEscoger.getSelectedItem().toString();
    }

    @Override
    public void setCategoriaEscogida(String pCategoria) {

        jComboBoxCategoriasEscogidas.addItem(pCategoria);
    }

    @Override
    public void nuevaCategoria(String categoria) {

        jComboBoxCategoriasAEscoger.addItem(categoria);
        setCategoriaRegistrada();

    }

    @Override
    public void setCategoriaRegistrada() {
        jTextFieldCategoriaRegistrada.setText("");
    }

    @Override
    public ArrayList<String> getCategoriasEscogidas() {
        ArrayList<String> catEscogidas = new ArrayList<String>();

        int total = jComboBoxCategoriasEscogidas.getItemCount();
        for (int i = 0; i < total; i++) {
            String categoria = (String) jComboBoxCategoriasEscogidas.getItemAt(i);
            catEscogidas.add(categoria);
        }
        return catEscogidas;
    }

    @Override
    public ArrayList<String> getCategoriasAEscoger() {
        ArrayList<String> catAEscoger = new ArrayList<String>();

        int total = jComboBoxCategoriasAEscoger.getItemCount();
        for (int i = 0; i < total; i++) {
            String categoria = (String) jComboBoxCategoriasAEscoger.getItemAt(i);
            catAEscoger.add(categoria);
        }
        return catAEscoger;
    }

    @Override
    public void setCategoriasEscogidas() {
        jComboBoxCategoriasEscogidas.removeAllItems();
    }

}
