package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public void checkAmount(String OrderId, String amount){

        boolean matched = true;

        if(!matched) throw new RuntimeException("결제 금액이 일치하지 않습니다");
    }

    public void setPaymentComplete(String orderId) {
    }
}
