package com.eshop.OrderService.viewLayer.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderProductRequest {

//    Можеш додати валідаційні анотації вони в пакеті jakarta.validation.constraints та їхній перелік
    private Long orderId;
    private Integer productId;
    private Integer quantity;

}
