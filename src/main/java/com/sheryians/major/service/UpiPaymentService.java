package com.sheryians.major.service;

import com.sheryians.major.model.UpiDetails;

public interface UpiPaymentService extends PaymentService {
    void processUpiPayment(UpiDetails upiDetails);
}