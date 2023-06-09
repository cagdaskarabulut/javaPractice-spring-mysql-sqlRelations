package com.karabulut.javapracticespringdockermysql.service;

import com.karabulut.javapracticespringdockermysql.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto save(ProductDto productDto);
    ProductDto getById(Long id);
    List<ProductDto> getAll();
    boolean delete(Long id);


}
