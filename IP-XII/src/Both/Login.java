/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Both;

import User.Desc;
import User.Model;
import User.UserHome;

/**
 *
 * @author admin
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    java.sql.Statement stmt = new data.data().stmt;
    
    SignUp sg = new SignUp(this);
    
    public String code = "User";
    public char ch = 'u';
    
    UserHome u = null;
    Model m = null;
    Desc d = null;
    int n = 0;
    
    public Login(int n, UserHome u, Model m, Desc d) {
        this.n = n;
        this.u = u;
        this.m = m;
        this.d = d;
        initComponents();
    }

    Login() {
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

        logo = new javax.swing.JLabel();
        idlb = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        psword = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        hmpg = new javax.swing.JLabel();
        signup = new javax.swing.JLabel();
        fback = new javax.swing.JLabel();
        custadm = new javax.swing.JLabel();
        cont = new javax.swing.JLabel();
        abt = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        blk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 560));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, -1, -1));

        idlb.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        idlb.setForeground(new java.awt.Color(153, 204, 255));
        idlb.setText("UserID:");
        getContentPane().add(idlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 70, 20));

        id.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 160, 30));

        psword.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        psword.setForeground(new java.awt.Color(153, 204, 255));
        psword.setText("Password:");
        getContentPane().add(psword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 80, 20));

        pwd.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        getContentPane().add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 160, 30));

        login.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        login.setText("Login >>");
        login.setOpaque(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 90, -1));

        hmpg.setBackground(new java.awt.Color(255, 255, 255));
        hmpg.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        hmpg.setForeground(new java.awt.Color(102, 0, 255));
        hmpg.setText("->Visit the User Home Page First");
        hmpg.setOpaque(true);
        hmpg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hmpgMouseClicked(evt);
            }
        });
        getContentPane().add(hmpg, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 240, 20));

        signup.setBackground(new java.awt.Color(255, 255, 255));
        signup.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        signup.setForeground(new java.awt.Color(102, 0, 255));
        signup.setText("->Don't have an Account? Sign Up");
        signup.setOpaque(true);
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 240, 20));

        fback.setBackground(new java.awt.Color(255, 255, 255));
        fback.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        fback.setForeground(new java.awt.Color(102, 0, 255));
        fback.setText("->Select between User/Admin");
        fback.setOpaque(true);
        fback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fbackMouseClicked(evt);
            }
        });
        getContentPane().add(fback, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 240, 20));

        custadm.setBackground(new java.awt.Color(0, 153, 153));
        custadm.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        custadm.setText("->Enter as Customization Admin");
        custadm.setOpaque(true);
        custadm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custadmMouseClicked(evt);
            }
        });
        getContentPane().add(custadm, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 240, 20));

        cont.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cont.setForeground(new java.awt.Color(0, 102, 255));
        cont.setText("Contact Us");
        cont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contMouseClicked(evt);
            }
        });
        getContentPane().add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 80, 30));

        abt.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        abt.setForeground(new java.awt.Color(0, 102, 255));
        abt.setText("About Us");
        abt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abtMouseClicked(evt);
            }
        });
        getContentPane().add(abt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 70, 30));

        num.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Toll Free.JPG"))); // NOI18N
        getContentPane().add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginbck.jpg"))); // NOI18N
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

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

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {
            String query = "Select fname from " + code + " where " + ch + "_id = \""+id.getText()+"\" and binary pwd = \""+new String(pwd.getPassword())+"\";";
            java.sql.ResultSet rs = stmt.executeQuery(query);
            rs.last();
            
            if(rs.getRow() == 1){
                if (ch == 'u'){
                    if (u != null || m != null || d != null){
                        if (n == 1){
                            u.setVisible(true);
                            u.fname.setText(rs.getString("fname"));
                            u.id.setText(id.getText());
                        }
                        if (n == 2){
                            m.setVisible(true);
                            m.fname.setText(rs.getString("fname"));
                            m.id.setText(id.getText());
                        }
                        if (n == 3){
                            d.setVisible(true);
                            d.fname.setText(rs.getString("fname"));
                            d.id.setText(id.getText());
                        }
                    }
                    else {
                        UserHome uh = new UserHome();
                        uh.setVisible(true);
                        uh.fname.setText(rs.getString("fname"));
                        uh.id.setText(id.getText());
                        uh.stmt = stmt;
                    }
                }
                if (ch == 'a'){
                    Admin.AdminHome ad = new Admin.AdminHome();
                    ad.setVisible(true);
                    ad.fname.setText(rs.getString("fname"));
                    ad.id.setText(id.getText());
                    ad.stmt = stmt;
                }
                this.dispose();
                Pane p = new Pane(this);
                p.txt.setText("You are succesfully logged in.");
                p.yes.setVisible(false);
                p.no.setVisible(false);
                p.setVisible(true);
            }
            else{
                java.sql.ResultSet r = stmt.executeQuery("Select fname from " + code + " where binary " + ch + "_id = \""+id.getText()+"\";");
                r.last();
                if(r.getRow() == 1){
                    Pane p = new Pane(this);
                    p.txt.setText("The password you entered is invalid.");
                    p.yes.setVisible(false);
                    p.no.setVisible(false);
                    p.setVisible(true);
                }
                else{
                    Pane p = new Pane(this){
                        @Override
                        public void method(){
                            sg.setVisible(true);
                            sg.value(code,ch);
                            sg.white.setText(code+" Sign Up");
                            sg.idlb.setText(code+"ID:");
                            sg.stmt = stmt;
                            f.dispose();
                            this.dispose();
                        }
                    };
                    p.top.setText("The " + code + "ID you entered does not exist.");
                    p.txt.setText("Would you like to sign up.");
                    p.ok.setVisible(false);
                    p.setVisible(true);
                }
            }
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        sg.setVisible(true);
        sg.value(code,ch);
        sg.white.setText(code+" Sign Up");
        sg.idlb.setText(code+"ID:");
        sg.stmt = stmt;
        this.setVisible(false);
    }//GEN-LAST:event_signupMouseClicked

    private void hmpgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hmpgMouseClicked
        UserHome uh = new UserHome();
        uh.setVisible(true);
        uh.stmt = stmt;
        this.dispose();
    }//GEN-LAST:event_hmpgMouseClicked

    private void fbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fbackMouseClicked
        new FirstPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fbackMouseClicked

    private void contMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contMouseClicked
        javax.swing.JOptionPane.showMessageDialog(null, "Customer Service\n" +
                "Text or Call: (888) 780-1234\n" +
                "\n" +
                "\n" +
                "TagCars Offices\n" +
                "(312) 500-5000\n" +
                "Fax: (312) 500-5700\n" +
                "\n" +
                "\n" +
                "National Advertising\n" +
                "TagSales@cars.com\n" +
                "\n" +
                "\n" +
                "Media Inquiries\n" +
                "Tag Department\n" +
                "Tag@cars.com");
    }//GEN-LAST:event_contMouseClicked

    private void abtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abtMouseClicked
        javax.swing.JOptionPane.showMessageDialog(null, 
                "TagCars is one of India's leading online auto marketplace providing buyers and sellers a structured \n"
                + "platform for transacting in new and used vehicles. Since its inception in 2010, we have expanded our \n"
                + "offerings across India with a strong network of more than 4000 dealers. Currently, over 4 million unique \n"
                + "consumers visit TagCars every month and avail of its features. TagCars's business can be divided \n"
                + "into two parts: TagCars, the consumer portal where the users can visit to buy used/new \n"
                + "cars and TagTrade Exchange, the dealer portal which helps them manage their business operations.\n"
                + "\n"
                + "What makes TagCars unique are its offerings and world class technology. Some of the unique features \n"
                + "include used car price information, certified used cars, on road dealer prices and expert reviews that \n"
                + "empower our buyers to choose the most suitable vehicles at the most affordable prices.\n"
                + "Additionally, we also provide information related to the automobile industry and the latest automotive \n"
                + "news. Our expert views and reviews of exciting upcoming models in the market guide and help buyers choose \n"
                + "the best option.\n"
                + "\n"
                + "We're proud of our sincere and continuous efforts, both for car buyers, sellers and the other people who want \n"
                + "to know more about the automotive industry in India. So whether you're a first-time visitor, a frequent \n"
                + "user, an avid auto enthusiast, a job seeker or a journalist working on a story, we hope you'll find \n"
                + "what you're looking for.\n"
                + "\n"
                + "\n"
                + "Investors and shareholders\n"
                + "\n"
                + "TagTrade was founded by Umang Sharma, Suraj Prakash and Rajat Agarwal (in partnership) in 2017.\n"
                + "Existing investors include Warburg Pincus, JP Morgan, Temasek, March Capital and Epiphany ventures.");
    }//GEN-LAST:event_abtMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        switch (n) {
            case 0:
                new FirstPage().setVisible(true);
                this.dispose();
                break;
            case 1:
                u.setVisible(true);
                this.dispose();
                break;
            case 2:
                m.setVisible(true);
                this.dispose();
                break;
            case 3:
                d.setVisible(true);
                this.dispose();
                break;
            default:
                Pane p = new Pane(this);
                p.txt.setText("You can't go back now.");
                p.yes.setVisible(false);
                p.no.setVisible(false);
                p.setVisible(true);
                break;
        }
    }//GEN-LAST:event_backMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setVisible(false);
        new Max(this).setVisible(true);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void custadmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custadmMouseClicked
        new Custom.ADMIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_custadmMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(0, null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abt;
    private javax.swing.JLabel back;
    private javax.swing.JLabel bck;
    private javax.swing.JLabel blk;
    private javax.swing.JLabel cont;
    public javax.swing.JLabel custadm;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fback;
    public javax.swing.JLabel hmpg;
    public javax.swing.JTextField id;
    public javax.swing.JLabel idlb;
    private javax.swing.JButton login;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel num;
    private javax.swing.JLabel psword;
    public javax.swing.JPasswordField pwd;
    private javax.swing.JLabel signup;
    // End of variables declaration//GEN-END:variables
}
