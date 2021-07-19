/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Suraj
 */
public class data2 {
    public String str = "show tables from project where Tables_in_project not like \"admin\" and Tables_in_project not like \"user\" and Tables_in_project not like \"game\" and Tables_in_project not like \"history\";";
    public Both.Pane p;
    
    public void logout(javax.swing.JFrame f, String code, char ch, java.sql.Statement stmt){
        p = new Both.Pane(f){
            @Override
            public void method(){
                Both.Login lg = new Both.Login(4, null, null, null);
                lg.setVisible(true);
                lg.idlb.setText(code + "ID:");
                lg.code = code;
                lg.ch = ch;
                if(ch == 'a')
                    lg.hmpg.setVisible(false);
                else if(ch == 'u')
                    lg.custadm.setVisible(false);
                try {
                    stmt.close();
                } catch (Exception e) {
                    javax.swing.JOptionPane.showMessageDialog(null, e);
                }
                f.dispose();
                this.dispose();
            }
        };
        p.top.setText("Warning");
        p.txt.setText("Do you really want to logout?");
        p.ok.setVisible(false);
        p.setVisible(true);
    }
}
