package com.sheryians.major.service;

import com.sheryians.major.model.DebitCardDetails;

public interface DebitCardPaymentService extends PaymentService {
    void processDebitCardPayment(DebitCardDetails debitCardDetails);
}