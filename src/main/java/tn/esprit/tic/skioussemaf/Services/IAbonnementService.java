package tn.esprit.tic.skioussemaf.Services;

import tn.esprit.tic.skioussemaf.entities.Abonnement;
import tn.esprit.tic.skioussemaf.entities.Cours;

import java.util.List;
import java.util.Optional;

public interface IAbonnementService {

    List<Abonnement> retrieveAllAbonnement();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Optional<Abonnement> retrieveAbonnement (Long numAbon);

    void removeAbonnement(Long numAbon);
}
