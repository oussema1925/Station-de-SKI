package tn.esprit.tic.skioussemaf.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skioussemaf.entities.Cours;
import tn.esprit.tic.skioussemaf.entities.Skieur;

public interface CoursRepository extends JpaRepository<Cours,Long > {
}
