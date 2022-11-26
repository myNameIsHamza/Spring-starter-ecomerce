package ecomerce.starter.demo.controller;

import java.util.*;

import ecomerce.starter.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import ecomerce.starter.demo.model.Product;

@RestController
public class ProductController {
    // @GetMapping(value = "/products")//endpoint
    // public ResponseEntity getProducts(){
    // Product product1 = new Product();
    // product1.setName("p1");
    // product1.setPrice(123);
    // Product product2 = new Product();
    // product2.setName("p2");
    // product2.setPrice(123);
    // Product product3 = new Product();
    // product3.setName("p4");
    // product3.setPrice(123);
    // List<Product> products = new ArrayList<>();
    // products.add(product1);
    // products.add(product2);
    // products.add(product3);

    // Map<String,Object> result = new HashMap<>();
    // result.put("status",200);
    // result.put("productData",products);
    // result.put("totalElement",products.size());
    // result.put("method","Get");

    // ResponseEntity response = ResponseEntity.ok(result);

    // return response;
    // }

    @Autowired
    private ProductService productService;

    // Controller -> Service -> Repository
    // Get
    @GetMapping(value = "/products")
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products = productService.getProducts();
        return products;
    }

    // Post (add product)
    @PostMapping(value = "/products")
    public Map<String,Object> addProduct(@RequestBody Product product) {
        Map<String,Object> result = new HashMap<>();
        String message = "";
        Product productResponse = new Product();
        try {
            productResponse = productService.addProduct(product);
            message = "Success";
        } catch (Exception e) {
            message = "There is an error in the service";
        }
        result.put("productData", productResponse);
        result.put("message", message);

        return result;
    }


    //Delete product
    @DeleteMapping(value = "/products")
    public String deleteProduct(@RequestParam String id){
        String message = "";
        try {
            productService.deleteProduct(id);
            message = "Success"; 
        } catch (Exception e) {
            message = "There is an error in the delete methods";
        }

        return message;
    }

    //Update product
    @PutMapping(value = "/products")
    public String updateProduct(@RequestBody Product product){
        String message = "";
        try {
            productService.updateProduct(product);
            message = "success";
        } catch (Exception e) {
            // TODO: handle exception
            message = "There is an error in updateProduct controller";
        }
        return message;
    }

}
