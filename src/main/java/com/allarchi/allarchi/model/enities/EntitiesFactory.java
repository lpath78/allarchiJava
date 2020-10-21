package com.allarchi.allarchi.model.enities;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class EntitiesFactory {

    public Projet fabriquerProjet(int numDossier, String nomProjet, Date dateDebut, Date dateFin, String rue, int codePostal, String localite, String pays, String section, String numParcellaire, String commune) {
        Projet p = new Projet();
        try {
            p.setNumDossier(numDossier);
            p.setNomProjet(nomProjet);
            p.setDateDebut(dateDebut);
            p.setDateFin(dateFin);
            p.setRue(rue);
            p.setCodePostal(codePostal);
            p.setLocalite(localite);
            p.setPays(pays);
            p.setSection(section);
            p.setNumParcellaire(numParcellaire);
            p.setCommune(commune);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public ParticipantMaitreOuvrage fabriquerMaitreOuvrage(String typeParticipant, String nom, String prenom, Date dateNaissance, String adresse, String ville, String pays, int codePostal, int telFixe, int telPortable, String email, String commentaire) {
        ParticipantMaitreOuvrage pmo = new ParticipantMaitreOuvrage();

        try {
            pmo.setTypeParticipant(typeParticipant);
            pmo.setNom(nom);
            pmo.setPrenom(prenom);
            pmo.setDateNaissance(dateNaissance);
            pmo.setAdresse(adresse);
            pmo.setVille(ville);
            pmo.setPays(pays);
            pmo.setCodePostal(codePostal);
            pmo.setTelFixe(telFixe);
            pmo.setTelPortable(telPortable);
            pmo.setEmail(email);
            pmo.setCommentaire(commentaire);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return pmo;
    }

    public ParticipantPromoteur fabriquerPromoteur(String typeParticipant, String nomSociete, String siret, String pays, String nom, String prenom, String email, int telPortable, String nom2, String prenom2, String email2, int portable2, String adresse, int codePostal, String ville, int telFixe, String commentaire) {
        ParticipantPromoteur pp = new ParticipantPromoteur();

        try {
            pp.setTypeParticipant(typeParticipant);
            pp.setNomSociete(nomSociete);
            pp.setSiret(siret);
            pp.setPays(pays);
            pp.setNom(nom);
            pp.setPrenom(prenom);
            pp.setEmail(email);
            pp.setTelPortable(telPortable);
            pp.setNom2(nom2);
            pp.setPrenom2(prenom2);
            pp.setEmail2(email2);
            pp.setTelPortable2(portable2);
            pp.setAdresse(adresse);
            pp.setCodePostal(codePostal);
            pp.setVille(ville);
            pp.setTelFixe(telFixe);
            pp.setCommentaire(commentaire);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pp;
    }

    public ParticipantBureauEtude fabriquerBureauEtude(String typeParticipant, String nomEntreprise, String typeEntreprise, String siret, String corpsEtat, String nom, String prenom, String enQuailiteDe, String service, String email, int telPortable, String adresse, int codePostal, String ville, int telFixe, String pays, String commentaire) {
        ParticipantBureauEtude pbe = new ParticipantBureauEtude();
        try {
            pbe.setTypeParticipant(typeParticipant);
            pbe.setNomEntreprise(nomEntreprise);
            pbe.setTypeEntreprise(typeEntreprise);
            pbe.setSiret(siret);
            pbe.setCorpsEtat(corpsEtat);
            pbe.setNom(nom);
            pbe.setPrenom(prenom);
            pbe.setEnQualiteDe(enQuailiteDe);
            pbe.setService(service);
            pbe.setEmail(email);
            pbe.setTelPortable(telPortable);
            pbe.setAdresse(adresse);
            pbe.setCodePostal(codePostal);
            pbe.setVille(ville);
            pbe.setTelFixe(telFixe);
            pbe.setPays(pays);
            pbe.setCommentaire(commentaire);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pbe;
    }

    public ParticipantEntreprise fabriquerEntreprise(String typeParticipant, String nomEntreprise, String typeEntreprise, String siret, String corpsEtat, String nom, String prenom, String enQualiteDe, String email, int telPortable, String nom2, String prenom2, String enQualiteDe2, String email2, int telPortable2, String adresse, int codePostal, String ville, int telFixe, String commentaire) {
        ParticipantEntreprise pe = new ParticipantEntreprise();
        try {
            pe.setTypeParticipant(typeParticipant);
            pe.setNomEntreprise(nomEntreprise);
            pe.setTypeEntreprise(typeEntreprise);
            pe.setSiret(siret);
            pe.setCorpsEtat(corpsEtat);
            pe.setNom(nom);
            pe.setPrenom(prenom);
            pe.setEnQualiteDe(enQualiteDe);
            pe.setEmail(email);
            pe.setTelPortable(telPortable);
            pe.setNom2(nom2);
            pe.setPrenom2(prenom2);
            pe.setEnQualiteDe2(enQualiteDe2);
            pe.setEmail2(email2);
            pe.setTelPortable2(telPortable2);
            pe.setAdresse(adresse);
            pe.setCodePostal(codePostal);
            pe.setVille(ville);
            pe.setTelFixe(telFixe);
            pe.setCommentaire(commentaire);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pe;
    }

    public ParticipantMairie fabriquerMairie(String typeParticipant, String nom, String prenom, String enQualiteDe, String service, String email, int telPortable, String nom2, String prenom2, String enQualiteDe2, String service2, String email2, int telPortable2, String adresse, int codePostal, String ville, int telFixe, String commentaire) {
        ParticipantMairie pm = new ParticipantMairie();

        try {
            pm.setTypeParticipant(typeParticipant);
            pm.setNom(nom);
            pm.setPrenom(prenom);
            pm.setEnQualiteDe(enQualiteDe);
            pm.setService(service);
            pm.setEmail(email);
            pm.setTelPortable(telPortable);
            pm.setNom2(nom2);
            pm.setPrenom2(prenom2);
            pm.setEnQualiteDe2(enQualiteDe2);
            pm.setService2(service2);
            pm.setEmail2(email2);
            pm.setTelPortable2(telPortable2);
            pm.setAdresse(adresse);
            pm.setCodePostal(codePostal);
            pm.setVille(ville);
            pm.setTelFixe(telFixe);
            pm.setCommentaire(commentaire);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pm;

    }
}
