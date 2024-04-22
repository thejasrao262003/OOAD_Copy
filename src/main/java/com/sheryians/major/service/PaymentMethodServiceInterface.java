package com.sheryians.major.service;

import com.sheryians.major.model.PaymentMethod;

import java.util.List;
import java.util.Optional;

public interface PaymentMethodServiceInterface {
    List<PaymentMethod> getAllPaymentMethods();
    void addPaymentMethod(PaymentMethod paymentMethod);
    void removePaymentMethodById(int id);
    Optional<PaymentMethod> getPaymentMethodById(int id);
}