/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author admin
 */
public class UserAccount extends javax.swing.JFrame {

    /**
     * Creates new form UserAccount
     */
    
    java.sql.Statement stmt;
    
    UserHome u;
    Model m;
    Desc d;
    int n;
    String ids;
    
    public UserAccount(String ids, int n, UserHome u, Model m, Desc d) {
        this.ids = ids;
        this.n = n;
        this.u = u;
        this.m = m;
        this.d = d;
        initComponents();
    }

    private UserAccount() {
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

        logout = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        month = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        updt = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        blk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        logout.setForeground(new java.awt.Color(153, 51, 255));
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, -1, 20));

        fname.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 310, 20));

        lname.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 310, 20));

        id.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 310, 20));

        gender.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 300, 20));

        year.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        year.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 70, 20));

        month.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        month.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        getContentPane().add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 70, 20));

        date.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 70, 20));

        updt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Update Btn.PNG"))); // NOI18N
        updt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updtMouseClicked(evt);
            }
        });
        getContentPane().add(updt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Details.png"))); // NOI18N
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 480));

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
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 30, 40));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 40));

        blk.setBackground(new java.awt.Color(0, 0, 0));
        blk.setOpaque(true);
        getContentPane().add(blk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try {
            String query = "Select fname, lname, gender, year(DOB) as year, month(DOB) as month, day(DOB) as date from user where u_id = \"" + ids + "\";";
            java.sql.ResultSet rs = stmt.executeQuery(query);
            rs.first();

            fname.setText(rs.getString("fname"));
            lname.setText(rs.getString("lname"));
            id.setText(ids);
            gender.setText(rs.getString("gender"));
            year.setText(rs.getString("year"));
            month.setText(rs.getString("month"));
            date.setText(rs.getString("date"));
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void updtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updtMouseClicked
        UpdateDetails upd = new UpdateDetails(this, id.getText());
        upd.idlb.setText(id.getText());
        upd.fname.setText(fname.getText());
        upd.lname.setText(lname.getText());
        if (gender.getText().equals("M"))
            upd.M.setSelected(true);
        else if (gender.getText().equals("F"))
            upd.F.setSelected(true);
        upd.year.setText(year.getText());
        upd.month.setText(month.getText());
        upd.date.setText(date.getText());
        upd.stmt = stmt;
        upd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updtMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if (n == 1){
            u.setVisible(true);
            u.fname.setText(fname.getText());
        }
        if (n == 2){
            m.setVisible(true);
            m.fname.setText(fname.getText());
        }
        if (n == 3){
            d.setVisible(true);
            d.fname.setText(fname.getText());
        }
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setVisible(false);
        new Both.Max(this).setVisible(true);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new data.data2().logout(this, "User", 'u', stmt);
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel bck;
    private javax.swing.JLabel blk;
    public javax.swing.JLabel date;
    private javax.swing.JLabel exit;
    public javax.swing.JLabel fname;
    public javax.swing.JLabel gender;
    public javax.swing.JLabel id;
    public javax.swing.JLabel lname;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel minimize;
    public javax.swing.JLabel month;
    private javax.swing.JLabel updt;
    public javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
