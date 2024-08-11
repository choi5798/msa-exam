package com.sparta.msa_exam.msa_exam.order;

import com.sparta.msa_exam.msa_exam.core.Order;
import com.sparta.msa_exam.msa_exam.core.OrderProduct;
import com.sparta.msa_exam.msa_exam.product.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    private final OrderProductRepository orderProductRepository;

    private final ProductService productService;

    public OrderService(OrderRepository orderRepository, OrderProductRepository orderProductRepository, ProductService productService, ProductService productService1) {
        this.orderRepository = orderRepository;
        this.orderProductRepository = orderProductRepository;
        this.productService = productService1;
    }

    @Transactional
    public void createOrder(String name, List<Long> productIds) {
        Order savedOrder = orderRepository.save(new Order(name));

        List<OrderProduct> orderProducts = new ArrayList<>();
        for (Long productId : productIds) {
            OrderProduct orderProduct = new OrderProduct(savedOrder, productId);
            orderProducts.add(orderProduct);
        }
        List<OrderProduct> products = orderProductRepository.saveAll(orderProducts);
        savedOrder.addProducts(products);
    }

    public Order getOrder(Long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new IllegalArgumentException("해당 주문이 존재하지 않습니다."));
    }

    @Transactional
    public void addOrder(Long orderId, Long productId) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new IllegalArgumentException("해당 주문이 존재하지 않습니다."));

        if (!productService.containsById(productId)) {
            throw new IllegalArgumentException("해당 상품이 존재하지 않습니다.");
        }

        OrderProduct orderProduct = new OrderProduct(order, productId);
        order.addProduct(orderProduct);
        orderProductRepository.save(orderProduct);
    }

}
