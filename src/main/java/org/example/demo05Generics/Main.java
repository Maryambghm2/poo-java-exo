package org.example.demo05Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Boite boite = new Boite();

        boite.setContenu("Coucou");
        System.out.println(boite.getContenu());

        Boite<Chat> boiteAChat = new Boite<>();

        boiteAChat.setContenu(new Chat(9, "toto"));

        System.out.println(boiteAChat.getContenu());

        List<Chat> maListeDeChat =  new ArrayList<>();
        List<String> list = new ArrayList<>();
        List<String> list1 = new LinkedList<>();
    }
}
