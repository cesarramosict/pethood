package be.pethood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Point d'entrée de l'application PetHood.
 * Démarre le serveur web et la configuration Spring Boot.
 * @author J. Ramos do Carmo
 */
@SpringBootApplication
public class PethoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(PethoodApplication.class, args);
	}

}
