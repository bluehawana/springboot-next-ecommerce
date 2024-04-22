package org.campusmolndal.grupp2ecoeatsab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("org.campusmolndal.grupp2ecoeatsab.models")
public class Grupp2EcoEatsAbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Grupp2EcoEatsAbApplication.class, args);
	}
}
