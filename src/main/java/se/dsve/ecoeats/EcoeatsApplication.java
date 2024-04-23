package se.dsve.ecoeats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"se.dsve.ecoeats.models", "se.dsve.ecoeats.controllers", "se.dsve.ecoeats.repositories", "se.dsve.ecoeats.services"})
 class EcoeatsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcoeatsApplication.class, args);
    }
}