package com.karabulut.javapracticespringdockermysql.repository;

import com.karabulut.javapracticespringdockermysql.model.Beer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends CrudRepository<Beer,Long> {
}
