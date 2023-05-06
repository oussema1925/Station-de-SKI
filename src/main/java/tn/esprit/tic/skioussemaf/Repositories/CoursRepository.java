package tn.esprit.tic.skioussemaf.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.tic.skioussemaf.entities.Cours;
import tn.esprit.tic.skioussemaf.entities.Skieur;

import java.util.List;
import java.util.Set;

public interface CoursRepository extends JpaRepository<Cours,Long > {
    @Query(value = "SELECT * " +
            "FROM cours c" +
            "ORDER BY (SELECT COUNT * FROM inscription i WHERE i.cours_num_cours = c.num_cours)", nativeQuery = true)
    Set<Cours> getAllOrderByInscriptionNumberSQL();
    @Query(value = "SELECT c FROM Cours c ORDER BY c.inscriptions.size")
    Set<Cours> getAllOrderByInscriptionNumberJPQL();
}
