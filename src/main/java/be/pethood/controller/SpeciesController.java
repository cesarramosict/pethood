package be.pethood.controller;

import be.pethood.model.Species;
import be.pethood.service.SpeciesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    /**
     * Affiche le détail d'une espèce.
     */
    @GetMapping("/species/{id}")
    public String show(@PathVariable Long id, Model model) {
        Species species = service.getSpecies(id);

        // Données envoyées à la vue
        model.addAttribute("species", species);
        model.addAttribute("title", "Fiche d'une espèce");

        return "species/show";
    }
    /**
     * Affiche le formulaire de création d'une espèce.
     */
    @GetMapping("/species/create")
    public String create(Model model) {
        // Objet vide que le formulaire va remplir
        model.addAttribute("species", new Species());
        model.addAttribute("title", "Ajouter une espèce");

        return "species/create";
    }
    /**
     * Enregistre l'espèce envoyée par le formulaire.
     */
    @PostMapping("/species/create")
    public String store(@Valid @ModelAttribute("species") Species species,
                        BindingResult bindingResult, Model model) {
        // S'il y a des erreurs, on réaffiche le formulaire avec les messages
        if (bindingResult.hasErrors()) {
            model.addAttribute("title", "Ajouter une espèce");
            return "species/create";
        }

        service.addSpecies(species);

        // Retour à la liste après l'enregistrement
        return "redirect:/species";
    }

}