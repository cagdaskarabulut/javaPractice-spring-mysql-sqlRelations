package com.karabulut.javapracticespringdockermysql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "beer-order-line")
public class BeerOrderLine extends ModelCore{
    private Integer orderQuantity;
    @ManyToOne
    private Beer beer;
    @ManyToOne
    private BeerOrder beerOrder;
}
