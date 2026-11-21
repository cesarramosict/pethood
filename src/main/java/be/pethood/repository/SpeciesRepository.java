package be.pethood.repository;

import be.pethood.model.Species;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Accès aux données de la table "species".
 * @author J. Ramos do Carmo
 */
public interface SpeciesRepository extends CrudRepository<Species, Long> {

    // Trouver une espèce par son code (ex. "dog")
    Species findByCode(String code);

    // Toutes les espèces actives
    List<Species> findByActiveTrue();
}