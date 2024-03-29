package com.karabulut.javapracticespringdockermysql.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "beer")
public class Beer extends ModelCore {
    private String name;
    private Integer style;
    private double price;
    private Integer quantityOnHand;
    @OneToMany(mappedBy ="beer")
    private Set<BeerOrderLine> beerOrderLines;

    @Builder.Default
    @ManyToMany
    @JoinTable(name = "beer_category",
        joinColumns = @JoinColumn(name = "beer_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();

    public void addCategory(Category category) {
        this.categories.add(category);
        category.getBeers().add(this);
    }

    public void removeCategory(Category category) {
        this.categories.remove(category);
        category.getBeers().remove(category);
    }
}
