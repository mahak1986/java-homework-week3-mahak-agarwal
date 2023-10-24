package javaprogrammes;

import java.util.Scanner;

/**
 * java program to input any number and find out if it’s odd or even
 */
public class Programme6 {

    public static void main(String[] args) {
        evenOdd();
    }

    public static void evenOdd() {
        int num; //Declaring a variable
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = scanner.nextInt();
        // If number is divisible by 2 then it's an even number
        //else it is an odd number
        if (num % 2 == 0) {
            System.out.println(num + " is an even number"); // Shows an even number
        } else
            System.out.println(num + " is an odd number"); // Shows a odd number
        scanner.close();
    }
}
