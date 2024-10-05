package com.eshop.OrderService.service;

import com.eshop.OrderService.entity.OrderProduct;
import com.eshop.OrderService.viewLayer.dto.OrderProductRequest;
import com.eshop.OrderService.viewLayer.dto.OrderProductResponse;

import java.util.List;

public interface OrderProductService {

    OrderProduct createProductToOrder(OrderProductRequest productRequest);

    List<OrderProductResponse> getAllProducts();

    OrderProductResponse getById(long id);

    void deleteById(long id);

    void updateOrder(OrderProductRequest orderProductRequest);
}
