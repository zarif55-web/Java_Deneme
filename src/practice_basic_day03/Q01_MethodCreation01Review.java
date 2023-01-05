package practice_basic_day03;

import java.util.Scanner;

public class Q01_MethodCreation01Review {

    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayi");
        double sayi1 = scan.nextDouble();
        System.out.println("2.sayi");
        double sayi2 = scan.nextDouble();
        System.out.println("islemi giriniz + - * /" );
        String islem = scan.next();


        switch (islem ) {
            case "+" :
                System.out.println(sayi1+sayi2);
                break;
            case "-" :
                System.out.println(sayi1-sayi2);
                break;
            case "*" :
                System.out.println(sayi1*sayi2);
                break;
            case "/" :
                System.out.println(sayi1/sayi2);
                break;
        }


    }
}
