/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.College;

/**
 *
 * @author sonal
 */
public class CollegeCounsellor {
    private String counsellorName;

    public String getCounsellorName() {
        return counsellorName;
    }

    public void setCounsellorName(String counsellorName) {
        this.counsellorName = counsellorName;
    }

    public int getCounsellorId() {
        return counsellorId;
    }

    public void setCounsellorId(int counsellorId) {
        this.counsellorId = counsellorId;
    }

    public boolean isIsCounsellorAvailable() {
        return isCounsellorAvailable;
    }

    public void setIsCounsellorAvailable(boolean isCounsellorAvailable) {
        this.isCounsellorAvailable = isCounsellorAvailable;
    }
    private int counsellorId;
    private boolean isCounsellorAvailable;
    
}
