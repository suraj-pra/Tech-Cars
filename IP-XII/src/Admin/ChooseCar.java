/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suraj
 */
public class ChooseCar extends javax.swing.JFrame {

    
    /**
     * Creates new form ChooseCar
     */
    
    Statement stmt;
    
    String fname, id;
    
    public ChooseCar() {
        initComponents();
    }
    
    public void set(int a){
        javax.swing.JLabel lb[] = {model, submodel, price, transmission, oiltype};
        javax.swing.JLabel b[] = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10};
        javax.swing.JTable t[] = {t1, t2, t3, t4, t5, t6, t7, t8, t9, t10};
        
        brand.setText(b[a - 1].getText());
        
        for(int i = 0;i < 10;i++){
            if(i != (a - 1))
                t[i].clearSelection();
        }
        
        for(int i = 0;i < 5;i++){
            lb[i].setText("" + t[a - 1].getValueAt(t[a - 1].getSelectedRow(), i));
        }
    }

    public String readUsingFiles(String fileName) throws java.io.IOException {
        java.nio.file.Path path = java.nio.file.Paths.get(fileName);
        byte[] bytes = java.nio.file.Files.readAllBytes(path);
        @SuppressWarnings("unused")
                java.util.List<String> allLines = java.nio.file.Files.readAllLines(path, java.nio.charset.StandardCharsets.UTF_8);
        return (new String(bytes));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JLabel();
        sc1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        b2 = new javax.swing.JLabel();
        sc2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        b3 = new javax.swing.JLabel();
        sc3 = new javax.swing.JScrollPane();
        t3 = new javax.swing.JTable();
        b4 = new javax.swing.JLabel();
        sc4 = new javax.swing.JScrollPane();
        t4 = new javax.swing.JTable();
        b5 = new javax.swing.JLabel();
        sc5 = new javax.swing.JScrollPane();
        t5 = new javax.swing.JTable();
        b6 = new javax.swing.JLabel();
        sc6 = new javax.swing.JScrollPane();
        t6 = new javax.swing.JTable();
        b7 = new javax.swing.JLabel();
        sc7 = new javax.swing.JScrollPane();
        t7 = new javax.swing.JTable();
        b8 = new javax.swing.JLabel();
        sc8 = new javax.swing.JScrollPane();
        t8 = new javax.swing.JTable();
        b9 = new javax.swing.JLabel();
        sc9 = new javax.swing.JScrollPane();
        t9 = new javax.swing.JTable();
        b10 = new javax.swing.JLabel();
        sc10 = new javax.swing.JScrollPane();
        t10 = new javax.swing.JTable();
        change = new javax.swing.JButton();
        brand = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        submodel = new javax.swing.JLabel();
        transmission = new javax.swing.JLabel();
        oiltype = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        blk = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 600));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        t1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Submodel", "Price", "Transmission", "Oil Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
        });
        sc1.setViewportView(t1);

        b2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        t2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Submodel", "Price", "Transmission", "Oil Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t2KeyReleased(evt);
            }
        });
        sc2.setViewportView(t2);

        b3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        t3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        t3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Submodel", "Price", "Transmission", "Oil Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t3MouseClicked(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t3KeyReleased(evt);
            }
        });
        sc3.setViewportView(t3);

        b4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        t4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        t4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Submodel", "Price", "Transmission", "Oil Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t4MouseClicked(evt);
            }
        });
        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t4KeyReleased(evt);
            }
        });
        sc4.setViewportView(t4);

        b5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        t5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        t5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Submodel", "Price", "Transmission", "Oil Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t5MouseClicked(evt);
            }
        });
        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t5KeyReleased(evt);
            }
        });
        sc5.setViewportView(t5);

        b6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        t6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        t6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Submodel", "Price", "Transmission", "Oil Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t6MouseClicked(evt);
            }
        });
        t6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t6KeyReleased(evt);
            }
        });
        sc6.setViewportView(t6);

        b7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        t7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        t7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Submodel", "Price", "Transmission", "Oil Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t7MouseClicked(evt);
            }
        });
        t7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t7KeyReleased(evt);
            }
        });
        sc7.setViewportView(t7);

        b8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        t8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        t8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Submodel", "Price", "Transmission", "Oil Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t8MouseClicked(evt);
            }
        });
        t8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t8KeyReleased(evt);
            }
        });
        sc8.setViewportView(t8);

        b9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        t9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        t9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Submodel", "Price", "Transmission", "Oil Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t9MouseClicked(evt);
            }
        });
        t9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t9KeyReleased(evt);
            }
        });
        sc9.setViewportView(t9);

        b10.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        t10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t10.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        t10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Submodel", "Price", "Transmission", "Oil Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t10MouseClicked(evt);
            }
        });
        t10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t10KeyReleased(evt);
            }
        });
        sc10.setViewportView(t10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sc5)
                            .addComponent(sc2)
                            .addComponent(sc3)
                            .addComponent(sc4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sc1, javax.swing.GroupLayout.PREFERRED_SIZE, 1428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sc10)
                            .addComponent(sc7)
                            .addComponent(sc8)
                            .addComponent(sc9)
                            .addComponent(sc6, javax.swing.GroupLayout.PREFERRED_SIZE, 1428, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sc1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sc2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sc3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sc4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sc5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sc6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sc7, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sc8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sc9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sc10, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1029, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1250, 450));

        change.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        change.setText("Change this Car's Details");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        getContentPane().add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 550, 250, 30));

        brand.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        getContentPane().add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 120, 20));

        price.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 120, 20));

        model.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        getContentPane().add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 120, 20));

        submodel.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        getContentPane().add(submodel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 330, 20));

        transmission.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        getContentPane().add(transmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, 120, 20));

        oiltype.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        getContentPane().add(oiltype, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 120, 20));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back btn.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        blk.setBackground(new java.awt.Color(0, 0, 0));
        blk.setOpaque(true);
        getContentPane().add(blk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1250, 30));

        bck.setBackground(new java.awt.Color(204, 204, 255));
        bck.setOpaque(true);
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        javax.swing.JTable[] tb = {t1, t2, t3, t4, t5, t6, t7, t8, t9, t10};
        javax.swing.JScrollPane[] sc = {sc1, sc2, sc3, sc4, sc5, sc6, sc7, sc8, sc9, sc10};
        javax.swing.JLabel[] j = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10};
        
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        for(int i = 0;i < 10;i++){
            sc[i].getVerticalScrollBar().setUnitIncrement(16);
        }
        
        try{
            int no1 = 0, no2 = 0, no3 = 0, no4 = 0, no5 = 0, no6 = 0, no7 = 0, no8 = 0, no9 = 0, no10 = 0;
            ResultSet rs1 = null, rs2 = null, rs3 = null, rs4 = null, rs5 = null, rs6 = null, rs7 = null, rs8 = null, rs9 = null, rs10 = null;
            
            int no[] = {no1, no2, no3, no4, no5, no6, no7, no8, no9, no10};
            DefaultTableModel t[] = {(DefaultTableModel)t1.getModel(), (DefaultTableModel)t2.getModel(), (DefaultTableModel)t3.getModel(), (DefaultTableModel)t4.getModel(), (DefaultTableModel)t5.getModel(), (DefaultTableModel)t6.getModel(), (DefaultTableModel)t7.getModel(), (DefaultTableModel)t8.getModel(), (DefaultTableModel)t9.getModel(), (DefaultTableModel)t10.getModel()};
            
            ResultSet rs[] = {rs1, rs2, rs3, rs4, rs5, rs6, rs7, rs8, rs9, rs10};
            
            
            ResultSet r = stmt.executeQuery(new data.data2().str);
            
            int x = 0;
            while(r.next()){
                String str = r.getString("Tables_in_project");
                String a = str.substring(0, 1).toUpperCase();
                String b = str.substring(1, str.length());
                j[x++].setText(a + b);
            }
            
            String n[] = {b1.getText(), b2.getText(), b3.getText(), b4.getText(), b5.getText(), b6.getText(), b7.getText(), b8.getText(), b9.getText(), b10.getText()};
            
            for(int a = 0;a<10;a++){
                if(!n[a].equals("")){
                    String query = "Select count(*) from " + n[a] + ";";
                    ResultSet subrs = stmt.executeQuery(query);
                    subrs.first();
                    no[a] = subrs.getInt("count(*)");
                }
                else{
                    j[a].setVisible(false);
                    sc[a].setVisible(false);
                    tb[a].setVisible(false);
                }
            }
            
            for(int a = 0;a<10;a++){
                if(!n[a].equals("")){
                    rs[a] = stmt.executeQuery("Select * from " + n[a] + " order by model;");
                    for(int i = 0;i<no[a];i++){
                        rs[a].next();
                        t[a].addRow(new Object[]{rs[a].getString("Model"), rs[a].getString("Submodel"), rs[a].getString("Price"), rs[a].getString("Transmission"), rs[a].getString("Oil_Type")});
                    }
                }
            }
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        if(!brand.getText().equals("")){
            CarDetails c = new CarDetails();
            String halfName = "D:\\Path\\" + brand.getText() + "\\" + model.getText() + "\\" + submodel.getText();
            
            c.fname.setText(fname);
            c.id.setText(id);
            
            c.brand = brand.getText();
            c.model = model.getText();
            c.name.setText(submodel.getText());
            c.price.setText(price.getText());
            c.trans.setText(transmission.getText());
            c.oil.setText(oiltype.getText());
            c.pic.setIcon(new javax.swing.ImageIcon(halfName + ".png"));
            c.path.setText(brand.getText() + " > " + model.getText() + " >");
            c.stmt = stmt;
            try {
                c.desc.setText(readUsingFiles(halfName + ".txt"));
                c.setVisible(true);
            }
            catch (Exception e) {
               javax.swing.JOptionPane.showMessageDialog(null, e);
            }
            this.dispose();
        }
        else{
            Both.Pane p = new Both.Pane(this);
            p.txt.setText("First select something.");
            p.yes.setVisible(false);
            p.no.setVisible(false);
            p.setVisible(true);
        }
    }//GEN-LAST:event_changeActionPerformed

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        set(1);
    }//GEN-LAST:event_t1MouseClicked

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked
        set(2);
    }//GEN-LAST:event_t2MouseClicked

    private void t3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3MouseClicked
        set(3);
    }//GEN-LAST:event_t3MouseClicked

    private void t4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4MouseClicked
        set(4);
    }//GEN-LAST:event_t4MouseClicked

    private void t5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t5MouseClicked
        set(5);
    }//GEN-LAST:event_t5MouseClicked

    private void t6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t6MouseClicked
        set(6);
    }//GEN-LAST:event_t6MouseClicked

    private void t7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t7MouseClicked
        set(7);
    }//GEN-LAST:event_t7MouseClicked

    private void t8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t8MouseClicked
        set(8);
    }//GEN-LAST:event_t8MouseClicked

    private void t9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t9MouseClicked
        set(9);
    }//GEN-LAST:event_t9MouseClicked

    private void t10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t10MouseClicked
        set(10);
    }//GEN-LAST:event_t10MouseClicked

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
        if(t1.getSelectedRow() > 0)
            set(1);
    }//GEN-LAST:event_t1KeyReleased

    private void t2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyReleased
        if(t2.getSelectedRow() > 0)
            set(2);
    }//GEN-LAST:event_t2KeyReleased

    private void t3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyReleased
        if(t3.getSelectedRow() > 0)
            set(3);
    }//GEN-LAST:event_t3KeyReleased

    private void t4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyReleased
        if(t4.getSelectedRow() > 0)
            set(4);
    }//GEN-LAST:event_t4KeyReleased

    private void t5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyReleased
        if(t5.getSelectedRow() > 0)
            set(5);
    }//GEN-LAST:event_t5KeyReleased

    private void t6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t6KeyReleased
        if(t6.getSelectedRow() > 0)
            set(6);
    }//GEN-LAST:event_t6KeyReleased

    private void t7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t7KeyReleased
        if(t7.getSelectedRow() > 0)
            set(7);
    }//GEN-LAST:event_t7KeyReleased

    private void t8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t8KeyReleased
        if(t8.getSelectedRow() > 0)
            set(8);
    }//GEN-LAST:event_t8KeyReleased

    private void t9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t9KeyReleased
        if(t9.getSelectedRow() > 0)
            set(9);
    }//GEN-LAST:event_t9KeyReleased

    private void t10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t10KeyReleased
        if(t10.getSelectedRow() > 0)
            set(10);
    }//GEN-LAST:event_t10KeyReleased

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        AdminHome ad = new AdminHome();
        ad.setVisible(true);
        ad.fname.setText(fname);
        ad.id.setText(id);
        ad.stmt = stmt;
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
            java.util.logging.Logger.getLogger(ChooseCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel b1;
    public javax.swing.JLabel b10;
    public javax.swing.JLabel b2;
    public javax.swing.JLabel b3;
    public javax.swing.JLabel b4;
    public javax.swing.JLabel b5;
    public javax.swing.JLabel b6;
    public javax.swing.JLabel b7;
    public javax.swing.JLabel b8;
    public javax.swing.JLabel b9;
    private javax.swing.JLabel back;
    private javax.swing.JLabel bck;
    private javax.swing.JLabel blk;
    private javax.swing.JLabel brand;
    private javax.swing.JButton change;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel model;
    private javax.swing.JLabel oiltype;
    private javax.swing.JLabel price;
    public javax.swing.JScrollPane sc1;
    public javax.swing.JScrollPane sc10;
    public javax.swing.JScrollPane sc2;
    public javax.swing.JScrollPane sc3;
    public javax.swing.JScrollPane sc4;
    public javax.swing.JScrollPane sc5;
    public javax.swing.JScrollPane sc6;
    public javax.swing.JScrollPane sc7;
    public javax.swing.JScrollPane sc8;
    public javax.swing.JScrollPane sc9;
    private javax.swing.JLabel submodel;
    public javax.swing.JTable t1;
    public javax.swing.JTable t10;
    public javax.swing.JTable t2;
    public javax.swing.JTable t3;
    public javax.swing.JTable t4;
    public javax.swing.JTable t5;
    public javax.swing.JTable t6;
    public javax.swing.JTable t7;
    public javax.swing.JTable t8;
    public javax.swing.JTable t9;
    private javax.swing.JLabel transmission;
    // End of variables declaration//GEN-END:variables
}
