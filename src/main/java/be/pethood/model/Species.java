package be.pethood.model;

import jakarta.persistence.*;

/**
 * Espèce d'animal (chien, chat...), avec le nom en 3 langues.
 * Correspond à la table "species".
 * @author J. Ramos do Carmo
 */
@Entity
@Table(name = "species")
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String nameFr;
    private String nameNl;
    private String nameEn;
    private boolean active = true;

    // Constructeur vide : utilisé par JPA et par le formulaire
    public Species() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public String getNameNl() {
        return nameNl;
    }

    public void setNameNl(String nameNl) {
        this.nameNl = nameNl;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}