package ecomerce.starter.demo.service;

import ecomerce.starter.demo.model.Category;
import ecomerce.starter.demo.model.Product;
import ecomerce.starter.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    //Get Category
    public List<Category> getCategories(){
        List<Category> categories = new ArrayList<>();
        categories = categoryRepository.findAll();
        return categories;
    }

    //Add
    public Category addCategory(Category category) {return categoryRepository.save(category);}

    //Delete
    public void deleteCategory(String id){
        categoryRepository.deleteById(Long.parseLong(id));
    }

    //Update
    public void updateCategory(Category category){categoryRepository.save(category);}

}
