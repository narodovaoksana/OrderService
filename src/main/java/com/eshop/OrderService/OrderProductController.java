package com.eshop.OrderService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order-products")
@RequiredArgsConstructor
public class OrderProductController {
    private final OrderProductService orderProductService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addProductToOrder(@RequestBody OrderProductRequest orderProductRequest) {
        orderProductService.createProductToOrder(orderProductRequest);
        return "Product Added to Order Successfully";
    }
}
