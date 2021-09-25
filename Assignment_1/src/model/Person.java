/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.util.Date;
import java.util.UUID;
import javax.swing.ImageIcon;

/**
 *
 * @author sonal
 */
public class Person {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(String geographicData) {
        this.geographicData = geographicData;
    }

    public Date getDateOfBirthDate() {
        return dateOfBirthDate;
    }

    public void setDateOfBirthDate(Date dateOfBirthDate) {
        this.dateOfBirthDate = dateOfBirthDate;
    }

    public String[] getTelephoneNumbers() {
        return telephoneNumbers;
    }

    public void setTelephoneNumbers(String[] telephoneNumbers) {
        this.telephoneNumbers = telephoneNumbers;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String[] getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(String[] emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getHealthPlanBenificiaryNumber() {
        return healthPlanBenificiaryNumber;
    }

    public void setHealthPlanBenificiaryNumber(String healthPlanBenificiaryNumber) {
        this.healthPlanBenificiaryNumber = healthPlanBenificiaryNumber;
    }

    public int[] getBankAccountNumbers() {
        return bankAccountNumbers;
    }

    public void setBankAccountNumbers(int[] bankAccountNumbers) {
        this.bankAccountNumbers = bankAccountNumbers;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String[] getVehicleIdentifierNumber() {
        return vehicleIdentifierNumber;
    }

    public void setVehicleIdentifierNumber(String[] vehicleIdentifierNumber) {
        this.vehicleIdentifierNumber = vehicleIdentifierNumber;
    }

    public String[] getDeviceIdentifiers() {
        return deviceIdentifiers;
    }

    public void setDeviceIdentifiers(String[] deviceIdentifiers) {
        this.deviceIdentifiers = deviceIdentifiers;
    }

    public String getLinkedinId() {
        return linkedinId;
    }

    public void setLinkedinId(String linkedinId) {
        this.linkedinId = linkedinId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    private String name;
    private String geographicData;
    private Date dateOfBirthDate;
    private String[] telephoneNumbers; 
    private String faxNumber;
    private String[] emailAddresses;
    private String socialSecurityNumber;
    private String medicalRecordNumber;
    private String healthPlanBenificiaryNumber;
    private int[] bankAccountNumbers;
    private String licenseNumber;
    private String[] vehicleIdentifierNumber;
    private String[] deviceIdentifiers;
    private String linkedinId;
    private String ipAddress;
    private String biometricIdentifierUrl;
    private String facePhotoUrl;
    private UUID uniqueIdentifier;
    
    public UUID getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(UUID uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public String getFacePhotoUrl() {
        return facePhotoUrl;
    }

    public void setFacePhotoUrl(String facePhotoUrl) {
        this.facePhotoUrl = facePhotoUrl;
    }

    public String getBiometricIdentifierUrl() {
        return biometricIdentifierUrl;
    }

    public void setBiometricIdentifierUrl(String biometricIdentifierUrl) {
        this.biometricIdentifierUrl = biometricIdentifierUrl;
    }

}
