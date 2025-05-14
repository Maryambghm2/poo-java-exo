package org.example.demo02Heritage;

public class Hyenne extends Canide {
    public Hyenne(int age, String nom) {
        super(age, nom);
    }

    @Override
    public String toString() {
        return super.toString()+ " est un hyenne";
    }
}
