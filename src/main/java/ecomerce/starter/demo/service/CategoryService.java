package ecomerce.starter.demo.service;

import ecomerce.starter.demo.dto.CategoryDTO;
import ecomerce.starter.demo.mapper.CategoryMapper;
import ecomerce.starter.demo.model.Category;
import ecomerce.starter.demo.model.Product;
import ecomerce.starter.demo.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;


    //Get Category
    public List<CategoryDTO> getCategories(){
        return categoryMapper.categoriesToCategoriesDTO(categoryRepository.findAll());
    }

    //Add
    public CategoryDTO addCategory(Category category) {return categoryMapper.categoryToCategoryDTO(categoryRepository.save(category));}

    //Delete
    public String deleteCategory(String id){
        try {
            categoryRepository.deleteById(Long.parseLong(id));
            return "Deleted Successfully";
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    //Update
    public CategoryDTO updateCategory(Category category){return categoryMapper.categoryToCategoryDTO(categoryRepository.save(category));}

}
