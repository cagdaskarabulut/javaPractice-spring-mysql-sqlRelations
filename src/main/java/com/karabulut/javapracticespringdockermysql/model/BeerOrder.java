package com.karabulut.javapracticespringdockermysql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "beer-order")
public class BeerOrder extends ModelCore{
    private String customerRef;
    @ManyToOne
    private Customer customer;

    public boolean isNew(){return this.getId() == null;}

    public void setCustomer(Customer customer){
        this.customer = customer;
        customer.getBeerOrders().add(this);
    }

    @OneToMany(mappedBy ="beerOrder")
    private Set<BeerOrderLine> beerOrderLines;



}
