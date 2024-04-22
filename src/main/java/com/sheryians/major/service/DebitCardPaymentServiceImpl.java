package com.sheryians.major.service;
import com.sheryians.major.model.DebitCardDetails;
import com.sheryians.major.repository.DebitCardDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DebitCardPaymentServiceImpl implements DebitCardPaymentService {

    @Autowired
    private DebitCardDetailsRepository debitCardDetailsRepository;

    @Override
    public String processPayment() {
        return "The charges of using Debit Card Payment is 3.5%";
    }

    @Override
    public void processDebitCardPayment(DebitCardDetails debitCardDetails) {
        debitCardDetailsRepository.save(debitCardDetails);
    }
}
