package ecomerce.starter.demo.model;

import jakarta.persistence.*;
import lombok.Data;



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

}
