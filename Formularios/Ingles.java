/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import Clases.Diccionario;
import Clases.Diccionario2;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class Ingles extends javax.swing.JFrame {

    /**
     * Creates new form Ingles
     */
    public Ingles() {
        initComponents();
        this.setLocationRelativeTo(null);
        bTrans();
       blok_Area();
        from_secun_visible();

        
    }
    
    public void bTrans(){
    b_cerr.setContentAreaFilled(false);
    b_cerr.setBorderPainted(false);
    b_cerr.setOpaque(false);
    b_min.setContentAreaFilled(false);
    b_min.setBorderPainted(false);
    b_min.setOpaque(false);
    b_TEI.setContentAreaFilled(false);
    b_TEI.setBorderPainted(false);
    b_TEI.setOpaque(false);
    b_TIE.setContentAreaFilled(false);
    b_TIE.setBorderPainted(false);
    b_TIE.setOpaque(false);
    b_cer2.setContentAreaFilled(false);
    b_cer2.setBorderPainted(false);
    b_cer2.setOpaque(false);
    b_info1.setContentAreaFilled(false);
    b_info1.setBorderPainted(false);
    b_info1.setOpaque(false);
    b_cerr3.setContentAreaFilled(false);
    b_cerr3.setBorderPainted(false);
    b_cerr3.setOpaque(false);
    b_info3.setContentAreaFilled(false);
    b_info3.setBorderPainted(false);
    b_info3.setOpaque(false);
    b_b.setBorderPainted(false);
    b_b.setOpaque(false);
    b_b.setContentAreaFilled(false);
    b_b2.setBorderPainted(false);
    b_b2.setOpaque(false);
    b_b2.setContentAreaFilled(false);
    b_cerr4.setContentAreaFilled(false);
    b_cerr4.setBorderPainted(false);
    b_cerr4.setOpaque(false);
    b_EjerIn.setOpaque(false);
    b_EjerIn.setContentAreaFilled(false);
    b_EjerIn.setBorderPainted(false);
    b_pdf1.setContentAreaFilled(false);
    b_pdf1.setBorderPainted(false);
    b_pdf1.setOpaque(false);
    b_pdf2.setOpaque(false);
    b_pdf2.setContentAreaFilled(false);
    b_pdf2.setBorderPainted(false);
    
    
}
    public void blok_Area(){
        jTextArea1.setEditable(false);
        jTextArea1.setEnabled(false);
    }
    public void from_secun_visible(){
        TraductorIE.setVisible(false);
        TraductorEI.setVisible(false);
        American_from.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TraductorEI = new javax.swing.JInternalFrame();
        b_cerr3 = new javax.swing.JButton();
        icon2 = new javax.swing.JLabel();
        txt_Ingles = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_espaTra = new javax.swing.JTextField();
        b_info3 = new javax.swing.JButton();
        b_Tradu3 = new javax.swing.JButton();
        b_b = new javax.swing.JButton();
        fondo3 = new javax.swing.JLabel();
        American_from = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        b_cerr4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        log_win = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        TraductorIE = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        b_cer2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_Ingles1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b_info1 = new javax.swing.JButton();
        Lab_Español = new javax.swing.JLabel();
        b_b2 = new javax.swing.JButton();
        fondo2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        b_min = new javax.swing.JButton();
        b_cerr = new javax.swing.JButton();
        b_TIE = new javax.swing.JButton();
        b_TEI = new javax.swing.JButton();
        b_EjerIn = new javax.swing.JButton();
        b_pdf1 = new javax.swing.JButton();
        b_pdf2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TraductorEI.setVisible(true);
        TraductorEI.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_cerr3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar (2).png"))); // NOI18N
        b_cerr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cerr3ActionPerformed(evt);
            }
        });
        TraductorEI.getContentPane().add(b_cerr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 40, -1));

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tema (1).png"))); // NOI18N
        TraductorEI.getContentPane().add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 70, 70));

        txt_Ingles.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        TraductorEI.getContentPane().add(txt_Ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 190, 30));

        jLabel6.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel6.setText("Español : ");
        TraductorEI.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel7.setText("Ingles :");
        TraductorEI.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        txt_espaTra.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        TraductorEI.getContentPane().add(txt_espaTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 180, 30));

        b_info3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/informacion (1).png"))); // NOI18N
        b_info3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_info3ActionPerformed(evt);
            }
        });
        TraductorEI.getContentPane().add(b_info3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 40, -1));

        b_Tradu3.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        b_Tradu3.setForeground(new java.awt.Color(153, 153, 153));
        b_Tradu3.setText("Traducir...");
        b_Tradu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_Tradu3ActionPerformed(evt);
            }
        });
        TraductorEI.getContentPane().add(b_Tradu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 110, -1));

        b_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/borrador.png"))); // NOI18N
        b_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bActionPerformed(evt);
            }
        });
        TraductorEI.getContentPane().add(b_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, -1));

        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        TraductorEI.getContentPane().add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 310));

        getContentPane().add(TraductorEI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 550, 340));

        American_from.setVisible(true);
        American_from.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Bienvenido");
        American_from.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        b_cerr4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar (2).png"))); // NOI18N
        b_cerr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cerr4ActionPerformed(evt);
            }
        });
        American_from.getContentPane().add(b_cerr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 40, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Iniciar Programa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        American_from.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        log_win.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ventanas.png"))); // NOI18N
        American_from.getContentPane().add(log_win, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 40, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("American Headway\n\n1. Requisitos mínimos del sistema\n- procesador de 400 MHz\n- Microsoft (r) Windows (r) 98, NT4 (SP 6 o superior), ME, 2000, XP\n- 64 MB de RAM\n- 50 MB de espacio libre en el disco duro\n- Velocidad de la unidad de CD-ROM 24x\n- Resolución de pantalla de 800 x 600 que muestra color de 16 bits \n\nNOTA IMPORTANTE: Si al abrirlo su pantalla se muestra totalmente negra no se \nasuste, solo esta mal configurada su resolucion de pantalla. \nUna forma rapida de solucionar la pantalla negra es aplastando la tecla \nwindows y con esto su pantalla se reajustara por si misma.\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        American_from.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 570, 210));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        American_from.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 310));

        getContentPane().add(American_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 610, 340));

        TraductorIE.setForeground(new java.awt.Color(153, 102, 0));
        TraductorIE.setVisible(true);
        TraductorIE.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tema (1).png"))); // NOI18N
        TraductorIE.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 70, 70));

        b_cer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar (2).png"))); // NOI18N
        b_cer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cer2ActionPerformed(evt);
            }
        });
        TraductorIE.getContentPane().add(b_cer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 40, -1));

        jButton3.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 153));
        jButton3.setText("Traducir...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        TraductorIE.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        txt_Ingles1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txt_Ingles1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Ingles1KeyTyped(evt);
            }
        });
        TraductorIE.getContentPane().add(txt_Ingles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 180, 30));

        jLabel2.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel2.setText("Ingles:");
        TraductorIE.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 80, 20));

        jLabel3.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel3.setText("Español : ");
        TraductorIE.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 110, -1));

        b_info1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/informacion (1).png"))); // NOI18N
        b_info1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_info1ActionPerformed(evt);
            }
        });
        TraductorIE.getContentPane().add(b_info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 30, -1));

        Lab_Español.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        TraductorIE.getContentPane().add(Lab_Español, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 270, 30));

        b_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/borrador.png"))); // NOI18N
        b_b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_b2ActionPerformed(evt);
            }
        });
        TraductorIE.getContentPane().add(b_b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 30, -1));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        TraductorIE.getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 310));

        getContentPane().add(TraductorIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, 340));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/inglaterra.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 140, 110));

        b_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/minimizar.png"))); // NOI18N
        b_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_minActionPerformed(evt);
            }
        });
        getContentPane().add(b_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 40, -1));

        b_cerr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar (2).png"))); // NOI18N
        b_cerr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cerrActionPerformed(evt);
            }
        });
        getContentPane().add(b_cerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 40, -1));

        b_TIE.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        b_TIE.setForeground(new java.awt.Color(204, 255, 255));
        b_TIE.setText("Traducir palabra de ingles a español...");
        b_TIE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_TIEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_TIEMouseExited(evt);
            }
        });
        b_TIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_TIEActionPerformed(evt);
            }
        });
        getContentPane().add(b_TIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 530, -1));

        b_TEI.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        b_TEI.setForeground(new java.awt.Color(204, 255, 255));
        b_TEI.setText("Traducir palabra de español a ingles...");
        b_TEI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_TEIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_TEIMouseExited(evt);
            }
        });
        b_TEI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_TEIActionPerformed(evt);
            }
        });
        getContentPane().add(b_TEI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 530, -1));

        b_EjerIn.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        b_EjerIn.setForeground(new java.awt.Color(204, 255, 255));
        b_EjerIn.setText("Ejercicios de ingles...");
        b_EjerIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_EjerInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_EjerInMouseExited(evt);
            }
        });
        b_EjerIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_EjerInActionPerformed(evt);
            }
        });
        getContentPane().add(b_EjerIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 360, -1));

        b_pdf1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        b_pdf1.setForeground(new java.awt.Color(204, 255, 255));
        b_pdf1.setText("Ejercicios de PDF_1...");
        b_pdf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_pdf1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_pdf1MouseExited(evt);
            }
        });
        b_pdf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pdf1ActionPerformed(evt);
            }
        });
        getContentPane().add(b_pdf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        b_pdf2.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        b_pdf2.setForeground(new java.awt.Color(204, 255, 255));
        b_pdf2.setText("Ejercicios de PDF_2...");
        b_pdf2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_pdf2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_pdf2MouseExited(evt);
            }
        });
        b_pdf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pdf2ActionPerformed(evt);
            }
        });
        getContentPane().add(b_pdf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/102.jpg"))); // NOI18N
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_cerrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cerrActionPerformed

             this.setVisible(false);
    }//GEN-LAST:event_b_cerrActionPerformed

    private void b_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_minActionPerformed
        setExtendedState(Ingles.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_b_minActionPerformed

    private void b_cer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cer2ActionPerformed
       TraductorIE.setVisible(false);
        //
       txt_Ingles1.setText("");
       Lab_Español.setText("");
    }//GEN-LAST:event_b_cer2ActionPerformed

    private void b_TIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_TIEActionPerformed
       TraductorIE.setVisible(true);
    }//GEN-LAST:event_b_TIEActionPerformed

    private void txt_Ingles1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Ingles1KeyTyped
                       char c = evt.getKeyChar();
        if (c == ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txt_Ingles1KeyTyped

    private void b_cerr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cerr3ActionPerformed
       TraductorEI.setVisible(false);
       //
       txt_espaTra.setText("");
        txt_Ingles.setText("");
    }//GEN-LAST:event_b_cerr3ActionPerformed

    private void b_TEIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_TEIActionPerformed
      //TraductorEI.setVisible(true);
                               try
{
   /* directorio/ejecutable es el path del ejecutable y un nombre */
   Process p = Runtime.getRuntime().exec ("American/traductor/sgp.exe");
}
catch (Exception e)
{
   /* Se lanza una excepción si no se encuentra en ejecutable o el fichero no es ejecutable. */
}
    }//GEN-LAST:event_b_TEIActionPerformed

    Diccionario D = new Diccionario();
       String s = "";
    private void b_Tradu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_Tradu3ActionPerformed
        s = txt_espaTra.getText();
       txt_Ingles.setText(D.traduce(s));
    }//GEN-LAST:event_b_Tradu3ActionPerformed

    private void b_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_bActionPerformed
        txt_espaTra.setText("");
        txt_Ingles.setText("");
        
    }//GEN-LAST:event_b_bActionPerformed
   // Diccionario  D = new Diccionario();
    String S = "";
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       S = txt_Ingles1.getText();
       Lab_Español.setText(D.traduce(S));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void b_b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_b2ActionPerformed
       txt_Ingles1.setText("");
       Lab_Español.setText("");
    }//GEN-LAST:event_b_b2ActionPerformed

    private void b_EjerInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_EjerInActionPerformed
      American_from.setVisible(true);

    }//GEN-LAST:event_b_EjerInActionPerformed

    private void b_cerr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cerr4ActionPerformed
        American_from.setVisible(false);
    }//GEN-LAST:event_b_cerr4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                try
{
   /* directorio/ejecutable es el path del ejecutable y un nombre */
   Process p = Runtime.getRuntime().exec ("American/start.exe");
}
catch (Exception e)
{
   /* Se lanza una excepción si no se encuentra en ejecutable o el fichero no es ejecutable. */
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_pdf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pdf1ActionPerformed
try {
     File path = new File ("PDF/American1.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_pdf1ActionPerformed

    private void b_pdf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pdf2ActionPerformed
       try {
     File path = new File ("PDF/American2.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_pdf2ActionPerformed
public void mensa(){

     JOptionPane.showMessageDialog(rootPane, "Para el buscador no hacepta espacios en blanco, \n Si desea buscar una "
               + "traducion que lleve dos palabras, \n solo escriba un '_' (guion bajo) entre la palabra.");
}
    private void b_info1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_info1ActionPerformed
      mensa();
    }//GEN-LAST:event_b_info1ActionPerformed

    private void b_info3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_info3ActionPerformed
       mensa();
    }//GEN-LAST:event_b_info3ActionPerformed

    private void b_pdf1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_pdf1MouseEntered
      b_pdf1.setForeground(Color.orange);
    }//GEN-LAST:event_b_pdf1MouseEntered

    private void b_pdf2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_pdf2MouseEntered
       b_pdf2.setForeground(Color.orange);
    }//GEN-LAST:event_b_pdf2MouseEntered

    private void b_EjerInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_EjerInMouseEntered
       b_EjerIn.setForeground(Color.orange);
    }//GEN-LAST:event_b_EjerInMouseEntered

    private void b_TIEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_TIEMouseEntered
        b_TIE.setForeground(Color.orange);
    }//GEN-LAST:event_b_TIEMouseEntered

    private void b_TEIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_TEIMouseEntered
       b_TEI.setForeground(Color.orange);
    }//GEN-LAST:event_b_TEIMouseEntered

    private void b_pdf1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_pdf1MouseExited
       b_pdf1.setForeground(new Color(204,255,255));
    }//GEN-LAST:event_b_pdf1MouseExited

    private void b_pdf2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_pdf2MouseExited
       b_pdf2.setForeground(new Color(204,255,255));
    }//GEN-LAST:event_b_pdf2MouseExited

    private void b_EjerInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_EjerInMouseExited
      b_EjerIn.setForeground(new Color(204,255,255));
    }//GEN-LAST:event_b_EjerInMouseExited

    private void b_TIEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_TIEMouseExited
      b_TIE.setForeground(new Color(204,255,255));
    }//GEN-LAST:event_b_TIEMouseExited

    private void b_TEIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_TEIMouseExited
       b_TEI.setForeground(new Color(204,255,255));
    }//GEN-LAST:event_b_TEIMouseExited

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
            java.util.logging.Logger.getLogger(Ingles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame American_from;
    private javax.swing.JLabel Lab_Español;
    private javax.swing.JInternalFrame TraductorEI;
    private javax.swing.JInternalFrame TraductorIE;
    private javax.swing.JButton b_EjerIn;
    private javax.swing.JButton b_TEI;
    private javax.swing.JButton b_TIE;
    private javax.swing.JButton b_Tradu3;
    private javax.swing.JButton b_b;
    private javax.swing.JButton b_b2;
    private javax.swing.JButton b_cer2;
    private javax.swing.JButton b_cerr;
    private javax.swing.JButton b_cerr3;
    private javax.swing.JButton b_cerr4;
    private javax.swing.JButton b_info1;
    private javax.swing.JButton b_info3;
    private javax.swing.JButton b_min;
    private javax.swing.JButton b_pdf1;
    private javax.swing.JButton b_pdf2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondo3;
    private javax.swing.JLabel icon2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel log_win;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel txt_Ingles;
    private javax.swing.JTextField txt_Ingles1;
    private javax.swing.JTextField txt_espaTra;
    // End of variables declaration//GEN-END:variables
}