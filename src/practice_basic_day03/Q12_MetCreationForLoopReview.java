package practice_basic_day03;

public class Q12_MetCreationForLoopReview {
    /* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */

    public static void main(String[] args) {

        String str= "asdf";
        System.out.println(reverseString1(str));




    }

    private static String reverseString1(String str) {
        String rStr ="";

        for (int i = 0; i < str.length(); i++) {

            rStr+=str.substring(str.length()-1,i);

        }
        return rStr;



    }
}
