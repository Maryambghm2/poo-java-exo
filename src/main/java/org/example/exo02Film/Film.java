package org.example.exo02Film;

public class Film {
    private String titre;
    private String realisateur;
    private String dateSortie;
    private String genre;


    public Film(String titre, String realisateur, String dateSortie, String genre) {
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


    public String getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(String modifDateSortie) {
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
