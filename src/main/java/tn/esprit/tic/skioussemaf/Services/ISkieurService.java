package tn.esprit.tic.skioussemaf.Services;

import tn.esprit.tic.skioussemaf.entities.*;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    Skieur updateSkieur(Skieur skieur);
    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);

    Skieur assignSkierToPiste(long numSkieur, long numPiste);
    Skieur AssignSkierToSubscription(long numSkieur, long numAbon);
    Skieur assignSkierToInscription(long numSkieur, long numInscription);
   List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
   List<Skieur> findByInscriptionsCoursTypeCoursAndInscriptionsCoursSupportAndPistesCouleur(TypeCours inscriptions_cours_typeCours, Support inscriptions_cours_support, Couleur pistes_couleur);

}
