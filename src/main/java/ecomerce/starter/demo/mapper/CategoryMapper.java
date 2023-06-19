package ecomerce.starter.demo.mapper;

import ecomerce.starter.demo.dto.CategoryDTO;
import ecomerce.starter.demo.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper( CategoryMapper.class );

    CategoryDTO categoryToCategoryDTO(Category category);

}


