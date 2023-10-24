package javaprogrammes;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme20SpecificValue {
    public static void main(String[] args) {
        //create integers for array
        int[] numbers = {1, 2, 3, 4, 5};
        int targetValue = 4;
        if (myMethod(numbers, targetValue)) {
            //print the result
            System.out.println("The array contains the target value: " + targetValue);
        } else {
            System.out.println("The array does not contain the target value: " + targetValue);
        }
    }

    public static boolean myMethod(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }
    }



