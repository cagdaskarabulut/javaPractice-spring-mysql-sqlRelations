package com.karabulut.javapracticespringdockermysql.service;

import com.karabulut.javapracticespringdockermysql.model.Beer;

import java.util.List;

public interface BeerService {
    Beer save(Beer beer);
    List<Beer> saveAll(List<Beer> beerList);
    List<Beer> getAll();
}
