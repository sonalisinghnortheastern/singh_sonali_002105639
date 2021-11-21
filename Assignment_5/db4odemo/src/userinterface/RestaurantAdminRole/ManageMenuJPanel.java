/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Restaurant.FoodItem;
import Business.Restaurant.Restaurant;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 
 * @author sonal
 */
public class ManageMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenuJPanel
     */
    private final EcoSystem system;  
    boolean validateNullOrEmpty=true;
    boolean validateRegex=true;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
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

        jLabel1.setBackground(new java.awt.Color(240, 178, 62));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
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

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lblItem.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblItem.setForeground(new java.awt.Color(255, 255, 255));
        lblItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItem.setText("ITEM NAME  :");
        lblItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAvailablity.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblAvailablity.setForeground(new java.awt.Color(255, 255, 255));
        lblAvailablity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvailablity.setText("AVAILABLITY :");
        lblAvailablity.setFocusable(false);
        lblAvailablity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblPrice.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setText("ITEM PRICE    :");
        lblPrice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAddItem.setBackground(new java.awt.Color(240, 178, 62));
        btnAddItem.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAddItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAddItem.setText("ADD ITEM");
        btnAddItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnUpdateItem.setBackground(new java.awt.Color(240, 178, 62));
        btnUpdateItem.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnUpdateItem.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateItem.setText("UPDATE ITEM");
        btnUpdateItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });

        cmbAvailablity.setForeground(new java.awt.Color(255, 255, 255));
        cmbAvailablity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Stock ", "Out Of Stock" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem)
                    .addComponent(lblAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
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
       if(validateNullOrEmpty())
       {
           if(validateFields()){
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
                        dB4OUtil.storeSystem(system);
                        JOptionPane.showMessageDialog(null, "Item Added to the menu successfully");
                } catch (Exception e) {
                    throw e;
                }
           }
           else{
               JOptionPane.showMessageDialog(this, "Validation Failed .Please check the red boxes");
                validateNullOrEmpty=true;
                validateRegex=true;
           }
       }
       else{
           JOptionPane.showMessageDialog(this, "Validation Failed .Please check the red boxes");
            validateNullOrEmpty=true;
            validateRegex=true;
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
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row before updating");
                    return;
        }
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
                dB4OUtil.storeSystem(system);
                JOptionPane.showMessageDialog(null, "Item Updated to the Menu Successfully");
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_btnUpdateItemActionPerformed
private void populateTable() {
    try {
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
    } catch (Exception e) {
    }
       
            }
    private void reset() {
            txtItemName.setText("");
            txtPrice.setText("");
            cmbAvailablity.setSelectedIndex(0);
        }
    private  boolean validateNullOrEmpty()
    {
        validateNullOrEmpty=true;
        if(txtItemName.getText().trim().isEmpty() || txtItemName.getText()==null)
        {
            validateNullOrEmpty=false;
            txtItemName.setToolTipText("Please Enter Item Name");
            txtItemName.setBorder(BorderFactory.createLineBorder(Color.red,1));
        }
        if(!txtItemName.getText().trim().isEmpty() && txtItemName.getText()!=null)
        {
            txtItemName.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        if(txtPrice.getText().trim().isEmpty() || txtPrice.getText()==null)
        {
            txtPrice.setToolTipText("Please Enter a Price");
            validateNullOrEmpty=false;
            txtPrice.setBorder(BorderFactory.createLineBorder (Color.red));
        }
        if(!txtPrice.getText().trim().isEmpty() && txtPrice.getText()!=null)
        {
            txtPrice.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        
        return  validateNullOrEmpty;
    }
    private  boolean  validateFields()
    {
        validateRegex=true;
        if(!txtPrice.getText().matches("\\b\\d+\\b"))
        {
            validateRegex=false;
            txtPrice.setToolTipText("Please Enter Only Numbers");
            txtPrice.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            txtPrice.setBorder(BorderFactory.createLineBorder (Color.red));
        }
        if(txtPrice.getText().matches("\\b\\d+\\b"))
        {
            txtPrice.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        return validateRegex;
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
