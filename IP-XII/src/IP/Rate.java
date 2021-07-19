/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IP;

import Both.Pane;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lab2 admin 12
 */
public class Rate extends javax.swing.JFrame {

    /**
     * Creates new form Rate
     */
    
    FinalPay f;
    
    String time, id, cname, car, prc, fname, paid;
    int n, x = 0, a = 1;
    
    public Rate(FinalPay f, int n) {
        this.n = n;
        this.f = f;
        initComponents();
    }

    private Rate() {
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

        bno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        srate = new javax.swing.JComboBox<>();
        bno0 = new javax.swing.JLabel();
        name0 = new javax.swing.JLabel();
        srate0 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        spnl = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        ok = new javax.swing.JButton();
        dwn = new javax.swing.JButton();
        blk = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bno.setEditable(false);
        bno.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        getContentPane().add(bno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 228, 30));

        name.setEditable(false);
        name.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 228, 30));

        srate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "4", "3", "2", "1" }));
        srate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                srateItemStateChanged(evt);
            }
        });
        getContentPane().add(srate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 230, 30));

        bno0.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        bno0.setText("Bill No:");
        getContentPane().add(bno0, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        name0.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        name0.setText("Name:");
        getContentPane().add(name0, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        srate0.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        srate0.setText("Star Ratings:");
        getContentPane().add(srate0, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rcbck.png"))); // NOI18N
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 250, 60));

        lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rlbck.png"))); // NOI18N
        getContentPane().add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 400, 132));

        ta.setEditable(false);
        ta.setColumns(20);
        ta.setRows(5);
        spnl.setViewportView(ta);

        getContentPane().add(spnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 336, 124));

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok_1.png"))); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 110, 80));

        dwn.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        dwn.setText("Download bill");
        dwn.setOpaque(false);
        dwn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dwnActionPerformed(evt);
            }
        });
        getContentPane().add(dwn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 140, 30));

        blk.setBackground(new java.awt.Color(0, 0, 0));
        blk.setOpaque(true);
        getContentPane().add(blk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rbck.jpg"))); // NOI18N
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 840, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        if(x == 1){
            JOptionPane.showMessageDialog(null, "Congratulations on being the proud owner\n"
                    + "of a new Tech cars. After you've enjoyed a few hundred\n"
                    + "miles of open road,remember to drop in for your free\n"
                    + "full-service tune-up which expires after 120 days.\n\n"
                    + "This is our way of letting you know how much we appreciate your\n"
                    + "business. We also want to help you protect your investment\n"
                    + "through regularly scheduled maintenance.\n\n"
                    + "We look forward to serving you soon. Until then, enjoy the\n"
                    + "Pacific Coast shoreline.\n\n\n"
                    +"                   Best regards.");
            try{
                Class.forName("java.sql.Driver");

                Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/project","root","sps");

                Statement stmt = con.createStatement();

                stmt.executeUpdate("update history set rating = \"" + srate.getSelectedItem() + "\" where b_no = \"" + bno.getText() + "\";");

                stmt.close();
                con.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

            if(n == 0){
                User.UserHome u = new User.UserHome();
                u.setVisible(true);
                u.fname.setText(fname);
                u.id.setText(id);
                u.stmt = new data.data().stmt;
                this.dispose();
            }
            if(n == 1){
                UserHome2 u = new UserHome2();
                u.setVisible(true);
                u.fname.setText(fname);
                u.id.setText(id);
                u.stmt = new rdata().stmt;
                this.dispose();
            }
        }
        else{
            Pane p = new Pane(this);
            p.txt.setText("First download your bill.");
            p.yes.setVisible(false);
            p.no.setVisible(false);
            p.setVisible(true);
        }
    }//GEN-LAST:event_okActionPerformed

    private void srateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_srateItemStateChanged
        String Rating = "";
        switch(Integer.parseInt((String) srate.getSelectedItem())){
            case 1: Rating = "* stars.";
                break;
            case 2: Rating = "** stars.";
                break;
            case 3: Rating = "*** stars.";
                break;
            case 4: Rating = "**** stars.";
                break;
            case 5: Rating = "***** stars.";
                break;
        }
        ta.setText(name.getText() + " Has Rated " + Rating);
    }//GEN-LAST:event_srateItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ta.setText(name.getText() + " Has Rated ***** stars.");
    }//GEN-LAST:event_formWindowOpened

    private void dwnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dwnActionPerformed
        Download d = new Download(this);
        d.time = time;
        d.bno = bno.getText();
        d.name = name.getText();
        d.id = id;
        d.cname = cname;
        d.car = car;
        d.prc = prc;
        d.paid = paid;
        d.setVisible(true);
        this.setEnabled(false);
        x = 1;
    }//GEN-LAST:event_dwnActionPerformed

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
            java.util.logging.Logger.getLogger(Rate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bck;
    private javax.swing.JLabel blk;
    public javax.swing.JTextField bno;
    private javax.swing.JLabel bno0;
    public javax.swing.JButton dwn;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel logo;
    public javax.swing.JTextField name;
    private javax.swing.JLabel name0;
    private javax.swing.JButton ok;
    private javax.swing.JScrollPane spnl;
    private javax.swing.JComboBox<String> srate;
    private javax.swing.JLabel srate0;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}