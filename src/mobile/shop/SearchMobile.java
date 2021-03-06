/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sahill Patil
 */
public class SearchMobile extends javax.swing.JInternalFrame {

    /**
     * Creates new form SearchMobile
     */
    public SearchMobile() {
        initComponents();
        loadTable();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobileshop_db", "root", "root");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select pid from mobiledetails");
            while (rs.next()) {
                pid.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Product Data Does Not Exit", "INFORMATION", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void loadTable() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobileshop_db", "root", "root");
            String sql = "select * from mobiledetails";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            DefaultTableModel dm;
            dm = (DefaultTableModel) jTable1.getModel();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pid = new javax.swing.JComboBox<>();
        pname = new javax.swing.JComboBox<>();
        ram = new javax.swing.JComboBox<>();
        os = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.black, java.awt.Color.black));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Product ID:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Brand:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("RAM:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("OS:");

        pid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<-Select->" }));
        pid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pidItemStateChanged(evt);
            }
        });

        pname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<-Select->", "Nokia", "Samsung", "Vivo", "Apple", "Zoopo", "Karbon", "Intex", "Lava", "Zolo", "Maxx", "VOX", "Sony", "G-Five", "Sansui" }));
        pname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pnameItemStateChanged(evt);
            }
        });

        ram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<-Select->", "1", "2", "3", "4", "5", "6", "7", "8" }));
        ram.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ramItemStateChanged(evt);
            }
        });

        os.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<-Select->", "Android", "IOS", "Windows", "Symbian", "Java", "Other" }));
        os.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                osItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(os, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(os, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Mobiles");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1171, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pidItemStateChanged
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobileshop_db", "root", "root");
            String sql = "select * from mobiledetails where pid='" +pid.getSelectedItem()+ "'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            DefaultTableModel dm;
            dm = (DefaultTableModel) jTable1.getModel();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_pidItemStateChanged

    private void pnameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pnameItemStateChanged
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobileshop_db", "root", "root");
            String sql = "select * from mobiledetails where pname='" +pname.getSelectedItem()+ "'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            DefaultTableModel dm;
            dm = (DefaultTableModel) jTable1.getModel();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_pnameItemStateChanged

    private void ramItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ramItemStateChanged
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobileshop_db", "root", "root");
            String sql = "select * from mobiledetails where ram='" +ram.getSelectedItem()+ "'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            DefaultTableModel dm;
            dm = (DefaultTableModel) jTable1.getModel();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_ramItemStateChanged

    private void osItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_osItemStateChanged
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobileshop_db", "root", "root");
            String sql = "select * from mobiledetails where ostype='" +os.getSelectedItem()+ "'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            DefaultTableModel dm;
            dm = (DefaultTableModel) jTable1.getModel();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_osItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> os;
    private javax.swing.JComboBox<String> pid;
    private javax.swing.JComboBox<String> pname;
    private javax.swing.JComboBox<String> ram;
    // End of variables declaration//GEN-END:variables
}
