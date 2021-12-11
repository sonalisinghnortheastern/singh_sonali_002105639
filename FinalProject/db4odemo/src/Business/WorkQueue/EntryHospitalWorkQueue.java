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
public class EntryHospitalWorkQueue {
    private EntryChildWorkRequest entryChidWorkRequest;
    private double height;
    private double weight;

    public EntryChildWorkRequest getEntryChidWorkRequest() {
        return entryChidWorkRequest;
    }

    public void setEntryChidWorkRequest(EntryChildWorkRequest entryChidWorkRequest) {
        this.entryChidWorkRequest = entryChidWorkRequest;
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
