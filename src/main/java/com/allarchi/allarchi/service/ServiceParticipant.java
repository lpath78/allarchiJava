package com.allarchi.allarchi.service;

import com.allarchi.allarchi.model.dao.*;
import com.allarchi.allarchi.model.enities.EntitiesFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ServiceParticipant {
    private final ParticipantBureauEtudeRepository participantBureauEtudeRepository;
    private final ParticipantEntrepriseRepository participantEntrepriseRepository;
    private final ParticipantMairieRepository participantMairieRepository;
    private final ParticipantMaitreOuvrageRepository participantMaitreOuvrageRepository;
    private final ParticipantPromoteurRepository participantPromoteurRepository;
    private final EntitiesFactory entitiesFactory;

    public ServiceParticipant(ParticipantBureauEtudeRepository participantBureauEtudeRepository, ParticipantEntrepriseRepository participantEntrepriseRepository, ParticipantMairieRepository participantMairieRepository, ParticipantMaitreOuvrageRepository participantMaitreOuvrageRepository, ParticipantPromoteurRepository participantPromoteurRepository, EntitiesFactory entitiesFactory) {
        this.participantBureauEtudeRepository = participantBureauEtudeRepository;
        this.participantEntrepriseRepository = participantEntrepriseRepository;
        this.participantMairieRepository = participantMairieRepository;
        this.participantMaitreOuvrageRepository = participantMaitreOuvrageRepository;
        this.participantPromoteurRepository = participantPromoteurRepository;
        this.entitiesFactory = entitiesFactory;
    }

    public void AjouterParticipantBureauEtude(String typeParticipant, String nomEntreprise, String typeEntreprise, String siret, String corpsEtat, String nom, String prenom, String enQuailiteDe, String service, String email, int telPortable, String adresse, int codePostal, String ville, int telFixe, String pays, String commentaire) {
        entitiesFactory.fabriquerBureauEtude(typeParticipant, nomEntreprise, typeEntreprise, siret,corpsEtat, nom, prenom, enQuailiteDe,service,email,telPortable,adresse,codePostal,ville,telFixe,pays,commentaire);
    }

    public void AjouterParticipantEntreprise(String typeParticipant, String nomEntreprise, String typeEntreprise, String siret, String corpsEtat, String nom, String prenom, String enQualiteDe, String email, int telPortable, String nom2, String prenom2, String enQualiteDe2, String email2, int telPortable2, String adresse, int codePostal, String ville, int telFixe, String commentaire) {

        entitiesFactory.fabriquerEntreprise(typeParticipant, nomEntreprise, typeEntreprise, siret,corpsEtat,nom, prenom, enQualiteDe,email,telPortable,nom2,prenom2,enQualiteDe2,email2,telPortable2, adresse, codePostal, ville,telFixe,);
    }

    public void AjouterParticipantMairie(String typeParticipant, String nom, String prenom, String enQualiteDe, String service, String email, int telPortable, String nom2, String prenom2, String enQualiteDe2, String service2, String email2, int telPortable2, String adresse, int codePostal, String ville, int telFixe, String commentaire) {
        entitiesFactory.fabriquerMairie(typeParticipant, nom, prenom, enQualiteDe, service, email, telPortable, nom2, prenom2, enQualiteDe2, service2, email2, telPortable2, adresse, codePostal, ville, telFixe, commentaire);
    }

    public void AjouterParticipantMaitreOuvrage(String typeParticipant, String nom, String prenom, Date dateNaissance, String adresse, String ville, String pays, int codePostal, int telFixe, int telPortable, String email, String commentaire) {
        entitiesFactory.fabriquerMaitreOuvrage(typeParticipant, nom, prenom, dateNaissance, adresse, ville, pays, codePostal, telFixe, telPortable, email, commentaire);
    }

    public void AjouterParticipantPromoteur(String typeParticipant, String nomSociete, String siret, String pays, String nom, String prenom, String email, int telPortable, String nom2, String prenom2, String email2, int portable2, String adresse, int codePostal, String ville, int telFixe, String commentaire) {
        entitiesFactory.fabriquerPromoteur(typeParticipant, nomSociete, siret, pays, nom, prenom, email, telPortable, nom2, prenom2, email2, portable2, adresse, codePostal, ville, telFixe, commentaire);

    }
}
