/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.AbnormalPatient;
import model.City;
import model.Community;
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
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    PatientDirectory patients;
    PersonDirectory persons;
    public SearchJPanel(PatientDirectory patients,PersonDirectory persons) {
        initComponents();
        this.patients=patients;
        this.persons=persons;
        initCityCombo();
        createTableData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        cmbCommunity = new javax.swing.JComboBox<>();
        lblAgeGroup = new javax.swing.JLabel();
        cmbAgeGroup = new javax.swing.JComboBox<>();
        lblAbnormalSign = new javax.swing.JLabel();
        cmbAnormalVitalSign = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSearchPatient = new javax.swing.JTable();
        btnsearch = new javax.swing.JButton();
        txtAbnormalPatient = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblCity.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCity.setText("City :");

        cmbCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCityItemStateChanged(evt);
            }
        });

        lblCommunity.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCommunity.setText("Community :");

        lblAgeGroup.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblAgeGroup.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAgeGroup.setText("Age Groups:");

        cmbAgeGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0-20", "21-40", "41-Above", " " }));

        lblAbnormalSign.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblAbnormalSign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAbnormalSign.setText("Abnormal Vital :");

        cmbAnormalVitalSign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pulse Rate", "Blood Pressure", "Both" }));

        jSearchPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Id", "Patient Name", "Vital Sign", "Age Group"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jScrollPane1.setViewportView(jSearchPatient);

    btnsearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    btnsearch.setText("Search");
    btnsearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnsearchActionPerformed(evt);
        }
    });

    jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
    jLabel2.setText("Total Abnormal Patients:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCity)
                            .addGap(54, 54, 54)
                            .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(lblCommunity)
                            .addGap(28, 28, 28)
                            .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(lblAgeGroup)
                            .addGap(18, 18, 18)
                            .addComponent(cmbAgeGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(lblAbnormalSign)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbAnormalVitalSign, 0, 164, Short.MAX_VALUE))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnsearch)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtAbnormalPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addGap(26, 26, 26)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgeGroup)
                    .addComponent(cmbAgeGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAbnormalSign)
                    .addComponent(cmbAnormalVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(cmbCity, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGap(32, 32, 32)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtAbnormalPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
            .addGap(47, 47, 47)
            .addComponent(btnsearch)
            .addContainerGap(222, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCityItemStateChanged

        if (evt.getStateChange() != ItemEvent.SELECTED) {
             initCommunityCombo();
        }
    }//GEN-LAST:event_cmbCityItemStateChanged

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
       createTableData();
    }//GEN-LAST:event_btnsearchActionPerformed
    private void initCityCombo() {
       cmbCity.removeAllItems();
       int count = 0;
        City[] cities = City.values();
        for (City citie : cities) {
            cmbCity.addItem(cities[count++].toString());
        }
       initCommunityCombo();
    }
    private void initCommunityCombo() {
    cmbCommunity.removeAllItems();
      int count = 0;
      var selectedCity=cmbCity.getSelectedItem().toString();
      City city=City.valueOf(selectedCity);
      Community community=new Community();
      community.setCommunities();
      String[] communities=community.getCommunities().get(city);
        for (String communitie : communities) {
            cmbCommunity.addItem(communities[count++]);
        }
    }
    private void createTableData()
    {
       List<AbnormalPatient> abnormalPatients=new ArrayList<>();
       var city=cmbCity.getSelectedItem();
       var community=cmbCommunity.getSelectedItem();
       var vitalSign=cmbAnormalVitalSign.getSelectedItem();
       VitalSigns vital=new VitalSigns();
       String[]ageGroups=cmbAgeGroup.getSelectedItem().toString().split("-");
       int lowerLimit=Integer.parseInt(ageGroups[0]);
       if(!ageGroups[1].contains("Above"))
        {
            int upperLimit=Integer.parseInt(ageGroups[1]);
            for(Patient patient : patients.getPatients())
            {
                for (Map.Entry<Integer, EncounterHistory> patienEntry : patient.getPatient().entrySet()) {
                    var encountersList=patienEntry.getValue().getPatientEncounterHistory();
                           int arrayLength=encountersList.size()-1;
                           var lastEncounter=encountersList.get(arrayLength);
                           for( Map.Entry<Date, VitalSigns> encounter:lastEncounter.getPatientEncounter().entrySet())
                           {
                                vital=encounter.getValue();
                           }
                    for (Person person:persons.getPersonDirectory()) {
                        if(patienEntry.getKey()==person.getPatientId())
                        {
                           if(vitalSign=="Blood Pressure")
                           {
                                if(person.getHouse().getCommunity().getCommunity().containsKey(city) &&
                                        person.getHouse().getCommunity().getCommunity().containsValue(community) &&
                                        person.getAge()<=upperLimit && person.getAge()>=lowerLimit && vital.getBloodPressure()>120)
                                {
                                    AbnormalPatient abnormalPatient=new AbnormalPatient();
                                    abnormalPatient.setPatientId(person.getPatientId());
                                    abnormalPatient.setPatientName(person.getName());
                                    abnormalPatient.setAge(person.getAge());
                                    abnormalPatient.setVitalSigns(vital);
                                    abnormalPatients.add(abnormalPatient);
                                }
                           }
                           if(vitalSign=="Pulse Rate")
                           {
                                if(person.getHouse().getCommunity().getCommunity().containsKey(cmbCity.getSelectedItem()) &&
                                  person.getHouse().getCommunity().getCommunity().containsValue(cmbCommunity.getSelectedItem()) &&
                                  person.getAge()<=upperLimit && person.getAge()>=lowerLimit && vital.getPulseRate()<60)
                                {
                                    AbnormalPatient abnormalPatient=new AbnormalPatient();
                                    abnormalPatient.setPatientId(person.getPatientId());
                                    abnormalPatient.setPatientName(person.getName());
                                    abnormalPatient.setAge(person.getAge());
                                    abnormalPatient.setVitalSigns(vital);
                                    abnormalPatients.add(abnormalPatient);
                                }
                           }
                           if(vitalSign=="Both")
                           {
                               if(person.getHouse().getCommunity().getCommunity().containsKey(cmbCity.getSelectedItem()) &&
                                  person.getHouse().getCommunity().getCommunity().containsValue(cmbCommunity.getSelectedItem()) &&
                                  person.getAge()<=upperLimit && person.getAge()>=lowerLimit && vital.getPulseRate()<60 && vital.getBloodPressure()>120)
                                {
                                    AbnormalPatient abnormalPatient=new AbnormalPatient();
                                    abnormalPatient.setPatientId(person.getPatientId());
                                    abnormalPatient.setPatientName(person.getName());
                                    abnormalPatient.setAge(person.getAge());
                                    abnormalPatient.setVitalSigns(vital);
                                    abnormalPatients.add(abnormalPatient);
                                }
                           }
                        }
                    }
                }
            }
        }
       else{
            for(Patient patient : patients.getPatients())
            {
                for (Map.Entry<Integer, EncounterHistory> patienEntry : patient.getPatient().entrySet()) {
                    var encountersList=patienEntry.getValue().getPatientEncounterHistory();
                           int arrayLength=encountersList.size()-1;
                           var lastEncounter=encountersList.get(arrayLength);
                           for( Map.Entry<Date, VitalSigns> encounter:lastEncounter.getPatientEncounter().entrySet())
                           {
                                vital=encounter.getValue();
                           }
                    for (Person person:persons.getPersonDirectory()) {
                        if(patienEntry.getKey()==person.getPatientId())
                        {
                           if(vitalSign=="Blood Pressure")
                           {
                                if(person.getHouse().getCommunity().getCommunity().containsKey(city) &&
                                        person.getHouse().getCommunity().getCommunity().containsValue(community)
                                        && person.getAge()>=lowerLimit && vital.getBloodPressure()>120)
                                {
                                    AbnormalPatient abnormalPatient=new AbnormalPatient();
                                    abnormalPatient.setPatientId(person.getPatientId());
                                    abnormalPatient.setPatientName(person.getName());
                                    abnormalPatient.setAge(person.getAge());
                                    abnormalPatient.setVitalSigns(vital);
                                    abnormalPatients.add(abnormalPatient);
                                }
                           }
                           if(vitalSign=="Pulse Rate")
                           {
                                if(person.getHouse().getCommunity().getCommunity().containsKey(cmbCity.getSelectedItem()) &&
                                  person.getHouse().getCommunity().getCommunity().containsValue(cmbCommunity.getSelectedItem()) &&
                                  person.getAge()>=lowerLimit && vital.getPulseRate()<60)
                                {
                                    AbnormalPatient abnormalPatient=new AbnormalPatient();
                                    abnormalPatient.setPatientId(person.getPatientId());
                                    abnormalPatient.setPatientName(person.getName());
                                    abnormalPatient.setAge(person.getAge());
                                    abnormalPatient.setVitalSigns(vital);
                                    abnormalPatients.add(abnormalPatient);
                                }
                           }
                           if(vitalSign=="Both")
                           {
                               if(person.getHouse().getCommunity().getCommunity().containsKey(cmbCity.getSelectedItem()) &&
                                  person.getHouse().getCommunity().getCommunity().containsValue(cmbCommunity.getSelectedItem()) &&
                                  person.getAge()>=lowerLimit && vital.getPulseRate()<60 && vital.getBloodPressure()>120)
                                {
                                    AbnormalPatient abnormalPatient=new AbnormalPatient();
                                    abnormalPatient.setPatientId(person.getPatientId());
                                    abnormalPatient.setPatientName(person.getName());
                                    abnormalPatient.setAge(person.getAge());
                                    abnormalPatient.setVitalSigns(vital);
                                    abnormalPatients.add(abnormalPatient);
                                }
                           }
                        }
                    }
                }
            }
    }
        displayInfo(abnormalPatients);
        txtAbnormalPatient.setText(String.valueOf(abnormalPatients.size()));
    }
    private void displayInfo(List<AbnormalPatient> patients) {
        try
        {
            DefaultTableModel model =(DefaultTableModel) jSearchPatient.getModel();
            model.setRowCount(0);
            if(patients!=null && !patients.isEmpty())
            {
                patients.forEach(abnormalPatient -> {
                    Map<String,Integer> recentVitalSigns=new HashMap<>();
                    recentVitalSigns.put("Blood Pressure", abnormalPatient.getVitalSigns().getBloodPressure());
                    recentVitalSigns.put("Pulse Rate", abnormalPatient.getVitalSigns().getPulseRate());
                    model.addRow(new Object[]
                    {abnormalPatient.getPatientId(),abnormalPatient.getPatientName(),recentVitalSigns,abnormalPatient.getAge()});
                });
                jSearchPatient.setModel(model);
            }
            else
            {
                 JOptionPane.showMessageDialog(this,"No Data to display");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Please enter data before viewing");
        }

        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cmbAgeGroup;
    private javax.swing.JComboBox<String> cmbAnormalVitalSign;
    private javax.swing.JComboBox<String> cmbCity;
    private javax.swing.JComboBox<String> cmbCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jSearchPatient;
    private javax.swing.JLabel lblAbnormalSign;
    private javax.swing.JLabel lblAgeGroup;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JTextField txtAbnormalPatient;
    // End of variables declaration//GEN-END:variables
}
