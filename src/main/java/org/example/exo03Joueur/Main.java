package org.example.exo03Joueur;

public class Main {
    public static void main(String[] args) {
        Joueur joueur1 = new Joueur("WarriorDu59");

        joueur1.setNom("LeGigaBossDuJava");
        System.out.println(joueur1);

        for (int i = 0; i < 31; i++) {
            joueur1.effectuerUneQuete();
            System.out.println("Le joueur "+ joueur1.getNom()+ "effectue la quete"+ joueur1.getQuete());
           //  System.out.println(joueur1.augmenterNiveau());
            System.out.println(joueur1);
        }
    }

}
