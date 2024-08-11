package com.sparta.msa_exam.msa_exam.order;

import com.sparta.msa_exam.msa_exam.core.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {

    Optional<OrderProduct> findByProductId(Long productId);
}
