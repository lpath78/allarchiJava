package com.allarchi.allarchi.model.enities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@NoArgsConstructor
public class Projet extends AbstractEntities {
    @Getter
    @Setter
    private int numDossier;
    @Getter
    @Setter
    private String nomProjet;
    @Getter
    @Setter
    private Date dateDebut;
    @Getter
    @Setter
    private Date dateFin;
    @Getter
    @Setter
    private String rue;
    @Getter
    @Setter
    private int codePostal;
    @Getter
    @Setter
    private String localite;
    @Getter
    @Setter
    private String pays;
    @Getter
    @Setter
    private String section;
    @Getter
    @Setter
    private String numParcellaire;
    @Getter
    @Setter
    private String commune;

}
