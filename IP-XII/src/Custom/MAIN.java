package Custom;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CNS
 */
public class MAIN extends javax.swing.JFrame {

    /**
     * Creates new form MAIN
     */
    public MAIN() {
        initComponents();
    }
    public String id;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l2.setFont(new java.awt.Font("Vrinda", 3, 36)); // NOI18N
        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/back btn.png"))); // NOI18N
        l2.setText("BACK");
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 140, 40));

        l1.setFont(new java.awt.Font("Vrinda", 3, 36)); // NOI18N
        l1.setText("CUSTOMIZE");
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 230, 40));

        l4.setFont(new java.awt.Font("Vijaya", 3, 24)); // NOI18N
        l4.setText("TERMS & CONDITIONS");
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/main.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
         TERMS T=new TERMS();
         T.setVisible(true);
         T.id=id;
         this.dispose();

    }//GEN-LAST:event_l4MouseClicked

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        CHOOSE T=new CHOOSE();
         T.setVisible(true);
         T.id=id;
         this.dispose();
    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        User.UserHome u = new User.UserHome();
        u.id.setText(id);
        u.stmt = new data.data().stmt;
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l2MouseClicked

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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel l1;
    public javax.swing.JLabel l2;
    private javax.swing.JLabel l4;
    // End of variables declaration//GEN-END:variables
}
