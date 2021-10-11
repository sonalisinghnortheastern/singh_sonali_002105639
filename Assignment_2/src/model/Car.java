/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author sonal
 */
public class Car {
    private String carName;
    private Boolean isPassengerCar;
    private Boolean isCarAvailable;
    private String manufacturerName;
    private int manufacturingYear;
    private int noOfSeats;
    private long serialNumber;
    private String modelNumber;
    private List<String> availableCity;
    private Date maintenanceCertificateDate;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Boolean getIsPassengerCar() {
        return isPassengerCar;
    }

    public void setIsPassengerCar(Boolean isPassengerCar) {
        this.isPassengerCar = isPassengerCar;
    }

    public Boolean getIsCarAvailable() {
        return isCarAvailable;
    }

    public void setIsCarAvailable(Boolean isCarAvailable) {
        this.isCarAvailable = isCarAvailable;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        
        this.manufacturingYear = manufacturingYear;
    }

   public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public List<String> getAvailableCity() {
        return availableCity;
    }

    public void setAvailableCity(List<String> availableCity) {
        this.availableCity = availableCity;
    }

    public Date getMaintenanceCertificateDate() {
        return maintenanceCertificateDate;
    }

    public void setMaintenanceCertificateDate(Date maintenanceCertificateDate) {
        this.maintenanceCertificateDate = maintenanceCertificateDate;
    }
    public int getNoOfSeats() {
    return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    
}
