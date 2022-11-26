package ecomerce.starter.demo.controller;

import java.util.*;

import ecomerce.starter.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping(value = "/products")
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products = productService.getProducts();
        return products;
    }

}
