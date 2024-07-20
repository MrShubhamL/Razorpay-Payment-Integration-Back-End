package com.payment.controller;

import com.payment.models.Order;
import com.payment.models.TransactionDetails;
import com.payment.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/placeOrder")
    public TransactionDetails placeOrder(@RequestBody Order order){
        System.out.println(order);
        return paymentService.createTransaction(order.getAmount());
    }

    @GetMapping("/createTransaction/{amount}")
    public TransactionDetails createTransaction(@PathVariable("amount")  Double amount){
        return paymentService.createTransaction(amount);
    }

}

