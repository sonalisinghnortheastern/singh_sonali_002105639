/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.College.CollegeCounsellor;
import Business.Customer.GeneralInformation;

/**
 *
 * @author sonal
 */
public class AssignToCounsellorWorkRequest {
    CollegeCounsellor counsellor;
    EntryChildWorkRequest entryChildWorkRequest;
    private boolean requestCompleted;
    private GeneralInformation generalInformation;

    public GeneralInformation getGeneralInformation() {
        return generalInformation;
    }

    public void setGeneralInformation(GeneralInformation generalInformation) {
        this.generalInformation = generalInformation;
    }

    public boolean isRequestCompleted() {
        return requestCompleted;
    }

    public void setRequestCompleted(boolean requestCompleted) {
        this.requestCompleted = requestCompleted;
    }

    public EntryChildWorkRequest getEntryChildWorkRequest() {
        return entryChildWorkRequest;
    }

    public void setEntryChildWorkRequest(EntryChildWorkRequest entryChildWorkRequest) {
        this.entryChildWorkRequest = entryChildWorkRequest;
    }

    public CollegeCounsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(CollegeCounsellor counsellor) {
        this.counsellor = counsellor;
    }
    
}
