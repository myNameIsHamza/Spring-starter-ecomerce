package ecomerce.starter.demo.controller;

import java.util.*;

import ecomerce.starter.demo.dto.ProductDTO;
import ecomerce.starter.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import ecomerce.starter.demo.model.Product;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // Controller -> Service -> Repository
    // Get
    @GetMapping(value = "/products")
    public ResponseEntity<List<ProductDTO>> getProducts() {
        return ResponseEntity.ok().body(productService.getProducts());
    }

    // Post (add product)
    @PostMapping(value = "/products")
    public ResponseEntity<ProductDTO> addProduct(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(product));
    }


    //Delete product
    @DeleteMapping(value = "/products")
    public ResponseEntity<String> deleteProduct(@RequestParam String id){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.deleteProduct(id));
    }

    //Update product
    @PutMapping(value = "/products")
    public ResponseEntity<ProductDTO> updateProduct(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.updateProduct(product));
    }

}
