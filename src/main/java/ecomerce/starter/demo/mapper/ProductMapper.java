package ecomerce.starter.demo.mapper;

import ecomerce.starter.demo.dto.ProductDTO;
import ecomerce.starter.demo.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper( ProductMapper.class );

    ProductDTO productToProductDTO(Product product);
}
