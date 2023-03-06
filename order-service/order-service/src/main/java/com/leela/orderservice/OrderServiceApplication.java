package com.leela.orderservice;

import com.leela.orderservice.dto.Payment;
import com.leela.orderservice.dto.TransactionResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Bean
	public Payment payment(){
		return new Payment();
	}

	@Bean
	public TransactionResponse transactionResponse(){
		return new TransactionResponse();
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}