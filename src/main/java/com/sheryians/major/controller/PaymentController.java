package com.sheryians.major.controller;

import com.sheryians.major.model.DebitCardDetails;
import com.sheryians.major.model.UpiDetails;
import com.sheryians.major.service.DebitCardPaymentServiceImpl;
import com.sheryians.major.service.UpiPaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PaymentController {

    @Autowired
    private UpiPaymentServiceImpl upiPaymentService;

    @Autowired
    private DebitCardPaymentServiceImpl debitCardPaymentService;

    @GetMapping("/paybyupi")
    public String showUpiPaymentForm(Model model) {
        model.addAttribute("upiDetails", new UpiDetails());
        return "upi_payment_form";
    }

    @PostMapping("/processupipayment")
    public String processUpiPayment(@ModelAttribute UpiDetails upiDetails, RedirectAttributes redirectAttributes) {
        // Process UPI payment using UpiPaymentServiceImpl
        upiPaymentService.processUpiPayment(upiDetails);
        redirectAttributes.addFlashAttribute("method", "upi");
        return "redirect:/payment/success";
    }

    @GetMapping("/paybydebitcard")
    public String showDebitCardPaymentForm(Model model) {
        model.addAttribute("debitCardDetails", new DebitCardDetails());
        return "debit_card_payment_form";
    }

    @PostMapping("/processdebitcardpayment")
    public String processDebitCardPayment(@ModelAttribute DebitCardDetails debitCardDetails, RedirectAttributes redirectAttributes) {
        debitCardPaymentService.processDebitCardPayment(debitCardDetails);
        redirectAttributes.addFlashAttribute("method", "debitcard");
        return "redirect:/payment/success";
    }

    @GetMapping("/payment/success")
    public String showPaymentSuccessPage(@ModelAttribute("method") String method, Model model) {
        String processPaymentMessage;
        if ("upi".equals(method)) {
            processPaymentMessage = upiPaymentService.processPayment();
        } else if ("debitcard".equals(method)) {
            processPaymentMessage = debitCardPaymentService.processPayment();
        } else {
            processPaymentMessage = "Invalid payment method";
        }
        model.addAttribute("processPaymentMessage", processPaymentMessage);
        return "payment_success";
    }
}
