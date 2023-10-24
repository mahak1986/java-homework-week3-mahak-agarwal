package javaprogrammes;
/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class Programme2LeapYear {

    public static void main(String[] args) {

        int year = 2020;
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;

        }
    }
}