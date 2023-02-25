package tn.esprit.tic.skioussemaf.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.ORDINAL)
    private Support support;
    private float prix;
    private int creneau;
    @Transient   //ma todhhorch fel base de données
    private int nomProf;
    @OneToMany(mappedBy = "cours")
    private List<Inscription> inscriptions;
}
