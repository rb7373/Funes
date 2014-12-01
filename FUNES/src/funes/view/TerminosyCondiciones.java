/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

import javax.swing.JButton;
import funes.model.Model;
import funes.controller.ControladorTerminosyCondiciones;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class TerminosyCondiciones extends javax.swing.JFrame implements ITerminosyCondiciones {

    ControladorTerminosyCondiciones Controlador;

    public TerminosyCondiciones(Model modelo) {
        initComponents();
        Controlador = new ControladorTerminosyCondiciones(modelo, this);
        vincularEventos();
    }

    public TerminosyCondiciones() {
        initComponents();
    }

    public JButton getjButtonSalirTerminosyCondiciones() {
        return jButtonSalirTerminosyCondiciones;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTerminosYcondiciones = new javax.swing.JTextArea();
        jButtonSalirTerminosyCondiciones = new javax.swing.JButton();
        jLabelTerminosyCondiciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextAreaTerminosYcondiciones.setEditable(false);
        jTextAreaTerminosYcondiciones.setColumns(20);
        jTextAreaTerminosYcondiciones.setRows(5);
        jTextAreaTerminosYcondiciones.setText("Términos y Condiciones del uso de FUNATEC\n\nDeclaración de derechos y responsabilidades:\n\t\nAl aceptar los términos y condiciones del uso de FUNATEC,\nusted se compromete a aceptar todas las condiciones \nredactadas en el presente documento.\n\nCuenta\n\nAl crear una cuenta en FUNATEC,  usted deberá entender y \naceptar lo siguiente:\n•\tA fin de crear una cuenta en FUNATEC,  usted \nproporcionará su información personal. Esto incluye su \nnúmero de cédula, nombre completo y apellido.\n•\tUsted deberá suministrarnos un nickname que \nidentificará su cuenta.\n•\tUsted tendrá la opción de escoger si su información\npersonal es pública o privada. Si escoge “Privada” entiende \nque FUNATEC seguirá teniendo acceso a esta información. \nSin embargo esta no será sumistrada a terceros.\n\nSeguridad\n\n Todos los usuarios de FUNATEC deben proporcionar su \ninformación personal, y solo existirá una cuenta por \npersona. Debido a lo anterior, al aceptar los términos y\ncondiciones usted se compromete a lo siguiente:\n•\tUsted no creará una cuenta falsa sumistrando los \ndatos personales de otra persona.\n•\tUsted no creará una cuenta si no es mayor de 18 años.\n•\tUsted no hará su contraseña pública ni dejará que \notras personas usen su cuenta por usted.\n•\tAl seleccionar su nickname, nos reservamos el derecho\nde denegarlo  si ese ya existe en el sistema o  reclamarlo \npor cualquier otro motivo.\n\nProtección de los derechos de otros\n\nFUNATEC fue creado para alzar la voz ante problemas \nnacionales, no para pisotear los derechos de ninguna persona.\nPor lo anterior, al aceptar los términos y condiciones del\nuso de FUNATEC, usted se compromete a lo siguiente:\n•\tUsted no creará un perfil de una persona acusándola \nde  actos falsos ni suministrando archivos probatorios falsos.\n•\tAl comentar y calificar el perfil de una persona, \nusted denunciará su mal acto con franqueza, pero con respeto.\n•\tUsted no inducirá a terceros de calificar a una \npersona siguiendo sus criterios. Respetará la opinión de los\ndemás y por ninguna razón tratará de manipular su criterio.\n•\tUsted no reportará a una persona si esta no tiene \nmotivo de reporte, ni inducirá a otros a hacer lo mismo.\n\nDispositivos móviles\n\n•\tFUNATEC está disponible para la plataforma Android \nde manera gratuita. Sin embargo, usted deberá asumir los \ngastos normales de su  operadora.\n\nConflictos\n\n•\tSi alguien interpone una demanda contra nosotros \nrelacionada con un perfil que usted creó en FUNATEC , o de \nalguno de sus comentarios, archivos probatorios o \ncalificaciones,  usted se encargará  de indemnizarnos y nos \nlibrará de la responsabilidad por todos los posibles daños,\npérdidas y gastos de cualquier tipo relacionados con dicha \ndemanda. FUNATEC no  controla ni dirige las acciones de sus\nusuarios  y no es responsable del contenido o la información\nque los usuarios transmitan o compartan en la aplicación.\n\n");
        jScrollPane1.setViewportView(jTextAreaTerminosYcondiciones);

        jButtonSalirTerminosyCondiciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/Button-Close-icon_1.png"))); // NOI18N
        jButtonSalirTerminosyCondiciones.setBorder(null);
        jButtonSalirTerminosyCondiciones.setContentAreaFilled(false);

        jLabelTerminosyCondiciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTerminosyCondiciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTerminosyCondiciones.setText("Términos y Condiciones FUNATEC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTerminosyCondiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalirTerminosyCondiciones)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalirTerminosyCondiciones)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTerminosyCondiciones)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TerminosyCondiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TerminosyCondiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TerminosyCondiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TerminosyCondiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TerminosyCondiciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalirTerminosyCondiciones;
    private javax.swing.JLabel jLabelTerminosyCondiciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTerminosYcondiciones;
    // End of variables declaration//GEN-END:variables

    @Override
    public void vincularEventos() {
        jButtonSalirTerminosyCondiciones.addActionListener(Controlador);
    }

    @Override
    public void mostrarMensajeError(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void mostrarVentana() {
        setVisible(true);
    }

    @Override
    public void ocultarVentana() {
        setVisible(false);
    }
}
