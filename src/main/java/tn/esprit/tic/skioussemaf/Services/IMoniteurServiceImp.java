package tn.esprit.tic.skioussemaf.Services;

import ch.qos.logback.core.util.FixedDelay;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tic.skioussemaf.entities.Moniteur;
import tn.esprit.tic.skioussemaf.Repositories.MoniteurRepository;
import tn.esprit.tic.skioussemaf.Repositories.PisteRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class IMoniteurServiceImp implements IMoniteurService{

    private final MoniteurRepository moniteurRepository;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);    }

    @Override
    public Optional<Moniteur> retrieveMoniteur(Long numMoniteur) {

        return moniteurRepository.findById(numMoniteur);
    }

    @Override
    public void removeMoniteur(Long numMoniteur) {
        log.info("in removeMoniteur");
        moniteurRepository.deleteById(numMoniteur);
    }

    @Scheduled(fixedDelay = 60000) //kol dkika w tarteh
    @Scheduled(fixedRate = 60000) //aala baadhou men ghir rahaa
    @Scheduled(cron = "0 0 0 * * MON-FRI")
    @Override
    public void test() {
        log.info("Haw je!!");
    }
}
