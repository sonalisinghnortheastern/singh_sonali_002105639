/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;

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
        jOrderPanel.setVisible(false);
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
        JMenu = new javax.swing.JTable();
        jOrderPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnUpdateRestaurantProfile = new javax.swing.JButton();
        btnUpdateRestaurantProfile1 = new javax.swing.JButton();
        chckBoxCompleted = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(240, 178, 62));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE ORDERS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        JMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JMenu.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ITEM NAME", "CUSTOMER NAME", "STATUS", "DELIVERY PERSON", "ORDER DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JMenu);

        jOrderPanel.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ITEM NAME :");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("QUANTITY :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("AMOUNT :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });

        btnUpdateRestaurantProfile.setBackground(new java.awt.Color(240, 178, 62));
        btnUpdateRestaurantProfile.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnUpdateRestaurantProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateRestaurantProfile.setText("DECLINE ORDER");
        btnUpdateRestaurantProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnUpdateRestaurantProfile1.setBackground(new java.awt.Color(240, 178, 62));
        btnUpdateRestaurantProfile1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnUpdateRestaurantProfile1.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateRestaurantProfile1.setText("ACCEPT ORDER");
        btnUpdateRestaurantProfile1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        chckBoxCompleted.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        chckBoxCompleted.setForeground(new java.awt.Color(0, 0, 102));
        chckBoxCompleted.setText("ORDER COMPLETED");

        javax.swing.GroupLayout jOrderPanelLayout = new javax.swing.GroupLayout(jOrderPanel);
        jOrderPanel.setLayout(jOrderPanelLayout);
        jOrderPanelLayout.setHorizontalGroup(
            jOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jOrderPanelLayout.createSequentialGroup()
                .addGroup(jOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jOrderPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUpdateRestaurantProfile1)
                        .addGap(74, 74, 74)))
                .addGroup(jOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jOrderPanelLayout.createSequentialGroup()
                        .addComponent(btnUpdateRestaurantProfile)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jOrderPanelLayout.createSequentialGroup()
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jOrderPanelLayout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(chckBoxCompleted)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jOrderPanelLayout.setVerticalGroup(
            jOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jOrderPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateRestaurantProfile)
                    .addComponent(btnUpdateRestaurantProfile1))
                .addGap(26, 26, 26)
                .addComponent(chckBoxCompleted)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuMouseClicked
        try{
            int rowNumber=JMenu.getSelectedRow();
            txtItemName.setText(JMenu.getModel().getValueAt(rowNumber, 0).toString());
            txtQuantity.setText(JMenu.getModel().getValueAt(rowNumber, 1).toString());
            txtPrice.setText(JMenu.getModel().getValueAt(rowNumber, 1).toString());
        }
        catch(Exception e)
        {
            throw  e;
        }
    }//GEN-LAST:event_JMenuMouseClicked

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JMenu;
    private javax.swing.JButton btnUpdateRestaurantProfile;
    private javax.swing.JButton btnUpdateRestaurantProfile1;
    private javax.swing.JCheckBox chckBoxCompleted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jOrderPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}