/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;

import Business.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author Vijay
 */
public class ReceptionistAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminJPanel1
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public ReceptionistAdminJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btnReceptionist = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGraphRepresentation = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        btnReceptionist.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnReceptionist.setText("SCHEDULE APPOINTMENT");
        btnReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceptionistActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout.png"))); // NOI18N

        btnGraphRepresentation.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGraphRepresentation.setText("GRAPH REPRESENTATION");
        btnGraphRepresentation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraphRepresentationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnGraphRepresentation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReceptionist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(101, 101, 101)
                .addComponent(btnReceptionist)
                .addGap(74, 74, 74)
                .addComponent(btnGraphRepresentation)
                .addContainerGap(916, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel2);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reception.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(jPanel3);

        add(jSplitPane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceptionistActionPerformed
        ReceptionistJPanel receptionJPanel =new ReceptionistJPanel(ecosystem);
        jSplitPane.setRightComponent(receptionJPanel);
    }//GEN-LAST:event_btnReceptionistActionPerformed

    private void btnGraphRepresentationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraphRepresentationActionPerformed
        VisualizeHospitalHistoryJPanel visualizeHospitalHistoryJPanel=new VisualizeHospitalHistoryJPanel(ecosystem);
        jSplitPane.setRightComponent(visualizeHospitalHistoryJPanel);
    }//GEN-LAST:event_btnGraphRepresentationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGraphRepresentation;
    private javax.swing.JButton btnReceptionist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
