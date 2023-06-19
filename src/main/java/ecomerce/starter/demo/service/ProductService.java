package ecomerce.starter.demo.service;

import ecomerce.starter.demo.dto.ProductDTO;
import ecomerce.starter.demo.mapper.ProductMapper;
import ecomerce.starter.demo.model.Product;
import ecomerce.starter.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    //Get product
    public List<ProductDTO> getProducts(){
        return productMapper.productsToProductDTOs(productRepository.findAll());
    }

    //Add product
    public ProductDTO addProduct(Product product){
        return productMapper.productToProductDTO(productRepository.save(product));
    }

    //Delete
    public String deleteProduct(String id){
        try {
            productRepository.deleteById(Long.parseLong(id));
            return "Deleted Successfully";
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    //Update 
    public ProductDTO updateProduct(Product product){
        return productMapper.productToProductDTO(productRepository.save(product));
    }
    
}