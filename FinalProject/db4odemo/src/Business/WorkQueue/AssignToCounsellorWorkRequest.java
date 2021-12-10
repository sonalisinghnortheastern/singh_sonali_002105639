/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.College.CollegeCounsellor;

/**
 *
 * @author sonal
 */
public class AssignToCounsellorWorkRequest extends EntryChildWorkRequest{
    CollegeCounsellor counsellor;

    public CollegeCounsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(CollegeCounsellor counsellor) {
        this.counsellor = counsellor;
    }
    
}
