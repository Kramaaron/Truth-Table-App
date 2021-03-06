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
public class Result extends javax.swing.JFrame {
    /**
     * Creates new form Result
     */
    public Result() {
        initComponents();
        setIcon();
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gamelogo.png")));
    }

    public Result(String para, String tt) {
        initComponents();
        
        scorelabel.setText("Score: "+para);
        
        double ave = (Double.parseDouble(para)/Double.parseDouble(tt))*100;
        
        totallabel.setText(" / "+tt);
        if(ave==100){ 
            commentarea.setText("“Man is least himself when he talks in his own person. Give him a mask, and he will tell you the truth.”\n-Oscar Wilde" );
        }
        else if(ave>=90){ 
            commentarea.setText("“In a time of deceit telling the truth is a revolutionary act.”\n-George Orwell" );
        }
        else if(ave>=80){
            commentarea.setText("“Truth never damages a cause that is just.”\n-Mahatma Gandhi" );
        }
        else if(ave>=70){
            commentarea.setText("“Never tell the truth to people who are not worthy of it.”\n-Mark Twain" );
        }
        else if(ave>=60){ 
            commentarea.setText("“The truth.\" Dumbledore sighed. \"It is a beautiful and terrible thing, and should therefore be treated with great caution.”\n-J.K. Rowling" );
        }
        else if(ave>=30){ 
            commentarea.setText("“The sadness will last forever.”\n-Vincent Van Gogh");
        }
        else{            
            commentarea.setText("“Anyone who doesn't take truth seriously in small matters cannot be trusted in large ones either.”\n-Albert Einstein" );
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

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        javax.swing.JButton jButton2 = new javax.swing.JButton();
        javax.swing.JButton jButton3 = new javax.swing.JButton();
        totallabel = new javax.swing.JLabel();
        scorelabel = new javax.swing.JLabel();
        commentarea = new javax.swing.JTextArea();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Truth Runes");
        setLocation(new java.awt.Point(300, 100));
        setMinimumSize(new java.awt.Dimension(1336, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(1336, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1336, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Alkhemikal", 1, 48)); // NOI18N
        jButton1.setText("Try Again");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 250, -1));

        jButton2.setFont(new java.awt.Font("Alkhemikal", 1, 48)); // NOI18N
        jButton2.setText("Main Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, -1, -1));

        jButton3.setFont(new java.awt.Font("Alkhemikal", 1, 48)); // NOI18N
        jButton3.setText("Scores");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 250, -1));

        totallabel.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 1, 48)); // NOI18N
        totallabel.setForeground(new java.awt.Color(255, 255, 255));
        totallabel.setText("/ 00");
        jPanel1.add(totallabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, -1, -1));

        scorelabel.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 1, 48)); // NOI18N
        scorelabel.setForeground(new java.awt.Color(255, 255, 255));
        scorelabel.setText("Score: 00");
        jPanel1.add(scorelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        commentarea.setBackground(new java.awt.Color(0, 0, 0, 0));
        commentarea.setColumns(20);
        commentarea.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 2, 36)); // NOI18N
        commentarea.setForeground(new java.awt.Color(102, 102, 102));
        commentarea.setLineWrap(true);
        commentarea.setRows(5);
        commentarea.setWrapStyleWord(true);
        commentarea.setBorder(null);
        commentarea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        commentarea.setOpaque(false);
        jPanel1.add(commentarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 1290, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/bg2.gif"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1336, 720));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Difficulty().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Scores().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextArea commentarea;
    javax.swing.JLabel scorelabel;
    javax.swing.JLabel totallabel;
    // End of variables declaration//GEN-END:variables
}

