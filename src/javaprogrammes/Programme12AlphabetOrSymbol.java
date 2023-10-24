package javaprogrammes;
/**
 *Write a program that tells us input value is number or an alphabet or symbol
 */

import java.util.Scanner;

public class Programme12AlphabetOrSymbol {
    public static void main(String[] args) {
        alphabetSymbol();
    }

    public static void alphabetSymbol() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char input = scanner.next().charAt(0);
        if (Character.isAlphabetic(input)) {
            System.out.println("You entered a alphabet.");
        } else if (Character.isDigit(input)) {
            System.out.println("You entered a number");
        } else {
            System.out.println("You entered a symbol");
            scanner.close();

        }

    }
}
