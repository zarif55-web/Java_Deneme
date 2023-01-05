package practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11Review {

    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Isim");
        String name =scan.next();
        System.out.println("Soyisim");
        String surname = scan.next();

        if (name.length()>surname.length()){
            System.out.println( "isminiz soyisminizden daha uzun");
        }else if (name.length()<surname.length()){
            System.out.println("soyisminiz isminizden daha uzun");
        }else {
            System.out.println("isminiz ve soy isminiz aynı uzunlukta" );
        }


    }
}
