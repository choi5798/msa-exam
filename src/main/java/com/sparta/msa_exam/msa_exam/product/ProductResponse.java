package com.sparta.msa_exam.msa_exam.product;

import com.sparta.msa_exam.msa_exam.core.Product;

public record ProductResponse(
        Long productId,
        String name,
        Integer supplyPrice
) {

    public ProductResponse(Long productId, String name, Integer supplyPrice) {
        this.productId = productId;
        this.name = name;
        this.supplyPrice = supplyPrice;
    }

    public ProductResponse(Product product) {
        this(product.getProductId(), product.getName(), product.getSupplyPrice());
    }

}
