package org.example.exo03Joueur;

public class Joueur {
    private String nom;
    private int niveau;
    private int points;
    private int quete;

    public Joueur(String nom, int niveau, int points, int quete) {
        this.nom = nom;
        this.niveau = niveau;
        this.points = points;
        this.quete = quete;
    }

    public Joueur(String nom) {
        this.nom = nom;
        this.niveau = 1;
        this.points = 0;
        this.quete = 1;
    }

    public String getNom() {
        return nom;
    }

    public String setNom(String modifNom) {
        this.nom = modifNom;
        return getNom() + " change de pseudo : " + modifNom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getQuete() {
        return quete;
    }

    public void setQuete(int modifQuete) {
        this.quete = modifQuete;
    }

    public void effectuerUneQuete() {
        this.quete += 1;
        this.points += 10;
        augmenterNiveau();
    }

    private String augmenterNiveau() {
        if (this.points >= 100) {
            this.niveau++;
            this.points = 0;
            System.out.println("Le joueur " + getNom() + " passe au niveau :" + getNiveau());
        }
        return "Le joueur passe au niveau :" + niveau;


    }

    public String toString() {
        return "Le joueur " + getNom() + " effectue la quête n° " + getNiveau();
    }


}
