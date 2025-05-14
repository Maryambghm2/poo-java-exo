package org.example.exo02Film;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Film film1 = new Film();
        Film film2 = new Film();

//        SETTER FILM2
        film1.setTitre("La Haine'");
        film1.setRealisateur("Mathieu Kassovitz");
        film1.setDateSortie(LocalDate.of(1995, 05, 31));
        film1.setGenre("Drame");

//        SETTER FILM2
        film2.setTitre("Avatar 2");
        film2.setRealisateur("James Cameron");
        film2.setDateSortie(LocalDate.of(2022, 12, 14));
        film2.setGenre("Action");

        System.out.println(film1);
        System.out.println(film2);


//        Film[] films = {film1, film2};
//        System.out.println(films[0]);

    }
}
