package com.eshop.OrderService.repository;

import com.eshop.OrderService.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderProductRepository extends CrudRepository<OrderProduct, Long> {

    List<OrderProduct> findAll();
}


