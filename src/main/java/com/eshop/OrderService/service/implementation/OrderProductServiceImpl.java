package com.eshop.OrderService.service.implementation;

import com.eshop.OrderService.entity.OrderProduct;
import com.eshop.OrderService.repository.OrderProductRepository;
import com.eshop.OrderService.service.OrderProductService;
import com.eshop.OrderService.viewLayer.dto.OrderProductRequest;
import com.eshop.OrderService.viewLayer.dto.OrderProductResponse;
import com.eshop.OrderService.viewLayer.mapper.OrderProductMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class OrderProductServiceImpl implements OrderProductService {

    private final OrderProductRepository orderProductRepository;

    private final OrderProductMapper orderProductMapper;

    @Override
    public OrderProduct createProductToOrder(OrderProductRequest productRequest) {

        OrderProduct orderProduct = orderProductMapper.toEntity(productRequest);

        return orderProductRepository.save(orderProduct);
    }

    @Override
    public List<OrderProductResponse> getAllProducts() {
        List<OrderProduct> orderProducts = orderProductRepository.findAll();

        return orderProducts.stream()
                .map(orderProduct -> {
                    OrderProductResponse orderProductResponse = orderProductMapper.toDto(orderProduct);

                    return orderProductResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public OrderProductResponse getById(long id) {
        OrderProduct orderProduct = orderProductRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No order with this id"));

        return orderProductMapper.toDto(orderProduct);
    }

    @Override
    public void deleteById(long id) {
        OrderProduct orderProduct = orderProductRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No order with this id"));

        orderProductRepository.deleteById(id);
    }

    @Override
    public void updateOrder(OrderProductRequest orderProductRequest) {
        OrderProduct orderProduct = orderProductRepository.findById(orderProductRequest.getOrderId())
                .orElseThrow(()-> new EntityNotFoundException("Np order"));

        if (orderProductRequest.getProductId() != null) {
            orderProduct.setProductId(orderProductRequest.getProductId());
        }

        if (orderProductRequest.getQuantity() != null) {
            orderProduct.setQuantity(orderProductRequest.getQuantity());
        }

        orderProductRepository.save(orderProduct);
    }
}
