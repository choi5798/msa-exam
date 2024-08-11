package com.sparta.msa_exam.product;

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
        this(product.getId(), product.getName(), product.getSupplyPrice());
    }

}
