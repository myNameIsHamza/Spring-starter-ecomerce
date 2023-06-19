package ecomerce.starter.demo.mapper;

import ecomerce.starter.demo.dto.CategoryDTO;
import ecomerce.starter.demo.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",uses = CategoryMapper.class)
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper( CategoryMapper.class );

    CategoryDTO categoryToCategoryDTO(Category category);

    List<CategoryDTO> categoriesToCategoriesDTO(List<Category> categories);


}


