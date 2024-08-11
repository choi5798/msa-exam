package com.sparta.msa_exam.msa_exam.core;

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
    @GeneratedValue
    private Long productId;

    private String name;

    private Integer supplyPrice;

    public Product(String name, Integer supplyPrice) {
        this.name = name;
        this.supplyPrice = supplyPrice;
    }

}
