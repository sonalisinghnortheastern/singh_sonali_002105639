/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.NGOEnterprise;
import Business.Person.Person;

/**
 *
 * @author sonal
 */
public class EntryChildWorkRequest extends WorkRequest {
    private String ngoName;
    private NGOEnterprise nGOEnterprise;
    private boolean isAccepted;

    public boolean isIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public String getRejectionMessage() {
        return rejectionMessage;
    }

    public void setRejectionMessage(String rejectionMessage) {
        this.rejectionMessage = rejectionMessage;
    }
    private String rejectionMessage;
    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public NGOEnterprise getnGOEnterprise() {
        return nGOEnterprise;
    }

    public void setnGOEnterprise(NGOEnterprise nGOEnterprise) {
        this.nGOEnterprise = nGOEnterprise;
    }
    private Person person;
    public EntryChildWorkRequest(){
   
    
    }
    
}
