/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<PlaceOrderWorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<PlaceOrderWorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(PlaceOrderWorkRequest orderWorkRequest) {
        this.workRequestList.add(orderWorkRequest);
    }
    
}