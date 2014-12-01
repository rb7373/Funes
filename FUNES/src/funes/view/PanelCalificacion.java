/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

import javax.swing.ImageIcon;

/**
 *
 * @author Trei
 */
public class PanelCalificacion extends javax.swing.JPanel {

    private int resultado;
    
    
    public static ImageIcon starOff = createImageIcon("/funes/view/imagenes/star_off.png");
    public static ImageIcon starOn = createImageIcon("/funes/view/imagenes/star_on.png");
    
    public PanelCalificacion() {
        initComponents();
        resultado = 0;
    }   

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
      
    public void changeStar1(){
        jLabelStar1.setIcon(starOn);
        jLabelStar2.setIcon(starOff);
        jLabelStar3.setIcon(starOff);
        jLabelStar4.setIcon(starOff);
        jLabelStar5.setIcon(starOff);
        jLabelStar6.setIcon(starOff);
        jLabelStar7.setIcon(starOff);
        jLabelStar8.setIcon(starOff);
        jLabelStar9.setIcon(starOff);
        jLabelStar10.setIcon(starOff);
        setResultado(1);
        System.out.println("Calificación PANEL: " + resultado);
    }

    public void changeStar2() {

        jLabelStar1.setIcon(starOn);
        jLabelStar2.setIcon(starOn);
        jLabelStar3.setIcon(starOff);
        jLabelStar4.setIcon(starOff);
        jLabelStar5.setIcon(starOff);
        jLabelStar6.setIcon(starOff);
        jLabelStar7.setIcon(starOff);
        jLabelStar8.setIcon(starOff);
        jLabelStar9.setIcon(starOff);
        jLabelStar10.setIcon(starOff);
         setResultado(2);
        System.out.println("Calificación " + resultado);

    }

    public void changeStar3() {
        jLabelStar1.setIcon(starOn);
        jLabelStar2.setIcon(starOn);
        jLabelStar3.setIcon(starOn);
        jLabelStar4.setIcon(starOff);
        jLabelStar5.setIcon(starOff);
        jLabelStar6.setIcon(starOff);
        jLabelStar7.setIcon(starOff);
        jLabelStar8.setIcon(starOff);
        jLabelStar9.setIcon(starOff);
        jLabelStar10.setIcon(starOff);
        setResultado(3);
        System.out.println("Calificación " + resultado);
    }

    public void changeStar4() {
        jLabelStar1.setIcon(starOn);
        jLabelStar2.setIcon(starOn);
        jLabelStar3.setIcon(starOn);
        jLabelStar4.setIcon(starOn);
        jLabelStar5.setIcon(starOff);
        jLabelStar6.setIcon(starOff);
        jLabelStar7.setIcon(starOff);
        jLabelStar8.setIcon(starOff);
        jLabelStar9.setIcon(starOff);
        jLabelStar10.setIcon(starOff);
        setResultado(4);
        System.out.println("Calificación " + resultado);
    }

    public void changeStar5() {
        jLabelStar1.setIcon(starOn);
        jLabelStar2.setIcon(starOn);
        jLabelStar3.setIcon(starOn);
        jLabelStar4.setIcon(starOn);
        jLabelStar5.setIcon(starOn);
        jLabelStar6.setIcon(starOff);
        jLabelStar7.setIcon(starOff);
        jLabelStar8.setIcon(starOff);
        jLabelStar9.setIcon(starOff);
        jLabelStar10.setIcon(starOff);
        setResultado(5);
        System.out.println("Calificación " + resultado);
    }

    public void changeStar6() {
        jLabelStar1.setIcon(starOn);
        jLabelStar2.setIcon(starOn);
        jLabelStar3.setIcon(starOn);
        jLabelStar4.setIcon(starOn);
        jLabelStar5.setIcon(starOn);
        jLabelStar6.setIcon(starOn);
        jLabelStar7.setIcon(starOff);
        jLabelStar8.setIcon(starOff);
        jLabelStar9.setIcon(starOff);
        jLabelStar10.setIcon(starOff);
        setResultado(6);
        System.out.println("Calificación " + resultado);
    }

    public void changeStar7() {
        jLabelStar1.setIcon(starOn);
        jLabelStar2.setIcon(starOn);
        jLabelStar3.setIcon(starOn);
        jLabelStar4.setIcon(starOn);
        jLabelStar5.setIcon(starOn);
        jLabelStar6.setIcon(starOn);
        jLabelStar7.setIcon(starOn);
        jLabelStar8.setIcon(starOff);
        jLabelStar9.setIcon(starOff);
        jLabelStar10.setIcon(starOff);
        setResultado(7);
        System.out.println("Calificación " + resultado);
    }

    public void changeStar8() {
        jLabelStar1.setIcon(starOn);
        jLabelStar2.setIcon(starOn);
        jLabelStar3.setIcon(starOn);
        jLabelStar4.setIcon(starOn);
        jLabelStar5.setIcon(starOn);
        jLabelStar6.setIcon(starOn);
        jLabelStar7.setIcon(starOn);
        jLabelStar8.setIcon(starOn);
        jLabelStar9.setIcon(starOff);
        jLabelStar10.setIcon(starOff);
        setResultado(8);
        System.out.println("Calificación " + resultado);
    }

    public void changeStar9() {
        jLabelStar1.setIcon(starOn);
        jLabelStar2.setIcon(starOn);
        jLabelStar3.setIcon(starOn);
        jLabelStar4.setIcon(starOn);
        jLabelStar5.setIcon(starOn);
        jLabelStar6.setIcon(starOn);
        jLabelStar7.setIcon(starOn);
        jLabelStar8.setIcon(starOn);
        jLabelStar9.setIcon(starOn);
        jLabelStar10.setIcon(starOff);
        setResultado(9);
        System.out.println("Calificación " + resultado);
    }

    public void changeStar10() {
        jLabelStar1.setIcon(starOn);
        jLabelStar2.setIcon(starOn);
        jLabelStar3.setIcon(starOn);
        jLabelStar4.setIcon(starOn);
        jLabelStar5.setIcon(starOn);
        jLabelStar6.setIcon(starOn);
        jLabelStar7.setIcon(starOn);
        jLabelStar8.setIcon(starOn);
        jLabelStar9.setIcon(starOn);
        jLabelStar10.setIcon(starOn);
        setResultado(10);
        System.out.println("Calificación " + resultado);
    }

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = PanelCalificacion.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelStar1 = new javax.swing.JLabel();
        jLabelStar2 = new javax.swing.JLabel();
        jLabelStar3 = new javax.swing.JLabel();
        jLabelStar4 = new javax.swing.JLabel();
        jLabelStar5 = new javax.swing.JLabel();
        jLabelStar6 = new javax.swing.JLabel();
        jLabelStar7 = new javax.swing.JLabel();
        jLabelStar8 = new javax.swing.JLabel();
        jLabelStar9 = new javax.swing.JLabel();
        jLabelStar10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/star_off.png"))); // NOI18N
        jLabelStar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelStar1MouseReleased(evt);
            }
        });
        add(jLabelStar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/star_off.png"))); // NOI18N
        jLabelStar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelStar2MouseReleased(evt);
            }
        });
        add(jLabelStar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jLabelStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/star_off.png"))); // NOI18N
        jLabelStar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelStar3MouseReleased(evt);
            }
        });
        add(jLabelStar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabelStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/star_off.png"))); // NOI18N
        jLabelStar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelStar4MouseReleased(evt);
            }
        });
        add(jLabelStar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        jLabelStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/star_off.png"))); // NOI18N
        jLabelStar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelStar5MouseReleased(evt);
            }
        });
        add(jLabelStar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jLabelStar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/star_off.png"))); // NOI18N
        jLabelStar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelStar6MouseReleased(evt);
            }
        });
        add(jLabelStar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jLabelStar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/star_off.png"))); // NOI18N
        jLabelStar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelStar7MouseReleased(evt);
            }
        });
        add(jLabelStar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        jLabelStar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/star_off.png"))); // NOI18N
        jLabelStar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelStar8MouseReleased(evt);
            }
        });
        add(jLabelStar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jLabelStar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/star_off.png"))); // NOI18N
        jLabelStar9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelStar9MouseReleased(evt);
            }
        });
        add(jLabelStar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        jLabelStar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funes/view/imagenes/star_off.png"))); // NOI18N
        jLabelStar10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelStar10MouseReleased(evt);
            }
        });
        add(jLabelStar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelStar1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStar1MouseReleased
        changeStar1();
    }//GEN-LAST:event_jLabelStar1MouseReleased

    private void jLabelStar2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStar2MouseReleased
        changeStar2();
    }//GEN-LAST:event_jLabelStar2MouseReleased

    private void jLabelStar3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStar3MouseReleased
        changeStar3();
    }//GEN-LAST:event_jLabelStar3MouseReleased

    private void jLabelStar4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStar4MouseReleased
        changeStar4();
    }//GEN-LAST:event_jLabelStar4MouseReleased

    private void jLabelStar5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStar5MouseReleased
        changeStar5();
    }//GEN-LAST:event_jLabelStar5MouseReleased

    private void jLabelStar6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStar6MouseReleased
        changeStar6();
    }//GEN-LAST:event_jLabelStar6MouseReleased

    private void jLabelStar7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStar7MouseReleased
        changeStar7();
    }//GEN-LAST:event_jLabelStar7MouseReleased

    private void jLabelStar8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStar8MouseReleased
        changeStar8();
    }//GEN-LAST:event_jLabelStar8MouseReleased

    private void jLabelStar9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStar9MouseReleased
        changeStar9();
    }//GEN-LAST:event_jLabelStar9MouseReleased

    private void jLabelStar10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStar10MouseReleased
        changeStar10();
    }//GEN-LAST:event_jLabelStar10MouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelStar1;
    private javax.swing.JLabel jLabelStar10;
    private javax.swing.JLabel jLabelStar2;
    private javax.swing.JLabel jLabelStar3;
    private javax.swing.JLabel jLabelStar4;
    private javax.swing.JLabel jLabelStar5;
    private javax.swing.JLabel jLabelStar6;
    private javax.swing.JLabel jLabelStar7;
    private javax.swing.JLabel jLabelStar8;
    private javax.swing.JLabel jLabelStar9;
    // End of variables declaration//GEN-END:variables
}
