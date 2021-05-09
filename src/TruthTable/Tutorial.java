/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TruthTable;

import java.awt.Toolkit;

/**
 *
 * @author asus
 */
public class Tutorial extends javax.swing.JFrame {

    /**
     * Creates new form Tutorial
     */
    public Tutorial() {
        initComponents();
        setIcon();
    }

    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gamelogo.png")));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        java.awt.Button BACK = new java.awt.Button();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JTextArea jTextArea2 = new javax.swing.JTextArea();
        javax.swing.JLabel rune1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        javax.swing.JTextArea jTextArea3 = new javax.swing.JTextArea();
        javax.swing.JLabel rune3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
        javax.swing.JTextArea jTextArea4 = new javax.swing.JTextArea();
        javax.swing.JLabel rune5 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel5 = new javax.swing.JPanel();
        javax.swing.JTextArea jTextArea6 = new javax.swing.JTextArea();
        javax.swing.JLabel rune6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel6 = new javax.swing.JPanel();
        javax.swing.JTextArea jTextArea1 = new javax.swing.JTextArea();
        javax.swing.JLabel rune4 = new javax.swing.JLabel();
        javax.swing.JLabel pagetitle = new javax.swing.JLabel();
        javax.swing.JLabel andtable1 = new javax.swing.JLabel();
        javax.swing.JLabel negtable = new javax.swing.JLabel();
        javax.swing.JLabel imptable = new javax.swing.JLabel();
        javax.swing.JLabel ortable2 = new javax.swing.JLabel();
        javax.swing.JLabel imptable1 = new javax.swing.JLabel();
        javax.swing.JLabel BACKGROUND = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Truth Runes");
        setLocation(new java.awt.Point(300, 100));
        setResizable(false);
        setSize(new java.awt.Dimension(1336, 720));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1336, 2150));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACK.setBackground(new java.awt.Color(51, 51, 51));
        BACK.setFont(new java.awt.Font("Æ Systematic TT BRK", 1, 24)); // NOI18N
        BACK.setForeground(new java.awt.Color(255, 255, 255));
        BACK.setLabel("<");
        BACK.setName(""); // NOI18N
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        jPanel1.add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 55, 60));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setPreferredSize(new java.awt.Dimension(1336, 450));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 0, 30)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("AND (^) ^ The AND operation of two propositions A and B (written as A^B)\nis true if both the propositional variable A and B is true.");
        jTextArea2.setToolTipText("");
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTextArea2.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextArea2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, 80));

        rune1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/green-^sign.gif"))); // NOI18N
        jPanel2.add(rune1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 130, 630));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 130));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 0, 30)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jTextArea3.setText("OR (V) V The OR operation of two propositions A and B (written as AvB)\nis true if at least any of the propositional variable A or B is true.");
        jTextArea3.setToolTipText("");
        jTextArea3.setAutoscrolls(false);
        jTextArea3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTextArea3.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextArea3.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 80));

        rune3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/gold-V.gif"))); // NOI18N
        jPanel3.add(rune3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 130, 630));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1336, 130));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 0, 30)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea4.setRows(5);
        jTextArea4.setText("Negation (~) ~ The negation of a proposition A (written as ~A) is false \nwhen A is true and is true when A is false.");
        jTextArea4.setToolTipText("");
        jTextArea4.setAutoscrolls(false);
        jTextArea4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTextArea4.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextArea4.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextArea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 80));

        rune5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/black-Negay.gif"))); // NOI18N
        jPanel4.add(rune5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, 630));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 900, 1336, 130));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 0, 30)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea6.setRows(5);
        jTextArea6.setText("Implication / if-then (->) -> An implication A->B is the proposition \n“if A, then B”. It is false if A is true and B is false. The rest \ncases are true. ");
        jTextArea6.setToolTipText("");
        jTextArea6.setAutoscrolls(false);
        jTextArea6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTextArea6.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextArea6.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel5.add(jTextArea6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 120));

        rune6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/blue-implies.gif"))); // NOI18N
        jPanel5.add(rune6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, 150, 660));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1300, 1336, 130));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 960, -1, -1));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 0, 30)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("If and only if (<->) <-> A<->B is bi-conditional logical connective \nwhich is true when p and q are same, i.e. both are false or both \nare true.");
        jTextArea1.setToolTipText("");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTextArea1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextArea1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel6.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 120));

        rune4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/BLUE-biconditional-sign.gif"))); // NOI18N
        jPanel6.add(rune4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 210, 660));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1700, 1336, 130));

        pagetitle.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 1, 48)); // NOI18N
        pagetitle.setForeground(new java.awt.Color(255, 255, 255));
        pagetitle.setText("A Guide to Propositional Logic");
        jPanel1.add(pagetitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        andtable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/AND.PNG"))); // NOI18N
        jPanel1.add(andtable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        negtable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/NEGATION.PNG"))); // NOI18N
        jPanel1.add(negtable, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 1090, -1, -1));

        imptable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/IFonly.PNG"))); // NOI18N
        jPanel1.add(imptable, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1850, -1, -1));

        ortable2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/OR.PNG"))); // NOI18N
        jPanel1.add(ortable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, -1, -1));

        imptable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/Implication.PNG"))); // NOI18N
        jPanel1.add(imptable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1440, -1, -1));

        BACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/bgtutrealreal.gif"))); // NOI18N
        jPanel1.add(BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1336, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_BACKActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tutorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

