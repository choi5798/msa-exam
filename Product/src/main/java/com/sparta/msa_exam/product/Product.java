package com.sparta.msa_exam.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue
    private Long id;

    private String name;

    private Integer supplyPrice;

    public Product(String name, Integer supplyPrice) {
        this.name = name;
        this.supplyPrice = supplyPrice;
    }

}
