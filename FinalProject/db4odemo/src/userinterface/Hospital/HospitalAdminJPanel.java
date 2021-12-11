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
public class HospitalAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public HospitalAdminJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
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

        jPanel1 = new javax.swing.JPanel();
        jSplitPane = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btnReceptionist = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnChildReport = new javax.swing.JButton();
        btnVisitDoctor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(240, 178, 62));

        btnReceptionist.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnReceptionist.setText("RECEPTIONIST");
        btnReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceptionistActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LogoutIcon.png"))); // NOI18N

        btnChildReport.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnChildReport.setText("CHILD'S REPORT");
        btnChildReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChildReportActionPerformed(evt);
            }
        });

        btnVisitDoctor.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnVisitDoctor.setText("VISIT THE DOCTOR");
        btnVisitDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnChildReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVisitDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
            .addComponent(btnReceptionist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(101, 101, 101)
                .addComponent(btnReceptionist)
                .addGap(58, 58, 58)
                .addComponent(btnVisitDoctor)
                .addGap(43, 43, 43)
                .addComponent(btnChildReport)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel2);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/RestaurantPlaceOrder.jpg"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(jPanel3);

        jPanel1.add(jSplitPane, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 907, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceptionistActionPerformed
        ReceptionistJPanel receptionJPanel =new ReceptionistJPanel(ecosystem);
        jSplitPane.setRightComponent(receptionJPanel);
    }//GEN-LAST:event_btnReceptionistActionPerformed

    private void btnChildReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChildReportActionPerformed
        // TODO add ybtnDoctorAssignedour handling code here:
       ChildReportJpanel childReportJPanel=new ChildReportJpanel(ecosystem);
       jSplitPane.setRightComponent(childReportJPanel);
    }//GEN-LAST:event_btnChildReportActionPerformed

    private void btnVisitDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitDoctorActionPerformed
        // TODO add your handling code here:
        VisitDoctorJPanel visitDoctorJPanel=new VisitDoctorJPanel(ecosystem);
        jSplitPane.setRightComponent(visitDoctorJPanel);
    }//GEN-LAST:event_btnVisitDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChildReport;
    private javax.swing.JButton btnReceptionist;
    private javax.swing.JButton btnVisitDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
