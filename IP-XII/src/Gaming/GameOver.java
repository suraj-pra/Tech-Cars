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
public class GameOver extends javax.swing.JFrame {

    /**
     * Creates new form GameOver
     */
    
    java.sql.Statement stmt = new data.data().stmt;
    
    int score, i = 0;
    int time = -1;
    int s;
    String id, fname;
    String name, gcode;
    
    GamerID g;
    
    public GameOver() {
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
        img = new javax.swing.JLabel();
        gname = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blk.setBackground(new java.awt.Color(0, 0, 0));
        blk.setOpaque(true);
        getContentPane().add(blk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 900, 470));

        gname.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        gname.setForeground(new java.awt.Color(204, 0, 255));
        getContentPane().add(gname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 20));

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gobck.PNG"))); // NOI18N
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        gname.setText(name);
        img.setIcon(new javax.swing.ImageIcon("D:\\Game\\" + name + "Over.png"));
        
        try {
            String update = "Update game set " + gcode + " = " + gcode + " + " + score + " , stotal = stotal + " + score + " where u_id = \"" + id + "\";";
            stmt.executeUpdate(update);
            
            String query = "Select stotal, added, ded from game where u_id = \"" + id + "\";";
            java.sql.ResultSet rs = stmt.executeQuery(query);
            rs.first();
            s = rs.getInt("stotal") + rs.getInt("added") - rs.getInt("ded");
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
        
        javax.swing.JFrame x = this;
        java.util.Timer t = new java.util.Timer();
        
        t.schedule(new java.util.TimerTask(){
            @Override
            public void run() {
                if(i == 2){
                    PlayDetails pd = new PlayDetails();
                    pd.g = g;
                    pd.fname.setText(fname);
                    pd.id.setText(id);
                    pd.fscore.setText("Score: " + score);
                    pd.s = s;
                    if(time >= 0){
                        pd.time.setText("Time Taken: " + time + " sec");
                        pd.stotal.setText("Total Score: " + s);
                    }
                    else
                        pd.time.setText("Total Score: " + s);
                    pd.setVisible(true);
                    try {
                        stmt.close();
                    } catch (Exception e) {
                        javax.swing.JOptionPane.showMessageDialog(null, e);
                    }
                    x.dispose();
                }
                i++;
            }
        }, 1000, 1000);
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
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameOver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bck;
    private javax.swing.JLabel blk;
    public javax.swing.JLabel gname;
    public javax.swing.JLabel img;
    // End of variables declaration//GEN-END:variables
}
