package be.pethood.service;

import be.pethood.model.Species;
import be.pethood.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service des espèces : fait le lien entre les contrôleurs et le repository.
 *
 * @author J. Ramos do Carmo
 */
@Service
public class SpeciesService {

    // Spring injecte automatiquement le repository
    @Autowired
    private SpeciesRepository repository;

    /**
     * Retourne toutes les espèces de la base de données.
     */
    public List<Species> getAllSpecies() {
        List<Species> species = new ArrayList<>();
        repository.findAll().forEach(species::add);
        return species;
    }

    /**
     * Retourne seulement les espèces actives.
     */
    public List<Species> getActiveSpecies() {
        return repository.findByActiveTrue();
    }
    /**
     * Retourne une espèce à partir de son id, ou null si elle n'existe pas.
     */
    public Species getSpecies(Long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Enregistre une nouvelle espèce dans la base de données.
     */
    public void addSpecies(Species species) {
        repository.save(species);
    }
}