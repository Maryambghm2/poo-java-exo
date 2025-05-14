package org.example.exoChaise;

public class Chaise {
    public int pieds;
    public String materiau;
    public String couleur;

    public Chaise(int pieds, String materiau, String couleur) {
        this.pieds = pieds;
        this.materiau = materiau;
        this.couleur = couleur;
    }

    public Chaise() {
    }

    @Override
    public String toString() {
        return "Je suis une chaise avec "+this.pieds+ " pied(s) en "+this.materiau+" de couleur "+this.couleur;
    }
}
