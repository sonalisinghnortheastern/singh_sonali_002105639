/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xml.sax.HandlerBase;

/**
 *
 * @author sonal
 */
public class PersonDirectory {
     List<Person> persons=new ArrayList<>();

    public PersonDirectory() {
        Person person=new Person();
        person.setAge(30);
        person.setHeight((float) 5.4);
        person.setWeight((float) 70);
        person.setMobileNumber(9810408081L);
        person.setName("Dummy Patient");
        person.setPatientId(123);
        House house=new House();
        Community community=new  Community();
        Map<String,String>communityMapping=new HashMap<>();
        communityMapping.put("Boston", "Longwood Medical Area");
        community.setCommunity(communityMapping);
        house.setCommunity(community);
        house.setHouseNumber("50");
        house.setStreetName("Seemant Vihar");
        person.setHouse(house);
        persons.add(person);
    }
     
    public List<Person> getPersonDirectory() {
        return persons;
    }

    public void setPersonDirectory(List<Person> persons) {
        this.persons = persons;
    }
     public Person addNewPerson()
    {
        Person person=new Person();
        persons.add(person);
        return person;
    }
}
