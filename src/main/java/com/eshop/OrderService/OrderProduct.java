package com.eshop.OrderService;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_order_products")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderProductId;
    @Column
    private Long orderId; // Зовнішній ключ на замовлення
    @Column
    private Integer productId; // Ідентифікатор продукту
    @Column
    private Integer quantity; // Кількість продукту в замовленні
}
