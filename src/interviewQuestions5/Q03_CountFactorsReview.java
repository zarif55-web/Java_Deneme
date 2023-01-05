package interviewQuestions5;

public class Q03_CountFactorsReview {


    /*
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
*/

    public static void main(String[] args) {

        int counter = 0;
        int sayi = 8;
        int baslangc =1;
        while (baslangc<=sayi){
            if (sayi%baslangc==0){
                counter++;
            }
            baslangc++;






        }
        System.out.println(counter);


    }




}
