/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Capitales;
import Clases.Capitales2;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class Geografia extends javax.swing.JFrame {

    /**
     * Creates new form Geografia
     */
    public Geografia() {
        initComponents();
        this.setLocationRelativeTo(null);
        buttonTrans();
        txt1.setVisible(false);
        txt2.setVisible(false);
        lb1.setVisible(false);
        lb2.setVisible(false);
        b_cap1.setVisible(false);
        b_cap2.setVisible(false);
       
        
    }
    public void buttonTrans(){
        b_cerr.setContentAreaFilled(false);b_cerr.setOpaque(false); b_cerr.setBorderPainted(false);
        b_min.setContentAreaFilled(false);b_min.setOpaque(false); b_min.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);jButton1.setOpaque(false); jButton1.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);jButton2.setOpaque(false); jButton2.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);jButton3.setOpaque(false); jButton3.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);jButton4.setOpaque(false); jButton4.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);jButton5.setOpaque(false); jButton5.setBorderPainted(false);
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_cerr = new javax.swing.JButton();
        b_min = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        b_cap1 = new javax.swing.JButton();
        b_cap2 = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        lb2 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_cerr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar (2).png"))); // NOI18N
        b_cerr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cerrActionPerformed(evt);
            }
        });
        getContentPane().add(b_cerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 40, -1));

        b_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/minimizar.png"))); // NOI18N
        getContentPane().add(b_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 40, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Botánica");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Geografia");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Cuestionario de geografia");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Buscar una cápital de México");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Buscar una cápital en el mundo");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        b_cap1.setBackground(new java.awt.Color(204, 102, 0));
        b_cap1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_cap1.setForeground(new java.awt.Color(255, 255, 255));
        b_cap1.setText("Buscar Cápital");
        b_cap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cap1ActionPerformed(evt);
            }
        });
        getContentPane().add(b_cap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 140, 30));

        b_cap2.setBackground(new java.awt.Color(204, 102, 0));
        b_cap2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_cap2.setForeground(new java.awt.Color(255, 255, 255));
        b_cap2.setText(" Buscar Cápital");
        b_cap2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cap2ActionPerformed(evt);
            }
        });
        getContentPane().add(b_cap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 140, 30));

        txt2.setBackground(new java.awt.Color(51, 51, 51));
        txt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt2.setForeground(new java.awt.Color(204, 255, 255));
        txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 160, 30));

        txt1.setBackground(new java.awt.Color(51, 51, 51));
        txt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt1.setForeground(new java.awt.Color(204, 255, 255));
        txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 170, 30));

        lb2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 220, 30));

        lb1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/geo2.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_cerrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cerrActionPerformed
     this.setVisible(false);
     PrimerAnio Pr = new PrimerAnio();
     Pr.setVisible(true);
    }//GEN-LAST:event_b_cerrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try {
     File path = new File ("PrimerAño/Geografia/Botanica.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
     File path = new File ("PrimerAño/Geografia/Geografia.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      txt1.setVisible(true); lb1.setVisible(true); b_cap1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try {
     File path = new File ("PrimerAño/Geografia/P_Geo.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    txt2.setVisible(true); lb2.setVisible(true); b_cap2.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed
        Capitales C1 = new Capitales();
        String S = "";
    private void b_cap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cap1ActionPerformed
    S = txt1.getText();
       lb1.setText(C1.traduce(S));
    }//GEN-LAST:event_b_cap1ActionPerformed
    Capitales2 C2 = new Capitales2();
    
    private void b_cap2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cap2ActionPerformed
     S = txt2.getText();
       lb2.setText(C1.traduce(S));
    }//GEN-LAST:event_b_cap2ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       jButton1.setForeground(new Color(204,153,0));
       
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
     jButton2.setForeground(new Color(204,153,0));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
     jButton3.setForeground(new Color(204,153,0));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
    jButton4.setForeground(new Color(204,153,0));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
     jButton5.setForeground(new Color(204,153,0));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
    jButton1.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
    jButton2.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
    jButton4.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
    jButton5.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
    jButton3.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jButton3MouseExited

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
            java.util.logging.Logger.getLogger(Geografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Geografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Geografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Geografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Geografia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cap1;
    private javax.swing.JButton b_cap2;
    private javax.swing.JButton b_cerr;
    private javax.swing.JButton b_min;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
