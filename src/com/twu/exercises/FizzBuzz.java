package com.twu.exercises;

public class FizzBuzz {

    private final Console console;
    private final String fizzBuzz = "FizzBuzz";
    private final String fizz = "Fizz";
    private final String buzz = "Buzz";

    public FizzBuzz(Console console) {
        this.console = console;
    }


    public void printNumber(int topNumber) {
        while (topNumber-- > 0) {
            printLine(String.valueOf(topNumber));
        }
    }

    private void printLine(String message) {
        console.print(message);
    }


    public void printNumberWithFizzAndBuzz(int topNumber) {
        for (int index = 1; index <= topNumber; index++) {
            if (isDivisibleByThree(index)) {
                printFizzOrFizzBuzz(index, fizzBuzz, fizz);
            } else printFizzOrFizzBuzz(index, buzz, String.valueOf(index));
        }
    }

    private void printFizzOrFizzBuzz(int number, String divisibleByFiveMessage, String inDivisibleByFiveMessage) {
        if (isDivisibleByFive(number)) {
            printLine(divisibleByFiveMessage);
        } else {
            printLine(inDivisibleByFiveMessage);
        }
    }

    private boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}
