/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sonal
 */
public class ManageRestaurantJPanel extends javax.swing.JPanel {
    private final EcoSystem system;
    boolean validateNullOrEmpty=true;
    boolean validateRegex=true;
    public ManageRestaurantJPanel(EcoSystem system) {
        initComponents();
        this.system = system;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jRegisterTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtLocation = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));

        jRegisterTable.setForeground(new java.awt.Color(56, 90, 174));
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Default", "Restaurant name", "Restaurant Contact", "Restaurant Location", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jRegisterTable.setGridColor(new java.awt.Color(56, 90, 174));
        jRegisterTable.setSelectionBackground(new java.awt.Color(240, 178, 62));
        jRegisterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegisterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jRegisterTable);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Restaurant Admin");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Restaurant Name :");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Restaurant Location :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Restaurant  Contact :");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnCreate.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCreate.setText("Create Restaurant ");
        btnCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnModify.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnModify.setText("Update Customer");
        btnModify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnDelete.setText("Delete Restaurant");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Restaurant Username :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Restaurant Password");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(64, 64, 64)
                        .addComponent(btnModify)
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(223, 223, 223))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModify)
                            .addComponent(btnCreate)))
                    .addComponent(jLabel4))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
    try {
        if(validateNullOrEmpty())
        {
            if(validateFields()){
                if(!system.getUserAccountDirectory().checkIfUsernameIsUnique((txtUsername.getText())))
                {
                    JOptionPane.showMessageDialog(this, "User with this username already exist.Try a diffrent username");
                }
                else{
                  Random random=new Random();
                  int uniqueId=random.nextInt((9999 - 100) + 1) + 10;
                  Restaurant restaurant=new Restaurant(txtName.getText(),txtLocation.getText(),Long.parseLong(txtContact.getText()),txtUsername.getText(),txtPassword.getText(),uniqueId);
                  system.getRestaurantDirectory().setRestaurants(restaurant);
                  system.getUserAccountDirectory().addUserAccountToAccounts(restaurant);
                  populateTable();
                  reset();
                  JOptionPane.showMessageDialog(this, "User Registered Succesfully");
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
    } catch (Exception e) {
        validateNullOrEmpty=true;
        validateRegex=true;
        throw e;
    }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
      try{
        if(validateNullOrEmpty() && validateFields())
        {
            int selectedRowIndex=jRegisterTable.getSelectedRow();
            int uniqueId=system.getRestaurantDirectory().getRestaurants().get(selectedRowIndex).getUniqueId();
            Restaurant restaurant=new Restaurant(txtName.getText(),txtLocation.getText(),Long.parseLong(txtContact.getText()),txtUsername.getText(),txtPassword.getText(),uniqueId);
            for(UserAccount userAccount:system.getUserAccountDirectory().getUserAccountList())
            {
                if(txtUsername.getText().equals(userAccount.getUsername()))
                {
                    if(uniqueId != userAccount.getUniqueId())
                    {
                        JOptionPane.showMessageDialog(this, "Username already taken.Please take a diffrent username");
                        return;
                    }
                }
            }
            system.getRestaurantDirectory().getRestaurants().set(selectedRowIndex, restaurant);
            populateTable();
            int index=0;
            for(UserAccount userAccount:system.getUserAccountDirectory().getUserAccountList())
            {
                    if(uniqueId == userAccount.getUniqueId())
                    {
                        system.getUserAccountDirectory().getUserAccountList().set(index, restaurant);
                    }
                    else{
                        index++;
                    }
            }
            JOptionPane.showMessageDialog(null, "User Updated Succesfully");
            reset();
        }
        else{
            JOptionPane.showMessageDialog(this, "Validation Failed .Please check the red boxes");
            validateNullOrEmpty=true;
            validateRegex=true;
        }
    }
    catch(Exception e)
    {
        validateNullOrEmpty=true;
        validateRegex=true;
        throw e;
    }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
           
      try{
        int selectedRowIndex=jRegisterTable.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        else{
            Restaurant restaurant=(Restaurant) jRegisterTable.getValueAt(selectedRowIndex, 0);
            system.getRestaurantDirectory().getRestaurants().remove(restaurant);
            populateTable();
            JOptionPane.showMessageDialog(null, "User Deleted Succesfully");
            reset();
        }
    }
    catch(Exception e)
    {
        throw e;
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jRegisterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterTableMouseClicked
         try{
           int rowNumber=jRegisterTable.getSelectedRow();
            txtName.setText(jRegisterTable.getModel().getValueAt(rowNumber, 1).toString());
            txtContact.setText(jRegisterTable.getModel().getValueAt(rowNumber, 2).toString());
            txtLocation.setText(jRegisterTable.getModel().getValueAt(rowNumber, 3).toString());
            txtUsername.setText(jRegisterTable.getModel().getValueAt(rowNumber, 4).toString());
            txtPassword.setText(jRegisterTable.getModel().getValueAt(rowNumber, 5).toString());
            
       }
      catch(Exception e)
      {
          throw  e;
      }
    }//GEN-LAST:event_jRegisterTableMouseClicked
    private void populateTable() {
        try{
            RestaurantDirectory restaurantDirectory = system.getRestaurantDirectory();
             DefaultTableModel model = (DefaultTableModel) jRegisterTable.getModel();
             model.setRowCount(0);
             jRegisterTable.getColumnModel().getColumn(0).setMinWidth(0);
             jRegisterTable.getColumnModel().getColumn(0).setMaxWidth(0);
             for (Restaurant restaurant : restaurantDirectory.getRestaurants()) {
                         Object[] row = new Object[6];
                         row[0] = restaurant;
                         row[1] = restaurant.getName();
                         row[2] = restaurant.getMobileNumber();
                         row[3] = restaurant.getAddress();
                         row[4] = restaurant.getUsername();
                         row[5] = restaurant.getPassword();
                         model.addRow(row);

                 }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    private void reset() {
            txtName.setText("");
            txtLocation.setText("");
            txtContact.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
        }
    private  boolean validateNullOrEmpty()
    {
        if(txtName.getText().trim().isEmpty() || txtName.getText()==null)
        {
            validateNullOrEmpty=false;
            txtName.setToolTipText("Please Enter a Name");
            txtName.setBorder(BorderFactory.createLineBorder(Color.red,1));
        }
        if(!txtName.getText().trim().isEmpty() && txtName.getText()!=null)
        {
            txtName.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        if(txtLocation.getText().trim().isEmpty() || txtLocation.getText()==null)
        {
            txtLocation.setToolTipText("Please Enter a Location");
            validateNullOrEmpty=false;
            txtLocation.setBorder(BorderFactory.createLineBorder (Color.red));
        }
        if(!txtLocation.getText().trim().isEmpty() && txtLocation.getText()!=null)
        {
            txtLocation.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        if(txtContact.getText().trim().isEmpty() || txtContact.getText()==null)
        {
            txtContact.setToolTipText("Please Enter a Contact");
            validateNullOrEmpty=false;
            txtContact.setBorder(BorderFactory.createLineBorder (Color.red));
        }
        if(!txtContact.getText().trim().isEmpty() && txtContact.getText()!=null)
        {
            txtContact.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        if(txtUsername.getText().trim().isEmpty() || txtUsername.getText()==null)
        {
            txtUsername.setToolTipText("Please Enter a Username");
            validateNullOrEmpty=false;
            txtUsername.setBorder(BorderFactory.createLineBorder (Color.red));
        }
        if(!txtUsername.getText().trim().isEmpty() && txtUsername.getText()!=null)
        {
            txtUsername.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        if(txtPassword.getText().trim().isEmpty() || txtPassword.getText()==null)
        {
            txtPassword.setToolTipText("Please Enter a Password");
            validateNullOrEmpty=false;
            txtPassword.setBorder(BorderFactory.createLineBorder (Color.red));
        }
        if(!txtPassword.getText().trim().isEmpty() && txtPassword.getText()!=null)
        {
            txtPassword.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        return  validateNullOrEmpty;
    }
    private  boolean  validateFields()
    {
        if(!txtContact.getText().matches("\\b\\d+\\b"))
        {
            validateRegex=false;
            txtContact.setToolTipText("Please Enter Only Numbers");
            txtName.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            txtContact.setBorder(BorderFactory.createLineBorder (Color.red));
        }
        if(txtContact.getText().matches("\\b\\d+\\b"))
        {
            txtContact.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        return validateRegex;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTable jRegisterTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
