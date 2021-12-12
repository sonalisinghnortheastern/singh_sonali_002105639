/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Network.Network;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.loggedInUser;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networks;
    private loggedInUser logInUser;
    private ArrayList<UserAccount> userAccounts;

    public ArrayList<UserAccount> getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(UserAccount userAccount) {
        this.userAccounts.add(userAccount);
    }

    public loggedInUser getLogInUser() {
        return logInUser;
    }

    public void setLogInUser(loggedInUser logInUser) {
        this.logInUser = logInUser;
    }
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem() {
        super(null);
        networks=new ArrayList<>();
        logInUser=new loggedInUser();
        userAccounts=new ArrayList<>();
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }
    public boolean checkIfUserIsUnique(String userName){
       return false;
    }
    public ArrayList<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(Network network) {
        networks.add(network);
    }
    public boolean CheckIfUSernameIsUnique(String username)
    {
        if(userAccounts==null)
        {
            userAccounts=new ArrayList<>();
        }
        for(UserAccount userAccount:userAccounts)
        {
            if(userAccount.getUsername().equals(username))
            {
                return false;
            }
        }
        return true;
    }
}
