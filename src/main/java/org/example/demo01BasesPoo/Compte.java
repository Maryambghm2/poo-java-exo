package org.example.demo01BasesPoo;

public class Compte {

    // Attributs
    private int code;
    protected float solde;

    // Constructeur
//    public Compte (int c, float s) {
//        code =c;
//        solde=s;
//    }
    public Compte(int code, float solde) {
        this.code = code;
        this.solde = solde;
    }

    // Méthodes
    public void verser(float mt) {
        solde += mt;
    }

    public void retirer(float mt) {
        solde -= mt;
    }

    // Méthode qui retourne l'état du compte
    @Override
    public String toString() {
        return "Compte : code = " + this.code + ", solde = " + this.solde + ".";
    }

}
