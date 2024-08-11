package com.sparta.msa_exam.msa_exam.product;

import com.sparta.msa_exam.msa_exam.core.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
