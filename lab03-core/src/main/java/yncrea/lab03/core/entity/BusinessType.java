package yncrea.lab03.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

//TODO annotate this entity
@JsonIgnoreProperties(value = { "customers" })
public class BusinessType {

    public long id;

    private String name;

    private List<Customer> customers;


    public BusinessType() {
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


    public List<Customer> getCustomers() {
        return customers;
    }


    public void setCustomers(final List<Customer> customersValue) {
        customers = customersValue;
    }
}
