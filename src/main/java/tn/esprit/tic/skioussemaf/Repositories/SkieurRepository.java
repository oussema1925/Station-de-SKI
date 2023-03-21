package tn.esprit.tic.skioussemaf.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.tic.skioussemaf.entities.Skieur;
import tn.esprit.tic.skioussemaf.entities.TypeAbonnement;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    @Query("select s from Skieur s where s.abonnement.typeAbon = ?1") //JPQL
    List<Skieur> findSkieurByAbonnement_TypeAbon(TypeAbonnement typeAbonnement); //keyword

}
