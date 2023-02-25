package tn.esprit.tic.skioussemaf.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skioussemaf.entities.Moniteur;
import tn.esprit.tic.skioussemaf.entities.Skieur;

public interface MoniteurRepository extends JpaRepository<Moniteur,Long > {
}
