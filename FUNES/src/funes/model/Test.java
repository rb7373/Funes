/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.model;

import funes.view.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author USUARIO
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPersonaDenunciada
     */
    public Test() {
        initComponents();

        //jLabelFotoPersonaDenunciada.setIcon(new javax.swing.ImageIcon(getClass().getResource()));
        JFileChooser c = new JFileChooser();
        // Demonstrate "Save" dialog:
        int rVal = c.showSaveDialog(this);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            try {
                System.out.println(c.getSelectedFile().getPath());
                System.out.println(c.getSelectedFile().getCanonicalPath());
                System.out.println(c.getCurrentDirectory().toString());
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }

        //jLabelFotoPersonaDenunciada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook_no_profile_pic2-jpg.gif")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFotoyNombrePersonaDeunciada = new javax.swing.JPanel();
        jLabelFotoPersonaDenunciada = new javax.swing.JLabel();
        jLabelNombrePersonaDenunciada = new javax.swing.JLabel();
        jLabelCedulaPersonaDenunciada = new javax.swing.JLabel();
        jLabelEdadPersonaDenunciada = new javax.swing.JLabel();
        jLabelInstitucionDondeLaboraPersonaDenunciada = new javax.swing.JLabel();
        jLabelCargoPersonaDenunciada = new javax.swing.JLabel();
        jPanelDenunciayCalificaciondeUsuario = new javax.swing.JPanel();
        jLabelDeunciePersonaDenunciada = new javax.swing.JLabel();
        jLabelRazondelaDenuncia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelPruebadelaDenuncia = new javax.swing.JLabel();
        jLabelCalificacióndelaDenuncia = new javax.swing.JLabel();
        jPanelReviewsdeotrosUsuarios = new javax.swing.JPanel();
        jLabelReviewsPersonaDenunciada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFotoyNombrePersonaDeunciada.setBackground(new java.awt.Color(102, 0, 102));
        jPanelFotoyNombrePersonaDeunciada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelFotoPersonaDenunciada.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFotoPersonaDenunciada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos/patronCR/sj/star_on.png"))); // NOI18N
        jLabelFotoPersonaDenunciada.setBorder(new javax.swing.border.MatteBorder(null));

        jLabelNombrePersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombrePersonaDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombrePersonaDenunciada.setText("Nombre Completo");

        jLabelCedulaPersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCedulaPersonaDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCedulaPersonaDenunciada.setText("Cédula");

        jLabelEdadPersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEdadPersonaDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEdadPersonaDenunciada.setText("Edad");

        jLabelInstitucionDondeLaboraPersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelInstitucionDondeLaboraPersonaDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInstitucionDondeLaboraPersonaDenunciada.setText("Institición donde labora");

        jLabelCargoPersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCargoPersonaDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCargoPersonaDenunciada.setText("Cargo");

        javax.swing.GroupLayout jPanelFotoyNombrePersonaDeunciadaLayout = new javax.swing.GroupLayout(jPanelFotoyNombrePersonaDeunciada);
        jPanelFotoyNombrePersonaDeunciada.setLayout(jPanelFotoyNombrePersonaDeunciadaLayout);
        jPanelFotoyNombrePersonaDeunciadaLayout.setHorizontalGroup(
            jPanelFotoyNombrePersonaDeunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabelFotoPersonaDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombrePersonaDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelCargoPersonaDenunciada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelInstitucionDondeLaboraPersonaDenunciada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelEdadPersonaDenunciada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCedulaPersonaDenunciada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFotoyNombrePersonaDeunciadaLayout.setVerticalGroup(
            jPanelFotoyNombrePersonaDeunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFotoyNombrePersonaDeunciadaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFotoPersonaDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelNombrePersonaDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCedulaPersonaDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEdadPersonaDenunciada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInstitucionDondeLaboraPersonaDenunciada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCargoPersonaDenunciada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDenunciayCalificaciondeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDenunciayCalificaciondeUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelDeunciePersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDeunciePersonaDenunciada.setText("Denúncie");

        jLabelRazondelaDenuncia.setText("Razón: ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabelPruebadelaDenuncia.setText("Prueba:");

        jLabelCalificacióndelaDenuncia.setText("Calificación:");

        javax.swing.GroupLayout jPanelDenunciayCalificaciondeUsuarioLayout = new javax.swing.GroupLayout(jPanelDenunciayCalificaciondeUsuario);
        jPanelDenunciayCalificaciondeUsuario.setLayout(jPanelDenunciayCalificaciondeUsuarioLayout);
        jPanelDenunciayCalificaciondeUsuarioLayout.setHorizontalGroup(
            jPanelDenunciayCalificaciondeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDenunciayCalificaciondeUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDenunciayCalificaciondeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDenunciayCalificaciondeUsuarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelDeunciePersonaDenunciada))
                    .addGroup(jPanelDenunciayCalificaciondeUsuarioLayout.createSequentialGroup()
                        .addGroup(jPanelDenunciayCalificaciondeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRazondelaDenuncia)
                            .addComponent(jLabelPruebadelaDenuncia)
                            .addComponent(jLabelCalificacióndelaDenuncia))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDenunciayCalificaciondeUsuarioLayout.setVerticalGroup(
            jPanelDenunciayCalificaciondeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDenunciayCalificaciondeUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDeunciePersonaDenunciada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelRazondelaDenuncia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPruebadelaDenuncia)
                .addGap(28, 28, 28)
                .addComponent(jLabelCalificacióndelaDenuncia)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jPanelReviewsdeotrosUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelReviewsdeotrosUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelReviewsPersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelReviewsPersonaDenunciada.setText("Reviews");

        javax.swing.GroupLayout jPanelReviewsdeotrosUsuariosLayout = new javax.swing.GroupLayout(jPanelReviewsdeotrosUsuarios);
        jPanelReviewsdeotrosUsuarios.setLayout(jPanelReviewsdeotrosUsuariosLayout);
        jPanelReviewsdeotrosUsuariosLayout.setHorizontalGroup(
            jPanelReviewsdeotrosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReviewsdeotrosUsuariosLayout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addComponent(jLabelReviewsPersonaDenunciada)
                .addContainerGap())
        );
        jPanelReviewsdeotrosUsuariosLayout.setVerticalGroup(
            jPanelReviewsdeotrosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReviewsdeotrosUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReviewsPersonaDenunciada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanelFotoyNombrePersonaDeunciada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelDenunciayCalificaciondeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelReviewsdeotrosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFotoyNombrePersonaDeunciada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDenunciayCalificaciondeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelReviewsdeotrosUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCalificacióndelaDenuncia;
    private javax.swing.JLabel jLabelCargoPersonaDenunciada;
    private javax.swing.JLabel jLabelCedulaPersonaDenunciada;
    private javax.swing.JLabel jLabelDeunciePersonaDenunciada;
    private javax.swing.JLabel jLabelEdadPersonaDenunciada;
    private javax.swing.JLabel jLabelFotoPersonaDenunciada;
    private javax.swing.JLabel jLabelInstitucionDondeLaboraPersonaDenunciada;
    private javax.swing.JLabel jLabelNombrePersonaDenunciada;
    private javax.swing.JLabel jLabelPruebadelaDenuncia;
    private javax.swing.JLabel jLabelRazondelaDenuncia;
    private javax.swing.JLabel jLabelReviewsPersonaDenunciada;
    private javax.swing.JPanel jPanelDenunciayCalificaciondeUsuario;
    private javax.swing.JPanel jPanelFotoyNombrePersonaDeunciada;
    private javax.swing.JPanel jPanelReviewsdeotrosUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
