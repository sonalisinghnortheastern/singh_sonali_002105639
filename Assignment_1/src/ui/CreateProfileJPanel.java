/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Person;

/**
 *
 * @author sonal
 */
public class CreateProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateProfileJPanel
     */
    Person person;
    int value=0;
    public CreateProfileJPanel(Person person) {
        initComponents();
        this.person=person;  
        lblSecondaryEmailAddress.setVisible(false);
        txtSecondaryEmailAddress.setVisible(false);
        lblSecondaryPhoneNumber.setVisible(false);
        txtSecondaryPhoneNumber.setVisible(false);
        lblSecondaryAccountNumber.setVisible(false);
        txtSecondaryAccountNumber.setVisible(false);
        lblSecondaryDeviceIdentifier.setVisible(false);
        txtSecondaryDeviceIdentifier.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        cmbState = new javax.swing.JComboBox<>();
        txtMiddleName = new javax.swing.JTextField();
        lblMedicalRecordNumber = new javax.swing.JLabel();
        lblAddressCity = new javax.swing.JLabel();
        txtZIP = new javax.swing.JTextField();
        lblIPPart2 = new javax.swing.JLabel();
        lblPersonalInformation = new javax.swing.JLabel();
        lblSSNDash2 = new javax.swing.JLabel();
        lblPrimaryEmailAddress = new javax.swing.JLabel();
        txtFaxNumber = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtIPPart3 = new javax.swing.JTextField();
        lblLinkedinId = new javax.swing.JLabel();
        lblIPPart1 = new javax.swing.JLabel();
        lblDeviceIdentifier = new javax.swing.JLabel();
        lblAddressCountry = new javax.swing.JLabel();
        lblHealthPlanNumber = new javax.swing.JLabel();
        txtLinkedinId = new javax.swing.JTextField();
        txtAddressLine1 = new javax.swing.JTextField();
        lblBankAccountNumber = new javax.swing.JLabel();
        lblInternetProtocolNumber = new javax.swing.JLabel();
        lblCarPlateNumber = new javax.swing.JLabel();
        lblAddressLine1 = new javax.swing.JLabel();
        lblOrganizationInformation = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txtIPPart1 = new javax.swing.JTextField();
        lblSSNDash = new javax.swing.JLabel();
        txtIPPart2 = new javax.swing.JTextField();
        lblCreate = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        cmbSalutation = new javax.swing.JComboBox<>();
        txtMedicalRecordNumber = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        txtCarPlateNumber = new javax.swing.JTextField();
        lblLicenseNumber = new javax.swing.JLabel();
        lblAddressLine2 = new javax.swing.JLabel();
        lblContactInformation = new javax.swing.JLabel();
        txtSSNPart2 = new javax.swing.JTextField();
        lblVehicleIdentifierNumber = new javax.swing.JLabel();
        txtVehicleIdentifierNumber = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        lnlSocialSecurityNumber = new javax.swing.JLabel();
        lblFaxNumber = new javax.swing.JLabel();
        txtHealthPlanNumber = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtSSNPart3 = new javax.swing.JTextField();
        txtSSNPart1 = new javax.swing.JTextField();
        txtAddressLine2 = new javax.swing.JTextField();
        txtDateOfBirth = new com.toedter.calendar.JDateChooser();
        lblBiometricIdentifier = new javax.swing.JLabel();
        btnBrowseBiometricImage = new javax.swing.JButton();
        lblFullFace = new javax.swing.JLabel();
        btnFullFace = new javax.swing.JButton();
        txtPrimaryEmailAddress = new javax.swing.JTextField();
        tglSecondaryEmailId = new javax.swing.JToggleButton();
        lblSecondaryEmailAddress = new javax.swing.JLabel();
        txtSecondaryEmailAddress = new javax.swing.JTextField();
        txtPrimaryPhoneNumber = new javax.swing.JTextField();
        lblSecondaryPhoneNumber = new javax.swing.JLabel();
        txtSecondaryPhoneNumber = new javax.swing.JTextField();
        txtPrimaryAccountNumber = new javax.swing.JTextField();
        lblSecondaryAccountNumber = new javax.swing.JLabel();
        txtSecondaryAccountNumber = new javax.swing.JTextField();
        txtDeviceIdentifier = new javax.swing.JTextField();
        lblSecondaryDeviceIdentifier = new javax.swing.JLabel();
        txtSecondaryDeviceIdentifier = new javax.swing.JTextField();
        tglPhoneNumber = new javax.swing.JToggleButton();
        tglBankAccountNumber = new javax.swing.JToggleButton();
        tglDeviceIdentifier = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MA", "AC", "DC", "BC" }));

        txtMiddleName.setToolTipText("Please Enter Middle Name if any");

        lblMedicalRecordNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMedicalRecordNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMedicalRecordNumber.setLabelFor(lblName);
        lblMedicalRecordNumber.setText("Medical Record Number :");

        lblAddressCity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAddressCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddressCity.setLabelFor(lblName);
        lblAddressCity.setText("* City , State , ZIP :");

        lblIPPart2.setText(".");

        lblPersonalInformation.setBackground(new java.awt.Color(204, 204, 204));
        lblPersonalInformation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPersonalInformation.setForeground(new java.awt.Color(102, 0, 51));
        lblPersonalInformation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPersonalInformation.setText("Personal Information");

        lblSSNDash2.setText("-");

        lblPrimaryEmailAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPrimaryEmailAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrimaryEmailAddress.setLabelFor(lblName);
        lblPrimaryEmailAddress.setText("* Primary Email Address : ");

        txtLastName.setToolTipText("Please Enter las Name if any");

        lblLinkedinId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblLinkedinId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLinkedinId.setLabelFor(lblName);
        lblLinkedinId.setText("* LinkedinID :");

        lblIPPart1.setText(".");

        lblDeviceIdentifier.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDeviceIdentifier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDeviceIdentifier.setLabelFor(lblName);
        lblDeviceIdentifier.setText("* Device Identifier :");

        lblAddressCountry.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAddressCountry.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddressCountry.setLabelFor(lblName);
        lblAddressCountry.setText("* Country : ");

        lblHealthPlanNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblHealthPlanNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHealthPlanNumber.setLabelFor(lblName);
        lblHealthPlanNumber.setText("* Health Plan Number :");

        lblBankAccountNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblBankAccountNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBankAccountNumber.setLabelFor(lblName);
        lblBankAccountNumber.setText("* Primary Bank Account Number :");

        lblInternetProtocolNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblInternetProtocolNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInternetProtocolNumber.setLabelFor(lblName);
        lblInternetProtocolNumber.setText("* Internet Protocol Number :");

        lblCarPlateNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCarPlateNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCarPlateNumber.setLabelFor(lblName);
        lblCarPlateNumber.setText("* Car Plate Number : ");

        lblAddressLine1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAddressLine1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddressLine1.setLabelFor(lblName);
        lblAddressLine1.setText("* Address Line1:");

        lblOrganizationInformation.setBackground(new java.awt.Color(204, 204, 204));
        lblOrganizationInformation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblOrganizationInformation.setForeground(new java.awt.Color(102, 0, 51));
        lblOrganizationInformation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOrganizationInformation.setLabelFor(lblContactInformation);
        lblOrganizationInformation.setText("Organization Information");

        btnCreate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblSSNDash.setText("-");

        lblCreate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreate.setText("Create Profile");

        cmbSalutation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Miss." }));

        lblDateOfBirth.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDateOfBirth.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDateOfBirth.setLabelFor(lblName);
        lblDateOfBirth.setText("* DateOf Birth :");

        lblLicenseNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblLicenseNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLicenseNumber.setLabelFor(lblName);
        lblLicenseNumber.setText("* Certificate/License Number :");

        lblAddressLine2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAddressLine2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddressLine2.setLabelFor(lblName);
        lblAddressLine2.setText("* Address Line2:");

        lblContactInformation.setBackground(new java.awt.Color(204, 204, 204));
        lblContactInformation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContactInformation.setForeground(new java.awt.Color(102, 0, 51));
        lblContactInformation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContactInformation.setLabelFor(lblContactInformation);
        lblContactInformation.setText("Contact Information");

        lblVehicleIdentifierNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblVehicleIdentifierNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVehicleIdentifierNumber.setLabelFor(lblName);
        lblVehicleIdentifierNumber.setText("* Vehicle Identifier Number : ");

        txtFirstName.setToolTipText("Please Enter your first Name");

        lblPhoneNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber.setLabelFor(lblName);
        lblPhoneNumber.setText("* Primary Phone Number : ");

        lnlSocialSecurityNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lnlSocialSecurityNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lnlSocialSecurityNumber.setLabelFor(lblName);
        lnlSocialSecurityNumber.setText("* Social Security Number : ");

        lblFaxNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFaxNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFaxNumber.setLabelFor(lblName);
        lblFaxNumber.setText("* Fax Number : ");

        lblName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setLabelFor(lblName);
        lblName.setText("* Name : ");

        lblBiometricIdentifier.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblBiometricIdentifier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBiometricIdentifier.setLabelFor(lblName);
        lblBiometricIdentifier.setText("* Biometric Identifier :");

        btnBrowseBiometricImage.setText("Browse File");
        btnBrowseBiometricImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseBiometricImageActionPerformed(evt);
            }
        });

        lblFullFace.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFullFace.setText("* Upload Full Face Photo :");

        btnFullFace.setText("Browse File");
        btnFullFace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFullFaceActionPerformed(evt);
            }
        });

        tglSecondaryEmailId.setText("Add Secondary Email Address?");
        tglSecondaryEmailId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tglSecondaryEmailIdItemStateChanged(evt);
            }
        });

        lblSecondaryEmailAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSecondaryEmailAddress.setText("* Secondary Email Address :");

        lblSecondaryPhoneNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSecondaryPhoneNumber.setText("* Secondary Phone Number :");

        lblSecondaryAccountNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSecondaryAccountNumber.setText("* Secondary Account Number :");

        lblSecondaryDeviceIdentifier.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSecondaryDeviceIdentifier.setText("* Secondary Device Identifier :");

        tglPhoneNumber.setText("Add Secondary Phone Number?");
        tglPhoneNumber.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tglPhoneNumberItemStateChanged(evt);
            }
        });

        tglBankAccountNumber.setText("Add Secondary Account Number?");
        tglBankAccountNumber.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tglBankAccountNumberItemStateChanged(evt);
            }
        });

        tglDeviceIdentifier.setText("Add Secondary Device Identifier?");
        tglDeviceIdentifier.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tglDeviceIdentifierItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPersonalInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContactInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblBiometricIdentifier)
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnFullFace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnBrowseBiometricImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(lblPhoneNumber)
                                    .addComponent(lblAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddressCity)
                                    .addComponent(lblAddressCountry)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPrimaryEmailAddress)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(210, 210, 210)
                                                .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(txtZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(291, 291, 291)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tglPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(tglSecondaryEmailId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addComponent(lblFullFace)
                                    .addComponent(lblLinkedinId)
                                    .addComponent(lblSecondaryPhoneNumber)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDateOfBirth)
                                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(93, 93, 93)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cmbSalutation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblInternetProtocolNumber)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIPPart1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblIPPart1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIPPart2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblIPPart2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIPPart3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 231, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblVehicleIdentifierNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVehicleIdentifierNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBankAccountNumber)
                                            .addComponent(lblSecondaryAccountNumber))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSecondaryAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrimaryAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblSecondaryDeviceIdentifier)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSecondaryDeviceIdentifier))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblDeviceIdentifier)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDeviceIdentifier))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblCarPlateNumber)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCarPlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tglBankAccountNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tglDeviceIdentifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPrimaryEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblSecondaryEmailAddress)
                                        .addGap(23, 23, 23)
                                        .addComponent(txtSecondaryEmailAddress))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblFaxNumber)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtLinkedinId, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblLicenseNumber)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblHealthPlanNumber)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtHealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblMedicalRecordNumber)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtMedicalRecordNumber))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lnlSocialSecurityNumber)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtSSNPart1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblSSNDash, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtSSNPart2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(lblSSNDash2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtSSNPart3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(4, 4, 4))
                                        .addComponent(txtPrimaryPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSecondaryPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblOrganizationInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblDateOfBirth, lblName});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAddressCity, lblAddressCountry, lblAddressLine1, lblAddressLine2, lblFaxNumber, lblLinkedinId, lblPhoneNumber, lblPrimaryEmailAddress});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBankAccountNumber, lblCarPlateNumber, lblDeviceIdentifier, lblHealthPlanNumber, lblInternetProtocolNumber, lblLicenseNumber, lblMedicalRecordNumber, lblVehicleIdentifierNumber, lnlSocialSecurityNumber});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCity, txtZIP});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPersonalInformation)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(cmbSalutation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateOfBirth)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblContactInformation)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressLine1)
                    .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressLine2)
                    .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressCountry)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimaryEmailAddress)
                    .addComponent(txtPrimaryEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglSecondaryEmailId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecondaryEmailAddress)
                    .addComponent(txtSecondaryEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedinId)
                    .addComponent(txtLinkedinId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPrimaryPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglPhoneNumber))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecondaryPhoneNumber)
                    .addComponent(txtSecondaryPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFaxNumber)
                    .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOrganizationInformation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedicalRecordNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSSNPart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSSNDash)
                            .addComponent(txtSSNPart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSSNDash2)
                            .addComponent(txtSSNPart3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnlSocialSecurityNumber))
                        .addGap(18, 18, 18)
                        .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHealthPlanNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHealthPlanNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicenseNumber)
                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankAccountNumber)
                    .addComponent(txtPrimaryAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglBankAccountNumber))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSecondaryAccountNumber)
                    .addComponent(txtSecondaryAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVehicleIdentifierNumber)
                    .addComponent(txtVehicleIdentifierNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarPlateNumber)
                    .addComponent(txtCarPlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tglDeviceIdentifier)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecondaryDeviceIdentifier)
                    .addComponent(txtSecondaryDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInternetProtocolNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIPPart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIPPart1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIPPart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIPPart2)
                        .addComponent(txtIPPart3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBrowseBiometricImage)
                    .addComponent(lblBiometricIdentifier))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFullFace, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFullFace, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(17, 17, 17)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblDateOfBirth, lblName});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAddressCountry, lblAddressLine1, lblAddressLine2, lblFaxNumber, lblLinkedinId, lblPhoneNumber, lblPrimaryEmailAddress});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBankAccountNumber, lblCarPlateNumber, lblHealthPlanNumber, lblInternetProtocolNumber, lblLicenseNumber, lblMedicalRecordNumber, lblVehicleIdentifierNumber, lnlSocialSecurityNumber});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtFirstName, txtLastName, txtMiddleName});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbState, txtCity, txtZIP});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblSSNDash, lblSSNDash2, txtSSNPart1, txtSSNPart2, txtSSNPart3});

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

            validation();
            try{
            person.setName(cmbSalutation.getSelectedItem().toString() + " " + txtFirstName.getText() + " " + txtLastName.getText());
            person.setGeographicData(txtAddressLine1.getText()+" "+txtAddressLine2.getText()+" "
            +txtCity.getText()+" "+cmbState.getSelectedItem().toString()+" "+txtZIP.getText()+" "+txtCountry.getText());
            person.setDateOfBirthDate(txtDateOfBirth.getDate());
            String[] telephoneNumbers=new String[10];
            telephoneNumbers[0]=((txtPrimaryPhoneNumber.getText()));
            if(txtSecondaryPhoneNumber.getText()!=null && !(txtSecondaryPhoneNumber.getText().trim().isEmpty()))
            {
                telephoneNumbers[1]=((txtSecondaryPhoneNumber.getText()));
            }
            person.setTelephoneNumbers(telephoneNumbers);
            person.setFaxNumber((txtFaxNumber.getText()));
            String[] emailAddresses=new String[10];
            emailAddresses[0]=((txtPrimaryEmailAddress.getText()));
            if(txtSecondaryEmailAddress.getText()!=null && !(txtSecondaryEmailAddress.getText().trim().isEmpty()))
            {
                emailAddresses[1]=((txtSecondaryEmailAddress.getText()));
            }
            person.setEmailAddresses(emailAddresses);
            person.setSocialSecurityNumber((txtSSNPart1.getText()+" - "+txtSSNPart2.getText()+
                    " - "+txtSSNPart3.getText()));
            person.setMedicalRecordNumber(txtMedicalRecordNumber.getText());
            person.setHealthPlanBenificiaryNumber(txtHealthPlanNumber.getText());
            int[] bankAccountNumbers=new int[10];
            bankAccountNumbers[0]=(Integer.parseInt(txtPrimaryAccountNumber.getText()));
            if(txtSecondaryAccountNumber.getText()!=null && !(txtSecondaryAccountNumber.getText().trim().isEmpty()))
            {
                bankAccountNumbers[1]=(Integer.parseInt(txtSecondaryAccountNumber.getText()));
            }
            person.setBankAccountNumbers(bankAccountNumbers);
            person.setLicenseNumber(txtLicenseNumber.getText());
            String[] vehicleIdentifiers=new String[10];
            vehicleIdentifiers[0]=(txtLicenseNumber.getText());
            vehicleIdentifiers[1]=(txtLicenseNumber.getText());
            person.setVehicleIdentifierNumber(vehicleIdentifiers);
            String[] deviceIdentifiers=new String[10];
            deviceIdentifiers[0]=((txtDeviceIdentifier.getText()));
            if(txtSecondaryDeviceIdentifier.getText()!=null && !(txtSecondaryDeviceIdentifier.getText().trim().isEmpty()))
            {
                deviceIdentifiers[1]=((txtSecondaryDeviceIdentifier.getText()));
            }
            person.setDeviceIdentifiers(deviceIdentifiers);
            person.setLinkedinId(txtLinkedinId.getText());
            person.setIpAddress((txtIPPart1.getText()+" . "+txtIPPart2.getText()+
                    " . "+txtIPPart3.getText()));
            person.setUniqueIdentifier(UUID.randomUUID());
            if(value==0)
            {
                JOptionPane.showMessageDialog(this,"Person Information Saved Successfully");
                value=0;
            }
            else{
                JOptionPane.showMessageDialog(this,"Field Validation Failed Please hover over the red filed to know more.");
            value=0;
            }
            }
            catch(HeadlessException | NumberFormatException ex)
            {
                person.setName("");
                person.setGeographicData("");
                try {
                    person.setDateOfBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(""));
                } catch (ParseException ex1) {
                    Logger.getLogger(CreateProfileJPanel.class.getName()).log(Level.SEVERE, null, ex1);
                }
                String[] empty=new String[10];
                person.setTelephoneNumbers(empty);
                person.setEmailAddresses(empty);
                person.setSocialSecurityNumber("");
                person.setMedicalRecordNumber("");
                person.setHealthPlanBenificiaryNumber("");
                person.setBankAccountNumbers(new int[10]);
                person.setLicenseNumber("");
                person.setVehicleIdentifierNumber(empty);
                person.setDeviceIdentifiers(empty);
                person.setLinkedinId("");
                person.setIpAddress("");
                JOptionPane.showMessageDialog(this,"Information Not Saved .");
                value =0;
            }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBrowseBiometricImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseBiometricImageActionPerformed
         JFileChooser file = new JFileChooser();
         file.setCurrentDirectory(new File(System.getProperty("user.home")));
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
         file.addChoosableFileFilter(filter);
         int result = file.showSaveDialog(null);
         if(result == JFileChooser.APPROVE_OPTION){
              File selectedFile = file.getSelectedFile();
              person.setBiometricIdentifierUrl(selectedFile.getAbsolutePath());
          }
    }//GEN-LAST:event_btnBrowseBiometricImageActionPerformed

    private void btnFullFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFullFaceActionPerformed
        JFileChooser file = new JFileChooser();
         file.setCurrentDirectory(new File(System.getProperty("user.home")));
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
         file.addChoosableFileFilter(filter);
         int result = file.showSaveDialog(null);
         if(result == JFileChooser.APPROVE_OPTION){
              File selectedFile = file.getSelectedFile();
              person.setFacePhotoUrl(selectedFile.getAbsolutePath());
          }
    }//GEN-LAST:event_btnFullFaceActionPerformed

    private void tglSecondaryEmailIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tglSecondaryEmailIdItemStateChanged

                if (evt.getStateChange() == ItemEvent.SELECTED) {
                    lblSecondaryEmailAddress.setVisible(true);
                    txtSecondaryEmailAddress.setVisible(true);
                }
                else {
                    lblSecondaryEmailAddress.setVisible(false);
                    txtSecondaryEmailAddress.setVisible(false);
                    txtSecondaryEmailAddress.setText(" ");
                }
    }//GEN-LAST:event_tglSecondaryEmailIdItemStateChanged

    private void tglPhoneNumberItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tglPhoneNumberItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
                    lblSecondaryPhoneNumber.setVisible(true);
                    txtSecondaryPhoneNumber.setVisible(true);
                }
                else {
                    lblSecondaryPhoneNumber.setVisible(false);
                    txtSecondaryPhoneNumber.setVisible(false);
                    txtSecondaryPhoneNumber.setText(" ");
                }
    }//GEN-LAST:event_tglPhoneNumberItemStateChanged

    private void tglBankAccountNumberItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tglBankAccountNumberItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
                    lblSecondaryAccountNumber.setVisible(true);
                    txtSecondaryAccountNumber.setVisible(true);
                }
                else {
                    lblSecondaryAccountNumber.setVisible(false);
                    txtSecondaryAccountNumber.setVisible(false);
                    txtSecondaryAccountNumber.setText(" ");
                }
    }//GEN-LAST:event_tglBankAccountNumberItemStateChanged

    private void tglDeviceIdentifierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tglDeviceIdentifierItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
                    lblSecondaryDeviceIdentifier.setVisible(true);
                    txtSecondaryDeviceIdentifier.setVisible(true);
                }
                else {
                    lblSecondaryDeviceIdentifier.setVisible(false);
                    txtSecondaryDeviceIdentifier.setVisible(false);
                    txtSecondaryDeviceIdentifier.setText(" ");
                }
    }//GEN-LAST:event_tglDeviceIdentifierItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseBiometricImage;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnFullFace;
    private javax.swing.JComboBox<String> cmbSalutation;
    private javax.swing.JComboBox<String> cmbState;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddressCity;
    private javax.swing.JLabel lblAddressCountry;
    private javax.swing.JLabel lblAddressLine1;
    private javax.swing.JLabel lblAddressLine2;
    private javax.swing.JLabel lblBankAccountNumber;
    private javax.swing.JLabel lblBiometricIdentifier;
    private javax.swing.JLabel lblCarPlateNumber;
    private javax.swing.JLabel lblContactInformation;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDeviceIdentifier;
    private javax.swing.JLabel lblFaxNumber;
    private javax.swing.JLabel lblFullFace;
    private javax.swing.JLabel lblHealthPlanNumber;
    private javax.swing.JLabel lblIPPart1;
    private javax.swing.JLabel lblIPPart2;
    private javax.swing.JLabel lblInternetProtocolNumber;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblLinkedinId;
    private javax.swing.JLabel lblMedicalRecordNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrganizationInformation;
    private javax.swing.JLabel lblPersonalInformation;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPrimaryEmailAddress;
    private javax.swing.JLabel lblSSNDash;
    private javax.swing.JLabel lblSSNDash2;
    private javax.swing.JLabel lblSecondaryAccountNumber;
    private javax.swing.JLabel lblSecondaryDeviceIdentifier;
    private javax.swing.JLabel lblSecondaryEmailAddress;
    private javax.swing.JLabel lblSecondaryPhoneNumber;
    private javax.swing.JLabel lblVehicleIdentifierNumber;
    private javax.swing.JLabel lnlSocialSecurityNumber;
    private javax.swing.JToggleButton tglBankAccountNumber;
    private javax.swing.JToggleButton tglDeviceIdentifier;
    private javax.swing.JToggleButton tglPhoneNumber;
    private javax.swing.JToggleButton tglSecondaryEmailId;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JTextField txtCarPlateNumber;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private com.toedter.calendar.JDateChooser txtDateOfBirth;
    private javax.swing.JTextField txtDeviceIdentifier;
    private javax.swing.JTextField txtFaxNumber;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHealthPlanNumber;
    private javax.swing.JTextField txtIPPart1;
    private javax.swing.JTextField txtIPPart2;
    private javax.swing.JTextField txtIPPart3;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JTextField txtLinkedinId;
    private javax.swing.JTextField txtMedicalRecordNumber;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtPrimaryAccountNumber;
    private javax.swing.JTextField txtPrimaryEmailAddress;
    private javax.swing.JTextField txtPrimaryPhoneNumber;
    private javax.swing.JTextField txtSSNPart1;
    private javax.swing.JTextField txtSSNPart2;
    private javax.swing.JTextField txtSSNPart3;
    private javax.swing.JTextField txtSecondaryAccountNumber;
    private javax.swing.JTextField txtSecondaryDeviceIdentifier;
    private javax.swing.JTextField txtSecondaryEmailAddress;
    private javax.swing.JTextField txtSecondaryPhoneNumber;
    private javax.swing.JTextField txtVehicleIdentifierNumber;
    private javax.swing.JTextField txtZIP;
    // End of variables declaration//GEN-END:variables

    private void validation() {
        validationForEmplyOrNull();
        regexValidation();
    }

    private void validationForEmplyOrNull() {
        if(txtFirstName.getText() ==null || (txtFirstName.getText().trim().isEmpty()))
        {
            txtFirstName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtFirstName.setToolTipText("Field Cannot be left empty");
        }
        if(txtDateOfBirth.getDate()==null )
        {
            txtDateOfBirth.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtDateOfBirth.setToolTipText("Field Cannot be left empty");
        }
        if(txtAddressLine1.getText()==null || (txtAddressLine1.getText().trim().isEmpty()))
        {
            txtAddressLine1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtAddressLine1.setToolTipText("Field Cannot be left empty");
        }
        if(txtCity.getText()==null ||(txtCity.getText().trim().isEmpty()))
        {
            txtCity.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCity.setToolTipText("Field Cannot be left empty");
        }
        if(txtZIP.getText()==null ||(txtZIP.getText().trim().isEmpty()))
        {
            txtZIP.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtZIP.setToolTipText("Field Cannot be left empty");
        }
        if(txtCountry.getText()==null || (txtCountry.getText().trim().isEmpty()))
        {
            txtCountry.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCountry.setToolTipText("Field Cannot be left empty");
        }
        if(txtLinkedinId.getText()==null || (txtLinkedinId.getText().trim().isEmpty()))
        {
            txtLinkedinId.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtLinkedinId.setToolTipText("Field Cannot be left empty");
        }
        if(txtFaxNumber.getText()==null ||(txtFaxNumber.getText().trim().isEmpty()))
        {
            txtFaxNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtFaxNumber.setToolTipText("Field Cannot be left empty");
        }
        if(txtSSNPart1.getText()==null ||(txtSSNPart1.getText().trim().isEmpty()))
        {
            txtSSNPart1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtSSNPart1.setToolTipText("Field Cannot be left empty");
        }
        if(txtSSNPart2.getText()== null ||(txtSSNPart2.getText().trim().isEmpty()))
        {
            txtSSNPart2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtSSNPart2.setToolTipText("Field Cannot be left empty");
        }
        if(txtSSNPart3.getText()== null ||(txtSSNPart3.getText().trim().isEmpty()))
        {
            txtSSNPart3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtSSNPart3.setToolTipText("Field Cannot be left empty");
        }
        if(txtMedicalRecordNumber.getText()==null ||(txtMedicalRecordNumber.getText().trim().isEmpty()))
        {
            txtMedicalRecordNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtMedicalRecordNumber.setToolTipText("Field Cannot be left empty");
        }
        if(txtHealthPlanNumber.getText()==null || (txtHealthPlanNumber.getText().trim().isEmpty()))
        {
            txtHealthPlanNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHealthPlanNumber.setToolTipText("Field Cannot be left empty");
        }
        if(txtLicenseNumber.getText()==null || (txtLicenseNumber.getText().trim().isEmpty()))
        {
            txtLicenseNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtLicenseNumber.setToolTipText("Field Cannot be left empty");
        }
        if(txtVehicleIdentifierNumber.getText()==null ||(txtVehicleIdentifierNumber.getText().trim().isEmpty()))
        {
            txtVehicleIdentifierNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtVehicleIdentifierNumber.setToolTipText("Field Cannot be left empty");
        }
        if(txtCarPlateNumber.getText()==null ||(txtCarPlateNumber.getText().trim().isEmpty()))
        {
            txtCarPlateNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCarPlateNumber.setToolTipText("Field Cannot be left empty");
        }
        if(txtIPPart1.getText()==null ||(txtIPPart1.getText().trim().isEmpty()))
        {
            txtIPPart1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtIPPart1.setToolTipText("Field Cannot be left empty");
        }
        if(txtIPPart2.getText()==null || (txtIPPart2.getText().trim().isEmpty()))
        {
            txtIPPart2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtIPPart2.setToolTipText("Field Cannot be left empty");
        }
        if(txtIPPart3.getText()==null || (txtIPPart3.getText().trim().isEmpty()))
        {
            txtIPPart3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtIPPart3.setToolTipText("Field Cannot be left empty");
        }
        if(txtPrimaryEmailAddress.getText()==null || (txtPrimaryEmailAddress.getText().trim().isEmpty()))
        {
            txtPrimaryEmailAddress.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPrimaryEmailAddress.setToolTipText("Field Cannot be left empty");
        }
        if(txtPrimaryPhoneNumber.getText()==null || (txtPrimaryPhoneNumber.getText().trim().isEmpty()))
        {
            txtPrimaryPhoneNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPrimaryPhoneNumber.setToolTipText("Field Cannot be left empty");
        }
        if(txtPrimaryAccountNumber.getText()==null || (txtPrimaryAccountNumber.getText().trim().isEmpty()))
        {
            txtPrimaryAccountNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPrimaryAccountNumber.setToolTipText("Field Cannot be left empty");
        }
        if(txtDeviceIdentifier.getText()==null || (txtDeviceIdentifier.getText().trim().isEmpty()))
        {
            txtDeviceIdentifier.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtDeviceIdentifier.setToolTipText("Field Cannot be left empty");
        }
    }

    private void regexValidation() {
        if(!txtFirstName.getText().matches("^\\pL+[\\pL\\pZ\\pP]{0,}$"))
        {
            txtFirstName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtFirstName.setToolTipText("Please enter only characters,dots or spaces.Has to start with a number");
            value=1;
        }
        if(!txtCity.getText().matches("^[a-zA-Z ]+$"))
        {
            txtCity.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCity.setToolTipText("Please enter only characters");
            value=1;
        }
        if(!txtZIP.getText().matches("\\b\\d+\\b"))
        {
            txtZIP.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtZIP.setToolTipText("Pleae enter only numbers");
            value=1;
        }
        if(!txtCountry.getText().matches("^[a-zA-Z ]+$"))
        {
            txtCountry.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCountry.setToolTipText("Please enter only characters and space");
            value=1;
        }
        if(!txtPrimaryEmailAddress.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$"))
        {
            txtPrimaryEmailAddress.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPrimaryEmailAddress.setToolTipText("Please enter only characters,numbers,,,-,_");
            value=1;
        }
        if(txtSecondaryEmailAddress.getText()!=null && !txtSecondaryEmailAddress.getText().trim().isEmpty() && !txtSecondaryEmailAddress.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$"))
        {
            txtSecondaryEmailAddress.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtSecondaryEmailAddress.setToolTipText("Please enter only characters,numbers,,,-,_");
            value=1;
        }
        if(!txtPrimaryPhoneNumber.getText().matches("^[0-9]{6,10}$"))
        {
            txtPrimaryPhoneNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPrimaryPhoneNumber.setToolTipText("Please enter numbers with length between 6-10");
            value=1;
        }
        if(txtSecondaryPhoneNumber.getText()!=null && !(txtSecondaryPhoneNumber.getText().trim().isEmpty())&& !txtSecondaryPhoneNumber.getText().matches("^[0-9]{6,10}$"))
        {
            txtSecondaryPhoneNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtSecondaryPhoneNumber.setToolTipText("Please enter numbers with length between 6-10");
            value=1;
        }
        if(!txtPrimaryAccountNumber.getText().matches("\\b\\d+\\b"))
        {
            txtPrimaryAccountNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPrimaryAccountNumber.setToolTipText("Please enter int following format: +number");
            value=1;
        }
        if(txtSecondaryAccountNumber.getText()!=null && !(txtSecondaryAccountNumber.getText().trim().isEmpty())&& !txtSecondaryAccountNumber.getText().matches("\\b\\d+\\b"))
        {
            txtSecondaryAccountNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtSecondaryAccountNumber.setToolTipText("Please enter int following format: +Number");
            value=1;
        }
        if(!txtDeviceIdentifier.getText().matches("\\b\\d+\\b"))
        {
            txtDeviceIdentifier.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtDeviceIdentifier.setToolTipText("Please enter int following format: number");
            value=1;
        }
        if(txtSecondaryDeviceIdentifier.getText()!=null && !(txtSecondaryDeviceIdentifier.getText().trim().isEmpty())&& !txtSecondaryDeviceIdentifier.getText().matches("^[0-9]$"))
        {
            txtSecondaryDeviceIdentifier.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtSecondaryDeviceIdentifier.setToolTipText("Please enter int following format: Number");
            value=1;
        }
        if(!txtLinkedinId.getText().matches("^https:\\/\\/[a-z]{2,3}\\.linkedin\\.com\\/.*$"))
        {
            txtLinkedinId.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtLinkedinId.setToolTipText("Please enter in this format https://www.linkedin.com/sometext");
            value=1;
        }
        if(!txtFaxNumber.getText().matches("^\\+?[0-9]{6,9}$"))
        {
            txtFaxNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtFaxNumber.setToolTipText("Please enter int following format: + and the"
                    + " faxnumber which can be maximum 9 digits long");
            value=1;
        }
        if(!txtSSNPart1.getText().matches("^\\d{3}$"))
        {
            txtSSNPart1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtSSNPart1.setToolTipText("Please enter only 3 numbers");
            value=1;
        }
        if(!txtSSNPart2.getText().matches("^\\d{2}$"))
        {
            txtSSNPart2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtSSNPart2.setToolTipText("Please enter only 2 numbers");
            value=1;
        }
        if(!txtSSNPart3.getText().matches("^\\d{4}$"))
        {
            txtSSNPart3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtSSNPart3.setToolTipText("Please enter only 4 numbers");
            value=1;
        }
        
        if(!txtMedicalRecordNumber.getText().matches("^[a-zA-Z0-9]+$"))
        {
            txtMedicalRecordNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtMedicalRecordNumber.setToolTipText("Please enter only characters and numbers");
            value=1;
        }
        if(!txtHealthPlanNumber.getText().matches("^[a-zA-Z0-9]+$"))
        {
            txtHealthPlanNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHealthPlanNumber.setToolTipText("Please enter only characters and numbers");
            value=1;
        }
        if(!txtVehicleIdentifierNumber.getText().matches("^[a-zA-Z0-9]{17}+$"))
        {
            txtVehicleIdentifierNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtVehicleIdentifierNumber.setToolTipText("Please enter 17 alphanumeric");
            value=1;
        }
        if(!txtCarPlateNumber.getText().matches("^[a-zA-Z0-9]+$"))
        {
            txtCarPlateNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCarPlateNumber.setToolTipText("please enter alphanumeric only."); 
            value=1;
        }
        if(!txtIPPart1.getText().matches("^\\d{1,3}$"))
        {
            txtIPPart1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtIPPart1.setToolTipText("Please enter three valid numbers"); 
            value=1;
        }
        if(!txtIPPart2.getText().matches("^\\d{1,3}$"))
        {
            txtIPPart2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtIPPart2.setToolTipText("Please enter three valid numbers"); 
            value=1;
        }
        if(!txtIPPart3.getText().matches("^\\d{1,3}$"))
        {
            txtIPPart3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtIPPart3.setToolTipText("Please enter three valid numbers"); 
            value=1;
        }
    }
}
