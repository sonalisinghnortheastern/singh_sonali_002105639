/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sonal
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomersJPanel
     */
    private final EcoSystem system;
    private final DB4OUtil dB4OUtil = DB4OUtil.getInstance();
   
    public ManageCustomerJPanel() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
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
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnCreateCustomer = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(920, 708));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRegisterTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRegisterTable.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jRegisterTable.setForeground(new java.awt.Color(56, 90, 174));
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Phone", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 920, 165));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Customers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 36, 643, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username :");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, -1, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 259, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 259, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 60, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 259, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Address :");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 259, -1));

        btnCreateCustomer.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnCreateCustomer.setText("Create Customer");
        btnCreateCustomer.setToolTipText("");
        btnCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCustomerActionPerformed(evt);
            }
        });
        add(btnCreateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, -1, -1));

        btnModify.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnModify.setText("Update Customer");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, 160, -1));

        btnDelete.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnDelete.setText("Delete Customer");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 270, 150, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mobile Number :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));
        add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 259, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCustomerActionPerformed
    try {
        if(!system.getUserAccountDirectory().checkIfUsernameIsUnique((txtUsername.getText())))
        {
            JOptionPane.showMessageDialog(this, "User with this username already exist.Try a diffrent username");
        }
        else{
          Random random=new Random();
          int uniqueId=random.nextInt((9999 - 100) + 1) + 10;
          Customer customer=new Customer(txtName.getText(),txtAddress.getText(),Long.parseLong(txtMobileNumber.getText()),txtUsername.getText(),txtPassword.getText(),uniqueId);
          system.getCustomerDirectory().addcustomer(customer);
          system.getUserAccountDirectory().addUserAccountToAccounts(customer);
          populateTable();
          reset();
          JOptionPane.showMessageDialog(this, "User Registered Succesfully");
        }
    } catch (Exception e) {
        throw e;
    }
    }//GEN-LAST:event_btnCreateCustomerActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
    try{
        int selectedRowIndex=jRegisterTable.getSelectedRow();
        int uniqueId=system.getCustomerDirectory().getCustomers().get(selectedRowIndex).getUniqueId();
        Customer customer=new Customer(txtName.getText(),txtAddress.getText(),Long.parseLong(txtMobileNumber.getText()),txtUsername.getText(),txtPassword.getText(),uniqueId);
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
        system.getCustomerDirectory().getCustomers().set(selectedRowIndex, customer);
        populateTable();
        JOptionPane.showMessageDialog(null, "User Updated Succesfully");
        reset();
    }
    catch(Exception e)
    {
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
            Customer customer=(Customer) jRegisterTable.getValueAt(selectedRowIndex, 0);
            system.getCustomerDirectory().getCustomers().remove(customer);
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
            txtName.setText(jRegisterTable.getModel().getValueAt(rowNumber, 0).toString());
            txtAddress.setText(jRegisterTable.getModel().getValueAt(rowNumber, 1).toString());
            txtMobileNumber.setText(jRegisterTable.getModel().getValueAt(rowNumber, 2).toString());
            txtUsername.setText(jRegisterTable.getModel().getValueAt(rowNumber, 3).toString());
            txtPassword.setText(jRegisterTable.getModel().getValueAt(rowNumber, 4).toString());
            
       }
      catch(Exception e)
      {
          throw  e;
      }
    }//GEN-LAST:event_jRegisterTableMouseClicked
     private void populateTable() {
        CustomerDirectory customerDirectory = system.getCustomerDirectory();
        DefaultTableModel model = (DefaultTableModel) jRegisterTable.getModel();
        model.setRowCount(0);
        for (Customer customer : customerDirectory.getCustomers()) {
                    Object[] row = new Object[5];
                    row[0] = customer.getName();
                    row[1] = customer.getAddress();
                    row[2] = customer.getMobileNumber();
                    row[3] = customer.getUsername();
                    row[4] = customer.getPassword();
                    model.addRow(row);
                
            }
    }
    private void reset() {
            txtName.setText("");
            txtAddress.setText("");
            txtMobileNumber.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCustomer;
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
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
