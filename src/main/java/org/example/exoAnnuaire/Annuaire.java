package org.example.exoAnnuaire;

import java.util.ArrayList;
import java.util.List;

public class Annuaire extends Entreprise {

    private List<Entreprise> entreprises;

    public Annuaire(String nom, String siret, String adresse, String siteWeb) {
        super(nom, siret, adresse, siteWeb);
        this.entreprises = new ArrayList<>();
    }



    public List<Entreprise> getEntreprises() {
        return entreprises;
    }

    public void ajouterEntreprise(Entreprise entreprise) {
        entreprises.add(entreprise);
    }

    public void entrepriseDetail() {
        for (Entreprise entreprise : entreprises) {
            System.out.println("Nom :" + entreprise.getNom() + ", Numéro de siret : " + entreprise.getSiret() + " Adresse :" + entreprise.getAdresse() + ", Site web: " + entreprise.getSiteWeb());
        }
    }

}
