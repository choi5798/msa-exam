package com.sparta.msa_exam.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public void createOrder(@RequestBody CreateOrderRequest request) {
        orderService.createOrder(request.name(), request.productIds());
    }

    @PutMapping("/{orderId}")
    public void addProduct(@PathVariable("orderId") Long orderId, @RequestBody AddOrderProductRequest request) {
        orderService.addOrder(orderId, request.productId());
    }

    @GetMapping("/{orderId}")
    public OrderResponse getOrder(@PathVariable("orderId") Long orderId) {
        Order order = orderService.getOrder(orderId);
        List<Long> productIds = order.getProductIds().stream()
                .map(OrderProduct::getProductId)
                .toList();
        return new OrderResponse(order.getId(), productIds);
    }

}
