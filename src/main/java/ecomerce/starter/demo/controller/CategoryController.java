package ecomerce.starter.demo.controller;

import ecomerce.starter.demo.dto.CategoryDTO;
import ecomerce.starter.demo.model.Category;
import ecomerce.starter.demo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.*;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    // Get Category
    @GetMapping (value = "/categories")

     public ResponseEntity<List<CategoryDTO>> getCategories(){
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.getCategories());
     }

    // Post (add Category)
    @PostMapping(value = "/categories")
    public ResponseEntity<CategoryDTO> addCategory(@RequestBody Category category) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.addCategory(category));
    }

    //Delete category
    @DeleteMapping(value = "/categories")
    public ResponseEntity<String> deleteCategory(@RequestParam String id){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.deleteCategory(id));
    }

    //Update category
    @PutMapping(value = "/categories")
    public ResponseEntity<CategoryDTO> updateCategory(@RequestBody Category category){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.updateCategory(category));
    }
}