/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Both;

/**
 *
 * @author admin
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    
    public java.sql.Statement stmt;
    
    Login lg;
    FillDetails fdt = new FillDetails();
    String code;
    char ch;
    
    public SignUp(Login lg) {
        this.lg = lg;
        initComponents();
    }
    
    public void value(String code, char ch){
        this.code = code;
        this.ch = ch;
    }

    private SignUp() {
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

        pnl = new javax.swing.JPanel();
        idlb = new javax.swing.JLabel();
        psword = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        signup = new javax.swing.JButton();
        syspwd = new javax.swing.JPasswordField();
        sysconf = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        white = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        blk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 510));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl.setOpaque(false);

        idlb.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        idlb.setForeground(new java.awt.Color(153, 0, 51));
        idlb.setText("<ID>");
        idlb.setOpaque(true);

        psword.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        psword.setForeground(new java.awt.Color(153, 0, 51));
        psword.setText("Password:");
        psword.setOpaque(true);

        id.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N

        pwd.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N

        signup.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        signup.setText("Next >>");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addComponent(idlb, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addComponent(psword, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idlb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(psword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(signup)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 270, 150));

        syspwd.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        syspwd.setEchoChar('*');
        getContentPane().add(syspwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 200, 30));

        sysconf.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        sysconf.setText("Confirm System Password");
        sysconf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sysconfActionPerformed(evt);
            }
        });
        getContentPane().add(sysconf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 200, 30));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        white.setBackground(new java.awt.Color(255, 255, 255));
        white.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        white.setForeground(new java.awt.Color(102, 51, 255));
        white.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        white.setOpaque(true);
        getContentPane().add(white, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 50));

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bck(sgup).jpg"))); // NOI18N
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 450));

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
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, 40));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, 40));

        blk.setBackground(new java.awt.Color(0, 0, 0));
        blk.setOpaque(true);
        getContentPane().add(blk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        syspwd.setVisible(false);
        sysconf.setVisible(false);
        if (ch == 'a'){
            syspwd.setVisible(true);
            sysconf.setVisible(true);
            pnl.setVisible(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void sysconfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysconfActionPerformed
        if (new String (syspwd.getPassword()).equals("sps")){
            syspwd.setVisible(false);
            sysconf.setVisible(false);
            pnl.setVisible(true);
        }
        else{
            lg.setVisible(true);
            Pane p = new Pane(this);
            p.top.setText("Your wrote the wrong password.");
            p.txt.setText("So Bye Bye...");
            p.yes.setVisible(false);
            p.no.setVisible(false);
            p.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_sysconfActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        if(!id.getText().equals("") && !pwd.getText().equals("")){
            try {
                String query = "Select count(*) from " + code + " where " + ch + "_id = \""+id.getText()+"\";";
                java.sql.ResultSet rs = stmt.executeQuery(query);
                rs.first();

                int count = rs.getInt("count(*)");

                if(count == 0){
                    String insert1 = "Insert into " + code +" (" + ch + "_id, pwd) values (\""+id.getText()+"\", \""+new String(pwd.getPassword())+"\");";
                    stmt.executeUpdate(insert1);
                    if(ch == 'u'){
                        stmt.executeUpdate("Insert into game (u_id,  added) values (\""+id.getText()+"\", 100);");
                    }
                    fdt.setVisible(true);
                    fdt.white.setText(code+" Details");
                    fdt.value(code,ch,id.getText());
                    fdt.stmt = stmt;
                    lg.dispose();
                    this.dispose();
                    Pane p = new Pane(this);
                    p.txt.setText("Your " + code + " ID is succesfully created.");
                    p.yes.setVisible(false);
                    p.no.setVisible(false);
                    p.setVisible(true);
                }
                else{
                    Pane p = new Pane(this);
                    p.txt.setText("The " + code + "ID you entered already exists.");
                    p.yes.setVisible(false);
                    p.no.setVisible(false);
                    p.setVisible(true);
                }
            }
            catch (Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, e);
            }
        }
        else{
            Pane p = new Pane(this);
            p.txt.setText("First fill all details.");
            p.yes.setVisible(false);
            p.no.setVisible(false);
            p.setVisible(true);
        }
    }//GEN-LAST:event_signupActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setVisible(false);
        new Max(this).setVisible(true);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        lg.setVisible(true);
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel bck;
    private javax.swing.JLabel blk;
    private javax.swing.JLabel exit;
    public javax.swing.JTextField id;
    public javax.swing.JLabel idlb;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel pnl;
    private javax.swing.JLabel psword;
    public javax.swing.JPasswordField pwd;
    private javax.swing.JButton signup;
    private javax.swing.JButton sysconf;
    private javax.swing.JPasswordField syspwd;
    public javax.swing.JLabel white;
    // End of variables declaration//GEN-END:variables
}
