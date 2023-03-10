package tn.esprit.tic.skioussemaf.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skioussemaf.entities.Skieur;
import tn.esprit.tic.skioussemaf.entities.TypeAbonnement;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    List<Skieur> findSkieurByAbonnement_TypeAbon(TypeAbonnement typeAbonnement);
}
