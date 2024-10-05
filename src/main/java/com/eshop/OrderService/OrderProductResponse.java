package com.eshop.OrderService;

public record OrderProductResponse(Long orderProductId, Long orderId, Integer productId, Integer quantity) {
}
