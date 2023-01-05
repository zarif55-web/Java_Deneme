package interviewQuestions7;

import java.util.Arrays;
import java.util.Random;

public class Q04_CreateMethodWithArrayReview {

    //    ||This Part Should be in Main Method||
    //
    //     -Create an array of size 5, assign some random values from 0 to 10
    //     -(use random class and for loop to assign values)
    //
    //
    //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
    //
    //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
    //     -2-Create a method that prints the sum of an array
    //     -3-Create a method that prints the max element of an array
    //
    //    P.S: Return type should be void because we are not returning anything just printing

    public static void main(String[] args) {
        int arr[] = new int[5];
        Random rnd = new Random();
        arr[0] = rnd.nextInt(10);
        arr[1] = rnd.nextInt(10);
        arr[2] = rnd.nextInt(10);
        arr[3] = rnd.nextInt(10);
        arr[4] = rnd.nextInt(10);
        System.out.println(Arrays.toString(arr));

        pringArr(arr);
        sumArr(arr);
        maxElmnt(arr);
    }

    private static void maxElmnt(int[] arr) {
        System.out.println(Arrays.stream(arr).max());
    }

    private static void sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("\nsum =" + sum);
    }

    private static void pringArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
