/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.OrganizationAdmin;
import Business.UserAccount.UserAccount;
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author sonal
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private final EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ManageEnterpriseAdminJPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        populateNetworkComboBox();
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
        jLabel4 = new javax.swing.JLabel();
        btnCreateEnterpriseAdmin = new javax.swing.JButton();
        btnModifyEnterpriseAdmin = new javax.swing.JButton();
        btnDeleteEnterpriseAdmin = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        networkJComboBox = new javax.swing.JComboBox();
        enterpriseJComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(new java.awt.Color(255, 255, 255));

        jRegisterTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRegisterTable.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jRegisterTable.setForeground(new java.awt.Color(56, 90, 174));
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Default", "NETWORK NAME", "ENTERPRISE NAME", "NAME", "USERNAME", "PASSWORD"
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
        if (jRegisterTable.getColumnModel().getColumnCount() > 0) {
            jRegisterTable.getColumnModel().getColumn(1).setResizable(false);
            jRegisterTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setBackground(new java.awt.Color(240, 178, 62));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Enterprise Admin");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username :");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Password :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Network :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnCreateEnterpriseAdmin.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCreateEnterpriseAdmin.setText("Create");
        btnCreateEnterpriseAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreateEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEnterpriseAdminActionPerformed(evt);
            }
        });

        btnModifyEnterpriseAdmin.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnModifyEnterpriseAdmin.setText("Modify");
        btnModifyEnterpriseAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModifyEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyEnterpriseAdminActionPerformed(evt);
            }
        });

        btnDeleteEnterpriseAdmin.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnDeleteEnterpriseAdmin.setText("Delete ");
        btnDeleteEnterpriseAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEnterpriseAdminActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Enterprise :");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Name :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(networkJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterpriseJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateEnterpriseAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyEnterpriseAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(817, Short.MAX_VALUE)
                        .addComponent(btnDeleteEnterpriseAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnDeleteEnterpriseAdmin)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateEnterpriseAdmin))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnModifyEnterpriseAdmin)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEnterpriseAdminActionPerformed
    String name= txtName.getText();
    String username=txtUsername.getText();
    String password =txtPassword.getText();
    Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
    if(system.CheckIfUSernameIsUnique(username))
    {
        Random random=new Random();
        int uniqueId=random.nextInt((9999 - 100) + 1) + 10;
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        UserAccount userAccount=new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(new OrganizationAdmin());
        userAccount.setUniqueId(uniqueId);
        system.setUserAccounts(userAccount);
        enterprise.getUserAccountDirectory().addUserAccountToAccounts(userAccount);
        dB4OUtil.storeSystem(system);
        populateTable();
        try {
            sendEmail(username, password);
        } catch (Exception ex) {
            Logger.getLogger(ManageEnterpriseAdminJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Organisation Admin Created");
        reset();
    }
    else{
        JOptionPane.showMessageDialog(null, "Username already exist");
        return;
    }
    }//GEN-LAST:event_btnCreateEnterpriseAdminActionPerformed

    private void btnModifyEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyEnterpriseAdminActionPerformed
    try{
        int rowNumber=jRegisterTable.getSelectedRow();
        if(rowNumber<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        String name= txtName.getText();
        String username=txtUsername.getText();
        String password =txtPassword.getText();
        int uniqueId=(int) jRegisterTable.getModel().getValueAt(rowNumber, 0);
        
         for(Network networks : system.getNetworks())
         {
             for(Enterprise enterprises :networks.getEnterpriseDirectory().getEnterprises())
             {
                 for(UserAccount userAccount : enterprises.getUserAccountDirectory().getUserAccountList())
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
             }
         }
         system.getNetworks().forEach(networks -> {
             networks.getEnterpriseDirectory().getEnterprises().forEach(enterprises -> {
                 enterprises.getUserAccountDirectory().getUserAccountList().stream().filter(userAccount -> (uniqueId == userAccount.getUniqueId())).map(userAccount -> {
                     userAccount.setUsername(username);
                     return userAccount;
                 }).map(userAccount -> {
                     userAccount.setPassword(password);
                     return userAccount;
                 }).forEachOrdered(userAccount -> {
                     userAccount.getEmployee().setName(name);
                 });
            });
        });
         dB4OUtil.storeSystem(system);
         populateTable();
         reset();
         JOptionPane.showMessageDialog(null, "User modifed succesfully");
    }
    catch(Exception e)
    {
        throw e;
    }
    }//GEN-LAST:event_btnModifyEnterpriseAdminActionPerformed

    private void btnDeleteEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEnterpriseAdminActionPerformed
    try{
        int selectedRowIndex=jRegisterTable.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            int uniqueId= (int) jRegisterTable.getValueAt(selectedRowIndex, 0);
            for(Network network : system.getNetworks())
            {
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises())
                {
                    for(UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList())
                    {
                        if(userAccount.getUniqueId()== uniqueId)
                        {
                            enterprise.getUserAccountDirectory().getUserAccountList().remove(userAccount);
                            system.getUserAccounts().remove(userAccount);
                            break;
                        }
                    }
                }
            }
            dB4OUtil.storeSystem(system);
            populateTable();
            reset();
            populateNetworkComboBox();
            JOptionPane.showMessageDialog(null, "Admin Deleted Successfully");
            
        }
    }
    catch(Exception e)
    {
        throw e;
    }
       
    }//GEN-LAST:event_btnDeleteEnterpriseAdminActionPerformed

    private void jRegisterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterTableMouseClicked
        try{
           int rowNumber=jRegisterTable.getSelectedRow();
           Enterprise type=(Enterprise) jRegisterTable.getModel().getValueAt(rowNumber, 2);
            enterpriseJComboBox.setSelectedItem(type);
            txtName.setText(jRegisterTable.getModel().getValueAt(rowNumber, 3).toString());
            txtUsername.setText(jRegisterTable.getModel().getValueAt(rowNumber, 4).toString());
            txtPassword.setText(jRegisterTable.getModel().getValueAt(rowNumber, 5).toString());
             for(Network networks:system.getNetworks())
            {
                if(networks.getNetworkName().equals(jRegisterTable.getModel().getValueAt(rowNumber, 1).toString()))
                {
                    networkJComboBox.setSelectedItem(networks.getNetworkName());
                }
            }
       }
      catch(Exception e)
      {
          throw  e;
      }
    }//GEN-LAST:event_jRegisterTableMouseClicked

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        enterpriseJComboBox.removeAllItems();
        Network network1=null;
        for (Network network : system.getNetworks()) {
            if(network.getNetworkName().equals((networkJComboBox.getSelectedItem())))
            {
              network1=network;
            }
        }
        if(network1!=null)
        {
            for(Enterprise enterprise:network1.getEnterpriseDirectory().getEnterprises())
        {
            enterpriseJComboBox.addItem(enterprise);
        }
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jRegisterTable.getModel();
        model.setRowCount(0);
        jRegisterTable.getColumnModel().getColumn(0).setMinWidth(0);
        jRegisterTable.getColumnModel().getColumn(0).setMaxWidth(0);
        for(Network network : system.getNetworks())
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises())
            {
                for(UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList())
                {
                    Object[] row = new Object[6];
                    row[0]=userAccount.getUniqueId();
                    row[1] = network.getNetworkName();
                    row[2] = enterprise;
                    row[3] = userAccount.getEmployee().getName();
                    row[4] = userAccount.getUsername();
                    row[5] = userAccount.getPassword();
                    model.addRow(row);
                }
            }
        }

    }
    private void reset() {
        try{
            txtName.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
            networkJComboBox.setSelectedIndex(0);
            enterpriseJComboBox.setSelectedIndex(0);
        }
        catch(Exception ex)
        {
            throw  ex;
        }
        }
    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();
       for(Network network: system.getNetworks())
       {
           networkJComboBox.addItem(network.getNetworkName());
       }
    }
    private void addEmployee() throws Exception
    {
        String name= txtName.getText();
    String username=txtUsername.getText();
    String password =txtPassword.getText();
    Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
    if(system.getUserAccountDirectory().checkIfUsernameIsUnique(username,system))
    {
        Random random=new Random();
        int uniqueId=random.nextInt((9999 - 100) + 1) + 10;
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new OrganizationAdmin(),uniqueId);
        dB4OUtil.storeSystem(system);
        populateTable();
        JOptionPane.showMessageDialog(null, "Organisation Admin Created");
        sendEmail(username,password);
        reset();
    }
    else{
        JOptionPane.showMessageDialog(null, "Username already exist");
        return;
    }
    }
    private void sendEmail(String toEmailAddress,String password) throws Exception
    {
       String toEmail=toEmailAddress;
       String fromEmail="huskydevportal@gmail.com";
       String fromEmailPassword="Husky@123";
       String message= "You have been registered on the xyz portal with "+toEmailAddress +"username and "+password +"password";
       String subject= "Registartion Successfull";
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEnterpriseAdmin;
    private javax.swing.JButton btnDeleteEnterpriseAdmin;
    private javax.swing.JButton btnModifyEnterpriseAdmin;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTable jRegisterTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
