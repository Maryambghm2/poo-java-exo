package org.example.exo02Film;

import java.time.LocalDate;
import java.util.Date;

public class Film {
    private String titre;
    private String realisateur;
    private LocalDate dateSortie;
    private String genre;


    public Film(String titre, String realisateur, LocalDate dateSortie, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.dateSortie = dateSortie;
        this.genre = genre;
    }

    public Film() {

    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String modifTitre) {
        this.titre = modifTitre;
    }


    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String modifRealisateur) {
        this.realisateur = modifRealisateur;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String modifGenre) {
        this.genre = modifGenre;
    }


    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(LocalDate modifDateSortie) {
        this.dateSortie = modifDateSortie;
    }

//    @Override
//    public String toString() {
//        return "Film{ titre= '" + this.titre + "', realisateur = '" + this.realisateur + "', dateSortie= " + this.dateSortie + ", genre ='" + this.genre + "'}";
//    }


    public String toString() {
        return "Film{ titre= '" + getTitre() + "', realisateur = '" + getRealisateur() + "', dateSortie= " + getDateSortie() + ", genre ='" + getGenre() + "'}";
    }
}
