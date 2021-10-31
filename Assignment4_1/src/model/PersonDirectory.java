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
