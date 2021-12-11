/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author sonal
 */
public class AssignToCollegeWorkRequest {
    private AssignToCounsellorWorkRequest assignToCounsellorWorkRequest;
    private String collegeName;

    public AssignToCounsellorWorkRequest getAssignToCounsellorWorkRequest() {
        return assignToCounsellorWorkRequest;
    }

    public void setAssignToCounsellorWorkRequest(AssignToCounsellorWorkRequest assignToCounsellorWorkRequest) {
        this.assignToCounsellorWorkRequest = assignToCounsellorWorkRequest;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
