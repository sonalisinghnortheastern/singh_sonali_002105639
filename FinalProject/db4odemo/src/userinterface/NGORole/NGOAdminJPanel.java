/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGORole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import javax.swing.JPanel;
/**
 *
 * @author Vijay
 */
public class NGOAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOAdminJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public NGOAdminJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
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
        jPanel1 = new javax.swing.JPanel();
        btnManageMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnManageMenu1 = new javax.swing.JButton();
        btnManageMenu2 = new javax.swing.JButton();
        btnManageMenu3 = new javax.swing.JButton();
        btnManageMenu4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(240, 178, 62));

        btnManageMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnManageMenu.setText("NEW STUDENT INTAKE REQUESTS");
        btnManageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenuActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LogoutIcon.png"))); // NOI18N

        btnManageMenu1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnManageMenu1.setText("VIEW ALL STUDENTS");
        btnManageMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenu1ActionPerformed(evt);
            }
        });

        btnManageMenu2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnManageMenu2.setText("REQUEST COUNSELLING SERVICE");
        btnManageMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenu2ActionPerformed(evt);
            }
        });

        btnManageMenu3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnManageMenu3.setText("VISUALIZE");
        btnManageMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenu3ActionPerformed(evt);
            }
        });

        btnManageMenu4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnManageMenu4.setText("REQUEST MEDICAL CHECKUP");
        btnManageMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenu4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnManageMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnManageMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnManageMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnManageMenu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnManageMenu4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(btnManageMenu)
                .addGap(57, 57, 57)
                .addComponent(btnManageMenu4)
                .addGap(49, 49, 49)
                .addComponent(btnManageMenu2)
                .addGap(59, 59, 59)
                .addComponent(btnManageMenu3)
                .addGap(18, 18, 18)
                .addComponent(btnManageMenu1)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/RestaurantPlaceOrder.jpg"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenuActionPerformed
        AdmitPersonToNGOJPanel admitPersonToNGO =new AdmitPersonToNGOJPanel(ecosystem);
        jSplitPane.setRightComponent(admitPersonToNGO);
    }//GEN-LAST:event_btnManageMenuActionPerformed

    private void btnManageMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenu1ActionPerformed
        AllStudentNGOJPanel allStudentNGOJPanel =new AllStudentNGOJPanel(ecosystem);
        jSplitPane.setRightComponent(allStudentNGOJPanel);
    }//GEN-LAST:event_btnManageMenu1ActionPerformed

    private void btnManageMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenu2ActionPerformed
       CounsellingAvailableStudentsNGOJPanel counsellingAvailableStudentsNGOJPanel =new CounsellingAvailableStudentsNGOJPanel(ecosystem);
        jSplitPane.setRightComponent(counsellingAvailableStudentsNGOJPanel);
    }//GEN-LAST:event_btnManageMenu2ActionPerformed

    private void btnManageMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenu3ActionPerformed
        VisualizeNGOJPanel visualizeNGOJPanel =new VisualizeNGOJPanel(ecosystem);
        jSplitPane.setRightComponent(visualizeNGOJPanel);
    }//GEN-LAST:event_btnManageMenu3ActionPerformed

    private void btnManageMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenu4ActionPerformed
        SendPersonForMedicalCheckup visualizeNGOJPanel =new SendPersonForMedicalCheckup(ecosystem);
        jSplitPane.setRightComponent(visualizeNGOJPanel);
    }//GEN-LAST:event_btnManageMenu4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageMenu;
    private javax.swing.JButton btnManageMenu1;
    private javax.swing.JButton btnManageMenu2;
    private javax.swing.JButton btnManageMenu3;
    private javax.swing.JButton btnManageMenu4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
