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
        printShape(sideLength, null, true);
    }

    public void printDiamond(int sideLength) {
        printShape(sideLength, null, false);
    }

    public void printDiamondWithName(int sideLength, String name) {
        printShape(sideLength, name, false);
    }

    private void printShape(int sideLength, String name, boolean isHalf){
        int row = 2 * sideLength - 1;
        for (int i = 1; i < 2 * sideLength; i++) {
            if (i > sideLength && isHalf){
                break;
            }
            int spaceNumber = Math.abs(sideLength - i);
            if (i == sideLength && name != null) {
                print(name);
            } else {
                printLine(spaceNumber, row - 2 * spaceNumber);
            }
        }
    }
}
