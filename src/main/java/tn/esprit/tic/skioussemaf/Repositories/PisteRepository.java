package tn.esprit.tic.skioussemaf.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skioussemaf.entities.Piste;
import tn.esprit.tic.skioussemaf.entities.Skieur;

public interface PisteRepository extends JpaRepository<Piste,Long > {
}
