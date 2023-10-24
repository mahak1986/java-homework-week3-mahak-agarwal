package javaprogrammes;
/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        number();
    }

    public static void number() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.print("The number is positive ");
        } else if (number < 0) {
            System.out.print("The number is negative");
        } else {
            System.out.print("The number is zero");
            scanner.close();
        }
    }
}

