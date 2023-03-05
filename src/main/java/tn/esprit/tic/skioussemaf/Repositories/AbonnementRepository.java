package tn.esprit.tic.skioussemaf.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skioussemaf.entities.Abonnement;
import tn.esprit.tic.skioussemaf.entities.Skieur;
import tn.esprit.tic.skioussemaf.entities.TypeAbonnement;

import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long > {
    List<Abonnement> findByTypeAbon(TypeAbonnement typeAbonnement);
}
