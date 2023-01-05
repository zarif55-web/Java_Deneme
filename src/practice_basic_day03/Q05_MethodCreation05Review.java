package practice_basic_day03;

import java.util.Scanner;

public class Q05_MethodCreation05Review {

    /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("tamsayi");
        int tamSayi = scan.nextInt();

        fibonacci1(tamSayi);


//        int sayi1=0;                          //methodun içine atıyorum
//        int sayi2=1;
//
//        System.out.print("0-");
//        for (int i = 0; i < tamSayi-1; i++) {
//
//            int sayi=sayi1+sayi2;
//            System.out.print(sayi+"-");
//
//            sayi1=sayi2;
//            sayi2=sayi;
//            //System.out.print(sayi1+" "+sayi2);

//        }
    }

    private static void fibonacci1(int tamSayi) {

        int sayi1=0;
        int sayi2=1;

        System.out.print("0-");
        for (int i = 0; i < tamSayi-1; i++) {

            int sayi = sayi1 + sayi2;
            System.out.print(sayi + "-");

            sayi1 = sayi2;
            sayi2 = sayi;
            //System.out.print(sayi1+" "+sayi2);


        }



        }
}
