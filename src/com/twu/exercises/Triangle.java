package com.twu.exercises;


public class Triangle {
    private final Console console;

    public Triangle(Console console) {
        this.console = console;
    }

    public void printOneAsterisk() {
        print("*");
    }

    public void printAHorizontalLine(int number) {
        StringBuilder message = new StringBuilder();
        while (number-- >0){
            message.append("*");
        }
        print(message.toString());
    }

    public void printAVerticalLine(int number) {
        while (number-- >0){
            print("*");
        }
    }

    private void print(String message) {
        console.print(message);
    }

    public void printRightTriangle(int number) {
        for (int i = 1; i <= number; i++){
            printAHorizontalLine(i);
        }
    }
}
