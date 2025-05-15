package org.example.demo06List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Syntaxe pour la collection List
        // List<String> prenoms = new ArrayList<String>();
        List<String> prenoms = new ArrayList<>();
        // List<Double> // toujours une liste d'objets => pour les primitifs on utilise les classes wrap

        // la méthode add() pour ajouter un élement
        prenoms.add("toto");
        prenoms.add("tata");
        prenoms.add("tutu");
        prenoms.add("titi");

        // la méthode get() pour accéder à un élément par son indice
        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));
        System.out.println(prenoms.get(3));

        // la méthode set() pour modifier un element à son index
        prenoms.set(2, "tyty");

        System.out.println(prenoms.get(2));


        // la méthode remove() pour supprimer un élément
        prenoms.remove(0);

        System.out.println(prenoms.get(0));
        System.out.println(prenoms);

        // la methode size() qui permet de retourner la taile de la liste
        System.out.println(prenoms.size());

        // parcourir avec la boucle foreach
        for (String p : prenoms) {
            System.out.println(p.toUpperCase());
        }

        // parcourir avec
        for (int i = 0; i < prenoms.size(); i++) {
            System.out.println(prenoms.get(i));
        }

    }

}
