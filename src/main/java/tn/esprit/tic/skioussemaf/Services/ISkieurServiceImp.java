package tn.esprit.tic.skioussemaf.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.tic.skioussemaf.Repositories.AbonnementRepository;
import tn.esprit.tic.skioussemaf.Repositories.InscriptionRepository;
import tn.esprit.tic.skioussemaf.Repositories.PisteRepository;
import tn.esprit.tic.skioussemaf.Repositories.SkieurRepository;
import tn.esprit.tic.skioussemaf.entities.*;

import java.util.List;

@Service
public class ISkieurServiceImp implements ISkieurService{

   @Autowired
    SkieurRepository skieurRepository;
   @Autowired
    PisteRepository pisteRepository;
    @Autowired
    AbonnementRepository abonnementRepository;
    @Autowired
    InscriptionRepository inscriptionRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
    skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }

        @Override
        public Skieur assignSkierToPiste(long numSkieur, long numPiste) {
        //RECUPERATION ID
            Skieur skieur=skieurRepository.findById(numSkieur).orElse(null) ;
            Assert.notNull(skieur,"skieur not found!!!");
            Piste piste=pisteRepository.findById(numPiste).orElse(null);
            Assert.notNull(piste,"piste not found!!!");
            //verrificationnon null
//            if(skieur!=null && piste!=null){
            //traitement
            // skieur.getPistes().add(piste);
            List<Piste>pistes=skieur.getPistes();
            pistes.add(piste);
            skieur.setPistes(pistes);
            return  skieurRepository.save(skieur);

            }
//            return null;
//        }
        @Override
        public Skieur AssignSkierToSubscription(long numSkieur, long numAbon) {
        //RECUPERATION ID
            Skieur skieur=skieurRepository.findById(numSkieur).orElse(null) ;
            Assert.notNull(skieur,"skieur not found!!!");
            Abonnement abonnement=abonnementRepository.findById(numAbon).orElse(null);
            Assert.notNull(abonnement,"abonnement not found!!!");
            //verrificationnon null
//            if(skieur!=null && abonnement!=null){
            //traitement
            // skieur.getPistes().add(piste);

            skieur.setAbonnement(abonnement);

            return  skieurRepository.save(skieur);

        }
//        return null;}

    @Override
    public Skieur assignSkierToInscription(long numSkieur, long numInscription) {
        Skieur skieur=skieurRepository.findById(numSkieur).orElse(null) ;
        Inscription inscription=inscriptionRepository.findById(numInscription).orElse(null);
        //verrificationnon null
        if(skieur!=null && inscription!=null){
            //traitement
            // skieur.getPistes().add(piste);
            List<Inscription>inscriptions=skieur.getInscriptions();
            inscriptions.add(inscription);
            skieur.setInscriptions(inscriptions);
            return  skieurRepository.save(skieur);

        }
        return null;    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return skieurRepository.findSkieurByAbonnement_TypeAbon(typeAbonnement);
    }
//    @Override
//    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement){
//        List<Skieur> skieurs = new ArrayList<>();
//        for (Skieur skieur : skieurRepository.findAll()) {
//            for (Abonnement abonnement : skieur.getAbonnement()){
//                if (abonnement.getTypeAbon() == typeAbonnement) {
//                    skieurs.add(skieur);
//                    break; // arrêter la recherche si un abonnement correspond
//                }
//            }
//        }
//        return skieurs;
//    }
    }



