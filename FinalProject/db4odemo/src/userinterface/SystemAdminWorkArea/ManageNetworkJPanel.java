/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Network.Network;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sonal
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomersJPanel
     */
    private final EcoSystem system; 
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ManageNetworkJPanel(EcoSystem system) {
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
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnCreateCustomer = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(920, 708));

        jRegisterTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRegisterTable.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jRegisterTable.setForeground(new java.awt.Color(56, 90, 174));
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Default", "Network Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Networks");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name :");

        btnCreateCustomer.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnCreateCustomer.setText("Create Network");
        btnCreateCustomer.setToolTipText("");
        btnCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCustomerActionPerformed(evt);
            }
        });

        btnModify.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnModify.setText("Update Network");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnDelete.setText("Delete Network");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(743, 743, 743)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(btnCreateCustomer)
                .addGap(32, 32, 32)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnDelete)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCustomer)
                    .addComponent(btnModify))
                .addGap(301, 301, 301))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCustomerActionPerformed
    try {
        String networkName = txtName.getText();
        if(networkName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter network name");
            return;
        }
        for (Network network : system.getNetworks()) {
            if(network.getNetworkName().equals(networkName))
            {
                JOptionPane.showMessageDialog(null, "Network with this name already exists");
                return;
            }
        }
     
        Network network = new  Network();
        network.setNetworkName(networkName);
        system.getNetworks().add(network);
        dB4OUtil.storeSystem(system);
        populateTable();
        reset();
        JOptionPane.showMessageDialog(null, "Netwrok added successfully");
    } catch (Exception e) {
       
        throw e;
    }
    }//GEN-LAST:event_btnCreateCustomerActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
    try{
        int index=0;
        int selectedRowIndex=jRegisterTable.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row before updating");
                    return;
        }
        for (Network network : system.getNetworks()) {
            if(network.getNetworkName().equals(txtName.getText()) && selectedRowIndex != index)
            {
                JOptionPane.showMessageDialog(null, "Network with this name already exists");
                return;
            }
            else{
                index++;
            }
        }
        Network network = new  Network();
        network.setNetworkName(txtName.getText());
        system.getNetworks().set(selectedRowIndex,network);
        populateTable();
        reset();
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Network Updated Succesfully");
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
            return;
        }
        else{
            Network network=(Network) jRegisterTable.getValueAt(selectedRowIndex, 0);
            system.getNetworks().remove(network);
            populateTable();
            dB4OUtil.storeSystem(system);
            JOptionPane.showMessageDialog(null, "Network Deleted Succesfully");
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
       }
      catch(Exception e)
      {
          throw  e;
      }
    }//GEN-LAST:event_jRegisterTableMouseClicked
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jRegisterTable.getModel();
        model.setRowCount(0);
        jRegisterTable.getColumnModel().getColumn(0).setMinWidth(0);
        jRegisterTable.getColumnModel().getColumn(0).setMaxWidth(0);
        if(system.getNetworks()==null)
        {
            return;
        }
        for (Network network : system.getNetworks()) {
                    Object[] row = new Object[3];
                    row[0]=network;
                    row[1] = network.getNetworkName();
                    model.addRow(row);
            }
        
    }
    private void reset() {
            txtName.setText("");
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCustomer;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTable jRegisterTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}