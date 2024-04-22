package org.campusmolndal.grupp2ecoeatsab.services;

import org.springframework.stereotype.Service;

@Service
public class SupportService {

    // Metod för att hantera kundsupport och FAQ
    public String getSupportResponse(String query) {

        return "Tack för din förfrågan. Vi återkommer snart med svar på din fråga.";
    }
}
// Här kan vi lägga till logik för att hantera frågor och generera svar
// Till exempel kan vi ha en databas med vanliga frågor och svar
// och söka efter matchningar baserat på den mottagna frågan.