package org.example.demo01BasesPoo;

public class Main {
    public static void main(String[] args) {
        Compte c1 = new Compte(55, 56.2f);

        Compte c2 = new Compte(84, 45.6f);
        System.out.println("Compte avant versement et retrait :");
        System.out.println(c1);
        System.out.println(c2);

        // Transaction
        c1.retirer(100f);
        c2.verser(52f);

        System.out.println("Compte après versement et retrait :");
        System.out.println(c1);
        System.out.println(c2);

        Personne p = new Personne();
        p.setNom("AZER");
        p.setNom("toto");
        System.out.println(p.getNom());

        Personne p1 = new Personne();
        p1.setNom("Corinne");
        System.out.println(p1.getNom());
        System.out.println(p1.getPrenom());
        p1.age = 50;

        System.out.println("Age de la personne 1: " + p1.age);

        Personne personne = new Personne();
        Personne personne2 = new Personne(45, "toto","tata", 45);


    }
}