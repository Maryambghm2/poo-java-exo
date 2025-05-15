package org.example.demo04Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ClassDemo2 classDemo2 = new ClassDemo2();
//        ClasseDemo classeDemo = new ClasseDemo();
//
//        DemoBaseInterface[] demoBaseInterfaces = {classDemo2, classeDemo};

        IMessage message;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Taper 1 pour du fr et 2 pour du en :");
        int choix = scanner.nextInt();

        while (choix != 1 && choix != 2) {
            System.out.println("Taper 1 pour du fr et 2 pour du en :");
             choix = scanner.nextInt();
        }
        if (choix == 1) {
            message = new MessageV1();
        } else {
            message = new EnglishMessage();
        }

        message.okMessage();
        message.warningMessage();
        message.errorMessage();

    }
}

