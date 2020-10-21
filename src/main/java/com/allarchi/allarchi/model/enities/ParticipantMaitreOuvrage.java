package com.allarchi.allarchi.model.enities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@NoArgsConstructor
public class ParticipantMaitreOuvrage extends AbstractEntities {
    @Getter
    @Setter
    private String typeParticipant;
    @Getter
    @Setter
    private String nom;
    @Getter
    @Setter
    private String prenom;
    @Getter
    @Setter
    private Date dateNaissance;
    @Getter
    @Setter
    private String adresse;
    @Getter
    @Setter
    private String ville;
    @Getter
    @Setter
    private String pays;
    @Getter
    @Setter
    private int codePostal;
    @Getter
    @Setter
    private int telFixe;
    @Getter
    @Setter
    private int telPortable;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String commentaire;
}
