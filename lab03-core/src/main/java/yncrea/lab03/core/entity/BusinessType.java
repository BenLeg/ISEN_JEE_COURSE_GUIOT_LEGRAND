package yncrea.lab03.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@JsonIgnoreProperties(value = { "customers" })
public class BusinessType extends GenericEntity {


    private String name;

    @OneToMany(mappedBy = "businessType")
    private List<Customer> customers;


    public BusinessType() {
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
