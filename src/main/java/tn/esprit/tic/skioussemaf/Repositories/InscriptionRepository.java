package tn.esprit.tic.skioussemaf.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skioussemaf.entities.Inscription;
import tn.esprit.tic.skioussemaf.entities.Skieur;

public interface InscriptionRepository extends JpaRepository<Inscription,Long > {
}
