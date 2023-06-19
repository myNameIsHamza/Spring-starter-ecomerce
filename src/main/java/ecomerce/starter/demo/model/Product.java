package ecomerce.starter.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private Long id;

    private String detail;
    private String name;
    private double price;

    @ManyToMany(mappedBy = "products")
    List<Category> categories;

}
