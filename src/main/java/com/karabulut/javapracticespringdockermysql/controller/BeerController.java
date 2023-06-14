package com.karabulut.javapracticespringdockermysql.controller;

import com.karabulut.javapracticespringdockermysql.model.Beer;
import com.karabulut.javapracticespringdockermysql.service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/beer")
@RequiredArgsConstructor
public class BeerController {
    private BeerService service;

    @GetMapping
    public List<Beer> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Beer create(@RequestBody Beer beer){
        return service.save(beer);
    }

}
