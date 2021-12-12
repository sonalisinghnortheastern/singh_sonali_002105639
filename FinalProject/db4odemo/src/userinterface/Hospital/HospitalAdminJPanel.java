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

        jSplitPane = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnChildReport = new javax.swing.JButton();
        btnVisitDoctor = new javax.swing.JButton();

        setAutoscrolls(true);
        setLayout(new java.awt.CardLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/img4.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1981, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1509, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(jPanel3);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout.png"))); // NOI18N

        btnChildReport.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnChildReport.setText("APPOINTMENT HISTORY");
        btnChildReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChildReportActionPerformed(evt);
            }
        });

        btnVisitDoctor.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnVisitDoctor.setText("SCHEDULED APPOINTMENT");
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
            .addComponent(btnVisitDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(134, 134, 134)
                .addComponent(btnVisitDoctor)
                .addGap(97, 97, 97)
                .addComponent(btnChildReport)
                .addContainerGap(1169, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel2);

        add(jSplitPane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnChildReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChildReportActionPerformed

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
    private javax.swing.JButton btnVisitDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
