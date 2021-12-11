/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

/**
 *
 * @author Vijay
 */
public class Hospital {
    private String hospitalName;
    private double temperature;
    private double bloodPressure;
    private double pulse;
   private boolean isHospitalAvailable;
   private int hospitalId;

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public boolean isIsHospitalAvailable() {
        return isHospitalAvailable;
    }

    public void setIsHospitalAvailable(boolean isHospitalAvailable) {
        this.isHospitalAvailable = isHospitalAvailable;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getPulse() {
        return pulse;
    }

    public void setPulse(double pulse) {
        this.pulse = pulse;
    }
    
}
