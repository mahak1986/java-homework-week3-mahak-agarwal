package javaprogrammes;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even
 * using ternary operator
 */
public class Programme1EvenOdd {

    public static void main(String[] args) {
        evenOrOdd(); //Calling static method into main method
    }

    public static void evenOrOdd() {
        Scanner scanner = new Scanner(System.in); //Creating an object using scanner
        System.out.print("Enter a number :  "); //User enters a number
        int number = scanner.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd"; //Using ternary operator ?:
        System.out.println(number + " is an " + result + " number.");
        scanner.close();
    }
}
