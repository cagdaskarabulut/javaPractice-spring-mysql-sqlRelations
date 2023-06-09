package com.karabulut.javapracticespringdockermysql.controller;

import com.karabulut.javapracticespringdockermysql.dto.ProductDto;
import com.karabulut.javapracticespringdockermysql.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable Long id){
        var product = service.getById(id);
        return product;
    }

    @GetMapping
    public List<ProductDto> getAll(){
        var productList = service.getAll();
        return productList;
    }

    @PostMapping
    public ProductDto create(@RequestBody ProductDto productDto){
        var savedProductDto = service.save(productDto);
        return savedProductDto;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        var isRemoved = service.delete(id);
        if (!isRemoved) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
