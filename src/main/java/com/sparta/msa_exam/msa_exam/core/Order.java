package com.sparta.msa_exam.msa_exam.core;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "orders")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {

    public Order(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "order_id")
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    private List<OrderProduct> productIds = new ArrayList<>();

    public void addProducts(List<OrderProduct> orderProducts) {
        this.productIds.addAll(orderProducts);
    }

    public void addProduct(OrderProduct orderProduct) {
        this.productIds.add(orderProduct);
    }

}
