/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
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
public class ManageDeliveryManJPanel extends javax.swing.JPanel {

    private final EcoSystem system;
    boolean validateNullOrEmpty=true;
    boolean validateRegex=true;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ManageDeliveryManJPanel(EcoSystem system) {
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
        jLabel4 = new javax.swing.JLabel();
        btnCreateDeliveryMan = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(new java.awt.Color(255, 255, 255));

        jRegisterTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRegisterTable.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jRegisterTable.setForeground(new java.awt.Color(56, 90, 174));
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Default", "NAME", "PHONE", "ADDRESS", "USERNAME", "PASSWORD"
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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Delivery Man");
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
        jLabel4.setText("Name :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnCreateDeliveryMan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCreateDeliveryMan.setText("Create");
        btnCreateDeliveryMan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreateDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDeliveryManActionPerformed(evt);
            }
        });

        btnModify.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnModify.setText("Modify");
        btnModify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnDelete.setText("Delete ");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Phone :");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Address :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                            .addComponent(txtAddress)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(btnCreateDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 194, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(817, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnDelete)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateDeliveryMan)
                    .addComponent(btnModify))
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDeliveryManActionPerformed
try {
    if(validateNullOrEmpty())
    {
        if(validateFields())
        {
            if(!system.getUserAccountDirectory().checkIfUsernameIsUnique((txtUsername.getText())))
            {
                JOptionPane.showMessageDialog(this, "User with this username already exist.Try a diffrent username");
            }
            else{
              Random random=new Random();
              int uniqueId=random.nextInt((9999 - 100) + 1) + 10;
              DeliveryMan deliveryMan=new DeliveryMan(txtName.getText(),Long.parseLong(txtMobileNumber.getText()),txtAddress.getText(),txtUsername.getText(),txtPassword.getText(),uniqueId);
              deliveryMan.setIsDeliveryPersonAvailable(true);
              system.getDeliveryManDirectory().setDeliveryMens(deliveryMan);
              system.getUserAccountDirectory().addUserAccountToAccounts(deliveryMan);
              populateTable();
              reset();
              dB4OUtil.storeSystem(system);
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
    }//GEN-LAST:event_btnCreateDeliveryManActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
    try{
        if(validateNullOrEmpty()){
            if(validateFields()){
            int selectedRowIndex=jRegisterTable.getSelectedRow();
            int uniqueId=system.getDeliveryManDirectory().getDeliveryMens().get(selectedRowIndex).getUniqueId();
            DeliveryMan deliveryMan=new DeliveryMan(txtName.getText(),Long.parseLong(txtMobileNumber.getText()),txtAddress.getText(),txtUsername.getText(),txtPassword.getText(),uniqueId);
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
            system.getDeliveryManDirectory().getDeliveryMens().set(selectedRowIndex, deliveryMan);
            populateTable();
             int index=0;
            for(UserAccount userAccount:system.getUserAccountDirectory().getUserAccountList())
            {
                    if(uniqueId == userAccount.getUniqueId())
                    {
                        system.getUserAccountDirectory().getUserAccountList().set(index, deliveryMan);
                    }
                    else{
                        index++;
                    }
            }
            dB4OUtil.storeSystem(system);
            JOptionPane.showMessageDialog(null, "User Updated Succesfully");
            reset();
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
        DeliveryMan deliveryMan=(DeliveryMan) jRegisterTable.getValueAt(selectedRowIndex, 0);
        system.getDeliveryManDirectory().getDeliveryMens().remove(deliveryMan);
        populateTable();
        dB4OUtil.storeSystem(system);
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
            txtMobileNumber.setText(jRegisterTable.getModel().getValueAt(rowNumber, 2).toString());
            txtAddress.setText(jRegisterTable.getModel().getValueAt(rowNumber, 3).toString());
            txtUsername.setText(jRegisterTable.getModel().getValueAt(rowNumber, 4).toString());
            txtPassword.setText(jRegisterTable.getModel().getValueAt(rowNumber, 5).toString());
            
       }
      catch(Exception e)
      {
          throw  e;
      }
    }//GEN-LAST:event_jRegisterTableMouseClicked
    private void populateTable() {
       DeliveryManDirectory deliveryManDirectory = system.getDeliveryManDirectory();
        DefaultTableModel model = (DefaultTableModel) jRegisterTable.getModel();
        model.setRowCount(0);
        jRegisterTable.getColumnModel().getColumn(0).setMinWidth(0);
        jRegisterTable.getColumnModel().getColumn(0).setMaxWidth(0);
        for (DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryMens()) {
                    Object[] row = new Object[6];
                    row[0] = deliveryMan;
                    row[1] = deliveryMan.getName();
                    row[2] = deliveryMan.getMobileNumber();
                    row[3] = deliveryMan.getAddress();
                    row[4] = deliveryMan.getUsername();
                    row[5] = deliveryMan.getPassword();
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
 private  boolean validateNullOrEmpty()
    {
        validateNullOrEmpty=true;
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
        if(txtAddress.getText().trim().isEmpty() || txtAddress.getText()==null)
        {
            txtAddress.setToolTipText("Please Enter a Location");
            validateNullOrEmpty=false;
            txtAddress.setBorder(BorderFactory.createLineBorder (Color.red));
        }
        if(!txtAddress.getText().trim().isEmpty() && txtAddress.getText()!=null)
        {
            txtAddress.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        if(txtMobileNumber.getText().trim().isEmpty() || txtMobileNumber.getText()==null)
        {
            txtMobileNumber.setToolTipText("Please Enter a Contact");
            validateNullOrEmpty=false;
            txtMobileNumber.setBorder(BorderFactory.createLineBorder (Color.red));
        }
        if(!txtMobileNumber.getText().trim().isEmpty() && txtMobileNumber.getText()!=null)
        {
            txtMobileNumber.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
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
        validateRegex=true;
        if(!txtMobileNumber.getText().matches("\\b\\d+\\b"))
        {
            validateRegex=false;
            txtMobileNumber.setToolTipText("Please Enter Only Numbers");
            txtName.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            txtMobileNumber.setBorder(BorderFactory.createLineBorder (Color.red));
        }
        if(txtMobileNumber.getText().matches("\\b\\d+\\b"))
        {
            txtMobileNumber.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        return validateRegex;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDeliveryMan;
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
