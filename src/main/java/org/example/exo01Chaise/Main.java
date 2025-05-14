package org.example.exo01Chaise;

public class Main {

    public static void main(String[] args) {
        Chaise chaise1 = new Chaise(4, "chaine", "bleu");
        Chaise chaise2 = new Chaise(3, "bambou", "gris");
        Chaise chaise3 = new Chaise(1, "métal", "orange");
        System.out.println(chaise1);
        System.out.println(chaise2);
        System.out.println(chaise3);

        // Méthode avec constructeur par défaut
        Chaise chaise = new Chaise();
        chaise.couleur = "vert";
        chaise.materiau = "verre";
        chaise.pieds = 2;

        System.out.println(chaise);

    }
}
