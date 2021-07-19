/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IP;

import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sam'
 */
public class rdata {
    public int n;
    public Connection con;
    public Statement stmt;
    {
        try {
            Class.forName("java.sql.Driver");
            
            con = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/ip","root","sps");
            
            stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public int method(UserHome2 u, Model2 mn, String query, String brand, String model) throws SQLException{
        JLabel pic[] = {mn.pic1, mn.pic2, mn.pic3, mn.pic4, mn.pic5, mn.pic6, mn.pic7, mn.pic8, mn.pic9, mn.pic10};
        JLabel name[] = {mn.name1, mn.name2, mn.name3, mn.name4, mn.name5, mn.name6, mn.name7, mn.name8, mn.name9, mn.name10};
        JLabel pr[] = {mn.pr1, mn.pr2, mn.pr3, mn.pr4, mn.pr5, mn.pr6, mn.pr7, mn.pr8, mn.pr9, mn.pr10};
        JButton b[] = {mn.b1, mn.b2, mn.b3, mn.b4, mn.b5, mn.b6, mn.b7, mn.b8, mn.b9, mn.b10};
        ResultSet subrs = stmt.executeQuery(query);
        subrs.last();
        n = subrs.getRow() - 1;
        subrs.first();

        for(int i = 0;i <= n;i++){
            pic[i].setVisible(true);
            pic[i].setIcon(new ImageIcon("D:\\New folder\\" + brand + "\\" + model + "\\" + subrs.getString("submodel") + ".png"));
            name[i].setVisible(true);
            name[i].setText(subrs.getString("submodel"));
            pr[i].setVisible(true);
            pr[i].setText(subrs.getString("price"));
            b[i].setVisible(true);
            subrs.next();
        }

        for(int i = n + 1;i < 10;i++){
            pic[i].setVisible(false);
            name[i].setVisible(false);
            pr[i].setVisible(false);
            b[i].setVisible(false);
        }
        return n;
    }
}
