/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.House;
import model.PersonDirectory;

/**
 *
 * @author sonal
 */
public class NewPatientRegistartionFormJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewPatientRegistartionFormJPanel
     */
    PersonDirectory persons;
    boolean emptyValidationStatus=true;
    boolean validationStatus=true;
    public NewPatientRegistartionFormJPanel(PersonDirectory persons) {
        initComponents();
        initCityCombo();
        this.persons=persons;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRegisterLabel = new javax.swing.JLabel();
        cmbState = new javax.swing.JComboBox<>();
        txtMiddleName = new javax.swing.JTextField();
        lblAddressCity = new javax.swing.JLabel();
        lblPersonalInformation = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtAddressLine1 = new javax.swing.JTextField();
        lblAddressLine1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        cmbSalutation = new javax.swing.JComboBox<>();
        lblDateOfBirth = new javax.swing.JLabel();
        lblAddressLine2 = new javax.swing.JLabel();
        lblContactInformation = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtAddressLine2 = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        lblDateOfBirth1 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        lblDateOfBirth2 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        cmbCity = new javax.swing.JComboBox<>();
        cmbCommunity = new javax.swing.JComboBox<>();

        jRegisterLabel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jRegisterLabel.setForeground(new java.awt.Color(102, 0, 0));
        jRegisterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRegisterLabel.setText("REGISTER PATIENT");
        jRegisterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MA", "AC", "DC", "BC" }));

        txtMiddleName.setToolTipText("Please Enter Middle Name if any");

        lblAddressCity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAddressCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddressCity.setText("* City , State , Community :");

        lblPersonalInformation.setBackground(new java.awt.Color(204, 204, 204));
        lblPersonalInformation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPersonalInformation.setForeground(new java.awt.Color(102, 0, 51));
        lblPersonalInformation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPersonalInformation.setText("Personal Information");

        txtLastName.setToolTipText("Please Enter las Name if any");

        lblAddressLine1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAddressLine1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddressLine1.setText("* Address Line1:");

        btnCreate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        cmbSalutation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Miss." }));

        lblDateOfBirth.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDateOfBirth.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDateOfBirth.setText("* Age :");

        lblAddressLine2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAddressLine2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddressLine2.setText(" Address Line2:");

        lblContactInformation.setBackground(new java.awt.Color(204, 204, 204));
        lblContactInformation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContactInformation.setForeground(new java.awt.Color(102, 0, 51));
        lblContactInformation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContactInformation.setText("Contact Information");

        txtFirstName.setToolTipText("Please Enter your first Name");

        lblPhoneNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber.setText("* Phone Number : ");

        lblName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("* Name : ");

        lblDateOfBirth1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDateOfBirth1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDateOfBirth1.setText("* Height");

        txtAge.setToolTipText("Please Enter your first Name");

        txtHeight.setToolTipText("Please Enter your first Name");

        lblDateOfBirth2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDateOfBirth2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDateOfBirth2.setText("* Weight");

        txtWeight.setToolTipText("Please Enter your first Name");

        cmbCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCityItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRegisterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContactInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(lblPersonalInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDateOfBirth)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbSalutation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddressCity)
                                    .addComponent(lblAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoneNumber)
                                    .addComponent(lblAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDateOfBirth1)
                                    .addComponent(lblDateOfBirth2))
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRegisterLabel)
                .addGap(27, 27, 27)
                .addComponent(lblPersonalInformation)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(cmbSalutation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateOfBirth)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateOfBirth1)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateOfBirth2)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(lblContactInformation)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressLine1)
                    .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddressLine2)
                    .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressCity)
                    .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        try
        {
            if(NullOrEmptyValidation())
            {
                if(validateField())
                {
                var person=persons.addNewPerson();
                if(txtMiddleName.getText()!=null && txtMiddleName.getText().trim()!="")
                {
                    person.setName(cmbSalutation.getSelectedItem().toString() + " " + txtFirstName.getText() + " " + txtMiddleName.getText() + " " + txtLastName.getText());
                }
                else{
                person.setName(cmbSalutation.getSelectedItem().toString() + " " + txtFirstName.getText() + " " + txtLastName.getText());
                }
                person.setAge(Integer.parseInt(txtAge.getText()));
                person.setHeight(Float.parseFloat(txtHeight.getText()));
                person.setWeight(Float.parseFloat(txtWeight.getText()));
                Random random=new Random();
                int patientId=random.nextInt((9999 - 100) + 1) + 10;
                person.setPatientId(patientId);
                House house=new House();
                house.setHouseNumber(txtAddressLine1.getText());
                if(!txtAddressLine2.getText().trim().isEmpty())
                {
                    house.setStreetName(txtAddressLine2.getText());
                }
                Community community=new Community();
                Map<String,String>communities=new HashMap<>();
                communities.put(cmbCity.getSelectedItem().toString(),cmbCommunity.getSelectedItem().toString());
                community.setCommunity(communities);
                house.setCommunity(community);
                person.setHouse(house);
                person.setMobileNumber(Long.parseLong(txtPhoneNumber.getText()));

                JOptionPane.showMessageDialog(this,"Information Saved Successfully.Your New PatientId is:"+patientId+
                    ",please save this for furture appointments.");
                }
                 else
                {
                JOptionPane.showMessageDialog(this,"Field Validation Failed .Please hover over the red fields  to know more.");
                validationStatus=true;
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Field Validation Failed .Please hover over the red fields  to know more.");
                emptyValidationStatus=true;
                if(persons.getPersonDirectory().size()>0)
                persons.getPersonDirectory().remove(persons.getPersonDirectory().size() - 1);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Information Not Saved");
            emptyValidationStatus=true;
            persons.getPersonDirectory().remove(persons.getPersonDirectory().size() - 1);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void cmbCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCityItemStateChanged
         if (evt.getStateChange() != ItemEvent.SELECTED) {
        initCommunityCombo();
    }
    }//GEN-LAST:event_cmbCityItemStateChanged
    private boolean NullOrEmptyValidation() {
        if(txtFirstName.getText().equals(null) || txtFirstName.getText().trim().isEmpty() )
        {
            txtFirstName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtFirstName.setToolTipText("Field Cannot be left empty");
            emptyValidationStatus= false;
        }
        if(!txtFirstName.getText().equals(null) && !txtFirstName.getText().trim().isEmpty() )
        {
            txtFirstName.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
        if(txtLastName.getText().equals(null) || txtLastName.getText().trim().isEmpty() )
        {
            txtLastName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtLastName.setToolTipText("Field Cannot be left empty");
            emptyValidationStatus= false;
        }
        if(!txtLastName.getText().equals(null) && !txtLastName.getText().trim().isEmpty() )
        {
            txtLastName.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
        if(txtAge.getText().equals(null) || txtLastName.getText().trim().isEmpty())
        {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtAge.setToolTipText("Field Cannot be left empty");
            emptyValidationStatus= false;
        }
        if(!txtAge.getText().equals(null) && !txtLastName.getText().trim().isEmpty())
        {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
         if(txtHeight.getText().equals(null) || txtHeight.getText().trim().isEmpty())
        {
            txtHeight.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHeight.setToolTipText("Field Cannot be left empty");
            emptyValidationStatus= false;
        }
         if(!txtHeight.getText().equals(null) && !txtHeight.getText().trim().isEmpty())
        {
            txtHeight.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
        if(txtWeight.getText().equals(null) || txtWeight.getText().trim().isEmpty())
        {
            txtWeight.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtWeight.setToolTipText("Field Cannot be left empty");
            emptyValidationStatus= false;
        }
         if(!txtWeight.getText().equals(null) && !txtWeight.getText().trim().isEmpty())
        {
            txtWeight.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            
        }
        if(txtAddressLine1.getText().equals(null)|| txtAddressLine1.getText().trim().isEmpty())
        {
            txtAddressLine1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtAddressLine1.setToolTipText("Field Cannot be left empty");
            emptyValidationStatus= false;
        }
        if(!txtAddressLine1.getText().equals(null) && !txtAddressLine1.getText().trim().isEmpty())
        {
            txtAddressLine1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
           
        }
        if(txtPhoneNumber.getText().equals(null) || txtPhoneNumber.getText().trim().isEmpty())
        {
            txtPhoneNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPhoneNumber.setToolTipText("Field Cannot be left empty");
            emptyValidationStatus=false;
        }
        if(!txtPhoneNumber.getText().equals(null) && !txtPhoneNumber.getText().trim().isEmpty())
        {
            txtPhoneNumber.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
        return emptyValidationStatus;
    }
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
    private boolean validateField() {
        if(!txtFirstName.getText().matches("^\\pL+[\\pL\\pZ\\pP]{0,}$"))
        {
            txtFirstName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtFirstName.setToolTipText("Please enter only characters.");
            validationStatus=false;
        }
        if(txtFirstName.getText().matches("^\\pL+[\\pL\\pZ\\pP]{0,}$"))
        {
            txtFirstName.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));
        }
        if(!txtAge.getText().matches("\\b\\d+\\b"))
        {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtAge.setToolTipText("Pleae enter only numbers");
            validationStatus=false;
        }
        if(txtAge.getText().matches("\\b\\d+\\b"))
        {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
        if(!txtHeight.getText().matches("([0-9]*[.]*[0-9])"))
        {
            txtHeight.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHeight.setToolTipText("Pleae enter only numbers/floating digits");
            validationStatus=false;
        }
         if(txtHeight.getText().matches("([0-9]*[.]*[0-9])"))
        {
            txtHeight.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
        if(!txtWeight.getText().matches("([0-9]*[.]*[0-9])"))
        {
            txtWeight.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtWeight.setToolTipText("Pleae enter only numbers/floating digits");
            validationStatus=false;
        }
        if(txtWeight.getText().matches("([0-9]*[.]*[0-9])"))
        {
            txtWeight.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
        if(!txtPhoneNumber.getText().matches("\\b\\d+\\b"))
        {
            txtPhoneNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPhoneNumber.setToolTipText("Pleae enter only numbers");
            validationStatus=false;
        }
        if(txtPhoneNumber.getText().matches("\\b\\d+\\b"))
        {
            txtPhoneNumber.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
        return validationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> cmbCity;
    private javax.swing.JComboBox<String> cmbCommunity;
    private javax.swing.JComboBox<String> cmbSalutation;
    private javax.swing.JComboBox<String> cmbState;
    private javax.swing.JLabel jRegisterLabel;
    private javax.swing.JLabel lblAddressCity;
    private javax.swing.JLabel lblAddressLine1;
    private javax.swing.JLabel lblAddressLine2;
    private javax.swing.JLabel lblContactInformation;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDateOfBirth1;
    private javax.swing.JLabel lblDateOfBirth2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPersonalInformation;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

}
