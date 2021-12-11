/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGO;

import Business.College.CollegeCounsellor;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AssignToCounsellorWorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vijay
 */
public class CounsellingAvailableStudentsNGOJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdmitPersonToNGOl
     */
    EcoSystem ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public CounsellingAvailableStudentsNGOJPanel(EcoSystem ecosystem) {
        initComponents();
        this.ecosystem= ecosystem;
        jPanel2.setVisible(false);
        populate();
        populateCompany();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jRegisterTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmbEnterpriseName = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbCounsellor = new javax.swing.JComboBox<>();
        btnAssignCounsellor = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(240, 178, 62));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COUNSELLING SERVICE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jRegisterTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRegisterTable.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jRegisterTable.setForeground(new java.awt.Color(56, 90, 174));
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Default", "Name", "Age", "Contact", "Highest Education"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("AVAILABLE COUNSELLORS:");

        cmbEnterpriseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High School", "Senior Secondary School", "Bachelors", "Masters", " " }));
        cmbEnterpriseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("COMPANY:");

        cmbCounsellor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High School", "Senior Secondary School", "Bachelors", "Masters", " " }));

        btnAssignCounsellor.setBackground(new java.awt.Color(240, 178, 62));
        btnAssignCounsellor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAssignCounsellor.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignCounsellor.setText("ASSIGN");
        btnAssignCounsellor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAssignCounsellor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignCounsellorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCounsellor, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btnAssignCounsellor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCounsellor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnAssignCounsellor)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(450, 450, 450))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1107, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRegisterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterTableMouseClicked

    jPanel2.setVisible(true);
    try{     
            int rowNumber=jRegisterTable.getSelectedRow();
            AssignToCounsellorWorkRequest request=(AssignToCounsellorWorkRequest) jRegisterTable.getModel().getValueAt(rowNumber, 0);
            
        }
        catch(Exception e)
        {
            throw  e;
        }
    }//GEN-LAST:event_jRegisterTableMouseClicked

    private void cmbEnterpriseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseNameActionPerformed
       populateCounsellors();
    }//GEN-LAST:event_cmbEnterpriseNameActionPerformed

    private void btnAssignCounsellorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignCounsellorActionPerformed
       try {
                int rowNumber=jRegisterTable.getSelectedRow();
                if(rowNumber<0)
                {
                    JOptionPane.showMessageDialog(null, "Please select a row");
                    return;
                }
               ArrayList<AssignToCounsellorWorkRequest> workRequest= ecosystem.getWorkQueue().getAssignToCounsellorWorkRequests();
                for(AssignToCounsellorWorkRequest assignToCounsellorWorkRequest:workRequest)
                {
                    if(assignToCounsellorWorkRequest.equals(jRegisterTable.getModel().getValueAt(rowNumber, 0)))
                    {
                        if(!cmbCounsellor.getSelectedItem().toString().isEmpty())
                        {
                            CollegeCounsellor collegeCounsellor=new CollegeCounsellor();
                            collegeCounsellor.setCounsellorName(cmbCounsellor.getSelectedItem().toString().split(",")[0]);
                            collegeCounsellor.setIsCounsellorAvailable(false);
                            collegeCounsellor.setCounsellorId(Integer.parseInt(cmbCounsellor.getSelectedItem().toString().split(",")[1]));
                            assignToCounsellorWorkRequest.setCounsellor(collegeCounsellor);
                            updateCounsellorInfo(Integer.parseInt(cmbCounsellor.getSelectedItem().toString().split(",")[1]));
                            JOptionPane.showMessageDialog(null, "Counsellor Assigned Succesfully");
                            jPanel2.setVisible(false);
                            break;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Counsellor not Available Please Select a diffrent counsellor");
                            break;
                        }
                    }
                }
                dB4OUtil.storeSystem(ecosystem);
                populate();
            } catch (Exception e) {
    
                throw e;
            }
    }//GEN-LAST:event_btnAssignCounsellorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignCounsellor;
    private javax.swing.JComboBox<String> cmbCounsellor;
    private javax.swing.JComboBox<String> cmbEnterpriseName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable jRegisterTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        ArrayList<AssignToCounsellorWorkRequest> finalWorkRequests=new ArrayList<>();
        int loggedinID = ecosystem.getLogInUser().getLogInId();
    for(AssignToCounsellorWorkRequest workRequest: ecosystem.getWorkQueue().getAssignToCounsellorWorkRequests()){
        for(Network network:ecosystem.getNetworks())
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises())
            {
                if(enterprise.getEnterpriseType().equals("NGO"))
                {
                    for(Organization organisation : enterprise.getOrganizationDirectory().getOrganisationList())
                    {
                       for(UserAccount userAccount : organisation.getUserAccountDirectory().getUserAccountList())
                       {
                           if(userAccount.getUniqueId()== loggedinID)
                           {
                              if(workRequest.getEntryChildWorkRequest().getNgoName().equals(enterprise.getName()))
                              {
                                  if(workRequest.getEntryChildWorkRequest().isIsAccepted() &&workRequest.getEntryChildWorkRequest().getPerson().getAge()>17 &&  workRequest.getCounsellor()==null)
                                  {
                                      finalWorkRequests.add(workRequest);
                                  }
                              }
                           }
                       }
                    }
                }
            }
        }
        DefaultTableModel model = (DefaultTableModel) jRegisterTable.getModel();
        model.setRowCount(0);
        jRegisterTable.getColumnModel().getColumn(0).setMinWidth(0);
        jRegisterTable.getColumnModel().getColumn(0).setMaxWidth(0);
        for(AssignToCounsellorWorkRequest requests : finalWorkRequests)
        {
            Object[] row = new Object[5];
            row[0]= requests;
            row[1] = requests.getEntryChildWorkRequest().getPerson().getName();
            row[2] = requests.getEntryChildWorkRequest().getPerson().getAge();
            row[3] = requests.getEntryChildWorkRequest().getPerson().getContact(); 
            row[4]= requests.getEntryChildWorkRequest().getPerson().getEducation();
            model.addRow(row);
        }
    }
  }
    
    private void populateCounsellors()
    {
        cmbCounsellor.removeAllItems();
        for(Network network: ecosystem.getNetworks())
        {
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterprises())
            {
                if(enterprise.getEnterpriseType().equals("CollegeCounsellor") && enterprise.getName().equals(cmbEnterpriseName.getSelectedItem()))
                {
                    for(Organization organization:enterprise.getOrganizationDirectory().getOrganisationList() )
                    {
                           for(UserAccount userAccount:organization.getUserAccountDirectory().getUserAccountList())
                           {
                               if(userAccount.isIsAvailable())
                               {
                                   cmbCounsellor.addItem(userAccount.getEmployee().getName()+","+userAccount.getUniqueId());
                               }
                           }
                    }
                }
            }
        }
    }
    private void populateCompany()
    {
        cmbEnterpriseName.removeAllItems();
        for(Network network: ecosystem.getNetworks())
        {
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterprises())
            {
                if(enterprise.getEnterpriseType().equals("CollegeCounsellor"))
                {
                   cmbEnterpriseName.addItem(enterprise.getName());
                }
            }
        }
    }
    private void updateCounsellorInfo(int counsellorUniqueId)
    {
        for(Network network: ecosystem.getNetworks())
        {
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterprises())
            {
                if(enterprise.getEnterpriseType().equals("CollegeCounsellor"))
                {
                    for(Organization organization:enterprise.getOrganizationDirectory().getOrganisationList() )
                    {
                           for(UserAccount userAccount:organization.getUserAccountDirectory().getUserAccountList())
                           {
                               if(userAccount.getUniqueId()==counsellorUniqueId)
                               {
                                   userAccount.setIsAvailable(false);
                               }
                           }
                    }
                }
            }
        }
    }
    

  
}