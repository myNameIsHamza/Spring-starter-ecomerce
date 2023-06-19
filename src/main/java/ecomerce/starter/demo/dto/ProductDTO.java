package ecomerce.starter.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String detail;
    private String name;
    private double price;
    private List<CategoryDTO> categories;
}
