/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.Cart;
import Business.WorkQueue.PlaceOrderWorkRequest;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sonal
 */
public class ManageOrdeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdeJPanel
     */
    private final EcoSystem system;
    public ManageOrdeJPanel(EcoSystem system) {
        initComponents();
        this.system=system;
        JManageIncomingOrder.getColumnModel().getColumn(0).setMinWidth(0);
        JManageIncomingOrder.getColumnModel().getColumn(0).setMaxWidth(0);
        populateManageIncomingOrderTable();
        orderDetailsJPanel.setVisible(false);
        cmbDeliveryPerson.setVisible(false);
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
        JManageIncomingOrder = new javax.swing.JTable();
        orderDetailsJPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JDetailOrder = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        JDetailOrder1 = new javax.swing.JTable();
        cmbStatus = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbDeliveryPerson = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(240, 178, 62));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE ORDERS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        JManageIncomingOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JManageIncomingOrder.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JManageIncomingOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Id", "CUSTOMER NAME", "STATUS", "ORDER DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JManageIncomingOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JManageIncomingOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JManageIncomingOrder);
        if (JManageIncomingOrder.getColumnModel().getColumnCount() > 0) {
            JManageIncomingOrder.getColumnModel().getColumn(0).setResizable(false);
        }

        orderDetailsJPanel.setBackground(new java.awt.Color(0, 102, 102));

        JDetailOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ITEM NAME", "PRICE", "QUANTITY"
            }
        ));
        jScrollPane2.setViewportView(JDetailOrder);

        JDetailOrder1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ITEM NAME", "PRICE", "QUANTITY"
            }
        ));
        jScrollPane3.setViewportView(JDetailOrder1);

        cmbStatus.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cmbStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbStatusItemStateChanged(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(240, 178, 62));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ORDER DETAILS");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout orderDetailsJPanelLayout = new javax.swing.GroupLayout(orderDetailsJPanel);
        orderDetailsJPanel.setLayout(orderDetailsJPanelLayout);
        orderDetailsJPanelLayout.setHorizontalGroup(
            orderDetailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(orderDetailsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderDetailsJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbDeliveryPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        orderDetailsJPanelLayout.setVerticalGroup(
            orderDetailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderDetailsJPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(orderDetailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderDetailsJPanelLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(orderDetailsJPanelLayout.createSequentialGroup()
                        .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbDeliveryPerson, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
            .addComponent(orderDetailsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(orderDetailsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JManageIncomingOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JManageIncomingOrderMouseClicked
        try{
            populateStatusComboBox();
            orderDetailsJPanel.setVisible(true);
            DefaultTableModel model = (DefaultTableModel) JDetailOrder.getModel();
            model.setRowCount(0);
            int rowNumber=JManageIncomingOrder.getSelectedRow();
            if(rowNumber<0)
            {
                JOptionPane.showMessageDialog(null, "Please select a row ");
                return;
            }
                
           String orderId= (String) JManageIncomingOrder.getModel().getValueAt(rowNumber, 0);
           String status=(String) JManageIncomingOrder.getModel().getValueAt(rowNumber, 2);
            if(status.equals("Ordered") ||  status.equals("ACCEPT"))
            {
                for(PlaceOrderWorkRequest workRequest:system.getWorkQueue().getWorkRequestList())
                {
                    if(workRequest.getId().equals(orderId))
                    {
                        for(Cart cart:workRequest.getItemsWithQuatityList())
                        {
                            Object[] row = new Object[3];
                            row[0]=cart.getItemName();
                            row[1] = cart.getPrice();
                            row[2]= cart.getQuantity();
                            model.addRow(row);
                        }
                        
                    }
                }
            }
            else if(status.equals("ASSIGNED")){
                JOptionPane.showMessageDialog(null, "Ordered Picked Up By Delivery Person");
                orderDetailsJPanel.setVisible(false);
            }
        }
        catch(Exception e)
        {
            throw  e;
        }
    }//GEN-LAST:event_JManageIncomingOrderMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            int rowNumber=JManageIncomingOrder.getSelectedRow();
            String orderId= (String) JManageIncomingOrder.getModel().getValueAt(rowNumber, 0);
            String status=(String) cmbStatus.getSelectedItem();
            
            for(PlaceOrderWorkRequest workRequest:system.getWorkQueue().getWorkRequestList())
            {
                if(workRequest.getId().equals(orderId))
                {
                    workRequest.setStatus(status);
                    populateManageIncomingOrderTable();
                    orderDetailsJPanel.setVisible(false);
                    if(status.equals("ASSIGNED"))
                    {
                        int deliveryPersonNumber=Integer.parseInt(cmbDeliveryPerson.getSelectedItem().toString().split(",")[1].trim());
                        for(DeliveryMan deliveryMan:system.getDeliveryManDirectory().getDeliveryMens())
                        {
                            if(deliveryMan.getUniqueId()==deliveryPersonNumber)
                            {
                                deliveryMan.setIsDeliveryPersonAvailable(false);
                                workRequest.setDeliverMan(deliveryMan);
                            }
                        }
                    }
                    if(status.equals("DECLINE"))
                    {
                        workRequest.setResolveDate(new Date());
                    }
                }
            }
        }
        catch(Exception ex)
        {
            throw  ex;
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbStatusItemStateChanged
        try{
        if(cmbStatus.getSelectedItem().equals("ASSIGNED"))
        {
            cmbDeliveryPerson.setVisible(true);
            populateDeliveryPersonComboBox();
        }
        else{
            
            cmbDeliveryPerson.setVisible(false);
        }
        }
        catch(Exception e)
        {
            throw e;
        }
    }//GEN-LAST:event_cmbStatusItemStateChanged
    private void populateDeliveryPersonComboBox()
    {
        try {
         DefaultComboBoxModel model = (DefaultComboBoxModel) cmbDeliveryPerson.getModel();
         model.removeAllElements();
        for(DeliveryMan deliveryMan:system.getDeliveryManDirectory().getDeliveryMens())
        {
            if(deliveryMan.isIsDeliveryPersonAvailable())
            {
                model.addElement(deliveryMan.getName()+","+deliveryMan.getUniqueId());
            }
        }
        } catch (Exception e) {
        }
    }
     private void populateStatusComboBox()
    {
        try {
         DefaultComboBoxModel model = (DefaultComboBoxModel) cmbStatus.getModel();
         model.removeAllElements();
         int rowNumber=JManageIncomingOrder.getSelectedRow();
         String status=(String) JManageIncomingOrder.getModel().getValueAt(rowNumber, 2);
         if(status.equals("Ordered"))
         {
             model.addElement("ACCEPT");
             model.addElement("DECLINE");
         }
         else if(status.equals("ACCEPT"))
         {
             model.addElement("ASSIGNED");
         }
        } catch (Exception e) {
        }
    }
    private void populateManageIncomingOrderTable()
    {
        try{
        DefaultTableModel model = (DefaultTableModel) JManageIncomingOrder.getModel();
        model.setRowCount(0);
        int uniqueId=system.getLogInUser().getLogInId();
        for(Restaurant restaurant : system.getRestaurantDirectory().getRestaurants())
        {
            if(restaurant.getUniqueId()== uniqueId)
            {
                for(PlaceOrderWorkRequest workRequest:system.getWorkQueue().getWorkRequestList())
                {
                    if(workRequest.getRestaurant().getUniqueId() == uniqueId)
                    {
                        if(!workRequest.getStatus().equals("Delivered")&& !workRequest.getStatus().equals("DECLINE") &&!workRequest.getStatus().equals("ASSIGNED") )
                        {
                            Object[] row = new Object[4];
                            row[0]=workRequest.getId();
                            row[1] = workRequest.getCustomer().getName();
                            row[2] = workRequest.getStatus();
                            row[3] = workRequest.getRequestDate();
                            model.addRow(row);
                        }
                       
                    }
                }
            }
        }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JDetailOrder;
    private javax.swing.JTable JDetailOrder1;
    private javax.swing.JTable JManageIncomingOrder;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbDeliveryPerson;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel orderDetailsJPanel;
    // End of variables declaration//GEN-END:variables
}
