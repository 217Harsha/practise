package com.leela.orderservice.controller;

import com.leela.orderservice.dto.Payment;
import com.leela.orderservice.dto.TransactionRequest;
import com.leela.orderservice.dto.TransactionResponse;
import com.leela.orderservice.entity.Order;
import com.leela.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest transaction){
        return orderService.saveOrder(transaction);
    }
}
