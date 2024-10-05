package com.eshop.OrderService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class OrderProductService {
    private final OrderProductRepository orderProductRepository;

    public void createProductToOrder(OrderProductRequest productRequest) {
        try {
            OrderProduct product = OrderProduct.builder()
                    .orderId(productRequest.orderId())
                    .productId(productRequest.productId())
                    .quantity(productRequest.quantity())
                    .build();
            orderProductRepository.save(product);
            log.info("Product {} is saved", product.getOrderProductId());
        } catch (Exception e) {
            log.error("Failed to save product: ", e);
        }
    }
}
