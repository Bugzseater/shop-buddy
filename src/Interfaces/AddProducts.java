/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Model.MYSQL;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Pasindu
 */
public class AddProducts extends javax.swing.JFrame {

    /**
     * Creates new form AddProducts
     */
    public AddProducts() {
        initComponents();
        loadTable();
    }
    
    public void loadTable() {
        try {
            
            ResultSet resultSet = (ResultSet) MYSQL.search("SELECT * FROM products");
//          ResultSet count = MYSQL.search("SELECT COUNT(*) FROM products");

            DefaultTableModel model = (DefaultTableModel) productable.getModel();
            model.setRowCount(0);

         

      
            while (resultSet.next()) {
                Vector<String> v = new Vector();
                v.add(resultSet.getString("product_id"));
                v.add(resultSet.getString("product_name"));
                v.add(resultSet.getString("item_price"));
                v.add(resultSet.getString("quntity"));
                v.add(resultSet.getString("category_item"));

                model.addRow(v);
                productable.setModel(model);
            }
            
//             if (count.next()) {
//                int cnt = count.getInt(1);
//                countbox.setText(String.valueOf(cnt));
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void loadcatoneTable() {
        try {
            
            ResultSet resultSet = (ResultSet) MYSQL.search("SELECT * FROM products WHERE category_item = 'Fruits'");
//            ResultSet count = MYSQL.search("SELECT COUNT(*) FROM products");

              DefaultTableModel model = (DefaultTableModel) productable.getModel();
            model.setRowCount(0);

         

      
            while (resultSet.next()) {
                Vector<String> v = new Vector();
                v.add(resultSet.getString("product_id"));
                v.add(resultSet.getString("product_name"));
                v.add(resultSet.getString("item_price"));
                v.add(resultSet.getString("quntity"));
                v.add(resultSet.getString("category_item"));

                model.addRow(v);
                productable.setModel(model);
            }
            
//             if (count.next()) {
//                int cnt = count.getInt(1);
//                countbox.setText(String.valueOf(cnt));
//            }

        } catch (Exception e) {
        }
    }
    
        public void loadcattwoTable() {
        try {
            
            ResultSet resultSet = (ResultSet) MYSQL.search("SELECT * FROM products WHERE category_item = 'Vegitable'");
//            ResultSet count = MYSQL.search("SELECT COUNT(*) FROM products");

              DefaultTableModel model = (DefaultTableModel) productable.getModel();
            model.setRowCount(0);

         

      
            while (resultSet.next()) {
                Vector<String> v = new Vector();
                v.add(resultSet.getString("product_id"));
                v.add(resultSet.getString("product_name"));
                v.add(resultSet.getString("item_price"));
                v.add(resultSet.getString("quntity"));
                v.add(resultSet.getString("category_item"));

                model.addRow(v);
                productable.setModel(model);
            }
            
//             if (count.next()) {
//                int cnt = count.getInt(1);
//                countbox.setText(String.valueOf(cnt));
//            }

        } catch (Exception e) {
        }
    }
        
    public void loadcatthreeTable() {
        try {
            
            ResultSet resultSet = (ResultSet) MYSQL.search("SELECT * FROM products WHERE category_item = 'Mallum'");
//            ResultSet count = MYSQL.search("SELECT COUNT(*) FROM products");

              DefaultTableModel model = (DefaultTableModel) productable.getModel();
            model.setRowCount(0);

         

      
            while (resultSet.next()) {
                Vector<String> v = new Vector();
                v.add(resultSet.getString("product_id"));
                v.add(resultSet.getString("product_name"));
                v.add(resultSet.getString("item_price"));
                v.add(resultSet.getString("quntity"));
                v.add(resultSet.getString("category_item"));

                model.addRow(v);
                productable.setModel(model);
            }
            
//             if (count.next()) {
//                int cnt = count.getInt(1);
//                countbox.setText(String.valueOf(cnt));
//            }

        } catch (Exception e) {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        category1 = new javax.swing.JButton();
        category2 = new javax.swing.JButton();
        category3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        categoryall = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        searchbox = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pitemprice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pqty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        upbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        category = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD PRODUCTS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 620));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), null));

        category1.setText("Fruits");
        category1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category1ActionPerformed(evt);
            }
        });

        category2.setText("Vegitable");
        category2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category2ActionPerformed(evt);
            }
        });

        category3.setText("Mallum");
        category3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category3ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));

        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        categoryall.setText("ALL");
        categoryall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryallActionPerformed(evt);
            }
        });

        jLabel6.setText("ADD PPODUCTS");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/ADDP.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(category1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(category2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(category3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(categoryall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(categoryall)
                .addGap(18, 18, 18)
                .addComponent(category1)
                .addGap(18, 18, 18)
                .addComponent(category2)
                .addGap(18, 18, 18)
                .addComponent(category3)
                .addGap(52, 52, 52)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        productable.setBackground(new java.awt.Color(255, 255, 204));
        productable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Item Price", "Qty", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productable);

        jLabel1.setText("Product ID");

        pid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pidKeyReleased(evt);
            }
        });

        jLabel2.setText("Product Name");

        jLabel3.setText("Item Price");

        jLabel4.setText("Qty");

        jLabel5.setText("Category");

        upbtn.setText("UPDATE");
        upbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upbtnActionPerformed(evt);
            }
        });

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruits", "Vegitable", "Powder", "Mallum", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(upbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pitemprice, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pqty, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(pitemprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(pqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(upbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1274, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void category1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category1ActionPerformed
        // TODO add your handling code here:
        loadcatoneTable();
    }//GEN-LAST:event_category1ActionPerformed

    private void category2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category2ActionPerformed
        // TODO add your handling code here:
        loadcattwoTable();
    }//GEN-LAST:event_category2ActionPerformed

    private void upbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upbtnActionPerformed
        // TODO add your handling code here:
        String productid = pid.getText();
        String productname = pname.getText();
        int itemprice = Integer.parseInt(pitemprice.getText());
        int itemqntity = Integer.parseInt(pqty.getText());
        String productCate = category.getSelectedItem().toString();
        
        if (productid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product ID field is empty", "Warning", JOptionPane.WARNING_MESSAGE);
            pid.grabFocus();
        }
        else if (productname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product Name field is empty", "Warning", JOptionPane.WARNING_MESSAGE);
            pname.grabFocus();
        }
        else {

            MYSQL.iud("UPDATE products SET product_name = '"+productname+"',item_price= '"+itemprice+"',quntity = '"+itemqntity+"',category_item = '"+productCate+"' WHERE product_id = '"+productid+"'");
            pid.setText("");
            pname.setText("");
            pitemprice.setText("");
            pqty.setText("");
            loadTable();
        }
    }//GEN-LAST:event_upbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        String productid = pid.getText();
        String productname = pname.getText();
        int itemprice = Integer.parseInt(pitemprice.getText());
        int itemqntity = Integer.parseInt(pqty.getText());
        String productCate = category.getSelectedItem().toString();
        
        if (productid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product ID field is empty", "Warning", JOptionPane.WARNING_MESSAGE);
            pid.grabFocus();
        }
        else if (productname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product Name field is empty", "Warning", JOptionPane.WARNING_MESSAGE);
            pname.grabFocus();
        }
        
        else {

            MYSQL.iud("INSERT INTO products (product_id,product_name,item_price,quntity,category_item) VALUES('" + productid + "','" + productname + "','" + itemprice + "','" + itemqntity + "','"+productCate+"') ");
            
            pid.setText("");
            pname.setText("");
            pitemprice.setText("");
            pqty.setText("");
            
            loadTable();
        }
        
    }//GEN-LAST:event_addbtnActionPerformed

    private void categoryallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryallActionPerformed
        // TODO add your handling code here:
        loadTable();
    }//GEN-LAST:event_categoryallActionPerformed

    private void category3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category3ActionPerformed
        // TODO add your handling code here:
        loadcatthreeTable();
    }//GEN-LAST:event_category3ActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
         DefaultTableModel ob = (DefaultTableModel) productable.getModel();
         TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
         productable.setRowSorter(obj);
         obj.setRowFilter(RowFilter.regexFilter(searchbox.getText()));
    }//GEN-LAST:event_searchbtnActionPerformed

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        // TODO add your handling code here:
         DefaultTableModel ob = (DefaultTableModel) productable.getModel();
         TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
         productable.setRowSorter(obj);
         obj.setRowFilter(RowFilter.regexFilter(searchbox.getText()));
    }//GEN-LAST:event_searchboxKeyReleased

    private void productableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productableMouseClicked
        // TODO add your handling code here:
            if (evt.getClickCount() == 2) {
        int selectedRow = productable.getSelectedRow();
        
        if (selectedRow != -1) {  // Ensure a row is selected
            try {
                String employeid = String.valueOf(productable.getValueAt(selectedRow, 0));
                pid.setText(employeid);
                String empname = String.valueOf(productable.getValueAt(selectedRow, 1));
                pname.setText(empname);
                String empadd = String.valueOf(productable.getValueAt(selectedRow, 2));
                pitemprice.setText(empadd);
                String empmobile = String.valueOf(productable.getValueAt(selectedRow, 3));
                pqty.setText(empmobile);
                String position = String.valueOf(productable.getValueAt(selectedRow, 4));
                category.setSelectedItem(position);

            } catch (Exception e) {
                // Handle potential exceptions
                
            }
        }
    }
    }//GEN-LAST:event_productableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login LoginWindow = new Login();
        LoginWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pidKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pidKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JButton category1;
    private javax.swing.JButton category2;
    private javax.swing.JButton category3;
    private javax.swing.JButton categoryall;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pitemprice;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pqty;
    private javax.swing.JTable productable;
    private javax.swing.JTextField searchbox;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton upbtn;
    // End of variables declaration//GEN-END:variables
}
