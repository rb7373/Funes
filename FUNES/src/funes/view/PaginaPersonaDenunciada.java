/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import funes.controller.ControladorPaginaPersonaDenunciada;
import funes.model.Model;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class PaginaPersonaDenunciada extends javax.swing.JFrame implements IPaginaPersonaDenunciada {

    private ControladorPaginaPersonaDenunciada Controlador;
    private PanelCalificacion calificacion = new PanelCalificacion();
    
     public PaginaPersonaDenunciada(Model modelo) {
        initComponents();
        calificacion = new PanelCalificacion();
        jPanelDenunciayCalificaciondeEntidad.add(calificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
         
        setSize(932, 559);
        Controlador = new ControladorPaginaPersonaDenunciada(modelo, this);
        vincularEventos();

    }

    public PaginaPersonaDenunciada() {
        initComponents();
        
        jPanelDenunciayCalificaciondeEntidad.add(calificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        //setResultadoCalificacion( calificacion.getResultado());
        setSize(932, 559);
        
        //getContentPane()
        //setSize(600, 600);
        //jLabelFotoPersonaDenunciada.setIcon(new javax.swing.ImageIcon(getClass().getResource()));
//        JFileChooser c = new JFileChooser();
//        // Demonstrate "Save" dialog:
//        int rVal = c.showSaveDialog(this);
//        if (rVal == JFileChooser.APPROVE_OPTION) {
//            try {
//                System.out.println(c.getSelectedFile().getPath());
//                System.out.println(c.getSelectedFile().getCanonicalPath());
//                System.out.println(c.getCurrentDirectory().toString());
//            }
//            
//            catch (IOException ex) {
//                System.out.println("Error");
//            }
//        }
        //jLabelFotoPersonaDenunciada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook_no_profile_pic2-jpg.gif")));
    }

    public int getResultadoCalificacion() {
        System.out.println(calificacion.getResultado());
        return calificacion.getResultado();
    }

    @Override
    public void vincularEventos() {
        jButtonDenunciarPersonaFisica.addActionListener(Controlador);
        jButtonSalirPaginaPersonaDenunciada.addActionListener(Controlador);

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

        jPanelFotoyNombrePersonaDeunciada = new javax.swing.JPanel();
        jLabelFotoPersonaDenunciada = new javax.swing.JLabel();
        jLabelNombrePersonaDenunciada = new javax.swing.JLabel();
        jLabelCedulaPersonaDenunciada = new javax.swing.JLabel();
        jLabelEdadPersonaDenunciada = new javax.swing.JLabel();
        jLabelInstitucionDondeLaboraPersonaDenunciada = new javax.swing.JLabel();
        jLabelCargoPersonaDenunciada = new javax.swing.JLabel();
        jButtonSalirPaginaPersonaDenunciada = new javax.swing.JButton();
        jLabelCalifiacionPersonaDenunciada = new javax.swing.JLabel();
        jLabeLIntroCalificacion = new javax.swing.JLabel();
        jPanelDenunciayCalificaciondeEntidad = new javax.swing.JPanel();
        jLabelDeunciePersonaDenunciada = new javax.swing.JLabel();
        jLabelRazondelaDenuncia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaComentarioDeDenuncia = new javax.swing.JTextArea();
        jLabelPruebadelaDenuncia = new javax.swing.JLabel();
        jLabelCalificacióndelaDenuncia = new javax.swing.JLabel();
        jButtonDenunciarPersonaFisica = new javax.swing.JButton();
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
        setBackground(new java.awt.Color(255, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFotoyNombrePersonaDeunciada.setBackground(new java.awt.Color(102, 0, 102));
        jPanelFotoyNombrePersonaDeunciada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelFotoPersonaDenunciada.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFotoPersonaDenunciada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/facebook_no_profile_pic2-jpg.gif"))); // NOI18N
        jLabelFotoPersonaDenunciada.setBorder(new javax.swing.border.MatteBorder(null));

        jLabelNombrePersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombrePersonaDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombrePersonaDenunciada.setText("Nombre Completo");

        jLabelCedulaPersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCedulaPersonaDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCedulaPersonaDenunciada.setText("Cédula");

        jLabelEdadPersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEdadPersonaDenunciada.setForeground(new java.awt.Color(255, 255, 255));

        jLabelInstitucionDondeLaboraPersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelInstitucionDondeLaboraPersonaDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInstitucionDondeLaboraPersonaDenunciada.setText("Institición donde labora");

        jLabelCargoPersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCargoPersonaDenunciada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCargoPersonaDenunciada.setText("Cargo");

        jButtonSalirPaginaPersonaDenunciada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/Button-Close-icon_1.png"))); // NOI18N
        jButtonSalirPaginaPersonaDenunciada.setBorder(null);
        jButtonSalirPaginaPersonaDenunciada.setContentAreaFilled(false);

        jLabelCalifiacionPersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCalifiacionPersonaDenunciada.setForeground(new java.awt.Color(255, 255, 255));

        jLabeLIntroCalificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeLIntroCalificacion.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelFotoyNombrePersonaDeunciadaLayout = new javax.swing.GroupLayout(jPanelFotoyNombrePersonaDeunciada);
        jPanelFotoyNombrePersonaDeunciada.setLayout(jPanelFotoyNombrePersonaDeunciadaLayout);
        jPanelFotoyNombrePersonaDeunciadaLayout.setHorizontalGroup(
            jPanelFotoyNombrePersonaDeunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabelFotoPersonaDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createSequentialGroup()
                        .addComponent(jLabelNombrePersonaDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                        .addComponent(jButtonSalirPaginaPersonaDenunciada))
                    .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createSequentialGroup()
                        .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createSequentialGroup()
                                .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelCargoPersonaDenunciada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelInstitucionDondeLaboraPersonaDenunciada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelEdadPersonaDenunciada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelCedulaPersonaDenunciada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFotoyNombrePersonaDeunciadaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabeLIntroCalificacion)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCalifiacionPersonaDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addContainerGap())
        );
        jPanelFotoyNombrePersonaDeunciadaLayout.setVerticalGroup(
            jPanelFotoyNombrePersonaDeunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelNombrePersonaDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCedulaPersonaDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEdadPersonaDenunciada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInstitucionDondeLaboraPersonaDenunciada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCargoPersonaDenunciada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFotoyNombrePersonaDeunciadaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalirPaginaPersonaDenunciada)
                    .addGroup(jPanelFotoyNombrePersonaDeunciadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabeLIntroCalificacion)
                        .addComponent(jLabelFotoPersonaDenunciada, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCalifiacionPersonaDenunciada)))
                .addContainerGap())
        );

        getContentPane().add(jPanelFotoyNombrePersonaDeunciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 923, -1));

        jPanelDenunciayCalificaciondeEntidad.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDenunciayCalificaciondeEntidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDenunciayCalificaciondeEntidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDeunciePersonaDenunciada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDeunciePersonaDenunciada.setText("Denúncie");
        jPanelDenunciayCalificaciondeEntidad.add(jLabelDeunciePersonaDenunciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 13, -1, -1));

        jLabelRazondelaDenuncia.setText("Razón: ");
        jPanelDenunciayCalificaciondeEntidad.add(jLabelRazondelaDenuncia, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 38, -1, -1));

        jTextAreaComentarioDeDenuncia.setColumns(20);
        jTextAreaComentarioDeDenuncia.setRows(5);
        jScrollPane1.setViewportView(jTextAreaComentarioDeDenuncia);

        jPanelDenunciayCalificaciondeEntidad.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, 330, 107));

        jLabelPruebadelaDenuncia.setText("Prueba:");
        jPanelDenunciayCalificaciondeEntidad.add(jLabelPruebadelaDenuncia, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 183, -1, -1));

        jLabelCalificacióndelaDenuncia.setText("Calificación:");
        jPanelDenunciayCalificaciondeEntidad.add(jLabelCalificacióndelaDenuncia, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 225, -1, -1));

        jButtonDenunciarPersonaFisica.setText("Denunciar");
        jPanelDenunciayCalificaciondeEntidad.add(jButtonDenunciarPersonaFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        getContentPane().add(jPanelDenunciayCalificaciondeEntidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 370, 378));

        jPanelReviewsdeotrosUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelReviewsdeotrosUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
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
                .addGroup(jPanelReviewsdeotrosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReviewsdeotrosUsuariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelReviewsPersonaDenunciada))
                    .addComponent(jPanelPlantillaReview2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPlantillaReview1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelReviewsdeotrosUsuariosLayout.setVerticalGroup(
            jPanelReviewsdeotrosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReviewsdeotrosUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReviewsPersonaDenunciada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanelPlantillaReview1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPlantillaReview2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        getContentPane().add(jPanelReviewsdeotrosUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, 378));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjButtonDenunciarPersonaFisica() {
        return jButtonDenunciarPersonaFisica;
    }

    public JTextArea getjTextAreaComentarioDeDenuncia() {
        return jTextAreaComentarioDeDenuncia;
    }

    public JButton getjButtonSalirPaginaPersonaDenunciada() {
        return jButtonSalirPaginaPersonaDenunciada;
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
            java.util.logging.Logger.getLogger(PaginaPersonaDenunciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPersonaDenunciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPersonaDenunciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPersonaDenunciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPersonaDenunciada().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDenunciarPersonaFisica;
    private javax.swing.JButton jButtonSalirPaginaPersonaDenunciada;
    private javax.swing.JLabel jLabeLIntroCalificacion;
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
    private javax.swing.JLabel jLabelCalifiacionPersonaDenunciada;
    private javax.swing.JLabel jLabelCalificacióndelaDenuncia;
    private javax.swing.JLabel jLabelCargoPersonaDenunciada;
    private javax.swing.JLabel jLabelCedulaPersonaDenunciada;
    private javax.swing.JLabel jLabelDeunciePersonaDenunciada;
    private javax.swing.JLabel jLabelEdadPersonaDenunciada;
    private javax.swing.JLabel jLabelFotoPersonaDenunciada;
    private javax.swing.JLabel jLabelInstitucionDondeLaboraPersonaDenunciada;
    private javax.swing.JLabel jLabelNicknameOrigen;
    private javax.swing.JLabel jLabelNicknameOrigen1;
    private javax.swing.JLabel jLabelNombrePersonaDenunciada;
    private javax.swing.JLabel jLabelPruebadelaDenuncia;
    private javax.swing.JLabel jLabelRazondelaDenuncia;
    private javax.swing.JLabel jLabelReviewsPersonaDenunciada;
    private javax.swing.JPanel jPanelDenunciayCalificaciondeEntidad;
    private javax.swing.JPanel jPanelFotoyNombrePersonaDeunciada;
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
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void setNombrePersonaDenunciada(String nombre) {
        jLabelNombrePersonaDenunciada.setText(nombre);
    }

    @Override
    public void setCedulaPersonaDenunciada(String cedula) {
        jLabelCedulaPersonaDenunciada.setText(cedula);
    }

    @Override
    public void setEdadPersonaDenunciada(String edad) {
        jLabelEdadPersonaDenunciada.setText(edad);
    }

    @Override
    public void setLugarDondeLaboraPersonaDenunciada(String lugar) {
        jLabelInstitucionDondeLaboraPersonaDenunciada.setText(lugar);
    }

    @Override
    public void setCargoPersonaDenunciada(String cargo) {
        jLabelCargoPersonaDenunciada.setText(cargo);
    }

    @Override
    public void setCalifiacionPersonaDenunciada(String calificacion) {
        jLabelCalifiacionPersonaDenunciada.setText(calificacion);
    }

    @Override
    public void setIntroCalificacion(String intro) {
        jLabeLIntroCalificacion.setText(intro);
    }

    @Override
    public String  getNombreCompleto() {
        return jLabelNombrePersonaDenunciada.getText();
    }

    @Override
    public String getCedula() {
        return jLabelCedulaPersonaDenunciada.getText();
    }

  
}
