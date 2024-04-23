package org.campusmolndal.grupp2ecoeatsab.controllers;

import org.campusmolndal.grupp2ecoeatsab.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // Metod för att behandla betalning
    @PostMapping("/process")
    public ResponseEntity<String> processPayment(@RequestBody double amount) {
        String result = paymentService.processPayment(amount);
        return ResponseEntity.ok(result);
    }
}
