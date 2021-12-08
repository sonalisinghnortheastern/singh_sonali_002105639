/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization;
import Business.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sonal
 */
public class Enterprise extends Organization {

    public Enterprise(String name,EnterpriseType type) {
        super(name);
        this.enterpriseType=type;
        this.organizationDirectory=new OrganizationDirectory();
    }
    
    private  EnterpriseType enterpriseType; 
    private  OrganizationDirectory organizationDirectory;
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public  enum EnterpriseType{
       NGO("NGO"),
       Restaurant("Restaurant"),
       College("College"),
       CollegeCounsellor("CollegeCounsellor"),
       Hospital("Hospital");
       private String value;
        private EnterpriseType(String value){
        this.value=value;
        }
        public String getValue() {
        return value;
        }
        @Override
        public String toString(){
        return value;
        }
   }
}
