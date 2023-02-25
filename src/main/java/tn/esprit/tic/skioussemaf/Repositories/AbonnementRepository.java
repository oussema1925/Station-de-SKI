package tn.esprit.tic.skioussemaf.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skioussemaf.entities.Abonnement;
import tn.esprit.tic.skioussemaf.entities.Skieur;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long > {
}
