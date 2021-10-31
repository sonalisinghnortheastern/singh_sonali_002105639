/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sonal
 */
public class EncounterHistory {
       ArrayList<Encounter> patientEncounterHistory=new ArrayList<>();

    public ArrayList<Encounter> getPatientEncounterHistory() {
        return patientEncounterHistory;
    }

    public void setPatientEncounterHistory(Encounter patientEncounterHistory) {
        this.patientEncounterHistory.add(patientEncounterHistory);
    }
    
}
