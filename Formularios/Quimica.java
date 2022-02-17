package Formularios;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Quimica extends javax.swing.JFrame {

    /**
     * Creates new form Quimica
     */
    public Quimica() {
        initComponents();
        this.setLocationRelativeTo(null);
        botTran();
        TablaPerr.setVisible(false);
    }
    public void botTran(){
      b_QuiEjer1.setContentAreaFilled(false);
      b_QuiEjer1.setBorderPainted(false);
      b_QuiEjer1.setOpaque(false);
      b_QuiEjer2.setContentAreaFilled(false);
      b_QuiEjer2.setBorderPainted(false);
      b_QuiEjer2.setOpaque(false);
      b_QuiEjer3.setContentAreaFilled(false);
      b_QuiEjer3.setBorderPainted(false);
      b_QuiEjer3.setOpaque(false);
      b_EjerRe.setContentAreaFilled(false);
      b_EjerRe.setBorderPainted(false);
      b_EjerRe.setOpaque(false);
      b_IrTabla.setContentAreaFilled(false);
      b_IrTabla.setBorderPainted(false);
      b_IrTabla.setOpaque(false);
      b_Quimi.setContentAreaFilled(false);
      b_Quimi.setBorderPainted(false);
      b_Quimi.setOpaque(false);
      b_Reacc.setContentAreaFilled(false);
      b_Reacc.setBorderPainted(false);
      b_Reacc.setOpaque(false);
      b_atomo.setContentAreaFilled(false);
      b_atomo.setBorderPainted(false);
      b_atomo.setOpaque(false);
      b_atomo2.setContentAreaFilled(false);
      b_atomo2.setBorderPainted(false);
      b_atomo2.setOpaque(false);
      b_atomoEjer2.setContentAreaFilled(false);
      b_atomoEjer2.setBorderPainted(false);
      b_atomoEjer2.setOpaque(false);
      b_cer2.setContentAreaFilled(false);
      b_cer2.setBorderPainted(false);
      b_cer2.setOpaque(false);
      b_cerr.setContentAreaFilled(false);
      b_cerr.setBorderPainted(false);
      b_cerr.setOpaque(false);
      b_ejerAtomo.setContentAreaFilled(false);
      b_ejerAtomo.setBorderPainted(false);
      b_ejerAtomo.setOpaque(false);
      b_min.setContentAreaFilled(false);
      b_min.setBorderPainted(false);
      b_min.setOpaque(false);
//      TablaPerr.setOpaque(false);
//      TablaPerr.setBorder(null);
      H.setContentAreaFilled(false);
      H.setBorderPainted(false);
      H.setOpaque(false);
      LI.setContentAreaFilled(false);
      LI.setBorderPainted(false);
      LI.setOpaque(false);
      NA.setContentAreaFilled(false);
      NA.setBorderPainted(false);
      NA.setOpaque(false);
      K.setContentAreaFilled(false);
      K.setBorderPainted(false);
      K.setOpaque(false);
      RB.setContentAreaFilled(false);
      RB.setBorderPainted(false);
      RB.setOpaque(false);
      CS.setContentAreaFilled(false);CS.setBorderPainted(false);CS.setOpaque(false);
      FR.setContentAreaFilled(false);FR.setBorderPainted(false);FR.setOpaque(false);
      BE.setContentAreaFilled(false);BE.setBorderPainted(false);BE.setOpaque(false);
      MG.setContentAreaFilled(false);MG.setBorderPainted(false);MG.setOpaque(false);
      CA.setContentAreaFilled(false);CA.setBorderPainted(false);CA.setOpaque(false);
      SR.setContentAreaFilled(false);SR.setBorderPainted(false);SR.setOpaque(false);
      BA.setContentAreaFilled(false);BA.setBorderPainted(false);BA.setOpaque(false);
      RA.setContentAreaFilled(false); RA.setBorderPainted(false); RA.setOpaque(false);
      SC.setContentAreaFilled(false); SC.setBorderPainted(false); SC.setOpaque(false);
      Y.setContentAreaFilled(false); Y.setBorderPainted(false); Y.setOpaque(false);
      LU.setContentAreaFilled(false); LU.setBorderPainted(false); LU.setOpaque(false);
      LR.setContentAreaFilled(false); LR.setBorderPainted(false); LR.setOpaque(false);
      TI.setContentAreaFilled(false); TI.setBorderPainted(false); TI.setOpaque(false);
      ZR.setContentAreaFilled(false); ZR.setBorderPainted(false); ZR.setOpaque(false);
      HF.setContentAreaFilled(false); HF.setBorderPainted(false); HF.setOpaque(false);
      RF.setContentAreaFilled(false); RF.setBorderPainted(false); RF.setOpaque(false);
      V.setContentAreaFilled(false); V.setBorderPainted(false); V.setOpaque(false);
      NB.setContentAreaFilled(false); NB.setBorderPainted(false); NB.setOpaque(false);
      TA.setContentAreaFilled(false); TA.setBorderPainted(false); TA.setOpaque(false);
      DB.setContentAreaFilled(false); DB.setBorderPainted(false); DB.setOpaque(false);
      CR.setContentAreaFilled(false); CR.setBorderPainted(false); CR.setOpaque(false);
      MO.setContentAreaFilled(false); MO.setBorderPainted(false); MO.setOpaque(false);
      W.setContentAreaFilled(false); W.setBorderPainted(false); W.setOpaque(false);
      SG.setContentAreaFilled(false); SG.setBorderPainted(false); SG.setOpaque(false);
      MN.setContentAreaFilled(false); MN.setBorderPainted(false); MN.setOpaque(false);
      TC.setContentAreaFilled(false); TC.setBorderPainted(false); TC.setOpaque(false);
      RE.setContentAreaFilled(false); RE.setBorderPainted(false); RE.setOpaque(false);
      BH.setContentAreaFilled(false); BH.setBorderPainted(false); BH.setOpaque(false);
      FE.setContentAreaFilled(false); FE.setBorderPainted(false); FE.setOpaque(false);
      RU.setContentAreaFilled(false); RU.setBorderPainted(false); RU.setOpaque(false);
      OS.setContentAreaFilled(false); OS.setBorderPainted(false); OS.setOpaque(false);
      HS.setContentAreaFilled(false); HS.setBorderPainted(false); HS.setOpaque(false);
      CO.setContentAreaFilled(false); CO.setBorderPainted(false); CO.setOpaque(false);
      RH.setContentAreaFilled(false); RH.setBorderPainted(false); RH.setOpaque(false);
      IR.setContentAreaFilled(false); IR.setBorderPainted(false); IR.setOpaque(false);
      MT.setContentAreaFilled(false); MT.setBorderPainted(false); MT.setOpaque(false);
      NI.setContentAreaFilled(false); NI.setBorderPainted(false); NI.setOpaque(false);
      PD.setContentAreaFilled(false); PD.setBorderPainted(false); PD.setOpaque(false);
      PT.setContentAreaFilled(false); PT.setBorderPainted(false); PT.setOpaque(false);
      DS.setContentAreaFilled(false); DS.setBorderPainted(false); DS.setOpaque(false);
      CU.setContentAreaFilled(false); CU.setBorderPainted(false); CU.setOpaque(false);
      AG.setContentAreaFilled(false); AG.setBorderPainted(false); AG.setOpaque(false);
      AU.setContentAreaFilled(false); AU.setBorderPainted(false); AU.setOpaque(false);
      RG.setContentAreaFilled(false); RG.setBorderPainted(false); RG.setOpaque(false);
      ZN.setContentAreaFilled(false); ZN.setBorderPainted(false); ZN.setOpaque(false);
      CD.setContentAreaFilled(false); CD.setBorderPainted(false); CD.setOpaque(false);
      HG.setContentAreaFilled(false); HG.setBorderPainted(false); HG.setOpaque(false);
      CN.setContentAreaFilled(false); CN.setBorderPainted(false); CN.setOpaque(false);
      B.setContentAreaFilled(false); B.setBorderPainted(false); B.setOpaque(false);
      AL.setContentAreaFilled(false); AL.setBorderPainted(false); AL.setOpaque(false);
      GA.setContentAreaFilled(false); GA.setBorderPainted(false); GA.setOpaque(false);
      IN.setContentAreaFilled(false); IN.setBorderPainted(false); IN.setOpaque(false);
      TL.setContentAreaFilled(false); TL.setBorderPainted(false); TL.setOpaque(false);
      NH.setContentAreaFilled(false); NH.setBorderPainted(false); NH.setOpaque(false);
      C.setContentAreaFilled(false); C.setBorderPainted(false); C.setOpaque(false);
      SI.setContentAreaFilled(false); SI.setBorderPainted(false); SI.setOpaque(false);
      GE.setContentAreaFilled(false); GE.setBorderPainted(false); GE.setOpaque(false);
      SN.setContentAreaFilled(false); SN.setBorderPainted(false); SN.setOpaque(false);
      PB.setContentAreaFilled(false); PB.setBorderPainted(false); PD.setOpaque(false);
      FL.setContentAreaFilled(false); FL.setBorderPainted(false); FL.setOpaque(false);
      N.setContentAreaFilled(false); N.setBorderPainted(false); N.setOpaque(false);
      P.setContentAreaFilled(false); P.setBorderPainted(false); P.setOpaque(false);
      AS.setContentAreaFilled(false); AS.setBorderPainted(false); AS.setOpaque(false);
      SB.setContentAreaFilled(false); SB.setBorderPainted(false); SB.setOpaque(false);
      BI.setContentAreaFilled(false); BI.setBorderPainted(false); BI.setOpaque(false);
      MC.setContentAreaFilled(false); MC.setBorderPainted(false); MC.setOpaque(false);
      O.setContentAreaFilled(false); O.setBorderPainted(false); O.setOpaque(false);
      S.setContentAreaFilled(false); S.setBorderPainted(false); S.setOpaque(false);
      SE.setContentAreaFilled(false); SE.setBorderPainted(false); SE.setOpaque(false);
      TE.setContentAreaFilled(false); TE.setBorderPainted(false); TE.setOpaque(false);
      PO.setContentAreaFilled(false); PO.setBorderPainted(false); PO.setOpaque(false);
      LV.setContentAreaFilled(false); LV.setBorderPainted(false); LV.setOpaque(false);
      F.setContentAreaFilled(false); F.setBorderPainted(false); F.setOpaque(false);
      CL.setContentAreaFilled(false); CL.setBorderPainted(false); CL.setOpaque(false);
      BR.setContentAreaFilled(false); BR.setBorderPainted(false); BR.setOpaque(false);
      I.setContentAreaFilled(false); I.setBorderPainted(false); I.setOpaque(false);
      AT.setContentAreaFilled(false); AT.setBorderPainted(false); AT.setOpaque(false);
      TS.setContentAreaFilled(false); TS.setBorderPainted(false); TS.setOpaque(false);
      HE.setContentAreaFilled(false); HE.setBorderPainted(false); HE.setOpaque(false);
      NE.setContentAreaFilled(false); NE.setBorderPainted(false); NE.setOpaque(false);
      AR.setContentAreaFilled(false); AR.setBorderPainted(false); AR.setOpaque(false);
      KR.setContentAreaFilled(false); KR.setBorderPainted(false); KR.setOpaque(false);
      XE.setContentAreaFilled(false); XE.setBorderPainted(false); XE.setOpaque(false);
      RN.setContentAreaFilled(false); RN.setBorderPainted(false); RN.setOpaque(false);
      OG.setContentAreaFilled(false); OG.setBorderPainted(false); OG.setOpaque(false);
     LA.setContentAreaFilled(false); LA.setBorderPainted(false); LA.setOpaque(false);
     CE.setContentAreaFilled(false); CE.setBorderPainted(false); CE.setOpaque(false);
     PR.setContentAreaFilled(false); PR.setBorderPainted(false); PR.setOpaque(false);
     ND.setContentAreaFilled(false); ND.setBorderPainted(false); ND.setOpaque(false);
     PM.setContentAreaFilled(false); PM.setBorderPainted(false); PM.setOpaque(false);
      SM.setContentAreaFilled(false); SM.setBorderPainted(false); SM.setOpaque(false);
      EU.setContentAreaFilled(false); EU.setBorderPainted(false); EU.setOpaque(false);
      GD.setContentAreaFilled(false); GD.setBorderPainted(false); GD.setOpaque(false);
      TB.setContentAreaFilled(false); TB.setBorderPainted(false); TB.setOpaque(false);
      DY.setContentAreaFilled(false); DY.setBorderPainted(false); DY.setOpaque(false);
      HO.setContentAreaFilled(false); HO.setBorderPainted(false); HO.setOpaque(false);
      ER.setContentAreaFilled(false); ER.setBorderPainted(false); ER.setOpaque(false);
      TM.setContentAreaFilled(false); TM.setBorderPainted(false); TM.setOpaque(false);
      YB.setContentAreaFilled(false); YB.setBorderPainted(false); YB.setOpaque(false);
      AC.setContentAreaFilled(false); AC.setBorderPainted(false); AC.setOpaque(false);
      TH.setContentAreaFilled(false); TH.setBorderPainted(false); TH.setOpaque(false);
      PA.setContentAreaFilled(false); PA.setBorderPainted(false); PA.setOpaque(false);
      U.setContentAreaFilled(false); U.setBorderPainted(false); U.setOpaque(false);
      NP.setContentAreaFilled(false); NP.setBorderPainted(false); NP.setOpaque(false);
      PU.setContentAreaFilled(false); PU.setBorderPainted(false); PU.setOpaque(false);
      AM.setContentAreaFilled(false); AM.setBorderPainted(false); AM.setOpaque(false);
      CM.setContentAreaFilled(false); CM.setBorderPainted(false); CM.setOpaque(false);
      BK.setContentAreaFilled(false); BK.setBorderPainted(false); BK.setOpaque(false);
      CF.setContentAreaFilled(false); CF.setBorderPainted(false); CF.setOpaque(false);
      ES.setContentAreaFilled(false); ES.setBorderPainted(false); ES.setOpaque(false);
      FM.setContentAreaFilled(false); FM.setBorderPainted(false); FM.setOpaque(false);
      MD.setContentAreaFilled(false); MD.setBorderPainted(false); MD.setOpaque(false);
      NO.setContentAreaFilled(false); NO.setBorderPainted(false); NO.setOpaque(false);
      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TablaPerr = new javax.swing.JInternalFrame();
        b_cer2 = new javax.swing.JButton();
        H = new javax.swing.JButton();
        LI = new javax.swing.JButton();
        NA = new javax.swing.JButton();
        K = new javax.swing.JButton();
        RB = new javax.swing.JButton();
        CS = new javax.swing.JButton();
        FR = new javax.swing.JButton();
        BE = new javax.swing.JButton();
        MG = new javax.swing.JButton();
        CA = new javax.swing.JButton();
        SR = new javax.swing.JButton();
        BA = new javax.swing.JButton();
        RA = new javax.swing.JButton();
        SC = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        LU = new javax.swing.JButton();
        LR = new javax.swing.JButton();
        TI = new javax.swing.JButton();
        ZR = new javax.swing.JButton();
        HF = new javax.swing.JButton();
        RF = new javax.swing.JButton();
        V = new javax.swing.JButton();
        NB = new javax.swing.JButton();
        TA = new javax.swing.JButton();
        DB = new javax.swing.JButton();
        CR = new javax.swing.JButton();
        MO = new javax.swing.JButton();
        W = new javax.swing.JButton();
        SG = new javax.swing.JButton();
        MN = new javax.swing.JButton();
        TC = new javax.swing.JButton();
        RE = new javax.swing.JButton();
        BH = new javax.swing.JButton();
        FE = new javax.swing.JButton();
        RU = new javax.swing.JButton();
        OS = new javax.swing.JButton();
        HS = new javax.swing.JButton();
        CO = new javax.swing.JButton();
        RH = new javax.swing.JButton();
        IR = new javax.swing.JButton();
        MT = new javax.swing.JButton();
        NI = new javax.swing.JButton();
        PD = new javax.swing.JButton();
        PT = new javax.swing.JButton();
        DS = new javax.swing.JButton();
        CU = new javax.swing.JButton();
        AG = new javax.swing.JButton();
        AU = new javax.swing.JButton();
        RG = new javax.swing.JButton();
        ZN = new javax.swing.JButton();
        CD = new javax.swing.JButton();
        HG = new javax.swing.JButton();
        CN = new javax.swing.JButton();
        B = new javax.swing.JButton();
        AL = new javax.swing.JButton();
        GA = new javax.swing.JButton();
        IN = new javax.swing.JButton();
        TL = new javax.swing.JButton();
        NH = new javax.swing.JButton();
        C = new javax.swing.JButton();
        SI = new javax.swing.JButton();
        GE = new javax.swing.JButton();
        SN = new javax.swing.JButton();
        PB = new javax.swing.JButton();
        FL = new javax.swing.JButton();
        N = new javax.swing.JButton();
        P = new javax.swing.JButton();
        AS = new javax.swing.JButton();
        SB = new javax.swing.JButton();
        BI = new javax.swing.JButton();
        MC = new javax.swing.JButton();
        O = new javax.swing.JButton();
        S = new javax.swing.JButton();
        SE = new javax.swing.JButton();
        TE = new javax.swing.JButton();
        PO = new javax.swing.JButton();
        LV = new javax.swing.JButton();
        F = new javax.swing.JButton();
        CL = new javax.swing.JButton();
        BR = new javax.swing.JButton();
        I = new javax.swing.JButton();
        AT = new javax.swing.JButton();
        TS = new javax.swing.JButton();
        HE = new javax.swing.JButton();
        NE = new javax.swing.JButton();
        AR = new javax.swing.JButton();
        KR = new javax.swing.JButton();
        XE = new javax.swing.JButton();
        RN = new javax.swing.JButton();
        OG = new javax.swing.JButton();
        LA = new javax.swing.JButton();
        CE = new javax.swing.JButton();
        PR = new javax.swing.JButton();
        ND = new javax.swing.JButton();
        PM = new javax.swing.JButton();
        SM = new javax.swing.JButton();
        EU = new javax.swing.JButton();
        GD = new javax.swing.JButton();
        TB = new javax.swing.JButton();
        DY = new javax.swing.JButton();
        HO = new javax.swing.JButton();
        ER = new javax.swing.JButton();
        TM = new javax.swing.JButton();
        YB = new javax.swing.JButton();
        AC = new javax.swing.JButton();
        TH = new javax.swing.JButton();
        PA = new javax.swing.JButton();
        U = new javax.swing.JButton();
        NP = new javax.swing.JButton();
        PU = new javax.swing.JButton();
        AM = new javax.swing.JButton();
        CM = new javax.swing.JButton();
        BK = new javax.swing.JButton();
        CF = new javax.swing.JButton();
        ES = new javax.swing.JButton();
        FM = new javax.swing.JButton();
        MD = new javax.swing.JButton();
        NO = new javax.swing.JButton();
        fon2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b_min = new javax.swing.JButton();
        b_cerr = new javax.swing.JButton();
        b_IrTabla = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b_Quimi = new javax.swing.JButton();
        b_atomo = new javax.swing.JButton();
        b_atomo2 = new javax.swing.JButton();
        b_Reacc = new javax.swing.JButton();
        b_QuiEjer3 = new javax.swing.JButton();
        b_atomoEjer2 = new javax.swing.JButton();
        b_QuiEjer2 = new javax.swing.JButton();
        b_ejerAtomo = new javax.swing.JButton();
        b_QuiEjer1 = new javax.swing.JButton();
        b_EjerRe = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaPerr.setVisible(true);
        TablaPerr.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_cer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar (2).png"))); // NOI18N
        b_cer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cer2ActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(b_cer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 40, 40));

        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, 50));

        LI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(LI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 50, 50));

        NA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(NA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 50, 50));

        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(K, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 50, 50));

        RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(RB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 50, 50));

        CS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(CS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 50, 40));

        FR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FRActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(FR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 50, 50));

        BE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(BE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 50, 50));

        MG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MGActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(MG, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 50, 50));

        CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(CA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 50, 50));

        SR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(SR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 50, 50));

        BA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(BA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 50, 40));

        RA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(RA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 50, 50));

        SC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(SC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 50, 50));

        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 50, 50));

        LU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LUActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(LU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 50, 40));

        LR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LRActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(LR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 50, 50));

        TI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(TI, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 50, 50));

        ZR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZRActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(ZR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 50, 50));

        HF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HFActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(HF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 50, 40));

        RF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(RF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 50, 50));

        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(V, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 50, 50));

        NB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NBActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(NB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 50, 50));

        TA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(TA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 50, 40));

        DB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(DB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 50, 50));

        CR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(CR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 50, 50));

        MO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(MO, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 50, 50));

        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(W, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 50, 40));

        SG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SGActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(SG, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 50, 50));

        MN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(MN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 50, 50));

        TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(TC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 50, 50));

        RE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(RE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 50, 40));

        BH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(BH, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 50, 50));

        FE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(FE, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 50, 50));

        RU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(RU, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 50, 50));

        OS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OSActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(OS, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 50, 40));

        HS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HSActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(HS, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 50, 50));

        CO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(CO, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 50, 50));

        RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RHActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 50, 50));

        IR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IRActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(IR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 50, 40));

        MT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(MT, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 50, 50));

        NI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(NI, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 50, 50));

        PD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(PD, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 50, 50));

        PT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(PT, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 50, 40));

        DS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(DS, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 50, 50));

        CU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(CU, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 50, 50));

        AG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(AG, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 50, 50));

        AU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(AU, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 50, 40));

        RG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RGActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 50, 50));

        ZN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZNActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(ZN, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 50, 50));

        CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 50, 50));

        HG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HGActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(HG, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 50, 40));

        CN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 50, 50));

        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 50, 50));

        AL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(AL, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 50, 50));

        GA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(GA, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 50, 50));

        IN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(IN, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 50, 50));

        TL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TLActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(TL, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 50, 40));

        NH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NHActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(NH, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 50, 50));

        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 50, 50));

        SI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(SI, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 50, 50));

        GE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GEActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(GE, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 50, 50));

        SN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SNActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(SN, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, 50, 50));

        PB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(PB, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 50, 40));

        FL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FLActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(FL, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, 50, 50));

        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 170, 50, 50));

        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 50, 50));

        AS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(AS, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 290, 50, 50));

        SB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(SB, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 350, 50, 50));

        BI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(BI, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 410, 50, 40));

        MC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, 50, 50));

        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(O, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 170, 50, 50));

        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(S, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, 50, 50));

        SE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, 50, 50));

        TE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(TE, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 350, 50, 50));

        PO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(PO, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, 50, 40));

        LV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LVActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(LV, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 470, 50, 50));

        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, 50, 50));

        CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(CL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 230, 50, 50));

        BR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(BR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 290, 50, 50));

        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 350, 50, 50));

        AT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(AT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 410, 50, 40));

        TS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(TS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 470, 50, 50));

        HE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HEActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(HE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, 50, 50));

        NE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(NE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 170, 50, 50));

        AR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(AR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 230, 50, 50));

        KR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KRActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(KR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 290, 50, 50));

        XE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XEActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(XE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 350, 50, 50));

        RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(RN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 410, 50, 40));

        OG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OGActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(OG, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 470, 50, 50));

        LA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(LA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 50, 50));

        CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(CE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 50, 50));

        PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(PR, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 50, 50));

        ND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NDActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(ND, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 50, 50));

        PM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(PM, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 50, 50));

        SM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(SM, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 50, 50));

        EU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EUActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(EU, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 50, 50));

        GD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GDActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(GD, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 50, 50));

        TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(TB, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 50, 50));

        DY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DYActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(DY, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 550, 50, 50));

        HO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(HO, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 50, 50));

        ER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ERActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(ER, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 550, 50, 50));

        TM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TMActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(TM, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 550, 50, 50));

        YB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YBActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(YB, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 550, 50, 50));

        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 50, 50));

        TH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(TH, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 50, 50));

        PA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(PA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 610, 50, 50));

        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(U, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 50, 50));

        NP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(NP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, 50, 50));

        PU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PUActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(PU, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 50, 50));

        AM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(AM, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 50, 50));

        CM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(CM, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, 50, 50));

        BK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(BK, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 50, 50));

        CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(CF, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 610, 50, 50));

        ES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(ES, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 50, 50));

        FM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FMActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(FM, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 50, 50));

        MD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MDActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(MD, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 610, 50, 50));

        NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOActionPerformed(evt);
            }
        });
        TablaPerr.getContentPane().add(NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 610, 50, 50));

        fon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tabla-periodica2-1200x679.png"))); // NOI18N
        fon2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        TablaPerr.getContentPane().add(fon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, -1));

        getContentPane().add(TablaPerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/quimica.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        b_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/minimizar.png"))); // NOI18N
        b_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_minActionPerformed(evt);
            }
        });
        getContentPane().add(b_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 40, -1));

        b_cerr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar (2).png"))); // NOI18N
        b_cerr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cerrActionPerformed(evt);
            }
        });
        getContentPane().add(b_cerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 40, -1));

        b_IrTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tabla-periodica.png"))); // NOI18N
        b_IrTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_IrTablaActionPerformed(evt);
            }
        });
        getContentPane().add(b_IrTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 560, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("\"La Química es una cienia que estudia la materia,  su estructura íntima, ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("sus cambios, su relaciones con la energía,");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("las leyes que rigen esos cambios y esas reacciones\"");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        b_Quimi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_Quimi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/idea.png"))); // NOI18N
        b_Quimi.setText("Quimica del carbono");
        b_Quimi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_QuimiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_QuimiMouseExited(evt);
            }
        });
        b_Quimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_QuimiActionPerformed(evt);
            }
        });
        getContentPane().add(b_Quimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 310, -1));

        b_atomo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_atomo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/idea.png"))); // NOI18N
        b_atomo.setText("Teoría atómico-molecular de la materia");
        b_atomo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_atomoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_atomoMouseExited(evt);
            }
        });
        b_atomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_atomoActionPerformed(evt);
            }
        });
        getContentPane().add(b_atomo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 430, -1));

        b_atomo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_atomo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/idea.png"))); // NOI18N
        b_atomo2.setText("El átomo y sus enlaces");
        b_atomo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_atomo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_atomo2MouseExited(evt);
            }
        });
        b_atomo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_atomo2ActionPerformed(evt);
            }
        });
        getContentPane().add(b_atomo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 310, -1));

        b_Reacc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_Reacc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/idea.png"))); // NOI18N
        b_Reacc.setText("Reacciones Químicas");
        b_Reacc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_ReaccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_ReaccMouseExited(evt);
            }
        });
        b_Reacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ReaccActionPerformed(evt);
            }
        });
        getContentPane().add(b_Reacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 320, -1));

        b_QuiEjer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tres.png"))); // NOI18N
        b_QuiEjer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_QuiEjer3ActionPerformed(evt);
            }
        });
        getContentPane().add(b_QuiEjer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, -1, 70));

        b_atomoEjer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/uno.png"))); // NOI18N
        b_atomoEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_atomoEjer2ActionPerformed(evt);
            }
        });
        getContentPane().add(b_atomoEjer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

        b_QuiEjer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/dos.png"))); // NOI18N
        b_QuiEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_QuiEjer2ActionPerformed(evt);
            }
        });
        getContentPane().add(b_QuiEjer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, 100, 70));

        b_ejerAtomo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/uno.png"))); // NOI18N
        b_ejerAtomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ejerAtomoActionPerformed(evt);
            }
        });
        getContentPane().add(b_ejerAtomo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 80, -1));

        b_QuiEjer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/uno.png"))); // NOI18N
        b_QuiEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_QuiEjer1ActionPerformed(evt);
            }
        });
        getContentPane().add(b_QuiEjer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, -1, -1));

        b_EjerRe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/uno.png"))); // NOI18N
        b_EjerRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_EjerReActionPerformed(evt);
            }
        });
        getContentPane().add(b_EjerRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/color4.jpg"))); // NOI18N
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        fondo.setPreferredSize(new java.awt.Dimension(900, 590));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_cerrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cerrActionPerformed
       this.setVisible(false);
       TercerAnio Tr = new TercerAnio();
       Tr.setVisible(true);
    }//GEN-LAST:event_b_cerrActionPerformed

    private void b_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_minActionPerformed
        setExtendedState(Quimica.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_b_minActionPerformed

    private void b_IrTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_IrTablaActionPerformed
       
        TablaPerr.setVisible(true);
    }//GEN-LAST:event_b_IrTablaActionPerformed

    private void b_cer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cer2ActionPerformed
        TablaPerr.setVisible(false);
    }//GEN-LAST:event_b_cer2ActionPerformed

    private void b_QuimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_QuimiActionPerformed
       try {
     File path = new File ("TercerAño/Quimica/Tema1.ppt");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_QuimiActionPerformed

    private void b_QuiEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_QuiEjer1ActionPerformed
             try {
     File path = new File ("TercerAño/Quimica/Ejer_1_1.doc");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_QuiEjer1ActionPerformed

    private void b_QuiEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_QuiEjer2ActionPerformed
try {
     File path = new File ("TercerAño/Quimica/Ejer_1_2.doc");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_QuiEjer2ActionPerformed

    private void b_QuiEjer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_QuiEjer3ActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/Ejer_1_3.doc");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    
    }//GEN-LAST:event_b_QuiEjer3ActionPerformed

    private void b_ejerAtomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ejerAtomoActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/Ejer_2.doc");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    
    }//GEN-LAST:event_b_ejerAtomoActionPerformed

    private void b_atomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_atomoActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/Tema2.ppt");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_atomoActionPerformed

    private void b_atomo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_atomo2ActionPerformed
       try {
     File path = new File ("TercerAño/Quimica/Tema3.ppt");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_atomo2ActionPerformed

    private void b_atomoEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_atomoEjer2ActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/Ejer_3.doc");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_atomoEjer2ActionPerformed

    private void b_EjerReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_EjerReActionPerformed
      try {
     File path = new File ("TercerAño/Quimica/Ejer_4.doc");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_EjerReActionPerformed

    private void b_ReaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ReaccActionPerformed
     try {
     File path = new File ("TercerAño/Quimica/Tema4.ppt");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_b_ReaccActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        try {
     File path = new File ("TercerAño/Quimica/HIDROGENO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_HActionPerformed

    private void LIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIActionPerformed
             try {
     File path = new File ("TercerAño/Quimica/LITIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_LIActionPerformed

    private void HEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HEActionPerformed
               try {
     File path = new File ("TercerAño/Quimica/HELIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_HEActionPerformed

    private void BEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEActionPerformed
               try {
     File path = new File ("TercerAño/Quimica/BERILIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_BEActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
try {
     File path = new File ("TercerAño/Quimica/BORO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/CARBONO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_CActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/NITROGENO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_NActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/OXIGENO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_OActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
         try {
     File path = new File ("TercerAño/Quimica/FLUOR.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_FActionPerformed

    private void NEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEActionPerformed
        try {
     File path = new File ("TercerAño/Quimica/NEON.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_NEActionPerformed

    private void NAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/SODIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_NAActionPerformed

    private void MGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MGActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/MAGNESIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_MGActionPerformed

    private void ALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/ALUMINIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_ALActionPerformed

    private void SIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/SILICIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_SIActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/FOSFORO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_PActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/AZUFRE.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_SActionPerformed

    private void CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLActionPerformed
      try {
     File path = new File ("TercerAño/Quimica/CLORO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_CLActionPerformed

    private void ARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARActionPerformed
        try {
     File path = new File ("TercerAño/Quimica/ARGON.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_ARActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
     try {
     File path = new File ("TercerAño/Quimica/POTASIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_KActionPerformed

    private void CAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/CALCIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_CAActionPerformed

    private void SCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/ESCANDIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_SCActionPerformed

    private void TIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/TITANIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_TIActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/VANADIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_VActionPerformed

    private void CRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRActionPerformed
       try {
     File path = new File ("TercerAño/Quimica/CROMO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_CRActionPerformed

    private void MNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/MANGANESO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_MNActionPerformed

    private void FEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/HIERRO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_FEActionPerformed

    private void COActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/COBALTO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_COActionPerformed

    private void NIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/NIQUEL.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_NIActionPerformed

    private void CUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/COBRE.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_CUActionPerformed

    private void ZNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZNActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/ZINC.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_ZNActionPerformed

    private void GAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAActionPerformed
       try {
     File path = new File ("TercerAño/Quimica/GALIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_GAActionPerformed

    private void GEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GEActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/GERMANIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_GEActionPerformed

    private void ASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/ARSENICO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_ASActionPerformed

    private void SEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/SELENIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_SEActionPerformed

    private void BRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/BROMO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_BRActionPerformed

    private void KRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KRActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/KRIPTON.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_KRActionPerformed

    private void RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/RUBIDIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_RBActionPerformed

    private void SRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SRActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/ESTRONCIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_SRActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/ITRIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_YActionPerformed

    private void ZRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZRActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/CIRCONIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_ZRActionPerformed

    private void NBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NBActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/NIOBIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_NBActionPerformed

    private void MOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/MOLIBDENO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_MOActionPerformed

    private void TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/TECNECIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_TCActionPerformed

    private void RUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RUActionPerformed
     try {
     File path = new File ("TercerAño/Quimica/RUTENIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_RUActionPerformed

    private void RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RHActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/RODIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_RHActionPerformed

    private void PDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/PALADIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_PDActionPerformed

    private void AGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/PLATA.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_AGActionPerformed

    private void CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/CADMIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_CDActionPerformed

    private void INActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/INDIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_INActionPerformed

    private void SNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SNActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/ESTAÑO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_SNActionPerformed

    private void SBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBActionPerformed
     try {
     File path = new File ("TercerAño/Quimica/ANTIMONIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_SBActionPerformed

    private void TEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/TELURIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_TEActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/YODO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_IActionPerformed

    private void XEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XEActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/XENON.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_XEActionPerformed

    private void CSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/CESIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_CSActionPerformed

    private void BAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAActionPerformed
    try {
    File path = new File ("TercerAño/Quimica/BARIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_BAActionPerformed

    private void LUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LUActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/LUTECIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_LUActionPerformed

    private void HFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HFActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/HAFNIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_HFActionPerformed

    private void TAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/TANTALO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_TAActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/WOLFRAMIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_WActionPerformed

    private void REActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/RENIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_REActionPerformed

    private void OSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OSActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/OSMIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_OSActionPerformed

    private void IRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IRActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/IRIDIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_IRActionPerformed

    private void PTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/PLATINO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_PTActionPerformed

    private void AUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/ORO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_AUActionPerformed

    private void HGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HGActionPerformed
     try {
     File path = new File ("TercerAño/Quimica/MERCURIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_HGActionPerformed

    private void TLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TLActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/TALIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_TLActionPerformed

    private void PBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/PLOMO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_PBActionPerformed

    private void BIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/BISMUTO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_BIActionPerformed

    private void POActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/POLONIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_POActionPerformed

    private void ATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATActionPerformed
     try {
     File path = new File ("TercerAño/Quimica/ASTATO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_ATActionPerformed

    private void RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/RADON.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_RNActionPerformed

    private void FRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FRActionPerformed
       try {
     File path = new File ("TercerAño/Quimica/FRANCIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_FRActionPerformed

    private void RAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAActionPerformed
      try {
     File path = new File ("TercerAño/Quimica/RADIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_RAActionPerformed

    private void LRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LRActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/LAWRENCIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_LRActionPerformed

    private void RFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/RUTHERFORDIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_RFActionPerformed

    private void DBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/DUBNIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_DBActionPerformed

    private void SGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SGActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/SEABORGIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_SGActionPerformed

    private void BHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/BOHRIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_BHActionPerformed

    private void HSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSActionPerformed
     try {
     File path = new File ("TercerAño/Quimica/HASIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_HSActionPerformed

    private void MTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/MAEITNERIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_MTActionPerformed

    private void DSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/DARMSTATIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_DSActionPerformed

    private void RGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RGActionPerformed
     try {
     File path = new File ("TercerAño/Quimica/ROENTGENIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_RGActionPerformed

    private void CNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/COPERNICIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_CNActionPerformed

    private void NHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NHActionPerformed
  try {
     File path = new File ("TercerAño/Quimica/NIHONIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_NHActionPerformed

    private void FLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FLActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/FLEROVIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_FLActionPerformed

    private void MCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/MOSCOVIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_MCActionPerformed

    private void LVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LVActionPerformed
  try {
     File path = new File ("TercerAño/Quimica/LIVERMORIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_LVActionPerformed

    private void TSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSActionPerformed
  try {
     File path = new File ("TercerAño/Quimica/TENESO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_TSActionPerformed

    private void OGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OGActionPerformed
  try {
     File path = new File ("TercerAño/Quimica/OGANESON.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_OGActionPerformed

    private void LAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/LANTANO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_LAActionPerformed

    private void CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/CERIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_CEActionPerformed

    private void PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/PRASEODIMIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_PRActionPerformed

    private void NDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NDActionPerformed
     try {
     File path = new File ("TercerAño/Quimica/NEODIMIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_NDActionPerformed

    private void PMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/PROMETIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_PMActionPerformed

    private void SMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/SAMARIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_SMActionPerformed

    private void EUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EUActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/EUROPIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_EUActionPerformed

    private void GDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GDActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/GADOLINIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_GDActionPerformed

    private void TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBActionPerformed
  try {
     File path = new File ("TercerAño/Quimica/TERBIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_TBActionPerformed

    private void DYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DYActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/DISPROSIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_DYActionPerformed

    private void HOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/HOLMIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_HOActionPerformed

    private void ERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ERActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/ERBIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_ERActionPerformed

    private void TMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TMActionPerformed
       try {
     File path = new File ("TercerAño/Quimica/TULIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_TMActionPerformed

    private void YBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YBActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/ITERBIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_YBActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/ACTINO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_ACActionPerformed

    private void THActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/TORIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_THActionPerformed

    private void PAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/PROTACTINIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_PAActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/URANIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_UActionPerformed

    private void NPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/NEPTUNIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_NPActionPerformed

    private void PUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PUActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/PLUTONIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_PUActionPerformed

    private void AMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMActionPerformed
   try {
     File path = new File ("TercerAño/Quimica/AMERICIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_AMActionPerformed

    private void CMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMActionPerformed
      try {
     File path = new File ("TercerAño/Quimica/CURIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_CMActionPerformed

    private void BKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/BERKELIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_BKActionPerformed

    private void CFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/CALIFORNIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_CFActionPerformed

    private void ESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESActionPerformed
     try {
     File path = new File ("TercerAño/Quimica/EINSTENIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_ESActionPerformed

    private void FMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FMActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/FERMIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_FMActionPerformed

    private void MDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MDActionPerformed
  try {
     File path = new File ("TercerAño/Quimica/MENDELEVIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_MDActionPerformed

    private void NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOActionPerformed
    try {
     File path = new File ("TercerAño/Quimica/NOBELIO.pdf");
     Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
    }//GEN-LAST:event_NOActionPerformed

    private void b_atomoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_atomoMouseEntered
    b_atomo.setForeground(Color.yellow);
    }//GEN-LAST:event_b_atomoMouseEntered

    private void b_atomo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_atomo2MouseEntered
      b_atomo2.setForeground(Color.yellow);
    }//GEN-LAST:event_b_atomo2MouseEntered

    private void b_ReaccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ReaccMouseEntered
     b_Reacc.setForeground(Color.yellow);
    }//GEN-LAST:event_b_ReaccMouseEntered

    private void b_QuimiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_QuimiMouseEntered
       b_Quimi.setForeground(Color.yellow);
    }//GEN-LAST:event_b_QuimiMouseEntered

    private void b_atomoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_atomoMouseExited
        b_atomo.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_b_atomoMouseExited

    private void b_atomo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_atomo2MouseExited
      b_atomo2.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_b_atomo2MouseExited

    private void b_ReaccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ReaccMouseExited
     b_Reacc.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_b_ReaccMouseExited

    private void b_QuimiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_QuimiMouseExited
    b_Quimi.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_b_QuimiMouseExited

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
            java.util.logging.Logger.getLogger(Quimica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quimica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quimica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quimica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quimica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JButton AG;
    private javax.swing.JButton AL;
    private javax.swing.JButton AM;
    private javax.swing.JButton AR;
    private javax.swing.JButton AS;
    private javax.swing.JButton AT;
    private javax.swing.JButton AU;
    private javax.swing.JButton B;
    private javax.swing.JButton BA;
    private javax.swing.JButton BE;
    private javax.swing.JButton BH;
    private javax.swing.JButton BI;
    private javax.swing.JButton BK;
    private javax.swing.JButton BR;
    private javax.swing.JButton C;
    private javax.swing.JButton CA;
    private javax.swing.JButton CD;
    private javax.swing.JButton CE;
    private javax.swing.JButton CF;
    private javax.swing.JButton CL;
    private javax.swing.JButton CM;
    private javax.swing.JButton CN;
    private javax.swing.JButton CO;
    private javax.swing.JButton CR;
    private javax.swing.JButton CS;
    private javax.swing.JButton CU;
    private javax.swing.JButton DB;
    private javax.swing.JButton DS;
    private javax.swing.JButton DY;
    private javax.swing.JButton ER;
    private javax.swing.JButton ES;
    private javax.swing.JButton EU;
    private javax.swing.JButton F;
    private javax.swing.JButton FE;
    private javax.swing.JButton FL;
    private javax.swing.JButton FM;
    private javax.swing.JButton FR;
    private javax.swing.JButton GA;
    private javax.swing.JButton GD;
    private javax.swing.JButton GE;
    private javax.swing.JButton H;
    private javax.swing.JButton HE;
    private javax.swing.JButton HF;
    private javax.swing.JButton HG;
    private javax.swing.JButton HO;
    private javax.swing.JButton HS;
    private javax.swing.JButton I;
    private javax.swing.JButton IN;
    private javax.swing.JButton IR;
    private javax.swing.JButton K;
    private javax.swing.JButton KR;
    private javax.swing.JButton LA;
    private javax.swing.JButton LI;
    private javax.swing.JButton LR;
    private javax.swing.JButton LU;
    private javax.swing.JButton LV;
    private javax.swing.JButton MC;
    private javax.swing.JButton MD;
    private javax.swing.JButton MG;
    private javax.swing.JButton MN;
    private javax.swing.JButton MO;
    private javax.swing.JButton MT;
    private javax.swing.JButton N;
    private javax.swing.JButton NA;
    private javax.swing.JButton NB;
    private javax.swing.JButton ND;
    private javax.swing.JButton NE;
    private javax.swing.JButton NH;
    private javax.swing.JButton NI;
    private javax.swing.JButton NO;
    private javax.swing.JButton NP;
    private javax.swing.JButton O;
    private javax.swing.JButton OG;
    private javax.swing.JButton OS;
    private javax.swing.JButton P;
    private javax.swing.JButton PA;
    private javax.swing.JButton PB;
    private javax.swing.JButton PD;
    private javax.swing.JButton PM;
    private javax.swing.JButton PO;
    private javax.swing.JButton PR;
    private javax.swing.JButton PT;
    private javax.swing.JButton PU;
    private javax.swing.JButton RA;
    private javax.swing.JButton RB;
    private javax.swing.JButton RE;
    private javax.swing.JButton RF;
    private javax.swing.JButton RG;
    private javax.swing.JButton RH;
    private javax.swing.JButton RN;
    private javax.swing.JButton RU;
    private javax.swing.JButton S;
    private javax.swing.JButton SB;
    private javax.swing.JButton SC;
    private javax.swing.JButton SE;
    private javax.swing.JButton SG;
    private javax.swing.JButton SI;
    private javax.swing.JButton SM;
    private javax.swing.JButton SN;
    private javax.swing.JButton SR;
    private javax.swing.JButton TA;
    private javax.swing.JButton TB;
    private javax.swing.JButton TC;
    private javax.swing.JButton TE;
    private javax.swing.JButton TH;
    private javax.swing.JButton TI;
    private javax.swing.JButton TL;
    private javax.swing.JButton TM;
    private javax.swing.JButton TS;
    private javax.swing.JInternalFrame TablaPerr;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton XE;
    private javax.swing.JButton Y;
    private javax.swing.JButton YB;
    private javax.swing.JButton ZN;
    private javax.swing.JButton ZR;
    private javax.swing.JButton b_EjerRe;
    private javax.swing.JButton b_IrTabla;
    private javax.swing.JButton b_QuiEjer1;
    private javax.swing.JButton b_QuiEjer2;
    private javax.swing.JButton b_QuiEjer3;
    private javax.swing.JButton b_Quimi;
    private javax.swing.JButton b_Reacc;
    private javax.swing.JButton b_atomo;
    private javax.swing.JButton b_atomo2;
    private javax.swing.JButton b_atomoEjer2;
    private javax.swing.JButton b_cer2;
    private javax.swing.JButton b_cerr;
    private javax.swing.JButton b_ejerAtomo;
    private javax.swing.JButton b_min;
    private javax.swing.JLabel fon2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
