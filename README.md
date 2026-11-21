<h1 align="center">PetHood</h1>

<p align="center"><i>Le réseau des voisins à quatre pattes</i></p>



<p align="center">
  <b>Application web de garde d'animaux entre voisins, à Bruxelles.</b><br>
  Travail de fin d'études - Bachelier en informatique (développement d'applications) - ICC Bruxelles - 2026-2027
</p>



```bash
git clone https://github.com/cesarramosict/pethood.git
cd pethood
./mvnw spring-boot:run
```

Sous Windows : `mvnw.cmd spring-boot:run`.

Ouvrir ensuite [http://localhost:8080](http://localhost:8080).

---

##  Structure du projet

```
src/main/java/be/pethood
├── PethoodApplication.java     point d'entrée
├── HomeController.java         page d'accueil
├── model/                      entités JPA (Species...)
├── repository/                 accès aux données
└── service/                    règles métier

src/main/resources
├── application.properties      configuration
└── db/migration/               scripts Flyway (V1, V2, V3...)
```

---

##  Conventions

- Messages de commit en **anglais**.
- Commentaires du code et Javadoc en **français**.
- Un script Flyway déjà exécuté n'est jamais modifié : chaque changement crée un nouveau script.
- Petits commits réguliers : le projet avance pas à pas.

---

##  Auteur

**Julio César Ramos do Carmo**
Étudiant en dernière année - ICC Bruxelles (Institut des Carrières Commerciales)
GitHub : [cesarramosict](https://github.com/cesarramosict)
