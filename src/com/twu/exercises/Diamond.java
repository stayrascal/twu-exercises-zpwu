package com.twu.exercises;


public class Diamond {
    private final Console console;

    public Diamond(Console console) {
        this.console = console;
    }

    private void print(String message) {
        console.print(message);
    }

    private void printLine(int leftSpaceNumber, int asterisksNumber) {
        StringBuilder message = new StringBuilder();
        while (leftSpaceNumber-- > 0) {
            message.append(" ");
        }
        while (asterisksNumber-- > 0) {
            message.append("*");
        }
        while (leftSpaceNumber-- > 0) {
            message.append(" ");
        }
        print(message.toString());
    }

    public void printIsoscelesTriangle(int sideLength) {
        int row = 2 * sideLength - 1;
        for (int i = 1; i <= sideLength; i++) {
            int spaceNumber = sideLength - i;
            printLine(spaceNumber, row - 2 * spaceNumber);
        }
    }

    public void printDiamond(int sideLength) {
        printDiamondWithName(sideLength, null);
    }

    public void printDiamondWithName(int sideLength, String name) {
        int row = 2 * sideLength - 1;
        for (int i = 1; i < 2 * sideLength; i++) {
            int spaceNumber = Math.abs(sideLength - i);
            if (i == sideLength && name != null) {
                print(name);
            } else {
                printLine(spaceNumber, row - 2 * spaceNumber);
            }
        }
    }
}
