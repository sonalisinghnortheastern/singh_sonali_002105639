/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.FoodItem;
import Business.Restaurant.Restaurant;
import javax.swing.table.DefaultTableModel;

/**
 
 * @author sonal
 */
public class ManageMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenuJPanel
     */
    private final EcoSystem system;  
    public ManageMenuJPanel(EcoSystem system) {
        initComponents();
        this.system=system;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JMenu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblItem = new javax.swing.JLabel();
        lblAvailablity = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        btnUpdateItem = new javax.swing.JButton();
        cmbAvailablity = new javax.swing.JComboBox<>();
        txtItemName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        JMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JMenu.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Price", "Availablity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JMenu);

        lblItem.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblItem.setForeground(new java.awt.Color(0, 0, 102));
        lblItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItem.setText("ITEM NAME  :");
        lblItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAvailablity.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblAvailablity.setForeground(new java.awt.Color(0, 0, 102));
        lblAvailablity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvailablity.setText("AVAILABLITY :");
        lblAvailablity.setFocusable(false);
        lblAvailablity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblPrice.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 0, 102));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setText("ITEM PRICE :");
        lblPrice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAddItem.setBackground(new java.awt.Color(0, 102, 102));
        btnAddItem.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAddItem.setText("ADD ITEM");
        btnAddItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnUpdateItem.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdateItem.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnUpdateItem.setText("UPDATE ITEM");
        btnUpdateItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });

        cmbAvailablity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Stock ", "Out Of Stock" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem)
                    .addComponent(lblAvailablity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAvailablity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrice)
                    .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbAvailablity)
                    .addComponent(lblAvailablity, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem)
                    .addComponent(btnUpdateItem))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
       FoodItem foodItem=new FoodItem();
       foodItem.setName(txtItemName.getText());
       foodItem.setPrice(Integer.parseInt(txtPrice.getText()));
       foodItem.setInStock((String) cmbAvailablity.getSelectedItem());
        try {
              int uniqueId=system.getLogInUser().getLogInId();
                for (Restaurant restaurant : system.getRestaurantDirectory().getRestaurants()) {
                   if(restaurant.getUniqueId()==uniqueId)
                   {
                       restaurant.getMenu().setMenu(foodItem);
                       populateTable();
                       reset();
                   }
                }
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void JMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuMouseClicked
        try{
           int rowNumber=JMenu.getSelectedRow();
            txtItemName.setText(JMenu.getModel().getValueAt(rowNumber, 0).toString());
            txtPrice.setText(JMenu.getModel().getValueAt(rowNumber, 1).toString());
            cmbAvailablity.setSelectedItem(JMenu.getModel().getValueAt(rowNumber, 2).toString());    
       }
      catch(Exception e)
      {
          throw  e;
      }
    }//GEN-LAST:event_JMenuMouseClicked

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
       int selectedRowIndex=JMenu.getSelectedRow();
        FoodItem foodItem=new FoodItem();
       foodItem.setName(txtItemName.getText());
       foodItem.setPrice(Integer.parseInt(txtPrice.getText()));
       foodItem.setInStock((String) cmbAvailablity.getSelectedItem());
        try {
              int uniqueId=system.getLogInUser().getLogInId();
                for (Restaurant restaurant : system.getRestaurantDirectory().getRestaurants()) {
                   if(restaurant.getUniqueId()==uniqueId)
                   {
                      restaurant.getMenu().getMenu().set(selectedRowIndex, foodItem);
                       populateTable();
                       reset();
                   }
                }
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_btnUpdateItemActionPerformed
private void populateTable() {
    DefaultTableModel model = (DefaultTableModel) JMenu.getModel();
     model.setRowCount(0);
    int uniqueId=system.getLogInUser().getLogInId();
    for (Restaurant restaurant : system.getRestaurantDirectory().getRestaurants()) {
       if(restaurant.getUniqueId()==uniqueId)
       {
           for (FoodItem foodItem : restaurant.getMenu().getMenu()) {
                Object[] row = new Object[3];
                row[0] = foodItem.getName();
                row[1] = foodItem.getPrice();
                row[2] = foodItem.isInStock();
                model.addRow(row);
           }
       }
    }   
            }
    private void reset() {
            txtItemName.setText("");
            txtPrice.setText("");
            cmbAvailablity.setSelectedIndex(1);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JMenu;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JComboBox<String> cmbAvailablity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailablity;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
