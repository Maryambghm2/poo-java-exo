package org.example.exo01Chaise;

public class Chaise {
    public int pieds;
    public String materiau;
    public String couleur;
    private double prix;

    public Chaise(int pieds, String materiau, String couleur, double prix) {
        this.pieds = pieds;
        this.materiau = materiau;
        this.couleur = couleur;
        this.prix = 99.5;
    }
    public Chaise(String couleur, String materiau) {
        this(4, materiau,couleur, 99.5);
    }
    public Chaise( int pieds, String couleur, String materiau) {
        this(4, materiau,couleur, 99.5);
    }

    public Chaise() {
    }


    @Override
    public String toString() {
        return "Je suis une chaise avec "+this.pieds+ " pied(s) en "+this.materiau+" de couleur "+this.couleur;
    }
}
