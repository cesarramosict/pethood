package be.pethood.controller;

import be.pethood.model.Species;
import be.pethood.service.SpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Contrôleur des espèces : affiche les pages liées aux espèces.
 *
 * @author J. Ramos do Carmo
 */
@Controller
public class SpeciesController {

    // Spring injecte automatiquement le service
    @Autowired
    private SpeciesService service;

    /**
     * Affiche la liste des espèces.
     */
    @GetMapping("/species")
    public String index(Model model) {
        List<Species> species = service.getAllSpecies();

        // Données envoyées à la vue
        model.addAttribute("species", species);
        model.addAttribute("title", "Liste des espèces");

        // Nom du template : templates/species/index.html
        return "species/index";
    }
}