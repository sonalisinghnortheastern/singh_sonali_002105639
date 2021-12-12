/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.College;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AssignToCollegeWorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sonal
 */
public class HistoryWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCollegeJPanel
     */
    private final EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public HistoryWorkAreaJPanel(EcoSystem system) {
        initComponents();
         this.system=system;
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jRegisterTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(240, 178, 62));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMISSION REQUEST HISTORY");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jRegisterTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRegisterTable.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jRegisterTable.setForeground(new java.awt.Color(56, 90, 174));
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Default", "STUDENT NAME", "NGO", "HIGHEST EDUCATION", "GENDER", "AGE", "COUNSELLOR", "STATUS", "REJECTION MESSAGE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true, true
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
        jScrollPane1.setViewportView(jRegisterTable);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1178, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(456, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(468, 468, 468))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1178, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1178, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTable jRegisterTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        try{
        ArrayList<AssignToCollegeWorkRequest> finalWorkRequests=new ArrayList<>();
        int loggedinID = system.getLogInUser().getLogInId();
         if(system.getWorkQueue()==null)
        {
            JOptionPane.showMessageDialog(null, "WorkQueue is empty");
                return;
        }
    for(AssignToCollegeWorkRequest workRequest: system.getWorkQueue().getAssignToCollegeWorkRequests()){
        for(Network network:system.getNetworks())
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises())
            {
                if(enterprise.getEnterpriseType().equals("College"))
                {
                    for(Organization organisation : enterprise.getOrganizationDirectory().getOrganisationList())
                    {
                       for(UserAccount userAccount : organisation.getUserAccountDirectory().getUserAccountList())
                       {
                           if(userAccount.getUniqueId()== loggedinID)
                           {
                              if(workRequest.getCollegeName().equals(enterprise.getName()))
                              {
                                  finalWorkRequests.add(workRequest);
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
        for(AssignToCollegeWorkRequest requests : finalWorkRequests)
        {
            if(requests.isAcceptedByCollege()|| (!requests.isAcceptedByCollege() && requests.getRejectionMessageByCollege()!=null))
            {
                Object[] row = new Object[10];
                row[0]=requests;
                row[1] = requests.getAssignToCounsellorWorkRequest().getEntryChildWorkRequest().getPerson().getName();
                row[2] = requests.getAssignToCounsellorWorkRequest().getEntryChildWorkRequest().getNgoName();
                row[3] = requests.getAssignToCounsellorWorkRequest().getEntryChildWorkRequest().getPerson().getEducation();
                row[4] = requests.getAssignToCounsellorWorkRequest().getEntryChildWorkRequest().getPerson().getGender();
                row[5] = requests.getAssignToCounsellorWorkRequest().getEntryChildWorkRequest().getPerson().getAge();
                row[6] = requests.getAssignToCounsellorWorkRequest().getCounsellor().getCounsellorName();
                row[7] = requests.isAcceptedByCollege()?"ACCEPTED":"DECLINED";
                row[8] = requests.getRejectionMessageByCollege();
                model.addRow(row);
            }
        }
    }
  }
        catch(Exception ex)
        {
            throw  ex;
        }
    }
    
}
