/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.WorkQueue.EntryChildWorkRequest;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sonal
 */
public class ManagePeopleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePeopleJPanel
     */
    private final EcoSystem system; 
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ManagePeopleJPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        populateNetwork();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jRegisterTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnCreateCustomer = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtIncome = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbNGO = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox<>();
        radiobtnMale = new javax.swing.JRadioButton();
        radioButtonFemale = new javax.swing.JRadioButton();
        cmbEducation = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(920, 708));

        jRegisterTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRegisterTable.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jRegisterTable.setForeground(new java.awt.Color(56, 90, 174));
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Default", "Name", "Age", "Gender", "Highest Education", "Family Income", "Address", "Contact"
            }
        ));
        jRegisterTable.setGridColor(new java.awt.Color(56, 90, 174));
        jRegisterTable.setSelectionBackground(new java.awt.Color(240, 178, 62));
        jRegisterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegisterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jRegisterTable);

        jLabel1.setBackground(new java.awt.Color(240, 178, 62));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage New Person");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name :");

        btnCreateCustomer.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnCreateCustomer.setText("REGISTER PERSON");
        btnCreateCustomer.setToolTipText("");
        btnCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCustomerActionPerformed(evt);
            }
        });

        btnModify.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnModify.setText("UPDATE PERSON");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Age:");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gender:");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Highest Education:");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Family Income:");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Address:");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Contact:");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("NETWORK :");

        cmbNGO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("NGO :");

        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiobtnMale);
        radiobtnMale.setText("Male");

        buttonGroup1.add(radioButtonFemale);
        radioButtonFemale.setText("Female");

        cmbEducation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High School", "Senior Secondary School", "Bachelors", "Masters", " " }));

        btnDelete.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnDelete.setText("DELETE PERSON");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbNGO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContact)
                    .addComponent(txtAddress)
                    .addComponent(txtIncome)
                    .addComponent(radiobtnMale)
                    .addComponent(txtAge)
                    .addComponent(txtName)
                    .addComponent(cmbEducation, 0, 259, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreateCustomer)
                            .addComponent(btnModify))))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(radioButtonFemale)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbNetwork, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobtnMale)
                    .addComponent(radioButtonFemale)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEducation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnModify)))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnCreateCustomer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(cmbNGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRegisterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterTableMouseClicked
        try{            
            int rowNumber=jRegisterTable.getSelectedRow();
            if(rowNumber<0)
            {
                JOptionPane.showMessageDialog(null, "Please select a row");
                return;
            }
            EntryChildWorkRequest request=(EntryChildWorkRequest) jRegisterTable.getModel().getValueAt(rowNumber, 0);
            if(request.isIsAccepted())
            {
                JOptionPane.showMessageDialog(this, "NGO has accepeted the request ,so NGO modifications cannot be done");
                cmbNGO.setVisible(false);
                cmbNetwork.setVisible(false);
                jLabel12.setVisible(false);
                jLabel11.setVisible(false);
            }
            txtName.setText(jRegisterTable.getModel().getValueAt(rowNumber, 1).toString());
            txtAge.setText(jRegisterTable.getModel().getValueAt(rowNumber, 2).toString());
            if(jRegisterTable.getModel().getValueAt(rowNumber, 3).toString().equals("Female"))
            {
                radioButtonFemale.setSelected(true);
            }
            if(jRegisterTable.getModel().getValueAt(rowNumber, 3).toString().equals("Male"))
            {
                radiobtnMale.setSelected(true);
            }
            cmbEducation.setSelectedItem(jRegisterTable.getModel().getValueAt(rowNumber, 4).toString());
            txtIncome.setText(jRegisterTable.getModel().getValueAt(rowNumber, 5).toString());
            txtAddress.setText(jRegisterTable.getModel().getValueAt(rowNumber, 6).toString());
            txtContact.setText(jRegisterTable.getModel().getValueAt(rowNumber, 7).toString());
        }
        catch(Exception e)
        {
            throw  e;
        }
    }//GEN-LAST:event_jRegisterTableMouseClicked

    private void btnCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCustomerActionPerformed
            try {
                EntryChildWorkRequest entryChildWorkRequest = new EntryChildWorkRequest();
                entryChildWorkRequest.getPerson().setName(txtName.getText());
                entryChildWorkRequest.getPerson().setAge(Double.parseDouble(txtAge.getText()));
                if(radiobtnMale.isSelected())
                {
                    entryChildWorkRequest.getPerson().setGender("Male");
                }
                else{
                    entryChildWorkRequest.getPerson().setGender("Female");
                }
                entryChildWorkRequest.getPerson().setIncome(Long.parseLong(txtIncome.getText()));
                entryChildWorkRequest.getPerson().setAddress(txtAddress.getText());
                entryChildWorkRequest.getPerson().setContact(Long.parseLong(txtContact.getText()));
                entryChildWorkRequest.getPerson().setName(txtName.getText());
                entryChildWorkRequest.getPerson().setEducation(cmbEducation.getSelectedItem().toString());
                entryChildWorkRequest.setNgoName(cmbNGO.getSelectedItem().toString());
                system.getWorkQueue().getWorkRequestListNew().add(entryChildWorkRequest);
                dB4OUtil.storeSystem(system);
                JOptionPane.showMessageDialog(null, "Person Information Added Succesfully");
                populateTable();
                reset();
                
            } catch (Exception e) {
    
                throw e;
            }
    }//GEN-LAST:event_btnCreateCustomerActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        try{
            cmbNGO.setVisible(true);
            cmbNetwork.setVisible(true);
            jLabel12.setVisible(true);
            jLabel11.setVisible(true);
            int index=0;
            int selectedRowIndex=jRegisterTable.getSelectedRow();
            if(selectedRowIndex<0)
            {
                JOptionPane.showMessageDialog(this, "Select a row before updating");
                return;
            }
            
            EntryChildWorkRequest entryChildWorkRequest = new EntryChildWorkRequest();
            entryChildWorkRequest.getPerson().setName(txtName.getText());
            entryChildWorkRequest.getPerson().setAge(Double.parseDouble(txtAge.getText()));
            if(radiobtnMale.isSelected())
            {
                entryChildWorkRequest.getPerson().setGender("Male");
            }
            else{
                entryChildWorkRequest.getPerson().setGender("Female");
            }
            entryChildWorkRequest.getPerson().setIncome(Long.parseLong(txtIncome.getText()));
            entryChildWorkRequest.getPerson().setAddress(txtAddress.getText());
            entryChildWorkRequest.getPerson().setContact(Long.parseLong(txtContact.getText()));
            entryChildWorkRequest.getPerson().setName(txtName.getText());
            entryChildWorkRequest.getPerson().setEducation(cmbEducation.getSelectedItem().toString());
            entryChildWorkRequest.setNgoName(cmbNGO.getSelectedItem().toString());
            system.getWorkQueue().getWorkRequestListNew().set(selectedRowIndex,entryChildWorkRequest);
            populateTable();
            reset();
            dB4OUtil.storeSystem(system);
            JOptionPane.showMessageDialog(null, "Person Information Updated Succesfully");
        }
        catch(Exception e)
        {
            throw e;
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            cmbNGO.setVisible(true);
            cmbNetwork.setVisible(true);
            jLabel12.setVisible(true);
            jLabel11.setVisible(true);

            int selectedRowIndex=jRegisterTable.getSelectedRow();
            if(selectedRowIndex<0)
            {
                JOptionPane.showMessageDialog(null, "Please select a row");
                return;
            }
            else{
                EntryChildWorkRequest entryChildWorkRequest= (EntryChildWorkRequest) jRegisterTable.getValueAt(selectedRowIndex, 0);
                if(entryChildWorkRequest.isIsAccepted()){
                    JOptionPane.showMessageDialog(null, "Work Request Cannot be cancelled .Please talk to the NGO for the same");
                    return;
                }
                system.getWorkQueue().getWorkRequestListNew().remove(entryChildWorkRequest);
                populateTable();
                dB4OUtil.storeSystem(system);
                JOptionPane.showMessageDialog(null, "Person Information Deleted Succesfully");
                reset();
            }
        }
        catch(Exception e)
        {
            throw e;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed

        cmbNGO.removeAllItems();
        Network network1=null;
        for (Network network : system.getNetworks()) {
            if(network.getNetworkName().equals((cmbNetwork.getSelectedItem())))
            {
              network1=network;
            }
        }
        if(network1!=null)
        {
        for(Enterprise enterprise:network1.getEnterpriseDirectory().getEnterprises())
        {
            if(enterprise.getEnterpriseType().equals("NGO"))
            {
                cmbNGO.addItem(enterprise.getName());
            }
        }
        }

    }//GEN-LAST:event_cmbNetworkActionPerformed
    public void populateNetwork()
    {
            cmbNetwork.removeAllItems();
            for(Network network : system.getNetworks())
            {
                cmbNetwork.addItem(network.getNetworkName());
            }
    }
    public void reset()
    {
        txtName.setText("");
        txtAge.setText("");
        radioButtonFemale.setSelected(false);
        radiobtnMale.setSelected(true);
        cmbEducation.setSelectedIndex(0);
        txtIncome.setText("");
        txtAddress.setText("");
        txtContact.setText("");
        cmbNGO.setSelectedIndex(0);
        cmbNetwork.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCustomer;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbEducation;
    private javax.swing.JComboBox<String> cmbNGO;
    private javax.swing.JComboBox<String> cmbNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable jRegisterTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioButtonFemale;
    private javax.swing.JRadioButton radiobtnMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jRegisterTable.getModel();
        model.setRowCount(0);
        jRegisterTable.getColumnModel().getColumn(0).setMinWidth(0);
        jRegisterTable.getColumnModel().getColumn(0).setMaxWidth(0);
        for(EntryChildWorkRequest workQueue : system.getWorkQueue().getWorkRequestListNew())
        {
                    Object[] row = new Object[9];
                    row[0]=workQueue;
                    row[1] = workQueue.getPerson().getName();
                    row[2] = workQueue.getPerson().getAge();
                    row[3] = workQueue.getPerson().getGender();
                    row[4] = workQueue.getPerson().getEducation();
                    row[5] = workQueue.getPerson().getIncome();
                    row[6] = workQueue.getPerson().getAddress();
                    row[7] = workQueue.getPerson().getContact();
                    model.addRow(row);
                
        }
        
  }
    
}
