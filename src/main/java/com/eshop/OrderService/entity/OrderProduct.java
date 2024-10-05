package com.eshop.OrderService.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "t_order_products")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderProduct implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_product_id")
    private Long orderProductId;

    @Column(name = "order_id")
    private Long orderId; // Зовнішній ключ на замовлення

    @Column(name = "product_id")
    private Integer productId; // Ідентифікатор продукту

    @Column(name = "quantity")
    private Integer quantity; // Кількість продукту в замовленні

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderProduct that)) return false;
        return Objects.equals(getOrderProductId(), that.getOrderProductId()) && Objects.equals(getQuantity(), that.getQuantity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderProductId(), getQuantity());
    }
}
