/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EntryHospitalWorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vijay
 */
public class ChildReportJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalJpanel
     */
    private final EcoSystem system;  
    public ChildReportJpanel(EcoSystem system) {
        initComponents();
         this.system=system;
        populateTable();
        jPanel2.setVisible(false);
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
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPrescription = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(2193, 1202));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(2193, 1202));

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APOINTMENT HISTORY");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jRegisterTable.setBackground(new java.awt.Color(204, 204, 204));
        jRegisterTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRegisterTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Default", "Name", "Age", "Height", "Weight", "Blood Pressure", "Temprature"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
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

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PRESCRIPTION :");

        jTextAreaPrescription.setColumns(20);
        jTextAreaPrescription.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaPrescription.setRows(5);
        jScrollPane2.setViewportView(jTextAreaPrescription);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(823, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(779, 779, 779))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1903, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(764, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2128, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRegisterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterTableMouseClicked

        try{
            int rowNumber=jRegisterTable.getSelectedRow();
            if(rowNumber<0)
            {
                JOptionPane.showMessageDialog(null, "Please select a row");
                return;
            }
            EntryHospitalWorkRequest request=(EntryHospitalWorkRequest) jRegisterTable.getModel().getValueAt(rowNumber, 0);
            if(request.getEntryChildWorkRequest()==null||request.getEntryChildWorkRequest().getPerson()==null){
                jPanel2.setVisible(false);
            }
            else{
                jPanel2.setVisible(true);
                jTextAreaPrescription.setText(request.getHospital().getPrescription());
               
            }
        }
        catch(Exception e)
        {
            throw  e;
        }
    }//GEN-LAST:event_jRegisterTableMouseClicked

    private void populateTable() {
        try{
        ArrayList<EntryHospitalWorkRequest> finalWorkRequests=new ArrayList<>();
        int loggedinID = system.getLogInUser().getLogInId();
        if(system.getWorkQueue()==null)
        {
            JOptionPane.showMessageDialog(null, "WorkQueue is empty");
                return;
        }
        for(EntryHospitalWorkRequest hospitalWorkRequest: system.getWorkQueue().getWorkRequestHospital())   
        {   
            for(Network network:system.getNetworks())
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises())
            {
                if(enterprise.getEnterpriseType().equals("Hospital"))
                {
                    for(Organization organisation : enterprise.getOrganizationDirectory().getOrganisationList())
                    {
                       for(UserAccount userAccount : organisation.getUserAccountDirectory().getUserAccountList())
                       {
                           if(userAccount.getUniqueId()== loggedinID)
                           {
                                      
                              if(hospitalWorkRequest.getHospital().getHospitalName().equals(enterprise.getName()))
                              {
                                  if(hospitalWorkRequest.isMedicalCheckupCompleted())
                                  {
                                       finalWorkRequests.add(hospitalWorkRequest);
                                  }
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
        
        for(EntryHospitalWorkRequest requests : finalWorkRequests) //displaying on table from counsellor queue
        {
            Object[] row = new Object[7];
            row[0]=requests;
            row[1] = requests.getEntryChildWorkRequest().getPerson().getName();
            row[2] = requests.getEntryChildWorkRequest().getPerson().getAge();
            row[3] = requests.getEntryChildWorkRequest().getPerson().getAddress();
            row[4] = requests.getEntryChildWorkRequest().getPerson().getContact();         
            row[5] = requests.getHeight();
            row[6]= requests.getWeight();
            model.addRow(row);
        }
        }
        catch(Exception ex)
        {
            throw ex;
        }
  }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable jRegisterTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaPrescription;
    // End of variables declaration//GEN-END:variables
}
