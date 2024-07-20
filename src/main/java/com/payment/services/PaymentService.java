package com.payment.services;

import com.payment.models.TransactionDetails;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    TransactionDetails createTransaction(Double amount);
}
