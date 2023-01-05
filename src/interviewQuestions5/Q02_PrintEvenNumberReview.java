package interviewQuestions5;

import java.util.Scanner;

public class Q02_PrintEvenNumberReview {


     /*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    */


    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int n=scan.nextInt();

        System.out.println(isEven1(n));


    }

    private static String isEven1(int n) {
        if (n%2==0){
            return "even";
        }else return "add";



    }
}
