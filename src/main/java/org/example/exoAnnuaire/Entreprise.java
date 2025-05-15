package org.example.exoAnnuaire;

public class Entreprise {
    private String nom;
    private String siret;
    private String adresse;
    private String siteWeb;

    public Entreprise(String nom, String siret, String adresse, String siteWeb) {
        this.nom = nom;
        this.siret = siret;
        this.adresse = adresse;
        this.siteWeb = siteWeb;
    }



    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

//    public String toString() {
//        return "Nom :" +getNom()+ ", Numéro de siret : "+ getSiret()+" Adresse :"+getAdresse()+ ", Site web: "+getSiteWeb();
//    }
}
