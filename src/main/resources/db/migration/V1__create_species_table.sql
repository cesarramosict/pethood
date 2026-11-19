-- Table des espèces d'animaux (chien, chat...), avec le nom en 3 langues
CREATE TABLE species (
    id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    code    VARCHAR(30)  NOT NULL UNIQUE,
    name_fr VARCHAR(60)  NOT NULL,
    name_nl VARCHAR(60)  NOT NULL,
    name_en VARCHAR(60)  NOT NULL,
    active  BOOLEAN      NOT NULL DEFAULT TRUE
);