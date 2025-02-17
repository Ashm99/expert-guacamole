package com.productcatalogsystem.productcatalogsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductDTO {
    private String name;
    private Long price;
    private String category;
}
