package com.twu.exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class FizzBuzz {

    private final Console console;

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
        for (int i = 1; i <= topNumber; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    printLine("FizzBuzz");
                } else {
                    printLine("Fizz");
                }
            } else if (i % 5 == 0) {
                printLine("Buzz");
            } else {
                printLine(String.valueOf(i));
            }
        }
    }
}
