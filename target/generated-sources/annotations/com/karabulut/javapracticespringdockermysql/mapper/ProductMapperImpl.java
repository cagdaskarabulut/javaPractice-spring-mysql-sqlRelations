package com.karabulut.javapracticespringdockermysql.mapper;

import com.karabulut.javapracticespringdockermysql.dto.ProductDto;
import com.karabulut.javapracticespringdockermysql.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-08T23:14:47+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toProduct(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setMake( productDto.getMake() );
        product.setModel( productDto.getModel() );

        return product;
    }

    @Override
    public ProductDto toProductDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setMake( product.getMake() );
        productDto.setModel( product.getModel() );

        return productDto;
    }

    @Override
    public List<ProductDto> toProductDtoList(List<Product> state) {
        if ( state == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( state.size() );
        for ( Product product : state ) {
            list.add( toProductDto( product ) );
        }

        return list;
    }
}
