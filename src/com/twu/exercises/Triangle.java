package com.twu.exercises;


public class Triangle {
    private final Console console;

    public Triangle(Console console) {
        this.console = console;
    }

    public void printOneAsterisk() {
        print("*");
    }

    private void print(String message) {
        console.print(message);
    }

    public void printAhorizontalLine(int number) {
        StringBuilder message = new StringBuilder();
        while (number-- >0){
            message.append("*");
        }
        print(message.toString());
    }

}
