package tn.esprit.tic.skioussemaf.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.tic.skioussemaf.entities.*;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    @Query("select s from Skieur s where s.abonnement.typeAbon = ?1") //JPQL
    List<Skieur> findSkieurByAbonnement_TypeAbon(TypeAbonnement typeAbonnement); //keyword
    @Query("select s from Skieur s where s.abonnement.typeAbon =  :typeAbonnement and s.ville= :ville") //JPQL
    List<Skieur> findSkieurByAbonnement_TypeAbonJPQL(@Param("typeAbonnement") TypeAbonnement typeAbonnement, @Param("ville") String ville); //keyword
    @Query(value = "SELECT * " +
            "FROM skieur s "+
            "JOIN abonnement a" +
            "ON s.abonnement_num_abon = a.num_abon " +
            "WHERE a.type_abon=:typeAbonnement "+
            "AND s.ville=:ville", nativeQuery = true ) //SQL
    List<Skieur> findSkieurByAbonnement_TypeAbonSQL(@Param("typeAbonnement") TypeAbonnement typeAbonnement, @Param("ville") String ville); //keyword
    List<Skieur> findByInscriptionsCoursTypeCoursAndInscriptionsCoursSupportAndPistesCouleur(TypeCours inscriptions_cours_typeCours, Support inscriptions_cours_support, Couleur pistes_couleur);

}
