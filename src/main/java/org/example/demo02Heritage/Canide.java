package org.example.demo02Heritage;

public class Canide {
    protected int age;
    protected String nom;

    public Canide(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    public void crier() {
        System.out.println("Cri du canidé !!!");
    }

    @Override
    public String toString() {
        return "Canide de nom :" + this.nom + " et d'age :" + this.age;
    }
}
