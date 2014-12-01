/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

import datos.Categoria;
import datos.PersonaDenunciada;
import funes.controller.ControladorBuscar;
import funes.controller.ControladorBusquedaPersona;

import funes.model.Model;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author USUARIO
 */
public class Buscar extends javax.swing.JFrame implements IBuscar {

    private ControladorBuscar Controlador;
    
    
    private ArrayList<String> listaResultados;
    private ArrayList<String> resultadosBuscarCategorias;
    Buscar.JLisResultados resultadosListaPanel = null;
    

    public Buscar(Model Modelo) {
        initComponents();
        Controlador = new ControladorBuscar(Modelo, this);
        vincularEventos();
    }

    public Buscar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSalirBuscar = new javax.swing.JButton();
        jButtonBuscarPorPersona = new javax.swing.JButton();
        jButtonBuscarPorEntidad = new javax.swing.JButton();
        jButtonBuscarPorCategoria = new javax.swing.JButton();
        jButtonCategoriasTotales = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar por :");

        jButtonSalirBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/Button-Close-icon_1.png"))); // NOI18N
        jButtonSalirBuscar.setBorder(null);
        jButtonSalirBuscar.setContentAreaFilled(false);
        jButtonSalirBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirBuscarActionPerformed(evt);
            }
        });

        jButtonBuscarPorPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/user.png"))); // NOI18N
        jButtonBuscarPorPersona.setBorder(null);
        jButtonBuscarPorPersona.setContentAreaFilled(false);
        jButtonBuscarPorPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPorPersonaActionPerformed(evt);
            }
        });

        jButtonBuscarPorEntidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/Briefcase-icon.png"))); // NOI18N
        jButtonBuscarPorEntidad.setBorder(null);
        jButtonBuscarPorEntidad.setContentAreaFilled(false);

        jButtonBuscarPorCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/categoria.png"))); // NOI18N
        jButtonBuscarPorCategoria.setBorder(null);
        jButtonBuscarPorCategoria.setContentAreaFilled(false);

        jButtonCategoriasTotales.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCategoriasTotales.setFont(new java.awt.Font("Tw Cen MT Condensed", 2, 18)); // NOI18N
        jButtonCategoriasTotales.setForeground(new java.awt.Color(102, 0, 102));
        jButtonCategoriasTotales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/Categorias.png"))); // NOI18N
        jButtonCategoriasTotales.setBorder(null);
        jButtonCategoriasTotales.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBuscarPorPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonBuscarPorEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonBuscarPorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalirBuscar)
                    .addComponent(jButtonCategoriasTotales))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSalirBuscar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscarPorEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarPorPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarPorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCategoriasTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirBuscarActionPerformed

    private void jButtonBuscarPorPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPorPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarPorPersonaActionPerformed

    public JButton getjButtonBuscarPorCategoria() {
        return jButtonBuscarPorCategoria;
    }

    public JButton getjButtonBuscarPorPersona() {
        return jButtonBuscarPorPersona;
    }

    public JButton getjButtonBuscarPorEntidad() {
        return jButtonBuscarPorEntidad;
    }

    public JButton getjButtonSalirBuscar() {
        return jButtonSalirBuscar;
    }

    public JButton getjButtonCategoriasTotales() {
        return jButtonCategoriasTotales;
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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarPorCategoria;
    private javax.swing.JButton jButtonBuscarPorEntidad;
    private javax.swing.JButton jButtonBuscarPorPersona;
    private javax.swing.JButton jButtonCategoriasTotales;
    private javax.swing.JButton jButtonSalirBuscar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarMensajeError(String mensaje, String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vincularEventos() {
        jButtonBuscarPorCategoria.addActionListener(Controlador);
        jButtonBuscarPorEntidad.addActionListener(Controlador);
        jButtonBuscarPorPersona.addActionListener(Controlador);
        jButtonSalirBuscar.addActionListener(Controlador);
        jButtonCategoriasTotales.addActionListener(Controlador);
    }

    @Override
    public void mostrarVentana() {
        setVisible(true);
    }

    @Override
    public void ocultarVentana() {
        setVisible(false);
        
    }
    
    public void mostrarResultados(ArrayList<String> solicitudBuscarCategoria) {

        
        listaResultados = solicitudBuscarCategoria;
       

        String[] listaDatosAMostrar = listaResultados.toArray(new String[listaResultados.size()]);
        if (resultadosListaPanel != null) {
            resultadosListaPanel.dispose();
        }
        resultadosListaPanel = new JLisResultados(listaDatosAMostrar);
        resultadosListaPanel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
     class JLisResultados extends JFrame {

        JList list;

        Container contentpane;

        public JLisResultados(String[] listColorNames) {
            super("Resultados");
            contentpane = getContentPane();
            contentpane.setLayout(new FlowLayout());
            contentpane.setBackground(Color.orange);
            list = new JList(listColorNames);
            //list.setSelectedIndex(0);
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            contentpane.add(new JScrollPane(list));
            list.addListSelectionListener(new ListSelectionListener() {

                public void valueChanged(ListSelectionEvent e) {
                    int selectedIndex = list.getSelectedIndex();
                    String categoria = resultadosBuscarCategorias.get(selectedIndex);
                    
                    
                    
                }
            });
            setSize(360,220);
            setVisible(true);
        }
    }
}
