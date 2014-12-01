/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

import javax.swing.JButton;
import javax.swing.JTextArea;
import funes.controller.ControladorPaginaEntidadDenunciada;
import funes.model.Model;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class PaginaEntidadDenunciada extends javax.swing.JFrame implements IPaginaEntidadDenunciada {

    private ControladorPaginaEntidadDenunciada Controlador;
    private PanelCalificacion calificacion = new PanelCalificacion();
    
     public PaginaEntidadDenunciada(Model modelo) {
        initComponents();
        calificacion = new PanelCalificacion();
        jPanelDenunciayCalificaciondeUsuario.add(calificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        
        
        setSize(932, 559);
        Controlador = new ControladorPaginaEntidadDenunciada(modelo, this);
        vincularEventos();
    }

    public PaginaEntidadDenunciada() {
        initComponents();
        calificacion = new PanelCalificacion();
        jPanelDenunciayCalificaciondeUsuario.add(calificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        
        
        setSize(932, 559);

    }

    @Override
    public void vincularEventos() {
        jButtonDenunciarEntidadFisica.addActionListener(Controlador);
        jButtonSalirPaginaEntidadDenunciada.addActionListener(Controlador);

    }

    @Override
    public void mostrarVentana() {
        setVisible(true);
    }

    @Override
    public void ocultarVentana() {
        setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFotoyNombreeEntidadUsuario = new javax.swing.JPanel();
        jLabelFotoEntidadDenunciada = new javax.swing.JLabel();
        jLabelNombreEntidadDenunciada = new javax.swing.JLabel();
        jLabelCedulaJuridicaEntidadDenunciada = new javax.swing.JLabel();
        jButtonSalirPaginaEntidadDenunciada = new javax.swing.JButton();
        jLabelCalificacionEntidadDenunciada = new javax.swing.JLabel();
        jLabelIntroCalificacioneEntidadDenunciada = new javax.swing.JLabel();
        jPanelDenunciayCalificaciondeUsuario = new javax.swing.JPanel();
        jLabelDeuncieEntidadDenunciada = new javax.swing.JLabel();
        jLabelRazondelaDenuncia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaComentarioDeDenuncia = new javax.swing.JTextArea();
        jLabelPruebadelaDenuncia = new javax.swing.JLabel();
        jLabelCalificacióndelaDenuncia = new javax.swing.JLabel();
        jButtonDenunciarEntidadFisica = new javax.swing.JButton();
        jPanelReviewsdeotrosUsuarios = new javax.swing.JPanel();
        jLabelReviewsPersonaDenunciada = new javax.swing.JLabel();
        jPanelPlantillaReview1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaComentarioCalificación = new javax.swing.JTextArea();
        jLabelNicknameOrigen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelPlantillaReview2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaComentarioCalificación1 = new javax.swing.JTextArea();
        jLabelNicknameOrigen1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFotoyNombreeEntidadUsuario.setBackground(new java.awt.Color(102, 0, 102));
        jPanelFotoyNombreeEntidadUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelFotoEntidadDenunciada.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFotoEntidadDenunciada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/392333_10149999285997743_1364412321_n.png"))); // NOI18N
        jLabelFotoEntidadDenunciada.setBorder(new javax.swing.border.MatteBorder(null));

        jLabelNombreEntidadDenunciada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombreEntidadDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreEntidadDenunciada.setText("Nombre de la Entidad");

        jLabelCedulaJuridicaEntidadDenunciada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCedulaJuridicaEntidadDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCedulaJuridicaEntidadDenunciada.setText("Cédula Jurídica");

        jButtonSalirPaginaEntidadDenunciada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/Button-Close-icon_1.png"))); // NOI18N
        jButtonSalirPaginaEntidadDenunciada.setBorder(null);
        jButtonSalirPaginaEntidadDenunciada.setContentAreaFilled(false);

        jLabelCalificacionEntidadDenunciada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCalificacionEntidadDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCalificacionEntidadDenunciada.setText("0");

        jLabelIntroCalificacioneEntidadDenunciada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelIntroCalificacioneEntidadDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIntroCalificacioneEntidadDenunciada.setText("Su calificacion es de ");

        javax.swing.GroupLayout jPanelFotoyNombreeEntidadUsuarioLayout = new javax.swing.GroupLayout(jPanelFotoyNombreeEntidadUsuario);
        jPanelFotoyNombreeEntidadUsuario.setLayout(jPanelFotoyNombreeEntidadUsuarioLayout);
        jPanelFotoyNombreeEntidadUsuarioLayout.setHorizontalGroup(
            jPanelFotoyNombreeEntidadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotoyNombreeEntidadUsuarioLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabelFotoEntidadDenunciada)
                .addGap(18, 18, 18)
                .addGroup(jPanelFotoyNombreeEntidadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFotoyNombreeEntidadUsuarioLayout.createSequentialGroup()
                        .addGroup(jPanelFotoyNombreeEntidadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCedulaJuridicaEntidadDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombreEntidadDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(393, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFotoyNombreeEntidadUsuarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelFotoyNombreeEntidadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFotoyNombreeEntidadUsuarioLayout.createSequentialGroup()
                                .addComponent(jButtonSalirPaginaEntidadDenunciada)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFotoyNombreeEntidadUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabelIntroCalificacioneEntidadDenunciada)
                                .addGap(60, 60, 60)
                                .addComponent(jLabelCalificacionEntidadDenunciada)
                                .addGap(68, 68, 68))))))
        );
        jPanelFotoyNombreeEntidadUsuarioLayout.setVerticalGroup(
            jPanelFotoyNombreeEntidadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFotoyNombreeEntidadUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFotoyNombreeEntidadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalirPaginaEntidadDenunciada)
                    .addGroup(jPanelFotoyNombreeEntidadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFotoyNombreeEntidadUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabelNombreEntidadDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelCedulaJuridicaEntidadDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFotoyNombreeEntidadUsuarioLayout.createSequentialGroup()
                            .addGroup(jPanelFotoyNombreeEntidadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelFotoyNombreeEntidadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCalificacionEntidadDenunciada)
                                    .addComponent(jLabelIntroCalificacioneEntidadDenunciada))
                                .addComponent(jLabelFotoEntidadDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))))
        );

        getContentPane().add(jPanelFotoyNombreeEntidadUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        jPanelDenunciayCalificaciondeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDenunciayCalificaciondeUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDenunciayCalificaciondeUsuario.setMinimumSize(new java.awt.Dimension(354, 323));
        jPanelDenunciayCalificaciondeUsuario.setPreferredSize(new java.awt.Dimension(354, 323));
        jPanelDenunciayCalificaciondeUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDeuncieEntidadDenunciada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDeuncieEntidadDenunciada.setText("Denúncie");
        jPanelDenunciayCalificaciondeUsuario.add(jLabelDeuncieEntidadDenunciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 13, -1, -1));

        jLabelRazondelaDenuncia.setText("Razón: ");
        jPanelDenunciayCalificaciondeUsuario.add(jLabelRazondelaDenuncia, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 38, -1, -1));

        jTextAreaComentarioDeDenuncia.setColumns(20);
        jTextAreaComentarioDeDenuncia.setRows(5);
        jScrollPane1.setViewportView(jTextAreaComentarioDeDenuncia);

        jPanelDenunciayCalificaciondeUsuario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, 344, 107));

        jLabelPruebadelaDenuncia.setText("Prueba:");
        jPanelDenunciayCalificaciondeUsuario.add(jLabelPruebadelaDenuncia, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 183, -1, -1));

        jLabelCalificacióndelaDenuncia.setText("Calificación:");
        jPanelDenunciayCalificaciondeUsuario.add(jLabelCalificacióndelaDenuncia, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 225, -1, -1));

        jButtonDenunciarEntidadFisica.setText("Denunciar");
        jPanelDenunciayCalificaciondeUsuario.add(jButtonDenunciarEntidadFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        getContentPane().add(jPanelDenunciayCalificaciondeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 370, 370));

        jPanelReviewsdeotrosUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelReviewsdeotrosUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelReviewsdeotrosUsuarios.setPreferredSize(new java.awt.Dimension(551, 378));

        jLabelReviewsPersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelReviewsPersonaDenunciada.setText("Reviews");

        jPanelPlantillaReview1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPlantillaReview1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextAreaComentarioCalificación.setEditable(false);
        jTextAreaComentarioCalificación.setColumns(20);
        jTextAreaComentarioCalificación.setRows(5);
        jScrollPane2.setViewportView(jTextAreaComentarioCalificación);

        jLabelNicknameOrigen.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelNicknameOrigen.setText("Nickname");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/knewstuff.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/knewstuff.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/knewstuff.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/knewstuff.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/knewstuff.png"))); // NOI18N

        javax.swing.GroupLayout jPanelPlantillaReview1Layout = new javax.swing.GroupLayout(jPanelPlantillaReview1);
        jPanelPlantillaReview1.setLayout(jPanelPlantillaReview1Layout);
        jPanelPlantillaReview1Layout.setHorizontalGroup(
            jPanelPlantillaReview1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlantillaReview1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPlantillaReview1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlantillaReview1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanelPlantillaReview1Layout.createSequentialGroup()
                        .addComponent(jLabelNicknameOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23))))
        );
        jPanelPlantillaReview1Layout.setVerticalGroup(
            jPanelPlantillaReview1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlantillaReview1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlantillaReview1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNicknameOrigen)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPlantillaReview2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPlantillaReview2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextAreaComentarioCalificación1.setEditable(false);
        jTextAreaComentarioCalificación1.setColumns(20);
        jTextAreaComentarioCalificación1.setRows(5);
        jScrollPane3.setViewportView(jTextAreaComentarioCalificación1);

        jLabelNicknameOrigen1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelNicknameOrigen1.setText("Nickname");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/knewstuff.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/knewstuff.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/knewstuff.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/knewstuff.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/knewstuff.png"))); // NOI18N

        javax.swing.GroupLayout jPanelPlantillaReview2Layout = new javax.swing.GroupLayout(jPanelPlantillaReview2);
        jPanelPlantillaReview2.setLayout(jPanelPlantillaReview2Layout);
        jPanelPlantillaReview2Layout.setHorizontalGroup(
            jPanelPlantillaReview2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlantillaReview2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPlantillaReview2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlantillaReview2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanelPlantillaReview2Layout.createSequentialGroup()
                        .addComponent(jLabelNicknameOrigen1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(23, 23, 23))))
        );
        jPanelPlantillaReview2Layout.setVerticalGroup(
            jPanelPlantillaReview2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlantillaReview2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlantillaReview2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNicknameOrigen1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelReviewsdeotrosUsuariosLayout = new javax.swing.GroupLayout(jPanelReviewsdeotrosUsuarios);
        jPanelReviewsdeotrosUsuarios.setLayout(jPanelReviewsdeotrosUsuariosLayout);
        jPanelReviewsdeotrosUsuariosLayout.setHorizontalGroup(
            jPanelReviewsdeotrosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReviewsdeotrosUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelReviewsdeotrosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReviewsdeotrosUsuariosLayout.createSequentialGroup()
                        .addGap(0, 479, Short.MAX_VALUE)
                        .addComponent(jLabelReviewsPersonaDenunciada))
                    .addComponent(jPanelPlantillaReview1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPlantillaReview2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelReviewsdeotrosUsuariosLayout.setVerticalGroup(
            jPanelReviewsdeotrosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReviewsdeotrosUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReviewsPersonaDenunciada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPlantillaReview1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPlantillaReview2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelReviewsdeotrosUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 550, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjButtonDenunciarEntidadFisica() {
        return jButtonDenunciarEntidadFisica;
    }

    public JTextArea getjTextAreaComentarioDeDenuncia() {
        return jTextAreaComentarioDeDenuncia;
    }

    public JButton getjButtonSalirPaginaEntidadDenunciada() {
        return jButtonSalirPaginaEntidadDenunciada;
    }

    public JLabel getjLabelNombreEntidadDenunciada() {
        return jLabelNombreEntidadDenunciada;
    }

    public JLabel getjLabelCedulaJuridicaEntidadDenunciada() {
        return jLabelCedulaJuridicaEntidadDenunciada;
    }
    
     public int getResultadoCalificacion() {
        System.out.println(calificacion.getResultado());
        return calificacion.getResultado();
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
            java.util.logging.Logger.getLogger(PaginaEntidadDenunciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaEntidadDenunciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaEntidadDenunciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaEntidadDenunciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaEntidadDenunciada().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDenunciarEntidadFisica;
    private javax.swing.JButton jButtonSalirPaginaEntidadDenunciada;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCalificacionEntidadDenunciada;
    private javax.swing.JLabel jLabelCalificacióndelaDenuncia;
    private javax.swing.JLabel jLabelCedulaJuridicaEntidadDenunciada;
    private javax.swing.JLabel jLabelDeuncieEntidadDenunciada;
    private javax.swing.JLabel jLabelFotoEntidadDenunciada;
    private javax.swing.JLabel jLabelIntroCalificacioneEntidadDenunciada;
    private javax.swing.JLabel jLabelNicknameOrigen;
    private javax.swing.JLabel jLabelNicknameOrigen1;
    private javax.swing.JLabel jLabelNombreEntidadDenunciada;
    private javax.swing.JLabel jLabelPruebadelaDenuncia;
    private javax.swing.JLabel jLabelRazondelaDenuncia;
    private javax.swing.JLabel jLabelReviewsPersonaDenunciada;
    private javax.swing.JPanel jPanelDenunciayCalificaciondeUsuario;
    private javax.swing.JPanel jPanelFotoyNombreeEntidadUsuario;
    private javax.swing.JPanel jPanelPlantillaReview1;
    private javax.swing.JPanel jPanelPlantillaReview2;
    private javax.swing.JPanel jPanelReviewsdeotrosUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaComentarioCalificación;
    private javax.swing.JTextArea jTextAreaComentarioCalificación1;
    private javax.swing.JTextArea jTextAreaComentarioDeDenuncia;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarMensajeError(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null,
                mensaje,
                titulo,
                JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public String getCedula() {
        return jLabelCedulaJuridicaEntidadDenunciada.getText();
    }

    @Override
    public void setIntroCalificacion(String intro) {
        jLabelIntroCalificacioneEntidadDenunciada.setText(intro);
    }

    @Override
    public void setNombreEntidadDenunciada(String nombre) {
        jLabelNombreEntidadDenunciada.setText(nombre);
    }

    @Override
    public void setCedulaJuridicaEntidadDenunciada(String cedula) {
        jLabelCedulaJuridicaEntidadDenunciada.setText(cedula);
    }

    @Override
    public void setCalifiacionEntidadDenunciada(String calificacion) {
        jLabelCalificacionEntidadDenunciada.setText(calificacion);
    }

}
