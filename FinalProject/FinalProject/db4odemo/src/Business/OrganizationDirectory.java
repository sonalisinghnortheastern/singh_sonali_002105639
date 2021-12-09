/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author sonal
 */
public class OrganizationDirectory {
    ArrayList<Organization> organisationList;

    public ArrayList<Organization> getOrganisationList() {
        return organisationList;
    }


    public OrganizationDirectory() {
        organisationList=new ArrayList<>();
    }
    
    public Organization createOrganisation(Organization organization)
    {
        if(organisationList==null)
        {
             organisationList=new ArrayList<Organization>();
        }
        organisationList.add(organization);
        return organization;
    }
    
    
}
