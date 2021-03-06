package com.allarchi.allarchi.model.enities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class ParticipantMairie extends AbstractEntities {
    @Getter
    @Setter
    private String typeParticipant;
    @Getter
    @Setter
    private String communeDe;
    @Getter
    @Setter
    private String nom;
    @Getter
    @Setter
    private String prenom;
    @Getter
    @Setter
    private String enQualiteDe;
    @Getter
    @Setter
    private String service;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private int telPortable;
    @Getter
    @Setter
    private String nom2;
    @Getter
    @Setter
    private String prenom2;
    @Getter
    @Setter
    private String enQualiteDe2;
    @Getter
    @Setter
    private String service2;
    @Getter
    @Setter
    private String email2;
    @Getter
    @Setter
    private int telPortable2;
    @Getter
    @Setter
    private String adresse;
    @Getter
    @Setter
    private int codePostal;
    @Getter
    @Setter
    private String ville;
    @Getter
    @Setter
    private int telFixe;
    @Getter
    @Setter
    private String Pays;
    @Getter
    @Setter
    private String commentaire;
}
