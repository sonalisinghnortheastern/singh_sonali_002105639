/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sonal
 */
public class Encounter {
      Map<Date,VitalSigns> patientEncounter=new HashMap<>();

    public Map<Date, VitalSigns> getPatientEncounter() {
        return patientEncounter;
    }

    public void setPatientEncounter(Map<Date, VitalSigns> patientEncounter) {
        this.patientEncounter = patientEncounter;
    }
}
