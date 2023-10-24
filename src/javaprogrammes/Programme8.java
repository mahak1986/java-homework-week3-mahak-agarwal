package javaprogrammes;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        city();
    }

    public static void city() {
        Scanner scanner = new Scanner(System.in);//Declare an object
        System.out.print("Enter an alphabet (A to F): "); //Entering alphabets A-F
        String Input = scanner.next();
        String cityName;
        if (Input == "A" || Input == "a") {
            cityName = "Acton";
        } else if (Input == "B" || Input == "b") {
            cityName = "Brighton";
        } else if (Input == "C" || Input == "c") {
            cityName = "Coventry";
        } else if (Input == "D" || Input == "D") {
            cityName = "Dundee";
        } else if (Input == "E" || Input == "e") {
            cityName = "Edinburgh";
        } else if (Input == "F" || Input == "f") {
            cityName = "Falcon";
        } else {
            cityName = "Invalid Entry";
        }

        System.out.println("City Name: " + cityName);
        scanner.close();
    }
}




