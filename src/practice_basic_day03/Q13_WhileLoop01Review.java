package practice_basic_day03;

import java.util.Scanner;

public class Q13_WhileLoop01Review {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayii");
        int sayi = scan.nextInt();

        int n = sayi;
        int  toplam =0;


        while (n>0) {

            toplam+=n%10;
            n/=10;


        }
        System.out.println(toplam);








    }

}
