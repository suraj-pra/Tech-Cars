/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Both;

/**
 *
 * @author Sam'
 */
public class Pane extends javax.swing.JFrame {

    /**
     * Creates new form Pane
     */
    
    public javax.swing.JFrame f;
    
    public Pane(javax.swing.JFrame f) {
        this.f = f;
        initComponents();
    }

    private Pane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void method() {}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        ok = new javax.swing.JLabel();
        yes = new javax.swing.JLabel();
        no = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setOpacity(0.8F);
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

        top.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        top.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 460, 30));

        txt.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 460, 30));

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        yes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yes.png"))); // NOI18N
        yes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yesMouseClicked(evt);
            }
        });
        getContentPane().add(yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        no.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png"))); // NOI18N
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noMouseClicked(evt);
            }
        });
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pbck.png"))); // NOI18N
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setFocusTraversalKeysEnabled(false);
        yes.setBorder(null);
        no.setBorder(null);
        ok.setBorder(null);
    }//GEN-LAST:event_formWindowOpened

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == 9){
            if(!ok.isVisible()){
                if(yes.getBorder() == null){
                    yes.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
                    no.setBorder(null);
                }
                else if(no.getBorder() == null){
                    no.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
                    yes.setBorder(null);
                }
            }
        }
        if(evt.getKeyCode() == 32){
            if(!ok.isVisible()){
                if(yes.getBorder() != null)
                    method();
                else if(no.getBorder() != null)
                    this.dispose();
            }
            else
                this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
        this.dispose();
    }//GEN-LAST:event_okMouseClicked

    private void yesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesMouseClicked
        method();
    }//GEN-LAST:event_yesMouseClicked

    private void noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseClicked
        this.dispose();
    }//GEN-LAST:event_noMouseClicked

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
            java.util.logging.Logger.getLogger(Pane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bck;
    public javax.swing.JLabel no;
    public javax.swing.JLabel ok;
    public javax.swing.JLabel top;
    public javax.swing.JLabel txt;
    public javax.swing.JLabel yes;
    // End of variables declaration//GEN-END:variables
}
