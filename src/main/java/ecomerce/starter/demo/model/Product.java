package ecomerce.starter.demo.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productId", nullable = false)
    private Long id;

    private String detail;
    private String name;
    private double price;

}
