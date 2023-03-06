package com.leela.orderservice.service;

import com.leela.orderservice.dto.TransactionRequest;
import com.leela.orderservice.dto.TransactionResponse;
import com.leela.orderservice.entity.Order;

public interface OrderService {
     TransactionResponse saveOrder(TransactionRequest transaction);

}
