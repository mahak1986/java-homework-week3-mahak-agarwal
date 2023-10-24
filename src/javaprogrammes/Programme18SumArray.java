package javaprogrammes;

/**
 * Write a Java program to sum values of an array
 */
public class Programme18SumArray {
    public static void main(String[] args) {
        myMethod1();
    }

    public static void myMethod1() {
        //Declare an array with values
        int[] numericArray = {2, 5, 6, 8, 9};
        int sum = 0;
        for (int i = 0; i < numericArray.length; i++) {
            sum += numericArray[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
