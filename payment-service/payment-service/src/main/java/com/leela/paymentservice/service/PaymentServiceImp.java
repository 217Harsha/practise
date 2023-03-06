package com.leela.paymentservice.service;

import com.leela.paymentservice.entity.Payment;
import com.leela.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentServiceImp implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment doPayment(Payment payment) {
        payment.setPaymentStatus(paymentProcesing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }

    @Override
    public String paymentProcesing() {
        //api should be 3rd party payment gate
        return new Random().nextBoolean()?"success":"false";
    }


}
