package com.twu.exercises;


public class Diamond {
    private final Console console;

    public Diamond(Console console) {
        this.console = console;
    }

    private void print(String message){
        console.print(message);
    }

    private void printLine(int spaceNumber, int asterisksNumber){
        StringBuilder message = new StringBuilder();
        while (spaceNumber-- >0){
            message.append(" ");
        }
        while (asterisksNumber-- >0){
            message.append("*");
        }
        print(message.toString());
    }

    public void printIsoscelesTriangle(int number) {
        int row = 2 * number - 1;
        for (int i = 1; i <= number; i++){
            int asteriskNumber = 2 * i - 1;
            printLine(row - asteriskNumber, asteriskNumber);
        }
    }

    public void printDiamond(int sideLength) {
        int row = 2 * sideLength - 1;
        for (int i = 1; i < 2 * sideLength; i++){
            int spacekNumber = Math.abs(sideLength - i) * 2;
            printLine(spacekNumber, row - spacekNumber);
        }
    }

    public void printDiamondWithName(int sideLength, String name) {
        int row = 2 * sideLength - 1;
        for (int i = 1; i < 2 * sideLength; i++){
            int spacekNumber = Math.abs(sideLength - i) * 2;
            if (i == sideLength){
                print(name);
            }else {
                printLine(spacekNumber, row - spacekNumber);
            }
        }
    }



    /*public static void main(String[] args) {
        Console console = new Console(new BufferedReader(new InputStreamReader(System.in)), new PrintStream(System.out));
        Diamond diamond = new Diamond(console);
        diamond.printDiamond(3);
    }*/
}
