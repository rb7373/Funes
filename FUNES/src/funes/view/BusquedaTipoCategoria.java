/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

import datos.EntidadDenunciada;
import datos.PersonaDenunciada;
import funes.controller.ControladorBusquedaTipoCategoria;
import funes.model.Model;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Trei
 */
public class BusquedaTipoCategoria extends javax.swing.JFrame implements IBusquedaTipoCategoria {

    private ControladorBusquedaTipoCategoria Controlador;

    private ArrayList<String> listaResultados;
    private ArrayList<EntidadDenunciada> resultadosBuscarEntidad;
    private ArrayList<PersonaDenunciada> resultadosBuscarPersona;

    JLisResultadosEntidad resultadosListaPanelEntidad = null;
    JLisResultadosPersona resultadosListaPanelPersona = null;

    public BusquedaTipoCategoria(Model modelo) {
        initComponents();
        Controlador = new ControladorBusquedaTipoCategoria(modelo, this);
        vincularEventos();
    }

    public BusquedaTipoCategoria() {
        initComponents();
    }

    public JButton getButtonBuscarTipoCategoria() {
        return ButtonBuscarTipoCategoria;
    }

    public JTextField getjTextFieldTipoCategoria() {
        return jTextFieldTipoCategoria;
    }

    public JComboBox getjComboBoxEntPers() {
        return jComboBoxEntPers;
    }

    public JButton getjButtonSalirBUsquedaTipoCategoria() {
        return jButtonSalirBUsquedaTipoCategoria;
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
        jLabelTituloVentana = new javax.swing.JLabel();
        jButtonSalirBUsquedaTipoCategoria = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelTipoCategoria = new javax.swing.JLabel();
        jTextFieldTipoCategoria = new javax.swing.JTextField();
        jComboBoxEntPers = new javax.swing.JComboBox();
        ButtonBuscarTipoCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jLabelTituloVentana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTituloVentana.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/categoriaGrande.png"))); // NOI18N

        jButtonSalirBUsquedaTipoCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/Button-Close-icon_1.png"))); // NOI18N
        jButtonSalirBUsquedaTipoCategoria.setBorder(null);
        jButtonSalirBUsquedaTipoCategoria.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalirBUsquedaTipoCategoria)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalirBUsquedaTipoCategoria)
                    .addComponent(jLabelTituloVentana))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTipoCategoria.setText("Categoría");

        jComboBoxEntPers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Persona", "Entidad" }));
        jComboBoxEntPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEntPersActionPerformed(evt);
            }
        });

        ButtonBuscarTipoCategoria.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTipoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBoxEntPers, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonBuscarTipoCategoria))
                    .addComponent(jTextFieldTipoCategoria))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTipoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEntPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscarTipoCategoria))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEntPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEntPersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEntPersActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaTipoCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaTipoCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaTipoCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaTipoCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaTipoCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscarTipoCategoria;
    private javax.swing.JButton jButtonSalirBUsquedaTipoCategoria;
    private javax.swing.JComboBox jComboBoxEntPers;
    private javax.swing.JLabel jLabelTipoCategoria;
    private javax.swing.JLabel jLabelTituloVentana;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldTipoCategoria;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarMensajeError(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null,
                mensaje,
                titulo,
                JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void vincularEventos() {
        ButtonBuscarTipoCategoria.addActionListener(Controlador);
        jButtonSalirBUsquedaTipoCategoria.addActionListener(Controlador);
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
    public void mostrarResultadosEntidad(ArrayList<EntidadDenunciada> solicitudEntidad) {

        resultadosBuscarEntidad = solicitudEntidad;
        listaResultados = new ArrayList<>();
        for (int entidad = 0; entidad < solicitudEntidad.size(); entidad++) {
            String datos = solicitudEntidad.get(entidad).getDatosGenerales();
            listaResultados.add(datos);
            System.out.println(datos);
        }

        String[] listaDatosAMostrar = listaResultados.toArray(new String[listaResultados.size()]);
        if (resultadosListaPanelEntidad != null) {
            resultadosListaPanelEntidad.dispose();
        }
        resultadosListaPanelEntidad = new JLisResultadosEntidad(listaDatosAMostrar);
        resultadosListaPanelEntidad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void mostrarResultadosPersona(ArrayList<PersonaDenunciada> solicitudBuscarPersona) {

        resultadosBuscarPersona = solicitudBuscarPersona;
        listaResultados = new ArrayList<>();
        for (int entidad = 0; entidad < solicitudBuscarPersona.size(); entidad++) {
            String datos = solicitudBuscarPersona.get(entidad).getDatosGenerales();
            listaResultados.add(datos);
            System.out.println(datos);
        }

        String[] listaDatosAMostrar = listaResultados.toArray(new String[listaResultados.size()]);
        if (resultadosListaPanelPersona != null) {
            resultadosListaPanelPersona.dispose();
        }
        resultadosListaPanelPersona = new JLisResultadosPersona(listaDatosAMostrar);
        resultadosListaPanelPersona.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void mostrarResultados(ArrayList<EntidadDenunciada> solicitudEntidad) {

    }

    @Override
    public void setCategoria() {
        jTextFieldTipoCategoria.setText("");
    }

    class JLisResultadosEntidad extends JFrame {

        JList list;

        Container contentpane;

        public JLisResultadosEntidad(String[] listColorNames) {
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
                    EntidadDenunciada entidad = resultadosBuscarEntidad.get(selectedIndex);
                    String nombre = entidad.getNombre();
                    String cedula = entidad.getCedulaJuridica();
                    String provincia = entidad.getProvincia();

                    System.out.println("CAMBIA INDICE");
                    Controlador.mostrarVentanaEntidadDenunciada(nombre, cedula, provincia);
                }
            });
           setSize(360,208);
            setVisible(true);
        }
    }

    class JLisResultadosPersona extends JFrame {

        JList list;

        Container contentpane;

        public JLisResultadosPersona(String[] listColorNames) {
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
                    PersonaDenunciada persona = resultadosBuscarPersona.get(selectedIndex);
                    String nombre = persona.getNombre();
                    String cedula = persona.getCedula();
                    String institucionLaboral = persona.getInstitucionLaboral();
                    String cargo = persona.getCargo();
                    Controlador.mostrarVentanaPersonaDenunciada(nombre, cedula, institucionLaboral, cargo);
                }
            });

            setSize(360,208);
            setVisible(true);
        }
    }
}
