/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author sonal
 */
public class VitalSigns {
    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    private int pulseRate;
    private int bloodPressure;
    private Date dateForTakingVitalSigns;

    public Date getDateForTakingVitalSigns() {
        return dateForTakingVitalSigns;
    }

    public void setDateForTakingVitalSigns(Date dateForTakingVitalSigns) {
        this.dateForTakingVitalSigns = dateForTakingVitalSigns;
    }
}
