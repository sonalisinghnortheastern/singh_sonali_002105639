/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sonal
 */
public class Community {
    EnumMap<City, String[]> communities = new
                     EnumMap<>(City.class);
    Map<String,String> community=new HashMap<>();

    public Map<String, String> getCommunity() {
        return community;
    }

    public void setCommunity(Map<String, String> community) {
        this.community = community;
    }
    public EnumMap<City, String[]> getCommunities() {
        return communities;
    }
    public void setCommunities() {
        communities.put(City.Boston,new String[]{"Longwood Medical Area","Brigham Circle","Park Street"});
        communities.put(City.Michigan,new String[]{"Detroit","Lansing","Holland"});
        communities.put(City.NewJersey,new String[]{"Newark","Jersey City","Princeton"});
    }
}
