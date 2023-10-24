package javaprogrammes;
/**
 * 10. Write a java program to input any two number and ask user to enter their symbol
 * (+, -, /, *) find addition,Subtraction, multiplication and division according
 * to their symbol (using if else)
 */

import java.util.Scanner;

public class Programme10 {

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter Second Number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Enter the operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result = 0;
        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        } else if (operator == '/') {
            result = firstNumber / secondNumber;
        } else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
        }
        System.out.println("Result: " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
        scanner.close();
    }
}
