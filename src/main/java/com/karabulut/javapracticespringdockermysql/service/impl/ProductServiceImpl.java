package com.karabulut.javapracticespringdockermysql.service.impl;

import com.karabulut.javapracticespringdockermysql.dto.ProductDto;
import com.karabulut.javapracticespringdockermysql.mapper.ProductMapper;
import com.karabulut.javapracticespringdockermysql.model.Product;
import com.karabulut.javapracticespringdockermysql.repository.ProductRepository;
import com.karabulut.javapracticespringdockermysql.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public ProductDto save(ProductDto productDto) {
        Product productToSave = mapper.toProduct(productDto);
        Product savedProduct = repository.save(productToSave);
        return mapper.toProductDto(savedProduct);
    }

    @Override
    public ProductDto getById(Long id) {
        var found = repository.findById(id);
        return mapper.toProductDto(found.get());
    }

    @Override
    public List<ProductDto> getAll() {
        var foundList = repository.findAll();
        return mapper.toProductDtoList((List<Product>) foundList);
    }

    @Override
    public boolean delete(Long id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
