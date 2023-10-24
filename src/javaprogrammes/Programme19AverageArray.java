package javaprogrammes;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme19AverageArray {
    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        // Define an array of numbers
        double[] a = {2.2, 5.5, 7.6, 9.0, 3.6};
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        // Calculate the average
        double average = sum / a.length;
        // Display the average
        System.out.println("The average of array is: " + average);
    }

}

