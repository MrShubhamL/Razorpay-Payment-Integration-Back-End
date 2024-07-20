package com.payment.models;

import lombok.Data;

@Data
public class Order {
    private String fullname;
    private String contact;
    private String email;
    private Double amount;
}
