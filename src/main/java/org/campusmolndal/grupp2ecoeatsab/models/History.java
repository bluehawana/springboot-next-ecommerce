package org.campusmolndal.grupp2ecoeatsab.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historik") // Namnet på tabellen i databasen
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Id för historiken

    private LocalDateTime tidpunkt; // Tidpunkten för historiken

    private String händelse; // Beskrivning av händelsen

    // Konstruktorer, getters och setters

    public History() {
    }

    public History(LocalDateTime tidpunkt, String händelse) {
        this.tidpunkt = tidpunkt;
        this.händelse = händelse;
    }

    // getters och setters
    // toString, equals och hashCode metoder
}
