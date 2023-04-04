package tn.esprit.tic.skioussemaf.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.skioussemaf.entities.Piste;
import tn.esprit.tic.skioussemaf.Repositories.PisteRepository;
import tn.esprit.tic.skioussemaf.Repositories.SkieurRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class IPisteServiceImp implements IPisteService{
    private final PisteRepository pisteRepository;
    @Override
    public List<Piste> retrieveAllPistes() {
        return  pisteRepository.findAll();    }

    @Override
    public Piste addPiste(Piste piste) {
         return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Optional<Piste> retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste);
    }

    @Override
    public void removePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }
}
