package tn.esprit.tic.skioussemaf.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.skioussemaf.Repositories.AbonnementRepository;
import tn.esprit.tic.skioussemaf.Repositories.PisteRepository;
import tn.esprit.tic.skioussemaf.Repositories.SkieurRepository;
import tn.esprit.tic.skioussemaf.entities.Abonnement;
import tn.esprit.tic.skioussemaf.entities.Piste;
import tn.esprit.tic.skioussemaf.entities.Skieur;

import java.util.List;

@Service
public class ISkieurServiceImp implements ISkieurService{

   @Autowired
    SkieurRepository skieurRepository;
   @Autowired
    PisteRepository pisteRepository;
    @Autowired
    AbonnementRepository abonnementRepository;
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
        public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        //RECUPERATION ID
            Skieur skieur=skieurRepository.findById(numSkieur).orElse(null) ;
            Piste piste=pisteRepository.findById(numPiste).orElse(null);
            //verrificationnon null
            if(skieur!=null && piste!=null){
            //traitement
            // skieur.getPistes().add(piste);
            List<Piste>pistes=skieur.getPistes();
            pistes.add(piste);
            skieur.setPistes(pistes);
            return  skieurRepository.save(skieur);

            }
            return null;
        }
        @Override
        public Skieur AssignSkierToSubscription(long numSkieur, long numAbon) {
        //RECUPERATION ID
            Skieur skieur=skieurRepository.findById(numSkieur).orElse(null) ;
            Abonnement abonnement=abonnementRepository.findById(numAbon).orElse(null);
            //verrificationnon null
            if(skieur!=null && abonnement!=null){
            //traitement
            // skieur.getPistes().add(piste);

            skieur.setAbonnement(abonnement);

            return  skieurRepository.save(skieur);

        }
        return null;}

}
