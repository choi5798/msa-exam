package com.sparta.msa_exam.msa_exam.order;

import com.sparta.msa_exam.msa_exam.core.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
