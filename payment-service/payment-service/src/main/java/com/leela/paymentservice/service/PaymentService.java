package com.leela.paymentservice.service;

import com.leela.paymentservice.entity.Payment;

public interface PaymentService {

    public Payment doPayment(Payment payment);

    public String paymentProcesing();

}
