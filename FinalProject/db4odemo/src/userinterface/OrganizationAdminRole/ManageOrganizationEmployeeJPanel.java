/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OrganizationAdminRole;

import Business.CollegeOrganisation;
import Business.CounsellorOrganisation;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryManOrganisation;
import Business.DoctorOrganisation;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.NGOAdminOrganisation;
import Business.Network.Network;
import Business.Organization;
import Business.ReceptionistOrganisation;
import Business.RestaurantOrganisation;
import Business.Role.College;
import Business.Role.CounsellorRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.DoctorRole;
import Business.Role.NGOEmployee;
import Business.Role.OrganizationAdmin;
import Business.Role.ReceptionistRole;
import Business.Role.RestaurantAdmin;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 
 * @author sonal
 */
public class ManageOrganizationEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationEmployeeJPanel
     */
    private final EcoSystem system;  
    boolean validateNullOrEmpty=true;
    boolean validateRegex=true;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ManageOrganizationEmployeeJPanel(EcoSystem system) {
        initComponents();
        this.system=system;
       populateData();
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
        jPanel1 = new javax.swing.JPanel();
        lblAvailablity = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        btnUpdateItem = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        cmbRole = new javax.swing.JComboBox<>();
        lblAvailablity1 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        lblAvailablity3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblItem = new javax.swing.JLabel();
        cmbOrganisation = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jRegisterTable = new javax.swing.JTable();
        btnDeleteEmployee = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(240, 178, 62));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lblAvailablity.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblAvailablity.setForeground(new java.awt.Color(255, 255, 255));
        lblAvailablity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvailablity.setText("EMPLOYEE NAME:");
        lblAvailablity.setFocusable(false);
        lblAvailablity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblPrice.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setText("Role    :");
        lblPrice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAddItem.setBackground(new java.awt.Color(240, 178, 62));
        btnAddItem.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAddItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAddItem.setText("ADD ORGANISATION EMPLOYEE");
        btnAddItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnUpdateItem.setBackground(new java.awt.Color(240, 178, 62));
        btnUpdateItem.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnUpdateItem.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateItem.setText("UPDATE ORGANISATION EMPLOYEE");
        btnUpdateItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAvailablity1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblAvailablity1.setForeground(new java.awt.Color(255, 255, 255));
        lblAvailablity1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvailablity1.setText("USERNAME :");
        lblAvailablity1.setFocusable(false);
        lblAvailablity1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAvailablity3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblAvailablity3.setForeground(new java.awt.Color(255, 255, 255));
        lblAvailablity3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvailablity3.setText("PASSWORD :");
        lblAvailablity3.setFocusable(false);
        lblAvailablity3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblItem.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblItem.setForeground(new java.awt.Color(255, 255, 255));
        lblItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItem.setText("ORGANISATION :");
        lblItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cmbOrganisation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrganisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganisationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddItem)
                .addGap(34, 34, 34)
                .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblAvailablity3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAvailablity1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUsername)
                        .addComponent(cmbRole, 0, 142, Short.MAX_VALUE)
                        .addComponent(txtEmployeeName)
                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(cmbOrganisation, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbOrganisation, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbRole, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailablity1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailablity3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem)
                    .addComponent(btnUpdateItem))
                .addGap(110, 110, 110))
        );

        jRegisterTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRegisterTable.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jRegisterTable.setForeground(new java.awt.Color(56, 90, 174));
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Default", "ORGANISATION", "ROLE", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jRegisterTable.setGridColor(new java.awt.Color(56, 90, 174));
        jRegisterTable.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jRegisterTable.setSelectionBackground(new java.awt.Color(240, 178, 62));
        jRegisterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegisterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jRegisterTable);

        btnDeleteEmployee.setBackground(new java.awt.Color(240, 178, 62));
        btnDeleteEmployee.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnDeleteEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEmployee.setText("DELETE");
        btnDeleteEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(btnDeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteEmployee))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        try{
            addEmployee(false,-1);
        }
        catch(Exception ex)
        {
            try {
                throw ex;
            } catch (Exception ex1) {
                Logger.getLogger(ManageOrganizationEmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
        try{
            int deletionIndex=deleteEmployee(true);
        }
        catch(Exception ex){

        }  
    }//GEN-LAST:event_btnUpdateItemActionPerformed

    private void cmbOrganisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganisationActionPerformed
       if(cmbOrganisation.getSelectedItem()==null)
       {
           return;
       }
        if(cmbOrganisation.getSelectedItem().equals(Organization.Type.NGOAdmin.getValue()))
       {
           cmbRole.removeAllItems();
           cmbRole.addItem(Role.RoleType.NGOEmployee.getValue());
       }
       if(cmbOrganisation.getSelectedItem().equals(Organization.Type.Restaurant.getValue()))
       {
           cmbRole.removeAllItems();
           cmbRole.addItem(Role.RoleType.RestaurantAdmin.getValue());
           
       }
       if(cmbOrganisation.getSelectedItem().equals(Organization.Type.DeliveryMan.getValue()))
       {
           cmbRole.removeAllItems();
           cmbRole.addItem(Role.RoleType.DeliveryMan.getValue());
           
       }
       if(cmbOrganisation.getSelectedItem().equals(Organization.Type.College.getValue()))
       {
           cmbRole.removeAllItems();
           cmbRole.addItem(Role.RoleType.College.getValue());
       }
       if(cmbOrganisation.getSelectedItem().equals(Organization.Type.Counsellor.getValue()))
       {
           cmbRole.removeAllItems();
           cmbRole.addItem(Role.RoleType.Counsellor.getValue());
           
       }
       if(cmbOrganisation.getSelectedItem().equals(Organization.Type.Doctor.getValue()))
       {
           cmbRole.removeAllItems();
           cmbRole.addItem(Role.RoleType.Doctor.getValue());
       }
       if(cmbOrganisation.getSelectedItem().equals(Organization.Type.Receptionist.getValue()))
       {
           cmbRole.removeAllItems();
           cmbRole.addItem(Role.RoleType.Receptionist.getValue());
       }
    }//GEN-LAST:event_cmbOrganisationActionPerformed

    private void jRegisterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterTableMouseClicked
        try{
            int rowNumber=jRegisterTable.getSelectedRow();
            cmbOrganisation.setSelectedItem(jRegisterTable.getModel().getValueAt(rowNumber, 1).toString());
            cmbRole.setSelectedItem(jRegisterTable.getModel().getValueAt(rowNumber, 2));
            txtEmployeeName.setText(jRegisterTable.getModel().getValueAt(rowNumber, 3).toString());
            txtUsername.setText(jRegisterTable.getModel().getValueAt(rowNumber, 4).toString());
            txtPassword.setText(jRegisterTable.getModel().getValueAt(rowNumber, 5).toString());
            
        }
        catch(Exception e)
        {
            throw  e;
        }
    }//GEN-LAST:event_jRegisterTableMouseClicked

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        try{
            deleteEmployee(false);
        }
        catch(Exception ex)
        {
            try {
                throw ex;
            } catch (Exception ex1) {
                Logger.getLogger(ManageOrganizationEmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed
    private void populateTable() {
        try {
            
            DefaultTableModel model = (DefaultTableModel) jRegisterTable.getModel();
            model.setRowCount(0);
            jRegisterTable.getColumnModel().getColumn(0).setMinWidth(0);
            jRegisterTable.getColumnModel().getColumn(0).setMaxWidth(0);
            for(Organization organization : loggedInUserEnterprise.getOrganizationDirectory().getOrganisationList())
            {
                for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                Object[] row = new Object[6];
                row[0]=  userAccount.getUniqueId();
                row[1] = organization.getName();
                row[2] = userAccount.getRole();
                row[3] = userAccount.getEmployee().getName();
                row[4] = userAccount.getUsername();
                row[5] = userAccount.getPassword();
                model.addRow(row);

                }
            }

        } catch (Exception e) {
            throw e;
        }

                }
    private void reset() {
                txtEmployeeName.setText("");
                txtPassword.setText("");
                txtUsername.setText("");
                cmbOrganisation.setSelectedIndex(0);
                cmbRole.setSelectedIndex(0);
            }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JComboBox<String> cmbOrganisation;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jRegisterTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailablity;
    private javax.swing.JLabel lblAvailablity1;
    private javax.swing.JLabel lblAvailablity3;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
Enterprise loggedInUserEnterprise=null;
    private void populateData() {
       for(Network network : system.getNetworks() )
       {
           for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises())
           {
               for(UserAccount useraccount: enterprise.getUserAccountDirectory().getUserAccountList())
               {
                   if(useraccount.getUniqueId()== system.getLogInUser().getLogInId())
                   {
                       loggedInUserEnterprise=enterprise;
                       jLabel1.setText("ENTERPRISE :"+enterprise.getEnterpriseType());
                       if(enterprise.getEnterpriseType().equals("NGO"))
                       {
                         
                           cmbOrganisation.removeAllItems();
                           cmbRole.removeAllItems();
                           cmbOrganisation.addItem(Organization.Type.NGOAdmin.getValue());
                           
                       }
                       else if(enterprise.getEnterpriseType().equals("Restaurant"))
                       {
                           cmbOrganisation.removeAllItems();
                           cmbRole.removeAllItems();
                           cmbOrganisation.addItem(Organization.Type.Restaurant.getValue());
                           cmbOrganisation.addItem(Organization.Type.DeliveryMan.getValue());
                           cmbRole.addItem(Role.RoleType.RestaurantAdmin.toString());
                           cmbRole.addItem(Role.RoleType.DeliveryMan.toString());
                       }
                       else if(enterprise.getEnterpriseType().equals("College"))
                       {
                           cmbOrganisation.removeAllItems();
                           cmbRole.removeAllItems();
                           cmbOrganisation.addItem(Organization.Type.College.getValue());
                           cmbRole.addItem(Role.RoleType.College.getValue());
                       }
                       else if(enterprise.getEnterpriseType().equals("CollegeCounsellor"))
                       {
                           cmbOrganisation.removeAllItems();
                           cmbRole.removeAllItems();
                           cmbOrganisation.addItem(Organization.Type.Counsellor.getValue());
                           cmbRole.addItem(Role.RoleType.Counsellor.getValue());
                       }
                       else if(enterprise.getEnterpriseType().equals("Hospital"))
                       {
                           cmbOrganisation.removeAllItems();
                           cmbRole.removeAllItems();
                           cmbOrganisation.addItem(Organization.Type.Doctor.getValue());
                           cmbOrganisation.addItem(Organization.Type.Receptionist.getValue());
                           cmbRole.addItem(Role.RoleType.Doctor.getValue());
                           cmbRole.addItem(Role.RoleType.Receptionist.getValue());
                       }
                   }
               }
           }
       }
    }
    private Role populateRole(String role)
    {
        Role newRole = new NGOEmployee();
       if(role.equals("NGOEmployee"))
       {
           newRole=new NGOEmployee();
       }
        if(role.equals("Customer"))
       {
           newRole=new CustomerRole();
       }
         if(role.equals("DeliveryMan"))
       {
           newRole=new DeliverManRole();
       }
          if(role.equals("OrganizationAdmin"))
       {
           newRole=new OrganizationAdmin();
       }
        if(role.equals("Receptionist Role"))
       {
           newRole=new ReceptionistRole();
       }
        if(role.equals("Doctor Role"))
       {
           newRole=new DoctorRole();
       }
        if(role.equals("Counsellor Role"))
       {
           newRole=new CounsellorRole();
       }
        if(role.equals("College Role"))
       {
           newRole=new College();
       }
         if(role.equals("RestaurantAdmin"))
       {
           newRole=new RestaurantAdmin();
       }
        return newRole;
        
    }
    private Organization populateOrganisation(String organisation)
    {
        Organization organization = new NGOAdminOrganisation();
       if(organisation.equals("NGOAdmin"))
       {
           organization=new NGOAdminOrganisation();
       }
        if(organisation.equals("Receptionist"))
       {
           organization=new ReceptionistOrganisation();
       }
         if(organisation.equals("Doctor"))
       {
           organization=new DoctorOrganisation();
       }
          if(organisation.equals("Counsellor"))
       {
           organization=new CounsellorOrganisation();
       }
        if(organisation.equals("College"))
       {
           organization=new CollegeOrganisation();
       }
        if(organisation.equals("Restaurant"))
       {
           organization=new RestaurantOrganisation();
       }
        if(organisation.equals("DeliveryMan"))
       {
           organization=new DeliveryManOrganisation();
       }
        
        return organization;
        
    }
    private  void addEmployee(boolean update,int deletionIndex) throws Exception //if update flag true and index where it has to be updated
    {
        try{
         if(validateNullOrEmpty()){
          if(validateFields()){ 
            String organisation = cmbOrganisation. getSelectedItem().toString(); //get selected organization
            String role = cmbRole. getSelectedItem().toString(); //get role from combo box dropdown
            String employeeName = txtEmployeeName.getText(); 
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            Organization organization = null;
            organization=populateOrganisation(organisation); //setting organization
            organization.setName(organisation);
            Employee employee=organization.getEmployeeDirectory().createEmployee(employeeName); //adding an employee to an org
            Random random=new Random();
            int uniqueId=random.nextInt((9999 - 100) + 1) + 10; //creates unique ID
            organization.getUserAccountDirectory().createUserAccount(username, password, employee, populateRole(role), uniqueId);
            for(Network network : system.getNetworks() ) //looping through networks
            {
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises()) //looping through enterprises
                {
                    for(UserAccount useraccount: enterprise.getUserAccountDirectory().getUserAccountList()) //looping through each account in enterprise
                    {
                        if(useraccount.getUniqueId()== system.getLogInUser().getLogInId())
                        {
                            if(update) //perform the task if its update else simple addition
                            {
                                    UserAccount a= enterprise.getOrganizationDirectory().getOrganisationList().get(deletionIndex).getUserAccountDirectory().getUserAccountList().get(0);
                                    organization.getUserAccountDirectory().getUserAccountList().get(0).setUniqueId(a.getUniqueId());
                                    organization.getUserAccountDirectory().getUserAccountList().get(0).setIsAvailable(a.isIsAvailable());
                                    enterprise.getOrganizationDirectory().getOrganisationList().set(deletionIndex, organization);
                                    break;
                            }
                            organization.getUserAccountDirectory().getUserAccountList().get(0).setIsAvailable(true);
                            enterprise.getOrganizationDirectory().createOrganisation(organization); //no updation, only for adding
                        }
                     }
                }
            }
            dB4OUtil.storeSystem(system);
            reset();
            populateTable();
            if(!update) //if its not an update flag, we are creating
            {
            JOptionPane.showMessageDialog(null, "Organisation Employee Added Successfully");
            }
            else{
                sendEmail(username, password);
                JOptionPane.showMessageDialog(null, "Organisation Employee Updated Successfully"); //if update flag true
            }
          }
          else{
           JOptionPane.showMessageDialog(this, "Validation Failed .Please check the blue boxes");
           validateNullOrEmpty=true;
           validateRegex=true; 
          }
         }
         else{
           JOptionPane.showMessageDialog(this, "Validation Failed .Please check the blue boxes");
           validateNullOrEmpty=true;
           validateRegex=true; 
          }
         
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
     private  int deleteEmployee(boolean update) throws Exception    //returns index to add method where it has to update
     {                                             
        try{
        int deletionIndex=0;  //initially set to 0
        int selectedRowIndex=jRegisterTable.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return -1;
        }
         else{
            int uniqueId= (int) jRegisterTable.getValueAt(selectedRowIndex, 0);
            Enterprise ent=null;
            Organization organizationNew=null;
            for(Network network : system.getNetworks()) //for networks
            {
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises()) 
                {
                    int i=0;
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganisationList())
                    {
                            Iterator account= organization.getUserAccountDirectory().getUserAccountList().iterator();
                            while (account.hasNext()) {
                               UserAccount e= (UserAccount) account.next();
                                if(e.getUniqueId() == uniqueId)
                                {
                                    ent=enterprise;
                                    organizationNew=organization;
                                    deletionIndex=i;
                                    break;
                                }
                                else
                                    i++;
                                }
                    }
                }
            }
            if(ent!=null && !update)
            {
                ent.getOrganizationDirectory().getOrganisationList().remove(organizationNew);
            }
            if(update)
            {
                addEmployee(update, deletionIndex);
            }
            dB4OUtil.storeSystem(system);
            populateTable();
            reset();
            if(!update)
            {
                JOptionPane.showMessageDialog(null, "Organisation Employee Deleted Successfully");
            }
            return deletionIndex;
            
        }
        }
        catch(Exception ex)
        {
            throw ex;
        }
     }
     private void sendEmail(String toEmailAddress,String password) throws Exception
    {
       String toEmail=toEmailAddress;
       String fromEmail="huskydevportal@gmail.com";
       String fromEmailPassword="Husky@123";
       String message= "You have been registered on the Foster Care with "+toEmailAddress +" username and "+password +" password";
       String subject= "Registration Successful";
       Properties properties=new Properties();
       properties.put("mail.smtp.auth", true);
       properties.put("mail.smtp.starttls.enable", true);
       properties.put("mail.smtp.host", "smtp.gmail.com");
       properties.put("mail.smtp.port", 587);
        Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(fromEmail,fromEmailPassword);

        }
        });

        try{
        //
        MimeMessage mimeMessage = new MimeMessage(session);
        mimeMessage.setFrom(new InternetAddress(fromEmail));
        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
        mimeMessage.setSubject(subject);
        mimeMessage.setText(message);
        Transport.send(mimeMessage);
        }
        catch(Exception e){
            throw  e;
        }

    }

    private boolean validateNullOrEmpty() {
        validateNullOrEmpty=true;
        if(txtEmployeeName.getText().trim().isEmpty() || txtEmployeeName.getText()==null){
             validateNullOrEmpty=false;
            txtEmployeeName.setToolTipText("Please Enter Valid Employee Name");
            txtEmployeeName.setBorder(BorderFactory.createLineBorder(Color.BLUE,1));
         }
        if(!txtEmployeeName.getText().trim().isEmpty() && txtEmployeeName.getText()!=null){
            txtEmployeeName.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
         }
        
        if(txtUsername.getText().trim().isEmpty() || txtUsername.getText()==null){
             validateNullOrEmpty=false;
            txtUsername.setToolTipText("Please Enter a Valid Email ID");
            txtUsername.setBorder(BorderFactory.createLineBorder(Color.BLUE,1));
         } 
         if(!txtUsername.getText().trim().isEmpty() && txtUsername.getText()!=null){
            txtUsername.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
         }
         
         if(txtPassword.getText().trim().isEmpty() || txtPassword.getText()==null){
            validateNullOrEmpty=false;
            txtPassword.setToolTipText("Please Enter a Password");
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.BLUE,1));
         } 
         
         if(!txtPassword.getText().trim().isEmpty() && txtPassword.getText()!=null){
            txtPassword.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
         }
              
        return validateNullOrEmpty;
                
    }

    private boolean validateFields() {
        
        validateRegex=true;
        if(!txtUsername.getText().matches("^(.+)@(.+)$")){
            validateRegex=false;
            txtUsername.setToolTipText("Please Enter A Valid Email Address");
            txtUsername.setBorder(BorderFactory.createLineBorder (Color.BLUE));
        }
        
        if(txtUsername.getText().matches("^(.+)@(.+)$")){
           txtUsername.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        
        
         if(!txtPassword.getText().matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$")){
            validateRegex=false;
            txtPassword.setToolTipText("Please Enter A Valid Password [minimum 8-digit with one letter, one number, and one special character");
            txtPassword.setBorder(BorderFactory.createLineBorder (Color.BLUE));
            txtUsername.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        
        if(txtPassword.getText().matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$")){
           txtPassword.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        
        
        return validateRegex;
    }
}

