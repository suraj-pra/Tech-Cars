/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author Suraj
 */
public class CarDetails extends javax.swing.JFrame {

    /**
     * Creates new form CarDetails
     */
    
    java.sql.Statement stmt;
    
    String brand = null, model = null;
    
    public CarDetails() {
        initComponents();
    }
    
    void upd(){
        UpdateCar upd = new UpdateCar(this, brand, model, name.getText());
        upd.opimg = pic.getIcon().toString();
        upd.optxt = upd.opimg.substring(0, upd.opimg.length() - 3) + "txt";
        upd.name.setText(name.getText());
        upd.price.setText(price.getText());
        upd.trans.setText(trans.getText());
        upd.oil.setText(oil.getText());
        upd.desc.setText(desc.getText());
        upd.pic.setIcon(pic.getIcon());
        upd.stmt = stmt;
        upd.setVisible(true);
        this.setVisible(false);
    }

    void dlt(){
        DeleteCar dlt = new DeleteCar(this, brand, name.getText());
        dlt.opimg = pic.getIcon().toString();
        dlt.optxt = dlt.opimg.substring(0, dlt.opimg.length() - 3) + "txt";
        dlt.stmt = stmt;
        dlt.setVisible(true);
        this.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        path = new javax.swing.JLabel();
        trans = new javax.swing.JLabel();
        oil = new javax.swing.JLabel();
        updt = new javax.swing.JLabel();
        dlte = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        scrollpane = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 340, 46));

        fname.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        fname.setText("Login");
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 170, 60));

        id.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 210, 20));

        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 12), new java.awt.Color(204, 0, 102))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 388, 240));

        price.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 121, 31));

        path.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        getContentPane().add(path, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 30));

        trans.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        getContentPane().add(trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 170, 30));

        oil.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        getContentPane().add(oil, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 180, 30));

        updt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Update Car Btn.PNG"))); // NOI18N
        updt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updtMouseClicked(evt);
            }
        });
        getContentPane().add(updt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        dlte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete Car Btn.png"))); // NOI18N
        dlte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dlteMouseClicked(evt);
            }
        });
        getContentPane().add(dlte, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, -1, -1));

        logout.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        logout.setForeground(new java.awt.Color(153, 51, 255));
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, 20));

        desc.setEditable(false);
        desc.setColumns(20);
        desc.setRows(5);
        desc.setToolTipText("");
        desc.setBorder(javax.swing.BorderFactory.createTitledBorder("KeyFeatures"));
        desc.setOpaque(false);
        scrollpane.setViewportView(desc);

        getContentPane().add(scrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 340, 250));

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descbck.jpg"))); // NOI18N
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 530));

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
        this.setFocusTraversalKeysEnabled(false);
        updt.setBorder(null);
        dlte.setBorder(null);
    }//GEN-LAST:event_formWindowOpened

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == 9){
            if(updt.getBorder() == null){
                updt.setBorder(new javax.swing.border.LineBorder(java.awt.Color.black, 2));
                dlte.setBorder(null);
            }
            else if(dlte.getBorder() == null){
                dlte.setBorder(new javax.swing.border.LineBorder(java.awt.Color.black, 2));
                updt.setBorder(null);
            }
        }
        if(evt.getKeyCode() == 32){
            if(updt.getBorder() != null)
                upd();
            else if(dlte.getBorder() != null)
                dlt();
        }
    }//GEN-LAST:event_formKeyPressed

    private void updtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updtMouseClicked
        upd();
    }//GEN-LAST:event_updtMouseClicked

    private void dlteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dlteMouseClicked
        dlt();
    }//GEN-LAST:event_dlteMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new data.data2().logout(this, "Admin", 'a', stmt);
    }//GEN-LAST:event_logoutMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        ChooseCar cc = new ChooseCar();
        cc.setVisible(true);
        cc.fname = fname.getText();
        cc.id = id.getText();
        cc.stmt = stmt;
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setVisible(false);
        new Both.Max(this).setVisible(true);
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
            java.util.logging.Logger.getLogger(CarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel bck;
    private javax.swing.JLabel blk;
    public javax.swing.JTextArea desc;
    private javax.swing.JLabel dlte;
    private javax.swing.JLabel exit;
    public javax.swing.JLabel fname;
    public javax.swing.JLabel id;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel minimize;
    public javax.swing.JLabel name;
    public javax.swing.JLabel oil;
    public javax.swing.JLabel path;
    public javax.swing.JLabel pic;
    public javax.swing.JLabel price;
    private javax.swing.JScrollPane scrollpane;
    public javax.swing.JLabel trans;
    private javax.swing.JLabel updt;
    // End of variables declaration//GEN-END:variables
}
