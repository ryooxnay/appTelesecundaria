/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class Fisica extends javax.swing.JFrame {

    /**
     * Creates new form Fisica
     */
    public Fisica() {
        initComponents();
        this.setLocationRelativeTo(null);
        butonTrans();
    }
public void butonTrans(){
    b_cerr.setOpaque(false); b_cerr.setBorderPainted(false); b_cerr.setContentAreaFilled(false);
    b_min.setOpaque(false); b_min.setBorderPainted(false); b_min.setContentAreaFilled(false);
    b_Ene.setOpaque(false); b_Ene.setBorderPainted(false); b_Ene.setContentAreaFilled(false);
    b_cine.setOpaque(false); b_cine.setBorderPainted(false); b_cine.setContentAreaFilled(false);
    b_din.setOpaque(false); b_din.setBorderPainted(false); b_din.setContentAreaFilled(false);
    Ejer_Cin.setOpaque(false); Ejer_Cin.setBorderPainted(false); Ejer_Cin.setContentAreaFilled(false);
    Ejer_Ener.setOpaque(false); Ejer_Ener.setBorderPainted(false); Ejer_Ener.setContentAreaFilled(false);
    Ejer_din.setOpaque(false); Ejer_din.setBorderPainted(false); Ejer_din.setContentAreaFilled(false);  
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_min = new javax.swing.JButton();
        b_cerr = new javax.swing.JButton();
        b_cine = new javax.swing.JButton();
        b_din = new javax.swing.JButton();
        b_Ene = new javax.swing.JButton();
        Ejer_Cin = new javax.swing.JButton();
        Ejer_din = new javax.swing.JButton();
        Ejer_Ener = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/minimizar.png"))); // NOI18N
        b_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_minActionPerformed(evt);
            }
        });
        getContentPane().add(b_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 40, -1));

        b_cerr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar (2).png"))); // NOI18N
        b_cerr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cerrActionPerformed(evt);
            }
        });
        getContentPane().add(b_cerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 40, -1));

        b_cine.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        b_cine.setForeground(new java.awt.Color(0, 0, 204));
        b_cine.setText("Cinemática");
        b_cine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_cineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_cineMouseExited(evt);
            }
        });
        b_cine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cineActionPerformed(evt);
            }
        });
        getContentPane().add(b_cine, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 170, -1));

        b_din.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        b_din.setForeground(new java.awt.Color(0, 0, 204));
        b_din.setText("Dinámica");
        b_din.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_dinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_dinMouseExited(evt);
            }
        });
        b_din.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_dinActionPerformed(evt);
            }
        });
        getContentPane().add(b_din, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 150, -1));

        b_Ene.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        b_Ene.setForeground(new java.awt.Color(0, 0, 204));
        b_Ene.setText("Energía");
        b_Ene.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_EneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_EneMouseExited(evt);
            }
        });
        b_Ene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_EneActionPerformed(evt);
            }
        });
        getContentPane().add(b_Ene, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 140, -1));

        Ejer_Cin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/matematicas_1.png"))); // NOI18N
        Ejer_Cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejer_CinActionPerformed(evt);
            }
        });
        getContentPane().add(Ejer_Cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        Ejer_din.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/matematicas_1.png"))); // NOI18N
        Ejer_din.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejer_dinActionPerformed(evt);
            }
        });
        getContentPane().add(Ejer_din, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        Ejer_Ener.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/matematicas_1.png"))); // NOI18N
        Ejer_Ener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejer_EnerActionPerformed(evt);
            }
        });
        getContentPane().add(Ejer_Ener, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/asistencia-sanitaria-y-medica.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pizarr_gris.jpg"))); // NOI18N
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 1060, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_cerrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cerrActionPerformed
    this.setVisible(false);
    SegundoAnio SA = new SegundoAnio();
    SA.setVisible(true);
    }//GEN-LAST:event_b_cerrActionPerformed

    private void b_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_minActionPerformed
    setExtendedState(Fisica.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_b_minActionPerformed

    private void b_cineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cineActionPerformed
   try {
     File path = new File ("SegundoAño/Fisica/Tema5.ppt");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_cineActionPerformed

    private void b_dinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_dinActionPerformed
      try {
     File path = new File ("SegundoAño/Fisica/Tema6.ppt");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_dinActionPerformed

    private void b_EneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_EneActionPerformed
       try {
     File path = new File ("SegundoAño/Fisica/Tema7.ppt");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_EneActionPerformed

    private void Ejer_CinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejer_CinActionPerformed
      try {
     File path = new File ("SegundoAño/Fisica/Tema5.doc");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_Ejer_CinActionPerformed

    private void Ejer_dinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejer_dinActionPerformed
     try {
     File path = new File ("SegundoAño/Fisica/Tema6.doc");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_Ejer_dinActionPerformed

    private void Ejer_EnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejer_EnerActionPerformed
    try {
     File path = new File ("SegundoAño/Fisica/Tema7.doc");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_Ejer_EnerActionPerformed

    private void b_cineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cineMouseEntered
    
        b_cine.setForeground(Color.green);
    }//GEN-LAST:event_b_cineMouseEntered

    private void b_dinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_dinMouseEntered
        b_din.setForeground(Color.green);
    }//GEN-LAST:event_b_dinMouseEntered

    private void b_EneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_EneMouseEntered
     b_Ene.setForeground(Color.green);
    }//GEN-LAST:event_b_EneMouseEntered

    private void b_cineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cineMouseExited
        b_cine.setForeground(new Color(0,0,204));
    }//GEN-LAST:event_b_cineMouseExited

    private void b_dinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_dinMouseExited
       b_din.setForeground(new Color(0,0,204));
    }//GEN-LAST:event_b_dinMouseExited

    private void b_EneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_EneMouseExited
       b_Ene.setForeground(new Color(0,0,204));
    }//GEN-LAST:event_b_EneMouseExited

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
            java.util.logging.Logger.getLogger(Fisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fisica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ejer_Cin;
    private javax.swing.JButton Ejer_Ener;
    private javax.swing.JButton Ejer_din;
    private javax.swing.JButton b_Ene;
    private javax.swing.JButton b_cerr;
    private javax.swing.JButton b_cine;
    private javax.swing.JButton b_din;
    private javax.swing.JButton b_min;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
