package com.twu.exercises;

public class FizzBuzz {

    private final Console console;

    public FizzBuzz(Console console) {
        this.console = console;
    }


    public void printNumber(int topNumber) {
        while (topNumber-- > 0){
            printLine(String.valueOf(topNumber));
        }
    }

    private void printLine(String message) {
        console.print(message);
    }
}
