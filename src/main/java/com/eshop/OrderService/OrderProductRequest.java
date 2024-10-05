package com.eshop.OrderService;

public record OrderProductRequest(Long orderId, Integer productId, Integer quantity) {
}


