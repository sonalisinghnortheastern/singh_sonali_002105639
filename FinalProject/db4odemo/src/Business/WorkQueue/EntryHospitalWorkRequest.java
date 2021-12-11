/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Vijay
 */
public class EntryHospitalWorkRequest {
    private EntryChildWorkRequest entryChildWorkRequest;
    private double height;
    private double weight;

    public EntryChildWorkRequest getEntryChildWorkRequest() {
        return entryChildWorkRequest;
    }

    public void setEntryChildWorkRequest(EntryChildWorkRequest entryChildWorkRequest) {
        this.entryChildWorkRequest = entryChildWorkRequest;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
