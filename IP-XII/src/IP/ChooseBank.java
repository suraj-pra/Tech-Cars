/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IP;

/**
 *
 * @author lab2 admin 12
 */
public class ChooseBank extends javax.swing.JFrame {

    /**
     * Creates new form ip10
     */
    PayMode p;
    
    String cname, name, fname, id, prc;
    int n, ded;
    
    public ChooseBank(PayMode p, int n) {
        this.n = n;
        this.p = p;
        initComponents();
    }

    private ChooseBank() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        logo = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        b4 = new javax.swing.JRadioButton();
        pay = new javax.swing.JButton();
        back = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        blk = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aobck.png"))); // NOI18N
        getContentPane().add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        bg.add(b1);
        b1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(102, 102, 255));
        b1.setSelected(true);
        b1.setText("AXIS BANK OF INDIA");
        b1.setOpaque(false);
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        bg.add(b2);
        b2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(102, 102, 255));
        b2.setText("PUNJAB NATIONAL BANK");
        b2.setOpaque(false);
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        bg.add(b3);
        b3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        b3.setForeground(new java.awt.Color(102, 102, 255));
        b3.setText("ALLAHABAD BANK OF INDIA");
        b3.setOpaque(false);
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        bg.add(b4);
        b4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        b4.setForeground(new java.awt.Color(102, 102, 255));
        b4.setText("STATE BANK OF INDIA");
        b4.setOpaque(false);
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paynow.PNG"))); // NOI18N
        pay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        getContentPane().add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 260, 60));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back btn.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/min.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, 40));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, 40));

        blk.setBackground(new java.awt.Color(0, 0, 0));
        blk.setOpaque(true);
        getContentPane().add(blk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 40));

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pnlbck.jpg"))); // NOI18N
        bck.setText("jLabel3");
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 660, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        AccNo  a= new AccNo(this, n);
        a.setVisible(true);
        a.cname = cname;
        a.name = name;
        a.prc.setText(prc);
        a.fname = fname;
        a.id = id;
        a.ded = ded;
        this.setVisible(false);
    }//GEN-LAST:event_payActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setVisible(false);
        new Both.Max(this).setVisible(true);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(ChooseBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseBank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JRadioButton b4;
    private javax.swing.JLabel back;
    private javax.swing.JLabel bck;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JLabel blk;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel minimize;
    private javax.swing.JButton pay;
    // End of variables declaration//GEN-END:variables
}
