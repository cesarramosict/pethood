package be.pethood;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Page d'accueil de PetHood.
 * @author J. Ramos do Carmo
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Bienvenue sur PetHood !";
    }
}