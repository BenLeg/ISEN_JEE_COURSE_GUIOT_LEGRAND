package yncrea.pw08.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    public String lastname;

    public String firstname;


    public long getId() {
        return id;
    }


    public String getLastname() {
        return lastname;
    }


    public void setLastname(final String lastnameValue) {
        lastname = lastnameValue;
    }


    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(final String firstnameValue) {
        firstname = firstnameValue;
    }
}
