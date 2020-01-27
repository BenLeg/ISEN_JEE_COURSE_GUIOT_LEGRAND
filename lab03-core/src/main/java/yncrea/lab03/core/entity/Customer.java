package yncrea.lab03.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@JsonIgnoreProperties(value = { "projects" })
public class Customer extends GenericEntity {

    private String name;

    @OneToMany(mappedBy = "customer")
    private List<Project> projects;

    @ManyToOne
    private BusinessType businessType;


    public Customer() {
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
