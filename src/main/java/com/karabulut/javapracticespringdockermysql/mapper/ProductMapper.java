package com.karabulut.javapracticespringdockermysql.mapper;

import com.karabulut.javapracticespringdockermysql.dto.ProductDto;
import com.karabulut.javapracticespringdockermysql.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toProduct(ProductDto productDto);
    ProductDto toProductDto(Product product);
    List<ProductDto> toProductDtoList(List<Product> state);
}
