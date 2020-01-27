package yncrea.lab03.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

//TODO annotate this entity
@JsonIgnoreProperties(value = { "projects" })
public class Customer {

    public long id;

    private String name;

    private List<Project> projects;

    private BusinessType businessType;


    public Customer() {
    }


    public long getId() {
        return id;
    }


    public void setId(final long idValue) {
        id = idValue;
    }


    public String getName() {
        return name;
    }


    public void setName(final String nameValue) {
        name = nameValue;
    }


    public List<Project> getProjects() {
        return projects;
    }


    public void setProjects(final List<Project> projectValue) {
        projects = projectValue;
    }


    public BusinessType getBusinessType() {
        return businessType;
    }


    public void setBusinessType(final BusinessType businessTypeValue) {
        businessType = businessTypeValue;
    }
}
