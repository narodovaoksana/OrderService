package com.eshop.OrderService.viewLayer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderProductResponse extends OrderProductRequest {

    private Long orderProductId;
}
