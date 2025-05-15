package org.example.demo04Interface;

public class EnglishMessage  implements IMessage {


    @Override
    public void okMessage() {
        System.out.println("This is ok");
    }

    @Override
    public void warningMessage() {
        System.out.println("Warning message");
    }

    @Override
    public void errorMessage() {
        System.out.println("Error");
    }
}
