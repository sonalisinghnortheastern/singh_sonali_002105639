/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author sonal
 */
public class PatientDirectory {
        Set<Patient> patients=new HashSet<>();

    public PatientDirectory() {
         Patient patient=new Patient();
        EncounterHistory encounterHistory=new EncounterHistory();
        Encounter encounter=new Encounter();
        VitalSigns vitalSigns=new VitalSigns();
        vitalSigns.setBloodPressure(100);
        vitalSigns.setPulseRate(50);
        vitalSigns.setDateForTakingVitalSigns(new Date());
        VitalSigns vitalSigns2=new VitalSigns();
        vitalSigns2.setBloodPressure(130);
        vitalSigns2.setPulseRate(80);
        vitalSigns2.setDateForTakingVitalSigns(new Date());  
        Map<Date,VitalSigns> encounterMapping=new HashMap<>();
        encounterMapping.put(new Date(), vitalSigns);
        encounter.setPatientEncounter(encounterMapping);
        encounterMapping.put(new Date(), vitalSigns2);
        encounter.setPatientEncounter(encounterMapping);
        encounterHistory.setPatientEncounterHistory(encounter);
        Map<Integer,EncounterHistory> encounterHistoryMapping =new HashMap<>();
        encounterHistoryMapping.put(123, encounterHistory);
        patient.setPatient(encounterHistoryMapping);
        patients.add(patient);
        
    }
        

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Patient patients) {
        this.patients.add(patients);
    }
}
