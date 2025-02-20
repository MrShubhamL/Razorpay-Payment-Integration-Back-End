package com.payment.models;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class TransactionDetails {
    private String orderID;
    private String currency;
    private Integer amount;
    private String key;
}
