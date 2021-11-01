/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSigns;

/**
 *
 * @author sonal
 */
public class ViewUpcomingAppointmentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpcomingAppointments
     */
    PatientDirectory patients;
    PersonDirectory persons;
    boolean emptyValidationStatus=true;
    boolean validationStatus=true;
    public ViewUpcomingAppointmentsJPanel( PatientDirectory patients,PersonDirectory persons) {
        initComponents();
        JTextFieldDateEditor editor = (JTextFieldDateEditor)jdateNewAppointmentDate.getDateEditor();
        editor.setEditable(false);
        this.patients=patients;
        this.persons=persons;
        displayInfo(patients.getPatients());
        visibleUpdateAppointment(false);
        visible(false);
    }
    private void displayInfo(Set<Patient> patients) {
        try{
        DefaultTableModel model =(DefaultTableModel) jRegisteredAppointmentTable.getModel();
        model.setRowCount(0);
        if(patients!=null && !patients.isEmpty())
        {
           for(Patient patient:patients){
                int patientId=0;
                boolean status=false;
                String patientName="";
                Date appointmentDate=new Date();
                Map<String,Integer> recentVitalSigns=new HashMap<>();
                Date testUnderTakenDate=new Date();
                for (Map.Entry<Integer, EncounterHistory> pair : patient.getPatient().entrySet())
                {
                    patientId= pair.getKey();
                    for(Map.Entry<Date,VitalSigns> x : pair.getValue().getPatientEncounterHistory().get(pair.getValue().getPatientEncounterHistory().size()-1).getPatientEncounter().entrySet())
                    {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        
                        try {
                            if(sdf.parse(sdf.format(x.getKey())).after(sdf.parse(sdf.format(new Date()))))
                            {
                                appointmentDate= x.getKey();
                                recentVitalSigns.put("Blood Pressure",  x.getValue().getBloodPressure());
                                recentVitalSigns.put("Pulse Rate",  x.getValue().getPulseRate());
                                testUnderTakenDate=x.getValue().getDateForTakingVitalSigns();
                                status=true;
                            }
                        } catch (ParseException ex) {
                            Logger.getLogger(ViewUpcomingAppointmentsJPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(status==true)
                {
                    for(Person person:persons.getPersonDirectory())
                {
                    if(person.getPatientId()==(patientId))
                    {
                        patientName=person.getName();
                    }

                }
                model.addRow(new Object[]
                {patientId,patientName,appointmentDate,recentVitalSigns,testUnderTakenDate});
                }
           }
           jRegisteredAppointmentTable.setModel(model);
        }
        else{
             JOptionPane.showMessageDialog(this,"No Data to display");
             return;
        }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Please enter data before viewing");
        }

        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDeleteUpcomingAppointment = new javax.swing.JButton();
        btnUpdateAppointmentDate = new javax.swing.JButton();
        lblNewAppointmentDate = new javax.swing.JLabel();
        lblPatientId = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jdateNewAppointmentDate = new com.toedter.calendar.JDateChooser();
        btnUpdateExistingBooking = new javax.swing.JButton();
        chckBoxRetakeTest = new javax.swing.JCheckBox();
        lblPulseRate = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        txtPulseRate = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jRegisteredAppointmentTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointments");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnDeleteUpcomingAppointment.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDeleteUpcomingAppointment.setText("Delete Appointment");
        btnDeleteUpcomingAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUpcomingAppointmentActionPerformed(evt);
            }
        });

        btnUpdateAppointmentDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdateAppointmentDate.setText("Update Appointment Date");
        btnUpdateAppointmentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAppointmentDateActionPerformed(evt);
            }
        });

        lblNewAppointmentDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblNewAppointmentDate.setText("Please Select New appointment date:");

        lblPatientId.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPatientId.setText("Patient Id :");

        txtPatientId.setEditable(false);

        btnUpdateExistingBooking.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdateExistingBooking.setText("Update");
        btnUpdateExistingBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateExistingBookingActionPerformed(evt);
            }
        });

        chckBoxRetakeTest.setText("Do You Want to retake the test?");
        chckBoxRetakeTest.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chckBoxRetakeTestStateChanged(evt);
            }
        });

        lblPulseRate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPulseRate.setText("Pulse Rate :");

        lblBloodPressure.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblBloodPressure.setText("Blood Pressure :");

        jRegisteredAppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient Name", "Appointment Date", "Recent VitalSigns", "Test Undertaken Date"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jScrollPane1.setViewportView(jRegisteredAppointmentTable);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnUpdateAppointmentDate)
                    .addGap(44, 44, 44)
                    .addComponent(btnDeleteUpcomingAppointment))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPulseRate)
                                    .addComponent(lblBloodPressure))
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPulseRate)
                                    .addComponent(txtBloodPressure)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNewAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(jdateNewAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(chckBoxRetakeTest)
                            .addGap(155, 155, 155)
                            .addComponent(btnUpdateExistingBooking)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addGap(50, 50, 50)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnDeleteUpcomingAppointment)
                .addComponent(btnUpdateAppointmentDate))
            .addGap(84, 84, 84)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblPatientId)
                .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblNewAppointmentDate)
                .addComponent(jdateNewAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(chckBoxRetakeTest)
                .addComponent(btnUpdateExistingBooking))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblPulseRate)
                .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblBloodPressure)
                .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(46, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateAppointmentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAppointmentDateActionPerformed
        int rowIndex=jRegisteredAppointmentTable.getSelectedRow();
        if(rowIndex<0)
    {
        JOptionPane.showMessageDialog(this,"Please select the entry you wish to Update");
    }
        else{
        visibleUpdateAppointment(true);
        txtPatientId.setText(jRegisteredAppointmentTable.getValueAt(rowIndex, 0).toString());
                }
    }//GEN-LAST:event_btnUpdateAppointmentDateActionPerformed

    private void btnUpdateExistingBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateExistingBookingActionPerformed

        if(NullOrEmptyDate()){
            try {
                if(ValidateDate())
                {
                    if(chckBoxRetakeTest.isSelected() )
                    {
                        if(NullOrEmptyValidation() && validateField() )
                        {
                            VitalSigns vitalSigns=new VitalSigns();
                            vitalSigns.setPulseRate(Integer.parseInt(txtPulseRate.getText()));
                            vitalSigns.setBloodPressure(Integer.parseInt(txtBloodPressure.getText()));
                            vitalSigns.setDateForTakingVitalSigns(new Date());
                            Map<Date,VitalSigns> patientEncounter=new HashMap<>();
                            patientEncounter.put(jdateNewAppointmentDate.getDate(),vitalSigns);
                            Encounter encounter=new Encounter();
                            encounter.setPatientEncounter(patientEncounter);
                            for(Patient patient:patients.getPatients())
                            {
                                if(patient.getPatient().containsKey(Integer.parseInt(txtPatientId.getText())))
                                {
                                    var a = patient.getPatient().get(Integer.parseInt(txtPatientId.getText()));
                                    a.setPatientEncounterHistory(encounter);
                                    patients.getPatients().remove(a);
                                    patients.setPatients(patient);
                                }
                            }
                            displayInfo(patients.getPatients());
                        }
                        else{
                            JOptionPane.showMessageDialog(this,"Field Validation Failed .Please hover over the red fields  to know more.");
                            validationStatus=true;
                        }
                    }
                    else{
                        int rowIndex=jRegisteredAppointmentTable.getSelectedRow();
                        Encounter encounter=new Encounter();
                        for(Patient patient:patients.getPatients())
                        {
                            if(patient.getPatient().containsKey(Integer.parseInt(txtPatientId.getText())))
                            {
                                var a = patient.getPatient().get(Integer.parseInt(txtPatientId.getText()));
                                for (Encounter num : a.getPatientEncounterHistory())
                                {
                                    for(Date appointmentDate:num.getPatientEncounter().keySet())
                                    {
                                        if(appointmentDate==jRegisteredAppointmentTable.getValueAt(rowIndex, 2))
                                        {
                                            var oldVitalSign=num.getPatientEncounter().get(appointmentDate);
                                            Map<Date,VitalSigns> patientEncounter=new HashMap<Date,VitalSigns>();
                                            patientEncounter.put(jdateNewAppointmentDate.getDate(),oldVitalSign);
                                            encounter.setPatientEncounter(patientEncounter);
                                        }
                                    }
                                }
                                var patientLastVisitEncounter=a.getPatientEncounterHistory().size()-1;
                                a.getPatientEncounterHistory().set(patientLastVisitEncounter, encounter);
                            }
                        }
                        displayInfo(patients.getPatients());
                    }
                }
                
                else{
                    JOptionPane.showMessageDialog(this,"Field Validation Failed .Please hover over the red fields  to know more.");
                    validationStatus=true;
                }   } catch (ParseException ex) {
                Logger.getLogger(ViewUpcomingAppointmentsJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Field Validation Failed .Please hover over the red fields  to know more.");
            validationStatus=true;
        }
    }//GEN-LAST:event_btnUpdateExistingBookingActionPerformed

    private void chckBoxRetakeTestStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chckBoxRetakeTestStateChanged
        if(chckBoxRetakeTest.isSelected())
        {
            visible(true);
        }
        else
        {
            visible(false);
        }
    }//GEN-LAST:event_chckBoxRetakeTestStateChanged

    private void btnDeleteUpcomingAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUpcomingAppointmentActionPerformed
        int rowIndex=jRegisteredAppointmentTable.getSelectedRow();
        if(rowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"Please select the entry you wish to delete");
        }
        for(Patient patient:patients.getPatients())
        {
            if(patient.getPatient().containsKey(jRegisteredAppointmentTable.getValueAt(rowIndex, 0)))
            {
                var completePatientEncounterHistory = patient.getPatient().get(jRegisteredAppointmentTable.getValueAt(rowIndex, 0));
                var patientLastVisitEncounter=completePatientEncounterHistory.getPatientEncounterHistory().size()-1;
                completePatientEncounterHistory.getPatientEncounterHistory().remove(patientLastVisitEncounter);
                if(completePatientEncounterHistory.getPatientEncounterHistory().size()==0)
                {
                    patient.getPatient().remove(jRegisteredAppointmentTable.getValueAt(rowIndex, 0));
                    patients.getPatients().remove(patient);
                }
                JOptionPane.showMessageDialog(this,"Appointment Deleted Successfully");
            } 
        }
        displayInfo(patients.getPatients());
            
    }//GEN-LAST:event_btnDeleteUpcomingAppointmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteUpcomingAppointment;
    private javax.swing.JButton btnUpdateAppointmentDate;
    private javax.swing.JButton btnUpdateExistingBooking;
    private javax.swing.JCheckBox chckBoxRetakeTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jRegisteredAppointmentTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdateNewAppointmentDate;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblNewAppointmentDate;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPulseRate;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPulseRate;
    // End of variables declaration//GEN-END:variables

    private void visibleUpdateAppointment(boolean value) {
        lblPatientId.setVisible(value);
       txtPatientId.setVisible(value);
       lblNewAppointmentDate.setVisible(value);
       jdateNewAppointmentDate.setVisible(value);
       chckBoxRetakeTest.setVisible(value);
       btnUpdateExistingBooking.setVisible(value);
    }
    private void visible(boolean value) {
       lblPulseRate.setVisible(value);
       lblBloodPressure.setVisible(value);
       txtPulseRate.setVisible(value);
       txtBloodPressure.setVisible(value);
    }
    private boolean NullOrEmptyDate()
    {
        if(jdateNewAppointmentDate.getDate()==null)
        {
            jdateNewAppointmentDate.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            jdateNewAppointmentDate.setToolTipText("Field Cannot be left empty");
            validationStatus= false;
        }if(jdateNewAppointmentDate.getDate()!=null)
        {
            jdateNewAppointmentDate.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
        
        return validationStatus;
    }
    private boolean NullOrEmptyValidation() {
        if(txtPulseRate.getText()==null && txtPulseRate.getText().trim()=="" )
        {
            txtPulseRate.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPulseRate.setToolTipText("Field Cannot be left empty");
            validationStatus= false;
        }
        else if(txtBloodPressure.getText()==null && txtBloodPressure.getText().trim()=="" )
        {
            txtBloodPressure.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtBloodPressure.setToolTipText("Field Cannot be left empty");
            validationStatus= false;
        }
        return validationStatus;
    }
    private boolean validateField() {
        
        if(!txtPulseRate.getText().matches("\\b\\d+\\b"))
        {
            txtPulseRate.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPulseRate.setToolTipText("Pleae enter only numbers");
            validationStatus=false;
        }
         if(txtPulseRate.getText().matches("\\b\\d+\\b"))
        {
            txtPulseRate.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
        if(!txtBloodPressure.getText().matches("\\b\\d+\\b"))
        {
            txtBloodPressure.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtBloodPressure.setToolTipText("Pleae enter only numbers");
            validationStatus=false;
        }
        if(txtBloodPressure.getText().matches("\\b\\d+\\b"))
        {
            txtBloodPressure.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
        return validationStatus;
    }

    private boolean ValidateDate() throws ParseException {
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       if(!(sdf.parse(sdf.format(jdateNewAppointmentDate.getDate())).after(sdf.parse(sdf.format(new Date())))))
        {
            jdateNewAppointmentDate.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            jdateNewAppointmentDate.setToolTipText("Please enter only future date");
            validationStatus=false;
        }
        if((sdf.parse(sdf.format(jdateNewAppointmentDate.getDate())).after(sdf.parse(sdf.format(new Date())))))
        {
            jdateNewAppointmentDate.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
        return validationStatus;
    }
}