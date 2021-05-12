package com.ex.module.entities.actors;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Set;
@Entity
@DiscriminatorValue("Company")
@Component
public class Company extends User{

    private String companyName;
    private String address;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Customer> customerSet;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "COLLABORATING_BETWEEN_COMP_AND_DES",
            joinColumns ={@JoinColumn(name = "COMPANY")},
            inverseJoinColumns ={@JoinColumn(name = "DESIGNER")}
    )
    private Set<Designer> designerSet;

    public Company() {
        this.setRole("COMPANY");
    }

    public String getName() {
        return companyName;
    }

    public void setName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }

    public Set<Designer> getDesignerSet() {
        return designerSet;
    }

    public void setDesignerSet(Set<Designer> designerSet) {
        this.designerSet = designerSet;
    }




}