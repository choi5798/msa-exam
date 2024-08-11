package com.sparta.msa_exam.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
=======

>>>>>>> a6ea2fd (feat: 멀티 모듈 구성)
=======
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
>>>>>>> 31ffbe2 (feat: 상품 추가, 조회, 주문 추가 전환)
@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

}
