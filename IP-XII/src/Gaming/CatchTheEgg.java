/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gaming;

/**
 *
 * @author Suraj
 */
public class CatchTheEgg extends javax.swing.JFrame {

    /**
     * Creates new form CatchTheEgg
     */
    
    Score sc = new Score();
    String id, fname;
    int i = 0, n = 0;
    
    GamerID g;
    
    public CatchTheEgg() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blk = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();

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

        blk.setBackground(new java.awt.Color(0, 0, 0));
        blk.setOpaque(true);
        getContentPane().add(blk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 40));

        b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bucket.png"))); // NOI18N
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 100, -1));

        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/egg.png"))); // NOI18N
        getContentPane().add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -30, -1, -1));

        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/egg.png"))); // NOI18N
        getContentPane().add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -30, -1, -1));

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eggbck.png"))); // NOI18N
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 630, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(b.getX() >= 0 && evt.getKeyCode() == 37)
            b.setLocation(b.getX() - 2, b.getY());
        else
            b.setLocation(b.getX() + 2, b.getY());
        if(b.getX() <= 720 - b.getWidth() && evt.getKeyCode() == 39)
            b.setLocation(b.getX() + 2, b.getY());
        else
            b.setLocation(b.getX() - 2, b.getY());
    }//GEN-LAST:event_formKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        sc.setVisible(true);
        
        javax.swing.JFrame x = this;
        x.setVisible(true);
        GameOver go = new GameOver();
        java.util.Timer t = new java.util.Timer();
        
        t.schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                sc.score.setText("Score: " + i);
                
                boolean cd = false;
                
                if(n >= 200)
                    cd = true;
                
                if (e1.getY() > 490 - e1.getHeight() || e2.getY() > 490 - e2.getHeight()){
                    t.cancel();
                    sc.dispose();
                    go.name = "Catch The Egg";
                    go.gcode = "segg";
                    go.score = i;
                    go.id = id;
                    go.fname = fname;
                    go.g = g;
                    go.setVisible(true);
                    x.dispose();
                }
                else{
                    e1.setLocation(e1.getX(), e1.getY() + 1);
                    if(cd)
                        e2.setLocation(e2.getX(), e2.getY() + 1);
                    if (e1.getX() >= b.getX() && e1.getX() + e1.getWidth() <= b.getX() + b.getWidth() && e1.getY() == 380){
                        e1.setBounds(50 + (int) (Math.random() * 480), -20, e1.getWidth(), e1.getHeight());
                        i++;
                    }
                    if (e2.getX() >= b.getX() && e2.getX() + e2.getWidth() <= b.getX() + b.getWidth() && e2.getY() == 380){
                        e2.setBounds(50 + (int) (Math.random() * 480), -20, e2.getWidth(), e2.getHeight());
                        i++;
                    }
                }
                n++;
            }
        }, 1000, 15);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(CatchTheEgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatchTheEgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatchTheEgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatchTheEgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatchTheEgg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b;
    private javax.swing.JLabel bck;
    private javax.swing.JLabel blk;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    // End of variables declaration//GEN-END:variables
}
