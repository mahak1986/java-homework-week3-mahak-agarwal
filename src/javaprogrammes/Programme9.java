package javaprogrammes;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use switch)
 * if any other alphabet should be invalid entry
 */
public class Programme9 {
    public static void main(String[] args) {
        cityName();
    }

    public static void cityName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet (A to F): ");
        String alphabet = scanner.next().toUpperCase();
        String CityName;
        switch (alphabet) {
            case "A":
                System.out.print("CityName - Acton");
                break;
            case "B":
                System.out.print("CityName - Brighton");
                break;
            case "C":
                System.out.print("CityName - Coventry");
                break;
            case "D":
                System.out.print("CityName - Dundee");
                break;
            case "E":
                System.out.print("CityName - Edinburgh");
                break;
            case "F":
                System.out.print("CityName - Falcon");
                break;
            default:
                CityName = "Invalid entry";
                break;
        }
        scanner.close();
        }
    }

