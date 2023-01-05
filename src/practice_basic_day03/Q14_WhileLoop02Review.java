package practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02Review {


    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("sayi");
        int sayi = scan.nextInt();;


        for (int i = 0; i < sayi; i++) {
            if ( i%2==1) {
                System.out.print(i+ " ");
            }

        }
    }
}
