package com.karabulut.javapracticespringdockermysql.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class BeerOrder extends ModelCore{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerRef;
    private Long customerId;
    @ManyToOne
    private Customer customer;

    public boolean isNew(){return this.id == null;}

    public void setCustomer(Customer customer){
        this.customer = customer;
        customer.getBeerOrders().add(this);
    }

    @OneToMany(mappedBy ="beerOrder")
    private Set<BeerOrderLine> beerOrderLines;



}
