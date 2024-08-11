package com.sparta.msa_exam.product;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record CreateProductRequest(
        String name,
        Integer supplyPrice
) {

    public Product toEntity() {
        return new Product(name, supplyPrice);
    }

}
