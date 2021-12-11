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
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sonal
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {
    private final EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ManageEnterpriseJPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        populateComboBox();
        populateTable();
        networkJComboBox.setEnabled(true);
        enterpriseTypeJComboBox.setEnabled(true);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        networkJComboBox = new javax.swing.JComboBox();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jRegisterTable.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jRegisterTable.setForeground(new java.awt.Color(56, 90, 174));
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Default", "Network Name", "Enterprise Type", "Enterprise Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jLabel1.setBackground(new java.awt.Color(240, 178, 62));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Enterprise");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Network Name :");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Enterprise Type :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Enterprise Name:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnCreate.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCreate.setText("Create Enterprise");
        btnCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnModify.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnModify.setText("Update Enterprise");
        btnModify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModify)
                            .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnModify))
                .addGap(22, 22, 22))
        );

        btnDelete.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnDelete.setText("Delete Enterprise");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
    try{
        networkJComboBox.setEnabled(true);
        enterpriseTypeJComboBox.setEnabled(true);
        int index=0;
        String enterpriseType="";
        Network network1=null;
        for (Network network : system.getNetworks()) {
            if(network.getNetworkName().equals((networkJComboBox.getSelectedItem())))
            {
              network1=network;
            }
            else{
                index++;
            }
        }
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();
        if(type.getValue().equals("NGO"))
        {
            enterpriseType="NGO";
        }
        if(type.getValue().equals("Restaurant"))
        {
            enterpriseType="Restaurant";
        }
        if(type.getValue().equals("Hospital"))
        {
            enterpriseType="Hospital";
        }
        if(type.getValue().equals("College"))
        {
            enterpriseType="College";
        }
        if(type.getValue().equals("CollegeCounsellor"))
        {
            enterpriseType="CollegeCounsellor";
        }
        String enterpriseName=txtName.getText();
        Enterprise createEnterprise = network1.getEnterpriseDirectory().createEnterprise(enterpriseName, enterpriseType);
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Enterprise Added Succesfully");
        reset();
        populateTable();
    } 
    catch(Exception e)
    {
        throw e;
    }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
      try{
            int rowNumber=jRegisterTable.getSelectedRow();
            if(rowNumber<0)
            {
                JOptionPane.showMessageDialog(null, "Please select a row");
                return;
            }
            String oldNetwork =(jRegisterTable.getModel().getValueAt(rowNumber, 1).toString());
            String enterpriseName=txtName.getText();
            Enterprise enterprise=(Enterprise) (jRegisterTable.getModel().getValueAt(rowNumber, 0));
            enterprise.setName(enterpriseName);
            if(enterpriseTypeJComboBox.getSelectedItem().equals(Enterprise.EnterpriseType.NGO))
            {
                enterprise.setEnterpriseType(Enterprise.EnterpriseType.NGO.getValue());
            }
            else if(enterpriseTypeJComboBox.getSelectedItem().equals(Enterprise.EnterpriseType.College))
            {
                 enterprise.setEnterpriseType(Enterprise.EnterpriseType.College.getValue());
            }
            else if(enterpriseTypeJComboBox.getSelectedItem().equals(Enterprise.EnterpriseType.CollegeCounsellor))
            {
                 enterprise.setEnterpriseType(Enterprise.EnterpriseType.CollegeCounsellor.getValue());
            }
            else if(enterpriseTypeJComboBox.getSelectedItem().equals(Enterprise.EnterpriseType.Restaurant))
            {
                 enterprise.setEnterpriseType(Enterprise.EnterpriseType.Restaurant.getValue());
            }
             else if(enterpriseTypeJComboBox.getSelectedItem().equals(Enterprise.EnterpriseType.Hospital))
            {
                 enterprise.setEnterpriseType(Enterprise.EnterpriseType.Hospital.getValue());
            }
            int index=0;
            for(Network network:system.getNetworks())
            {
                if(network.getNetworkName().equals(oldNetwork))
                {
                    for(Enterprise enterprise1:network.getEnterpriseDirectory().getEnterprises())
                    {
                        if(enterprise1.equals(enterprise))
                        {
                           network.getEnterpriseDirectory().getEnterprises().set(index, enterprise);
                        }
                        else{
                            index++;
                        }
                    }
                }
            }
            populateTable();
            reset();
            dB4OUtil.storeSystem(system);
            JOptionPane.showMessageDialog(null, "Enterprise Updated Succesfully");
            
       }
      catch(Exception e)
      {
          throw  e;
      }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
try{
            networkJComboBox.setEnabled(true);
            enterpriseTypeJComboBox.setEnabled(true);
        int selectedRowIndex=jRegisterTable.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            Enterprise enterprise=(Enterprise) jRegisterTable.getValueAt(selectedRowIndex, 0);
            String networkName=(String) jRegisterTable.getValueAt(selectedRowIndex, 1);
            for(Network network : system.getNetworks())
            {
                if(network.getNetworkName().equals(networkName))
                {
                    Iterator enterprise1= network.getEnterpriseDirectory().getEnterprises().iterator();
                    
                    while (enterprise1.hasNext()) {
                        Enterprise e= (Enterprise) enterprise1.next();
                        if(e.equals(enterprise))
                        {
                            enterprise1.remove();
                            
                        }
                    }
                }
            }
            populateTable();
            dB4OUtil.storeSystem(system);
            JOptionPane.showMessageDialog(null, "Enterprise Deleted Succesfully");
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
            networkJComboBox.setEnabled(false);
            enterpriseTypeJComboBox.setEnabled(false);
           int rowNumber=jRegisterTable.getSelectedRow();
            txtName.setText(jRegisterTable.getModel().getValueAt(rowNumber, 3).toString());
            String type=jRegisterTable.getModel().getValueAt(rowNumber, 2).toString();
            for(Network networks:system.getNetworks())
            {
                if(networks.getNetworkName().equals(jRegisterTable.getModel().getValueAt(rowNumber, 1).toString()))
                {
                    networkJComboBox.setSelectedItem(networks.getNetworkName());
                }
            }
            if(type.equals(Enterprise.EnterpriseType.NGO.getValue()))
            {
                enterpriseTypeJComboBox.setSelectedItem(Enterprise.EnterpriseType.NGO);
            }
            if(type.equals(Enterprise.EnterpriseType.Restaurant.getValue()))
            {
                enterpriseTypeJComboBox.setSelectedItem(Enterprise.EnterpriseType.Restaurant);
            }
            if(type.equals(Enterprise.EnterpriseType.College.getValue()))
            {
                enterpriseTypeJComboBox.setSelectedItem(Enterprise.EnterpriseType.College);
            }
            if(type.equals(Enterprise.EnterpriseType.CollegeCounsellor.getValue()))
            {
                enterpriseTypeJComboBox.setSelectedItem(Enterprise.EnterpriseType.CollegeCounsellor);
            }
            if(type.equals(Enterprise.EnterpriseType.Hospital.getValue()))
            {
                enterpriseTypeJComboBox.setSelectedItem(Enterprise.EnterpriseType.Hospital);
            }
       }
      catch(Exception e)
      {
          throw  e;
      }
    }//GEN-LAST:event_jRegisterTableMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        networkJComboBox.setEnabled(true);
        enterpriseTypeJComboBox.setEnabled(true);
        txtName.setText("");
        
        
    }//GEN-LAST:event_btnRefreshActionPerformed
    private void populateComboBox()
    {
        networkJComboBox.removeAllItems();
         enterpriseTypeJComboBox.removeAllItems();
        for(Network networks:system.getNetworks())
        {
            networkJComboBox.addItem(networks.getNetworkName());
        }
        for(Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values())
        {
            enterpriseTypeJComboBox.addItem(type);
        }
    }
     private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) jRegisterTable.getModel();
        model.setRowCount(0);
        jRegisterTable.getColumnModel().getColumn(0).setMinWidth(0);
        jRegisterTable.getColumnModel().getColumn(0).setMaxWidth(0);
        if(system.getNetworks()==null)
        {
            return;
        }
        for(Network network : system.getNetworks())
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises())
            {
                Object[] row = new Object[5];
                    row[0]=enterprise;
                    row[1] = network.getNetworkName();
                    row[2] = enterprise.getEnterpriseType();
                    row[3] = enterprise.getName();
                    
                    model.addRow(row);
            }
        }
        
    }    

    private  void reset()
    {
        txtName.setText("");
            networkJComboBox.setSelectedIndex(0);
            enterpriseTypeJComboBox.setSelectedIndex(0);
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jRegisterTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
