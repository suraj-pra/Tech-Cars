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
 * @author Sam
 */
public class PayMode extends javax.swing.JFrame {

    /**
     * Creates new form PayMode
     */
    
    User.Desc d;
    Desc2 d2;
    
    public String cname, fname1, price;
    int n;
    
    public PayMode(User.Desc d, Desc2 d2, int n) {
        this.n = n;
        this.d = d;
        this.d2 = d2;
        initComponents();
    }

    private PayMode() {
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
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        prc = new javax.swing.JTextField();
        fname0 = new javax.swing.JLabel();
        lname0 = new javax.swing.JLabel();
        prc0 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        cash = new javax.swing.JRadioButton();
        net = new javax.swing.JRadioButton();
        go = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        t_c = new javax.swing.JLabel();
        gpt = new javax.swing.JCheckBox();
        sld = new javax.swing.JSlider();
        nprc = new javax.swing.JLabel();
        dis = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 200, 30));

        lname.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 200, 30));

        prc.setEditable(false);
        prc.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        getContentPane().add(prc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 200, 30));

        fname0.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        fname0.setText("First Name:");
        getContentPane().add(fname0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 90, -1));

        lname0.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lname0.setText("Last Name:");
        getContentPane().add(lname0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 90, -1));

        prc0.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        prc0.setText("Price:");
        getContentPane().add(prc0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 90, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        head.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        head.setForeground(new java.awt.Color(255, 255, 255));
        head.setText("Select Payment Mode");
        getContentPane().add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 250, 40));

        bg.add(cash);
        cash.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cash.setForeground(new java.awt.Color(153, 204, 0));
        cash.setSelected(true);
        cash.setText("Cash");
        cash.setOpaque(false);
        getContentPane().add(cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, -1));

        bg.add(net);
        net.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        net.setForeground(new java.awt.Color(153, 204, 0));
        net.setText("NetBanking");
        net.setOpaque(false);
        getContentPane().add(net, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, -1));

        go.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/go.PNG"))); // NOI18N
        go.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        getContentPane().add(go, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 120, 80));

        id.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        id.setForeground(new java.awt.Color(51, 0, 51));
        id.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 210, 20));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon.jpg"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));

        t_c.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        t_c.setForeground(new java.awt.Color(204, 204, 255));
        t_c.setText("*Terms and Conditons apply");
        t_c.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_cMouseClicked(evt);
            }
        });
        getContentPane().add(t_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 220, 20));

        gpt.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        gpt.setForeground(new java.awt.Color(255, 204, 153));
        gpt.setText("Apply discount from Game Points");
        gpt.setOpaque(false);
        gpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gptActionPerformed(evt);
            }
        });
        getContentPane().add(gpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

        sld.setOpaque(false);
        sld.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sldMouseDragged(evt);
            }
        });
        getContentPane().add(sld, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 310, -1));
        getContentPane().add(nprc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 200, 20));

        dis.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        getContentPane().add(dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 60, 20));

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mbck.jpg"))); // NOI18N
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 910, 540));

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
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 30, 40));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 40));

        blk.setBackground(new java.awt.Color(0, 0, 0));
        blk.setOpaque(true);
        getContentPane().add(blk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setVisible(false);
        new Both.Max(this).setVisible(true);
    }//GEN-LAST:event_minimizeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if(d != null)
            d.setVisible(true);
        if(d2 != null)
            d2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void t_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_cMouseClicked
        T_C t = new T_C(this);
        t.setVisible(true);
        t.prc.setText(prc.getText());
        this.setEnabled(false);
    }//GEN-LAST:event_t_cMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        sld.setMinimum(0);
        sld.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        for (char c: fname.getText().toCharArray()){
            if ("0123456789".indexOf(c) > -1) {
                Pane p = new Pane(this);
                p.txt.setText("I think name contains letters.");
                p.yes.setVisible(false);
                p.no.setVisible(false);
                p.setVisible(true);
                return;
            }
        }
        for (char c: lname.getText().toCharArray()){
            if ("0123456789".indexOf(c) > -1) {
                Pane p = new Pane(this);
                p.txt.setText("I think name contains letters.");
                p.yes.setVisible(false);
                p.no.setVisible(false);
                p.setVisible(true);
                return;
            }
        }
        if(!fname.getText().equals("") && !lname.getText().equals("")){
            if(cash.isSelected()){
                FinalPay f = new FinalPay(null, this, n);
                f.setVisible(true);
                f.txt.setText("Cash Payment:");
                f.cname = cname;
                f.name = fname.getText() + " " + lname.getText();
                f.prc.setText(prc.getText());
                f.fname = fname1;
                f.id = id.getText();
                f.ded = sld.getValue() * 200;
                f.paid = "No";
                this.setVisible(false);
            }
            else if(net.isSelected()){
                ChooseBank c = new ChooseBank(this, n);
                c.setVisible(true);
                c.cname = cname;
                c.name = fname.getText() + " " + lname.getText();
                c.prc= prc.getText();
                c.fname = fname1;
                c.id = id.getText();
                c.ded = sld.getValue() * 200;
                this.setVisible(false);
            }
        }
        else
            JOptionPane.showMessageDialog(null, "First fill all details.");
    }//GEN-LAST:event_goActionPerformed

    private void gptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gptActionPerformed
        if(gpt.isSelected()){
            sld.setVisible(true);
            try{
                Class.forName("java.sql.Driver");
                
                Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/project","root","sps");
                
                Statement stmt = con.createStatement();
                
                ResultSet rs = stmt.executeQuery("select stotal, added, ded from game where u_id = \"" + id.getText() + "\";");
                rs.first();
                
                int x = rs.getInt("stotal") + rs.getInt("added") - rs.getInt("ded");
                if(x <= 0)
                    x = 0;
                
                if(x/200 <= 15)
                    sld.setMaximum(x/200);
                else
                    sld.setMaximum(15);
                sld.setValue(0);
                
                stmt.close();
                rs.close();
                con.close();
                }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else{
            sld.setValue(0);
            sld.setVisible(false);
            prc.setText(price);
            nprc.setText("");
            dis.setText("");
        }
    }//GEN-LAST:event_gptActionPerformed

    private void sldMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldMouseDragged
        int p = Integer.parseInt(price);
        prc.setText("" + (p - (p * sld.getValue() / 100)));
        nprc.setText("" + p + " - " + p + " * " + sld.getValue() + "/" + 100);
        dis.setText("" + sld.getValue() + "%");
    }//GEN-LAST:event_sldMouseDragged

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
            java.util.logging.Logger.getLogger(PayMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel bck;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JLabel blk;
    private javax.swing.JRadioButton cash;
    private javax.swing.JLabel dis;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel fname0;
    private javax.swing.JButton go;
    private javax.swing.JCheckBox gpt;
    private javax.swing.JLabel head;
    private javax.swing.JLabel icon;
    public javax.swing.JLabel id;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel lname0;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel minimize;
    private javax.swing.JRadioButton net;
    private javax.swing.JLabel nprc;
    public javax.swing.JTextField prc;
    private javax.swing.JLabel prc0;
    private javax.swing.JSlider sld;
    private javax.swing.JLabel t_c;
    // End of variables declaration//GEN-END:variables
}
