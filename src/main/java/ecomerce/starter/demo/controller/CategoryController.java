package ecomerce.starter.demo.controller;

import ecomerce.starter.demo.model.Category;
import ecomerce.starter.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.*;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    // Get Category
    @GetMapping (value = "/categories")

     public List<Category> getCategories(){
     List<Category> categories = new ArrayList<>();
     categories = categoryService.getCategories();
     return categories;
     }

    // Post (add Category)
    @PostMapping(value = "/categories")
    public Map<String,Object> addCategory(@RequestBody Category category) {
        Map<String,Object> result = new HashMap<>();
        String message = "";
        Category categoryResponse = new Category();
        try {
            categoryResponse = categoryService.addCategory(category);
            message = "Success";
        } catch (Exception e) {
            message = "There is an error in the service";
        }
        result.put("categoryData", categoryResponse);
        result.put("message", message);

        return result;
        }

    //Delete category
    @DeleteMapping(value = "/categories")
    public String deleteCategory(@RequestParam String id){
        String message = "";
        try {
            categoryService.deleteCategory(id);
            message = "Success";
        } catch (Exception e) {
            message = "There is an error in the delete methods";
        }

        return message;
    }

    //Update category
    @PutMapping(value = "/categories")
    public String updateCategory(@RequestBody Category category){
        String message = "";
        try {
            categoryService.updateCategory(category);
            message = "success";
        } catch (Exception e) {
            message = "There is an error in updateCategory controller";
        }
        return message;
    }
}