/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

import funes.controller.ControladorRegistroEntidad;
import funes.model.Model;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Trei
 */
public class RegistroEntidad extends javax.swing.JFrame implements IRegistroEntidad {

    private ControladorRegistroEntidad Controlador;

    public RegistroEntidad(Model Modelo) {
        Controlador = new ControladorRegistroEntidad(Modelo, this);
        initComponents();
        vincularEventos();
    }

    public RegistroEntidad() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNombreEntidad = new javax.swing.JPanel();
        jLabelNombreEntidadDenunciada = new javax.swing.JLabel();
        jButtonSalirRegistroEntidad = new javax.swing.JButton();
        jPanelDatosPrincipalesEntidadDenunciada = new javax.swing.JPanel();
        jLabelNombreEntidad = new javax.swing.JLabel();
        jTextFieldNombreEntidad = new javax.swing.JTextField();
        jLabelCedJuridica = new javax.swing.JLabel();
        jTextFieldCedJuridica = new javax.swing.JTextField();
        jLabelFotoEntidadDenunciada = new javax.swing.JLabel();
        jButtonFotoEntidadDenunciada = new javax.swing.JButton();
        jLabelRutaFotoEntidadDenunciada = new javax.swing.JLabel();
        jPanelDireccionEntidadDenunciada = new javax.swing.JPanel();
        jLabelDireccionEntidadDenunciada = new javax.swing.JLabel();
        jLabelPais = new javax.swing.JLabel();
        jTextFieldPaisEntidad = new javax.swing.JTextField();
        jLabelProvincia = new javax.swing.JLabel();
        jComboBoxProvinciaEntidad = new javax.swing.JComboBox();
        jLabelCanton = new javax.swing.JLabel();
        jTextFieldCanton = new javax.swing.JTextField();
        jLabelDistrito = new javax.swing.JLabel();
        jTextFieldDistrito = new javax.swing.JTextField();
        jLabelBarrio = new javax.swing.JLabel();
        jTextFieldBarrio = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelCategoriaEntidad = new javax.swing.JLabel();
        jComboBoxCategoriasAEscoger = new javax.swing.JComboBox();
        jTextFieldCategoriaRegistrada = new javax.swing.JTextField();
        jButtonRegistrarCategoria = new javax.swing.JButton();
        jButtonRegistrarEntidad = new javax.swing.JButton();
        jLabelCategoriasEntidad = new javax.swing.JLabel();
        jButtonAgregoCategoria = new javax.swing.JButton();
        jComboBoxCategoriasEscogidas = new javax.swing.JComboBox();
        jLabelCategoriasIngresadas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelNombreEntidad.setBackground(new java.awt.Color(153, 0, 153));
        jPanelNombreEntidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelNombreEntidadDenunciada.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelNombreEntidadDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreEntidadDenunciada.setText("Registro de Entidad");

        jButtonSalirRegistroEntidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/Button-Close-icon_1.png"))); // NOI18N
        jButtonSalirRegistroEntidad.setBorder(null);
        jButtonSalirRegistroEntidad.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanelNombreEntidadLayout = new javax.swing.GroupLayout(jPanelNombreEntidad);
        jPanelNombreEntidad.setLayout(jPanelNombreEntidadLayout);
        jPanelNombreEntidadLayout.setHorizontalGroup(
            jPanelNombreEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNombreEntidadLayout.createSequentialGroup()
                .addComponent(jLabelNombreEntidadDenunciada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalirRegistroEntidad)
                .addContainerGap())
        );
        jPanelNombreEntidadLayout.setVerticalGroup(
            jPanelNombreEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNombreEntidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNombreEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNombreEntidadDenunciada)
                    .addComponent(jButtonSalirRegistroEntidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDatosPrincipalesEntidadDenunciada.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrincipalesEntidadDenunciada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelNombreEntidad.setText("Nombre:");

        jLabelCedJuridica.setText("Cédula Jurídica:");

        jLabelFotoEntidadDenunciada.setText("Foto:");

        jButtonFotoEntidadDenunciada.setText("Browse");

        javax.swing.GroupLayout jPanelDatosPrincipalesEntidadDenunciadaLayout = new javax.swing.GroupLayout(jPanelDatosPrincipalesEntidadDenunciada);
        jPanelDatosPrincipalesEntidadDenunciada.setLayout(jPanelDatosPrincipalesEntidadDenunciadaLayout);
        jPanelDatosPrincipalesEntidadDenunciadaLayout.setHorizontalGroup(
            jPanelDatosPrincipalesEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCedJuridica)
                    .addComponent(jLabelFotoEntidadDenunciada)
                    .addComponent(jLabelNombreEntidad))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createSequentialGroup()
                        .addComponent(jButtonFotoEntidadDenunciada)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelRutaFotoEntidadDenunciada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createSequentialGroup()
                        .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCedJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombreEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDatosPrincipalesEntidadDenunciadaLayout.setVerticalGroup(
            jPanelDatosPrincipalesEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createSequentialGroup()
                        .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreEntidad)
                            .addComponent(jTextFieldNombreEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCedJuridica)
                            .addComponent(jTextFieldCedJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelRutaFotoEntidadDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosPrincipalesEntidadDenunciadaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelFotoEntidadDenunciada))))
                    .addGroup(jPanelDatosPrincipalesEntidadDenunciadaLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButtonFotoEntidadDenunciada)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDireccionEntidadDenunciada.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDireccionEntidadDenunciada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelDireccionEntidadDenunciada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDireccionEntidadDenunciada.setText("Dirección");

        jLabelPais.setText("País:");

        jLabelProvincia.setText("Provincia:");

        jComboBoxProvinciaEntidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "San José", "Cartago", "Heredia", "Alajuela", "Puntarenas", "Guanacaste", "Limón" }));

        jLabelCanton.setText("Cantón:");

        jLabelDistrito.setText("Distrito:");

        jLabelBarrio.setText("Barrio:");

        javax.swing.GroupLayout jPanelDireccionEntidadDenunciadaLayout = new javax.swing.GroupLayout(jPanelDireccionEntidadDenunciada);
        jPanelDireccionEntidadDenunciada.setLayout(jPanelDireccionEntidadDenunciadaLayout);
        jPanelDireccionEntidadDenunciadaLayout.setHorizontalGroup(
            jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDireccionEntidadDenunciadaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDireccionEntidadDenunciadaLayout.createSequentialGroup()
                        .addGroup(jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCanton)
                            .addGroup(jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelBarrio)
                                .addComponent(jLabelDistrito)))
                        .addGap(55, 55, 55)
                        .addGroup(jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDistrito)
                            .addComponent(jTextFieldBarrio)
                            .addComponent(jTextFieldCanton))
                        .addGap(129, 129, 129))
                    .addGroup(jPanelDireccionEntidadDenunciadaLayout.createSequentialGroup()
                        .addGroup(jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPais)
                            .addComponent(jLabelProvincia))
                        .addGap(47, 47, 47)
                        .addGroup(jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxProvinciaEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPaisEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDireccionEntidadDenunciadaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDireccionEntidadDenunciada)
                .addGap(20, 20, 20))
        );
        jPanelDireccionEntidadDenunciadaLayout.setVerticalGroup(
            jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDireccionEntidadDenunciadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDireccionEntidadDenunciada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPais)
                    .addComponent(jTextFieldPaisEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProvincia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxProvinciaEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCanton)
                    .addComponent(jTextFieldCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDistrito)
                    .addComponent(jTextFieldDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDireccionEntidadDenunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBarrio)
                    .addComponent(jTextFieldBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelCategoriaEntidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCategoriaEntidad.setText("Categoría");

        jComboBoxCategoriasAEscoger.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Senasa", "Empresa", "PANI", "Restaurante", "Condominio" }));

        jButtonRegistrarCategoria.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonRegistrarCategoria.setText("Nueva Categoría");

        jButtonRegistrarEntidad.setText("Registrar");

        jLabelCategoriasEntidad.setText("Categorías:");

        jButtonAgregoCategoria.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonAgregoCategoria.setText("Agregar Categoría");

        jComboBoxCategoriasEscogidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriasEscogidasActionPerformed(evt);
            }
        });

        jLabelCategoriasIngresadas.setText("Categoría (s) ingresadas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCategoriasIngresadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCategoriasEntidad)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCategoriaRegistrada, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCategoriasEscogidas, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCategoriasAEscoger, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregoCategoria)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonRegistrarEntidad)))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCategoriaEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelCategoriaEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoriasEntidad)
                    .addComponent(jComboBoxCategoriasAEscoger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregoCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCategoriaRegistrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoriasIngresadas)
                    .addComponent(jComboBoxCategoriasEscogidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrarEntidad))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNombreEntidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDatosPrincipalesEntidadDenunciada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDireccionEntidadDenunciada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelNombreEntidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDatosPrincipalesEntidadDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDireccionEntidadDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCategoriasEscogidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriasEscogidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriasEscogidasActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEntidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEntidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEntidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEntidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEntidad().setVisible(true);
            }
        });
    }

    public JButton getjButtonSalirRegistroEntidad() {
        return jButtonSalirRegistroEntidad;
    }

    public JButton getjButtonFotoEntidadDenunciada() {
        return jButtonFotoEntidadDenunciada;
    }

    public JButton getjButtonRegistrarEntidad() {
        return jButtonRegistrarEntidad;
    }

    public JButton getjButtonRegistrarCategoria() {
        return jButtonRegistrarCategoria;
    }

    public JTextField getjTextFieldNombreEntidad() {
        return jTextFieldNombreEntidad;
    }

    public JTextField getjTextFieldCedJuridica() {
        return jTextFieldCedJuridica;
    }

    public JTextField getjTextFieldPaisEntidad() {
        return jTextFieldPaisEntidad;
    }

    public JComboBox getjComboBoxProvinciaEntidad() {
        return jComboBoxProvinciaEntidad;
    }

    public JTextField getjTextFieldCanton() {
        return jTextFieldCanton;
    }

    public JTextField getjTextFieldBarrio() {
        return jTextFieldBarrio;
    }

    public JTextField getjTextFieldDistrito() {
        return jTextFieldDistrito;
    }

    public JComboBox getjComboBoxCategorias() {
        return jComboBoxCategoriasAEscoger;
    }

    public JButton getjButtonAgregoCategoria() {
        return jButtonAgregoCategoria;
    }

    public JTextField getjTextFieldCategoriaRegistrada() {
        return jTextFieldCategoriaRegistrada;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregoCategoria;
    private javax.swing.JButton jButtonFotoEntidadDenunciada;
    private javax.swing.JButton jButtonRegistrarCategoria;
    private javax.swing.JButton jButtonRegistrarEntidad;
    private javax.swing.JButton jButtonSalirRegistroEntidad;
    private javax.swing.JComboBox jComboBoxCategoriasAEscoger;
    private javax.swing.JComboBox jComboBoxCategoriasEscogidas;
    private javax.swing.JComboBox jComboBoxProvinciaEntidad;
    private javax.swing.JLabel jLabelBarrio;
    private javax.swing.JLabel jLabelCanton;
    private javax.swing.JLabel jLabelCategoriaEntidad;
    private javax.swing.JLabel jLabelCategoriasEntidad;
    private javax.swing.JLabel jLabelCategoriasIngresadas;
    private javax.swing.JLabel jLabelCedJuridica;
    private javax.swing.JLabel jLabelDireccionEntidadDenunciada;
    private javax.swing.JLabel jLabelDistrito;
    private javax.swing.JLabel jLabelFotoEntidadDenunciada;
    private javax.swing.JLabel jLabelNombreEntidad;
    private javax.swing.JLabel jLabelNombreEntidadDenunciada;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelProvincia;
    private javax.swing.JLabel jLabelRutaFotoEntidadDenunciada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDatosPrincipalesEntidadDenunciada;
    private javax.swing.JPanel jPanelDireccionEntidadDenunciada;
    private javax.swing.JPanel jPanelNombreEntidad;
    private javax.swing.JTextField jTextFieldBarrio;
    private javax.swing.JTextField jTextFieldCanton;
    private javax.swing.JTextField jTextFieldCategoriaRegistrada;
    private javax.swing.JTextField jTextFieldCedJuridica;
    private javax.swing.JTextField jTextFieldDistrito;
    private javax.swing.JTextField jTextFieldNombreEntidad;
    private javax.swing.JTextField jTextFieldPaisEntidad;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarMensajeError(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void vincularEventos() {
        jButtonRegistrarEntidad.addActionListener(Controlador);
        jButtonRegistrarEntidad.addActionListener(Controlador);
        jButtonFotoEntidadDenunciada.addActionListener(Controlador);
        jButtonSalirRegistroEntidad.addActionListener(Controlador);
        jButtonAgregoCategoria.addActionListener(Controlador);
        jButtonRegistrarCategoria.addActionListener(Controlador);
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
    public String getNombre() {
        return jTextFieldNombreEntidad.getText();
    }

    @Override
    public String getCedulaJuridica() {
        return jTextFieldCedJuridica.getText();
    }

    @Override
    public String getProvincia() {
        return jComboBoxProvinciaEntidad.getSelectedItem().toString();
    }

    @Override
    public String getPais() {
        return jTextFieldPaisEntidad.getText();
    }

    @Override
    public String getCanton() {
        return jTextFieldCanton.getText();
    }

    @Override
    public String getBarrio() {
        return jTextFieldBarrio.getText();
    }

    @Override
    public String getDistrito() {
        return jTextFieldDistrito.getText();
    }

    @Override
    public void setNombre() {
        jTextFieldNombreEntidad.setText("");
    }

    @Override
    public void setCedulaJuridica() {
        jTextFieldCedJuridica.setText("");
    }

    @Override
    public void setPais() {
        jTextFieldPaisEntidad.setText("");
    }

    @Override
    public void setCanton() {
        jTextFieldCanton.setText("");
    }

    @Override
    public void setBarrio() {
        jTextFieldBarrio.setText("");
    }

    @Override
    public void setDistrito() {
        jTextFieldDistrito.setText("");
    }

    @Override
    public String getCategoria() {
        return jComboBoxCategoriasAEscoger.getSelectedItem().toString();
    }

    @Override
    public void setCategoria(String categoria) {
        jComboBoxCategoriasEscogidas.addItem(categoria);
    }

    public void setCategoriaRegistrada() {
        jTextFieldCategoriaRegistrada.setText("");
    }

    @Override
    public void nuevaCategoria(String categoriaRegistrada) {
        jComboBoxCategoriasAEscoger.addItem(categoriaRegistrada);
        setCategoriaRegistrada();

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
