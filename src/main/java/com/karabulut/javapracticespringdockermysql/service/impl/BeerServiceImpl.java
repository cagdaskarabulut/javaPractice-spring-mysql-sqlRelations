package com.karabulut.javapracticespringdockermysql.service.impl;

import com.karabulut.javapracticespringdockermysql.model.Beer;
import com.karabulut.javapracticespringdockermysql.repository.BeerRepository;
import com.karabulut.javapracticespringdockermysql.service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {

    private final BeerRepository repository;
    @Override
    public Beer save(Beer beer) {
        return repository.save(beer);
    }

    @Override
    public List<Beer> saveAll(List<Beer> beerList) {
        return (List<Beer>) repository.saveAll(beerList);
    }

    @Override
    public List<Beer> getAll() {
        return (List<Beer>) repository.findAll();
    }
}
