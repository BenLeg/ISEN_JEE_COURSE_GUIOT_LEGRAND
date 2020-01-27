package yncrea.lab03.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties(value = { "projects" })
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column
    private String name;

    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "company")
    private List<Project> projects;


    public Company() {
    }


    public long getId() {
        return id;
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


    public void setProjects(final List<Project> projectsValue) {
        projects = projectsValue;
    }


}
