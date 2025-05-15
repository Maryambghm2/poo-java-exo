package org.example.exo05Plante;

public class Plante {
    protected String nom;
    protected double hauteur;
    protected String couleur;

    public Plante(String nom, String couleur, double hauteur) {
        this.nom = nom;
        this.couleur = couleur;
        this.hauteur = hauteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }


    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }


}
