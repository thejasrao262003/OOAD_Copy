package com.sheryians.major.service;
import com.sheryians.major.model.UpiDetails;
import com.sheryians.major.repository.UpiDetailsRepository;
import com.sheryians.major.service.UpiPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// UpiPaymentServiceImpl class implementing UpiPaymentService interface
@Service
public class UpiPaymentServiceImpl implements UpiPaymentService {

    @Autowired
    private UpiDetailsRepository upiDetailsRepository;

    @Override
    public String processPayment() {
        return "Charges of using UPI payment is 2% of your entire bill";
    }

    @Override
    public void processUpiPayment(UpiDetails upiDetails) {
        // Logic for processing UPI payment
        // Save UpiDetails to database or integrate with UPI gateway
        upiDetailsRepository.save(upiDetails);
    }
}