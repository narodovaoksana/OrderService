package com.eshop.OrderService.api;

import com.eshop.OrderService.service.OrderProductService;
import com.eshop.OrderService.viewLayer.dto.OrderProductRequest;
import com.eshop.OrderService.viewLayer.dto.OrderProductResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-products")
@RequiredArgsConstructor
@Validated
public class OrderProductController {

    private final OrderProductService orderProductService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addProductToOrder(@Valid @RequestBody OrderProductRequest orderProductRequest) {
        orderProductService.createProductToOrder(orderProductRequest);
        return "Product Added to Order Successfully";
    }

    @GetMapping("/get-all")
    public List<OrderProductResponse> getAllOrders() {
        return orderProductService.getAllProducts();
    }

    @GetMapping("/get")
    public OrderProductResponse getById(@RequestParam long id) {
        return orderProductService.getById(id);
    }

    @DeleteMapping("/delete")
    public String deleteById(@RequestParam long id) {
        orderProductService.deleteById(id);

        return "Successfully deleted";
    }

    @PatchMapping("/update")
    public String update(@Valid @RequestBody OrderProductRequest orderProductRequest) {
        orderProductService.updateOrder(orderProductRequest);

        return "Successfully updated";
    }
}
