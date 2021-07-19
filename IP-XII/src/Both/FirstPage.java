/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Both;

/**
 *
 * @author Suraj
 */
public class FirstPage extends javax.swing.JFrame {

    /**
     * Creates new form FirstPage
     */
    
    Login l = new Login(0, null, null, null);
    
    public FirstPage() {
        initComponents();
    }
    
    void open(String code, char ch){
        l.idlb.setText(code + "ID:");
        l.code = code;
        l.ch = ch;
        l.setVisible(true);
        this.dispose();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminicon = new javax.swing.JLabel();
        usericon = new javax.swing.JLabel();
        adm = new javax.swing.JLabel();
        usr = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        blk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin icon.png"))); // NOI18N
        getContentPane().add(adminicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, -1));

        usericon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user icon.png"))); // NOI18N
        getContentPane().add(usericon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 150, 136));

        adm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        adm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admMouseClicked(evt);
            }
        });
        getContentPane().add(adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        usr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        usr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usrMouseClicked(evt);
            }
        });
        getContentPane().add(usr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Mini Logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 560, -1));

        bck.setBackground(new java.awt.Color(0, 0, 0));
        bck.setOpaque(true);
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 560, 440));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/min.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, 40));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 40));

        blk.setBackground(new java.awt.Color(0, 0, 0));
        blk.setOpaque(true);
        getContentPane().add(blk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setFocusTraversalKeysEnabled(false);
        adm.setBorder(null);
        usr.setBorder(null);
    }//GEN-LAST:event_formWindowOpened

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == 9){
            if(adm.getBorder() == null){
                adm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2));
                usr.setBorder(null);
            }
            else if(usr.getBorder() == null){
                usr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2));
                adm.setBorder(null);
            }
        }
        if(evt.getKeyCode() == 32){
            if(adm.getBorder() != null){
                open("Admin", 'a');
                l.hmpg.setVisible(false);
            }
            else if(usr.getBorder() != null){
                open("User", 'u');
                l.custadm.setVisible(false);
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void admMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admMouseClicked
        open("Admin", 'a');
        l.hmpg.setVisible(false);
    }//GEN-LAST:event_admMouseClicked

    private void usrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrMouseClicked
        open("User", 'u');
        l.custadm.setVisible(false);
    }//GEN-LAST:event_usrMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setVisible(false);
        new Max(this).setVisible(true);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

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
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlwaysOn().setVisible(true);
                new FirstPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adm;
    private javax.swing.JLabel adminicon;
    private javax.swing.JLabel bck;
    private javax.swing.JLabel blk;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel usericon;
    private javax.swing.JLabel usr;
    // End of variables declaration//GEN-END:variables
}
