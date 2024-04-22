package org.campusmolndal.grupp2ecoeatsab.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    // Metod för att behandla betalningar
    public String processPayment(double amount) {

        return "Betalningen på " + amount + " hanterades framgångsrikt.";
    }
}
//  jag tror at vi kan Implementera logiken för betalningsprocessen
// Till exempel kan vi göra en simulering