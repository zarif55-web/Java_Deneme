package practice_basic_day02;

import java.util.Scanner;

public class Q05_SwitchCase03Review {
    public static void main(String[] args) {

        // Girilen uc haneli bir sayının onlar basamağının değerini yazı ile yazdırınız.


        Scanner scan = new Scanner(System.in);
        System.out.println("loütfen 3 haneli bir sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi >99 && sayi <1000){

            int sayiYüzler = sayi/100;
            int sayiOnlar = sayi/10%10;
            int sayiBirler = sayi%10;

            switch (sayiYüzler) {
                case 1 :
                    System.out.print("1");
                    break;
                case 2 :
                    System.out.print("2");
                    break;
            }switch (sayiOnlar) {
                case 1 :
                    System.out.print("on");
                    break;
                case 2 :
                    System.out.print("yirmi ");
                    break;
            }switch (sayiBirler) {
                case 1 :
                    System.out.print("1");
                    break;
                case 2 :
                    System.out.print("2");
            }

        }



    }
}
