/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Both.Pane;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Suraj
 */
public class AddCar extends javax.swing.JFrame {

    /**
     * Creates new form AddCar
     */
    
    Statement stmt;
    
    int c = 0;
    
    public AddCar() {
        initComponents();
    }
    
    public String readUsingFiles(String fileName) throws java.io.IOException {
        java.nio.file.Path path = java.nio.file.Paths.get(fileName);
        byte[] bytes = java.nio.file.Files.readAllBytes(path);
        @SuppressWarnings("unused")
                java.util.List<String> allLines = java.nio.file.Files.readAllLines(path, StandardCharsets.UTF_8);
        return (new String(bytes));
    }

    public void method(){
        int n = 0;
        
        if(!brand.getText().equals("") && !model.getText().equals("")){
            if(!(name.getText().equals("") || price.getText().equals("") || pic.getIcon() == null || desc.getText().equals(""))){
                try {
                    if(c == 1){
                        String query = "show tables like \"" + brand.getText() + "\";";
                        ResultSet rs = stmt.executeQuery(query);
                        rs.last();
                        if(rs.getRow() > 0){
                            Pane p = new Pane(this);
                            p.txt.setText("The brand already exists.");
                            p.yes.setVisible(false);
                            p.no.setVisible(false);
                            p.setVisible(true);
                        }
                        else{
                            String s = brand.getText();
                            String q = "create table " + s.substring(0, 1).toUpperCase() + s.substring(1, s.length()) + "(model varchar(15), submodel varchar(50) primary key, price integer(15), transmission varchar(10), oil_type varchar(10));";
                            stmt.executeUpdate(q);
                            new File("D:\\Path\\" + brand.getText() + "\\" + model.getText()).mkdirs();
                            n = 1;
                        }
                    }
                    if(c == 2 || c == 3){
                        String query = "Select count(*) from " + brand.getText() + " where submodel = \"" + name.getText() + "\";";
                        ResultSet rs = stmt.executeQuery(query);
                        rs.first();

                        if(rs.getInt("count(*)") == 0){
                            n = 1;
                            if(c == 3){
                                ResultSet sr = stmt.executeQuery("Select count(*) from " + brand.getText() + " where model = \"" + model.getText() + "\";");
                                sr.first();
                                if(sr.getInt("count(*)") == 0)
                                    new File("D:\\Path\\" + brand.getText() + "\\" + model.getText()).mkdirs();
                                else{
                                    n = 0;
                                    Pane p = new Pane(this);
                                    p.txt.setText("The model already exists.");
                                    p.yes.setVisible(false);
                                    p.no.setVisible(false);
                                    p.setVisible(true);
                                }
                            }
                        }
                        else{
                            Pane p = new Pane(this);
                            p.txt.setText("The name already exists.");
                            p.yes.setVisible(false);
                            p.no.setVisible(false);
                            p.setVisible(true);
                        }
                    }
                    if(n == 1){
                        stmt.executeUpdate("Insert into " + brand.getText() + " values(\"" + model.getText() + "\",\"" + name.getText() + "\",\"" + price.getText() + "\",\"" + trans.getSelectedItem() + "\",\"" + oil.getSelectedItem() + "\");");
                        
                        {
                            try {
                                javax.imageio.ImageIO.write(javax.imageio.ImageIO.read(new File(pic.getIcon().toString())), "png", new File("D:\\Path\\" + brand.getText() + "\\" + model.getText() + "\\" + name.getText() + ".png"));

                                java.io.PrintWriter w = new java.io.PrintWriter("D:\\Path\\" + brand.getText() + "\\" + model.getText() + "\\" + name.getText() + ".txt", "UTF-8");
                                w.print(desc.getText());
                                w.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
                        AdminHome ad = new AdminHome();
                        ad.setVisible(true);
                        ad.fname.setText(fname.getText());
                        ad.id.setText(id.getText());
                        ad.stmt = stmt;
                        this.dispose();
                        Pane p = new Pane(this);
                        p.txt.setText("Details are successfully added.");
                        p.yes.setVisible(false);
                        p.no.setVisible(false);
                        p.setVisible(true);
                    }
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            else{
                Pane p = new Pane(this);
                p.txt.setText("First fill all values correctly.");
                p.yes.setVisible(false);
                p.no.setVisible(false);
                p.setVisible(true);
            }
        }
        else{
            Pane p = new Pane(this);
            p.txt.setText("First write brand and model.");
            p.yes.setVisible(false);
            p.no.setVisible(false);
            p.setVisible(true);
        }
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
        panel = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        pnl1 = new javax.swing.JPanel();
        brd1 = new javax.swing.JLabel();
        brand1 = new javax.swing.JTextField();
        mdl1 = new javax.swing.JLabel();
        model1 = new javax.swing.JTextField();
        pnl = new javax.swing.JPanel();
        tab = new javax.swing.JTabbedPane();
        pnl2 = new javax.swing.JPanel();
        brand2 = new javax.swing.JComboBox<>();
        model2 = new javax.swing.JComboBox<>();
        pnl3 = new javax.swing.JPanel();
        brand3 = new javax.swing.JComboBox<>();
        mdl3 = new javax.swing.JLabel();
        model3 = new javax.swing.JTextField();
        scrollpane = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        brand = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        trans = new javax.swing.JComboBox<>();
        oil = new javax.swing.JComboBox<>();
        brd = new javax.swing.JLabel();
        mdl = new javax.swing.JLabel();
        nm = new javax.swing.JLabel();
        prc = new javax.swing.JLabel();
        trns = new javax.swing.JLabel();
        ol = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        bdesc = new javax.swing.JButton();
        bimg = new javax.swing.JButton();
        fname = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
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

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabs.setToolTipText("You can add atmost 10 brands, 10 models and 10 cars in them.");
        tabs.setOpaque(true);

        pnl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl1MouseClicked(evt);
            }
        });
        pnl1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brd1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        brd1.setText("Brand:");
        pnl1.add(brd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 20));

        brand1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        brand1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brand1MouseClicked(evt);
            }
        });
        brand1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                brand1KeyReleased(evt);
            }
        });
        pnl1.add(brand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 420, 30));

        mdl1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        mdl1.setText("Model:");
        pnl1.add(mdl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 20));

        model1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        model1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        model1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                model1KeyReleased(evt);
            }
        });
        pnl1.add(model1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 420, 30));

        tabs.addTab("New Brand", pnl1);

        pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        pnl2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brand2.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        brand2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Brand>" }));
        brand2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                brand2ItemStateChanged(evt);
            }
        });
        pnl2.add(brand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 30));

        model2.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        model2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Model>" }));
        model2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                model2ItemStateChanged(evt);
            }
        });
        pnl2.add(model2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 250, 30));

        tab.addTab("Old Model", pnl2);

        pnl3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brand3.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        brand3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Brand>" }));
        brand3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                brand3ItemStateChanged(evt);
            }
        });
        pnl3.add(brand3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 30));

        mdl3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        mdl3.setText("Model:");
        pnl3.add(mdl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, 20));

        model3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        model3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        model3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                model3KeyReleased(evt);
            }
        });
        pnl3.add(model3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 340, 30));

        tab.addTab("New Model", pnl3);

        pnl.add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 570, 120));

        tabs.addTab("Old Brand", pnl);

        panel.add(tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 590, 150));

        desc.setColumns(20);
        desc.setRows(5);
        desc.setToolTipText("");
        desc.setBorder(javax.swing.BorderFactory.createTitledBorder("Modify Key Features"));
        desc.setOpaque(false);
        scrollpane.setViewportView(desc);

        panel.add(scrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 330, 260));

        brand.setEditable(false);
        brand.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        brand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 360, 30));

        model.setEditable(false);
        model.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        model.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 360, 30));

        name.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 360, 30));

        price.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });
        panel.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 360, 30));

        trans.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        trans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automatic", "Manual" }));
        panel.add(trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 250, 30));

        oil.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        oil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Petrol", "Diesel" }));
        panel.add(oil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 250, 30));

        brd.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        brd.setText("Brand:");
        panel.add(brd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 20));

        mdl.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        mdl.setText("Model:");
        panel.add(mdl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 20));

        nm.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        nm.setText("Name:");
        panel.add(nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 50, 20));

        prc.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        prc.setText("Price:");
        panel.add(prc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 60, 20));

        trns.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        trns.setText("Transmission:");
        panel.add(trns, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, 20));

        ol.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ol.setText("Oil Type:");
        panel.add(ol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 20));

        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 12), new java.awt.Color(204, 0, 102))); // NOI18N
        panel.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 460, 210));

        bdesc.setText("Or Browse desc");
        bdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdescActionPerformed(evt);
            }
        });
        panel.add(bdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, -1, -1));

        bimg.setText("Browse image");
        bimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bimgActionPerformed(evt);
            }
        });
        panel.add(bimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 620, -1, -1));

        fname.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        fname.setText("Login");
        panel.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 170, 60));

        id.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        panel.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 210, 20));

        logout.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        logout.setForeground(new java.awt.Color(153, 51, 255));
        logout.setText("Logout");
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        panel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, 20));

        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add btn.png"))); // NOI18N
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        panel.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, -1, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 850, 670));

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
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, 40));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, 40));

        blk.setBackground(new java.awt.Color(0, 0, 0));
        blk.setOpaque(true);
        getContentPane().add(blk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        panel.setBackground(new java.awt.Color(10 + (int)(Math.random() * 245), 10 + (int)(Math.random() * 245), 10 + (int)(Math.random() * 245)));
        
        model1.setEnabled(false);
        model2.setEnabled(false);
        model3.setEnabled(false);
        
        brand2.removeAllItems();
        brand2.addItem("<Select Brand>");
        brand3.removeAllItems();
        brand3.addItem("<Select Brand>");
        try{
            ResultSet rs = stmt.executeQuery(new data.data2().str);
            rs.last();
            
            if(rs.getRow() >= 10){
                pnl1.setEnabled(false);
                brand1.setEnabled(false);
                c = 0;
            }
            else
                c = 1;
            
            rs.first();
            do{
                String str = rs.getString("Tables_in_project");
                String a = str.substring(0, 1).toUpperCase();
                String b = str.substring(1, str.length());
                brand2.addItem(a + b);
                brand3.addItem(a + b);
            }while(rs.next());
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                if(!brand.getText().equals(""))
                    brand.setText(brand.getText().substring(0, 1).toUpperCase() + brand.getText().substring(1, brand.getText().length()).toLowerCase());
            }
        }, 1000, 1);
    }//GEN-LAST:event_formWindowOpened

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        method();
    }//GEN-LAST:event_addMouseClicked

    private void pnl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1MouseClicked
        if(!pnl1.isEnabled()){
            Pane p = new Pane(this);
            p.txt.setText("You can add a max of 10 brands only.");
            p.yes.setVisible(false);
            p.no.setVisible(false);
            p.setVisible(true);
        }
    }//GEN-LAST:event_pnl1MouseClicked

    private void brand1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brand1MouseClicked
        if(!pnl1.isEnabled()){
            Pane p = new Pane(this);
            p.txt.setText("You can add a max of 10 brands only.");
            p.yes.setVisible(false);
            p.no.setVisible(false);
            p.setVisible(true);
        }
    }//GEN-LAST:event_brand1MouseClicked

    private void brand1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brand1KeyReleased
        model.setText("");
        c = 1;
        model1.setEnabled(true);
        brand.setText(brand1.getText());
    }//GEN-LAST:event_brand1KeyReleased

    private void model1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_model1KeyReleased
        model.setText(model1.getText());
    }//GEN-LAST:event_model1KeyReleased

    private void brand2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_brand2ItemStateChanged
        model2.removeAllItems();
        model2.addItem("<Select Model>");
        model.setText("");
        
        if(brand2.getSelectedIndex() > 0){
            brand.setText((String) brand2.getSelectedItem());
            model2.setEnabled(true);
            try {
                String query = "Select distinct model from " + brand2.getSelectedItem() +";";
                ResultSet rs = stmt.executeQuery(query);
                rs.last();

                if(rs.getRow() >= 10){
                    model2.setEnabled(false);
                    c = 0;
                    Pane p = new Pane(this);
                    p.txt.setText("You can add a max of 10 models only.");
                    p.yes.setVisible(false);
                    p.no.setVisible(false);
                    p.setVisible(true);
                }
                else
                    c = 2;
            
                rs.first();
                
                do{
                    model2.addItem(rs.getString("model"));
                }while(rs.next());
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else
            model3.setEnabled(false);
    }//GEN-LAST:event_brand2ItemStateChanged

    private void model2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_model2ItemStateChanged
        if(model2.getSelectedIndex() > 0){
            model.setText((String) model2.getSelectedItem());
            try {
                String query = "Select submodel from " + brand2.getSelectedItem() + " where model = \"" + model2.getSelectedItem() + "\";";
                ResultSet rs = stmt.executeQuery(query);
                rs.last();

                if(rs.getRow() >= 10){
                    model2.setSelectedIndex(0);
                    model.setText("");
                    c = 0;
                    Pane p = new Pane(this);
                    p.txt.setText("You can add a max of 10 cars only.");
                    p.yes.setVisible(false);
                    p.no.setVisible(false);
                    p.setVisible(true);
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_model2ItemStateChanged

    private void brand3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_brand3ItemStateChanged
        model.setText("");
        
        if(brand3.getSelectedIndex() > 0){
            brand.setText((String) brand3.getSelectedItem());
            try {
                String query = "Select distinct model from " + brand3.getSelectedItem() +";";
                ResultSet rs = stmt.executeQuery(query);
                rs.last();
                
                if(rs.getRow() >= 10){
                    model3.setEnabled(false);
                    c = 0;
                    Pane p = new Pane(this);
                    p.txt.setText("You can add a max of 10 models only.");
                    p.yes.setVisible(false);
                    p.no.setVisible(false);
                    p.setVisible(true);
                }
                else{
                    model3.setEnabled(true);
                    c = 3;
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else
            model3.setEnabled(false);
    }//GEN-LAST:event_brand3ItemStateChanged

    private void model3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_model3KeyReleased
        model.setText(model3.getText());
    }//GEN-LAST:event_model3KeyReleased

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
        String s = price.getText(), res = "";
        for (int i = 0; i < s.length(); i ++) {
            if ("0123456789".indexOf(s.charAt(i)) > -1) {
                res += s.charAt(i);
            }
            else {
                Pane p = new Pane(this);
                p.top.setText("Do you thing I'm a fool you fool.");
                p.txt.setText("Type only integer.");
                p.yes.setVisible(false);
                p.no.setVisible(false);
                p.setVisible(true);
                break;
            }
        }
        price.setText(res);
    }//GEN-LAST:event_priceKeyReleased

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new data.data2().logout(this, "Admin", 'a', stmt);
    }//GEN-LAST:event_logoutMouseClicked

    private void bimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bimgActionPerformed
        JFileChooser fc = new JFileChooser();
        int n = fc.showOpenDialog(null);
        String imgName = null;
        if(n == javax.swing.JFileChooser.APPROVE_OPTION){
            imgName = fc.getSelectedFile().getAbsolutePath();
            if(imgName.toLowerCase().endsWith(".png"))
                pic.setIcon(new javax.swing.ImageIcon(imgName));
            else{
                Pane p = new Pane(this);
                p.txt.setText("This is not a \".png\" file.");
                p.yes.setVisible(false);
                p.no.setVisible(false);
                p.setVisible(true);
            }
        }
    }//GEN-LAST:event_bimgActionPerformed

    private void bdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdescActionPerformed
        JFileChooser fc = new JFileChooser();
        int n = fc.showOpenDialog(null);
        String txtName = null;
        if(n == JFileChooser.APPROVE_OPTION){
            txtName = fc.getSelectedFile().getAbsolutePath();
            if(txtName.toLowerCase().endsWith(".txt")){
                try {
                    desc.setText(readUsingFiles(txtName));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            else{
                Pane p = new Pane(this);
                p.txt.setText("This is not a \".txt\" file.");
                p.yes.setVisible(false);
                p.no.setVisible(false);
                p.setVisible(true);
            }
        }
    }//GEN-LAST:event_bdescActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        AdminHome ad = new AdminHome();
        ad.setVisible(true);
        ad.fname.setText(fname.getText());
        ad.id.setText(id.getText());
        ad.stmt = stmt;
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
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel back;
    private javax.swing.JButton bdesc;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JButton bimg;
    private javax.swing.JLabel blk;
    public javax.swing.JTextField brand;
    public javax.swing.JTextField brand1;
    public javax.swing.JComboBox<String> brand2;
    public javax.swing.JComboBox<String> brand3;
    private javax.swing.JLabel brd;
    private javax.swing.JLabel brd1;
    public javax.swing.JTextArea desc;
    private javax.swing.JLabel exit;
    public javax.swing.JLabel fname;
    public javax.swing.JLabel id;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel mdl;
    private javax.swing.JLabel mdl1;
    private javax.swing.JLabel mdl3;
    private javax.swing.JLabel minimize;
    public javax.swing.JTextField model;
    public javax.swing.JTextField model1;
    public javax.swing.JComboBox<String> model2;
    public javax.swing.JTextField model3;
    public javax.swing.JTextField name;
    private javax.swing.JLabel nm;
    private javax.swing.JComboBox<String> oil;
    private javax.swing.JLabel ol;
    private javax.swing.JPanel panel;
    public javax.swing.JLabel pic;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JLabel prc;
    public javax.swing.JTextField price;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JComboBox<String> trans;
    private javax.swing.JLabel trns;
    // End of variables declaration//GEN-END:variables
}
