package javaprogrammes;

import java.util.Arrays;

public class Programme17NumericStringSort {
    /**
     *  * 17. Write a Java program to sort a numeric array and a string array.
     */


    public static void main(String[] args) {
        myMethod1();
    }

    public static void myMethod1() {
        int[] numericArray = {5, 2, 6, 1, 7};
        //Sorting the array in ascending order
        Arrays.sort(numericArray);
        //Printing the sorted array
        System.out.println("Sorted numeric array(Ascending): " + Arrays.toString(numericArray));
        String [] stringArray = {"Blue","Green","Red","Purple","Black"};
        //Sorting the array in ascending order
        Arrays.sort(stringArray);
        //Printing the sorted array
        System.out.println("Sorted string array(Ascending): " +Arrays.toString(stringArray));
    }

}


