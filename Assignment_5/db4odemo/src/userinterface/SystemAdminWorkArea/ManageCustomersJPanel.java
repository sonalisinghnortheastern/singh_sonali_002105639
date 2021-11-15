/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Customer.CustomerInformation;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sonal
 */
public final class ManageCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomers
     */
    CustomerDirectory customerDirectory;
    UserAccountDirectory userAccountDirectory;
    private final EcoSystem system;
    private final DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    ArrayList<CustomerInformation> customerInformations ;
    public ManageCustomersJPanel() {
        initComponents();
        customerDirectory=new  CustomerDirectory();
        userAccountDirectory=new UserAccountDirectory();
        system = dB4OUtil.retrieveSystem();
        customerInformations=new ArrayList<>();
        populateTable(system.getCustomerDirectory().getCustomers());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnCreateCustomer = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jManageCustomerTable = new javax.swing.JTable();
        btnModify1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Customers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 36, 643, -1));

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblName.setText("Name :");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 259, -1));

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAddress.setText("Address :");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 259, -1));

        lblPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPhoneNumber.setText("Mobile Number :");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 259, -1));

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblUsername.setText("Username :");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 259, -1));

        btnCreateCustomer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreateCustomer.setText("Create New Customer");
        btnCreateCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCustomerActionPerformed(evt);
            }
        });
        add(btnCreateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, -1, -1));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("Delete Customer");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 140, -1));

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPassword.setText("Password :");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 70, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 259, -1));

        jManageCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Mobile Number", "Username", "Password"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jScrollPane1.setViewportView(jManageCustomerTable);

    add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 840, 180));

    btnModify1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    btnModify1.setText("Modify Customer");
    btnModify1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnModify1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnModify1ActionPerformed(evt);
        }
    });
    add(btnModify1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCustomerActionPerformed
       try{
        if(!system.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText()))
       {
           JOptionPane.showMessageDialog(this,"User with this username exist.Try a diffrent one");
       }
        else
       {
           Employee employee=new Employee();
           employee.setName(txtName.getText());
           UserAccount userAccount = new UserAccount();
           userAccount.setUsername(txtUserName.getText());
           userAccount.setPassword(txtPassword.getText());
           userAccount.setEmployee(employee);
           Customer customer =new Customer();
           customer.setName(txtName.getText());
           customer.setAddress(txtAddress.getText());
           customer.setAddress(txtAddress.getText());
           customer.setMobileNumber(Long.parseLong(txtPhoneNumber.getText()));
           customer.setUserAccount(userAccount);
           system.getEmployeeDirectory().createEmployee(txtName.getText());
           system.getUserAccountDirectory().createUserAccount(txtUserName.getText(), txtPassword.getText(), employee, new CustomerRole());
           system.getCustomerDirectory().setCustomers(customer);
           populateTable(system.getCustomerDirectory().getCustomers());
           JOptionPane.showMessageDialog(this,"User created succesfully");
           
       }
       }
       catch(Exception ex)
       {
           throw ex;
       }
    }//GEN-LAST:event_btnCreateCustomerActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       try{
           int rowIndex=jManageCustomerTable.getSelectedRow();
        if(rowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"Please select the entry you wish to delete");
        }
        else{
             Customer customer = (Customer) jManageCustomerTable.getValueAt(rowIndex, 0);
            system.getCustomerDirectory().getCustomers().remove(customer);
            for(UserAccount userAccount :system.getUserAccountDirectory().getUserAccountList())
            {
                if(userAccount.getUsername() == customer.getUserAccount().getUsername())
                {
                    system.getUserAccountDirectory().getUserAccountList().remove(userAccount);
                    JOptionPane.showMessageDialog(this,"User deleted succesfully");
                }
            }
            populateTable(system.getCustomerDirectory().getCustomers());
            
       }
       }
       catch(Exception ex)
       {
           throw ex;
       }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModify1ActionPerformed
        try {
            int rowIndex=jManageCustomerTable.getSelectedRow();
            if(rowIndex<0)
            {
                JOptionPane.showMessageDialog(this,"Please select the entry you wish to modify");
            }
            else{
                int userNameIndex=0;
                for(Customer customer : system.getCustomerDirectory().getCustomers())
                {
                    if(customer.getUserAccount().getUsername()== txtUserName.getText() && rowIndex !=userNameIndex)
                    {
                        JOptionPane.showMessageDialog(this,"Please select a diffrent username.User with this username already exist");
                    }
                    else{
                        userNameIndex++;
                    }
                }
                Customer selectedCustomer = (Customer) jManageCustomerTable.getValueAt(rowIndex, 0);
                int index=0;
                for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
                    if(userAccount.getUsername() == selectedCustomer.getUserAccount().getUsername())
                    {
                        system.getUserAccountDirectory().getUserAccountList().set(index, userAccount);
                    }
                    else{
                        index++;
                    }
                }
                Employee employee=new Employee();
                employee.setName(txtName.getText());
                UserAccount userAccount = new UserAccount();
                userAccount.setUsername(txtUserName.getText());
                userAccount.setPassword(txtPassword.getText());
                userAccount.setEmployee(employee);
                Customer customer =new Customer();
                customer.setName(txtName.getText());
                customer.setAddress(txtAddress.getText());
                customer.setAddress(txtAddress.getText());
                customer.setMobileNumber(Long.parseLong(txtPhoneNumber.getText()));
                customer.setUserAccount(userAccount);
                system.getCustomerDirectory().getCustomers().set(rowIndex, customer);
                JOptionPane.showMessageDialog(this,"User Modified succesfully");
                populateTable(system.getCustomerDirectory().getCustomers());
            }
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_btnModify1ActionPerformed

    public void populateTable(ArrayList<Customer> customers)
 {
     try{
         DefaultTableModel model =(DefaultTableModel) jManageCustomerTable.getModel();
            model.setRowCount(0);
            if(customerInformations!=null || !customerInformations.isEmpty())
            {
                for (Customer customer : customers) {
                    
                    model.addRow(new Object[]
                    {customer.getName(),customer.getAddress(),customer.getMobileNumber(),customer.getUserAccount().getUsername(),
                    customer.getUserAccount().getPassword()});
                }
                 jManageCustomerTable.setModel(model);
            }
            else{
                JOptionPane.showMessageDialog(this,"No customer Present To Display");
            }
     }
     catch(Exception ex)
     {
         throw ex;
     }
 }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCustomer;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jManageCustomerTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
