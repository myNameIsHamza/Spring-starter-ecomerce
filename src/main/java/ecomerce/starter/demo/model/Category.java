package ecomerce.starter.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    private Long parentCategoryId;
    @ManyToMany
    @JoinTable(  name = "category_product",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products = new ArrayList<>();

}
