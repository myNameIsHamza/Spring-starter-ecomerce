package ecomerce.starter.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CategoryDTO {
    private Long id;
    private String name;
    private Long parentCategoryId;
}
