package org.example.demo01BasesPoo;

public class Personne {
    // Attributs
    private int code;
    private String nom;
    private String prenom = "Christophe";
    public int age;

    public Personne(int age, String prenom, String nom, int code) {
        this.age = age;
        this.prenom = prenom;
        this.nom = nom;
        this.code = code;
    }

    // 2e forme du constructeur; il est polymorphe (plusieurs forme)
    public Personne() {

    }
    //Méthodes
    public void setNom(String nom) {
        if (nom.toLowerCase().startsWith("c")) {
            System.out.println("Les prénom commençant par 'c' ne sont pas autorisé");
        } else {
            this.nom = nom;
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
