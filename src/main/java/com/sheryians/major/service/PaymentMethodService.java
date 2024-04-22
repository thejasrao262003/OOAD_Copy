package com.sheryians.major.service;
import com.sheryians.major.model.PaymentMethod;
import com.sheryians.major.repository.PaymentMethodRepository;
import com.sheryians.major.service.PaymentMethodServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentMethodService implements PaymentMethodServiceInterface {

    private final PaymentMethodRepository paymentMethodRepository;

    @Autowired
    public PaymentMethodService(PaymentMethodRepository paymentMethodRepository) {
        this.paymentMethodRepository = paymentMethodRepository;
    }

    @Override
    public List<PaymentMethod> getAllPaymentMethods() {
        return paymentMethodRepository.findAll();
    }

    @Override
    public void addPaymentMethod(PaymentMethod paymentMethod) {
        paymentMethodRepository.save(paymentMethod);
    }

    @Override
    public void removePaymentMethodById(int id) {
        paymentMethodRepository.deleteById(id);
    }

    @Override
    public Optional<PaymentMethod> getPaymentMethodById(int id) {
        return paymentMethodRepository.findById(id);
    }
}