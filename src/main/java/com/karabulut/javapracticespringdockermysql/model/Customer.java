package com.karabulut.javapracticespringdockermysql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "customers")
public class Customer extends ModelCore{
    private String name;
    private String email;
    @OneToMany(mappedBy = "customer")
    private Set<BeerOrder> beerOrders;

}
