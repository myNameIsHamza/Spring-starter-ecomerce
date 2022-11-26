package ecomerce.starter.demo.service;

import ecomerce.starter.demo.model.Product;
import ecomerce.starter.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    //Get product
    public List<Product> getProducts(){
        List<Product> products = new ArrayList<>();
        products = productRepository.findAll();
       return products;
    }

    //Add product
    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    //Delete
    public void deleteProduct(String id){
        productRepository.deleteById(Long.parseLong(id));
    }

    //Update 
    public void updateProduct(Product product){
        productRepository.save(product);
    }
    
}