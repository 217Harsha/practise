package com.leela.orderservice.service;

import com.leela.orderservice.dto.Payment;
import com.leela.orderservice.dto.TransactionRequest;
import com.leela.orderservice.dto.TransactionResponse;
import com.leela.orderservice.entity.Order;
import com.leela.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImp implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private Payment payment;

    @Autowired
    private TransactionResponse transactionResponse;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public TransactionResponse saveOrder(TransactionRequest transaction) {
        Order order = transaction.getOrder();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());
        Payment paymentResponse = restTemplate.postForObject("http://localhost:9191/payment/doPayment",payment, Payment.class);
        if(paymentResponse.getPaymentStatus().equals("success")){
            transactionResponse.setMessage("payment processing successful and order placed");
            order = orderRepository.save(order);
        }else{
            transactionResponse.setMessage("payment failed - moved your item to the cart");
        }
        transactionResponse.setOrder(order);
        transactionResponse.setPayment(paymentResponse);
        return transactionResponse;
    }


}
