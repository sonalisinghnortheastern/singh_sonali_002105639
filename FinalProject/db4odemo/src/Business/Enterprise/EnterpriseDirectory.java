/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author sonal
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterprises;

    public ArrayList<Enterprise> getEnterprises() {
        if(enterprises==null)
        {
            enterprises=new ArrayList<>();
        }
        return enterprises;
    }

    public void setEnterprises(ArrayList<Enterprise> enterprises) {
        this.enterprises = enterprises;
    }

    public EnterpriseDirectory() {
        enterprises=new ArrayList<Enterprise>();
    }
    public Enterprise createEnterprise(String name,String type)
    {
        Enterprise enterprise=null;
        if(type.equals("Hospital"))
        {
            enterprise=new HospitalEnterprise(name);
            enterprises.add(enterprise);
        }
        if(type.equals("NGO")){
        enterprise=new NGOEnterprise(name);
        enterprises.add(enterprise);
        }
        if(type.equals("Restaurant")){
        enterprise=new RestaurantEnterprise(name);
        enterprises.add(enterprise);
        }
        if(type.equals("College")){
        enterprise=new CollegeEnterprise(name);
        enterprises.add(enterprise);
        }
        if(type.equals("CollegeCounsellor")){
        enterprise=new CollegeCounsellorEnterprise(name);
        enterprises.add(enterprise);
        }
        return  enterprise;
    }
}

