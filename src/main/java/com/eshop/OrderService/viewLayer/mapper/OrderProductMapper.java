package com.eshop.OrderService.viewLayer.mapper;

import com.eshop.OrderService.entity.OrderProduct;
import com.eshop.OrderService.viewLayer.dto.OrderProductRequest;
import com.eshop.OrderService.viewLayer.dto.OrderProductResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderProductMapper extends BaseMapper<OrderProduct, OrderProductResponse> {

    OrderProduct toEntity(OrderProductRequest orderProductRequest);
}
