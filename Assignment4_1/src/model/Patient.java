/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sonal
 */
public class Patient {
    Map<Integer,EncounterHistory> patient=new HashMap<>();

    public Map<Integer, EncounterHistory> getPatient() {
        return patient;
    }

    public void setPatient(Map<Integer, EncounterHistory> patient) {
        this.patient = patient;
    }
}
