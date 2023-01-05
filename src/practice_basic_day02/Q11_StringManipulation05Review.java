package practice_basic_day02;

import java.util.Scanner;

public class Q11_StringManipulation05Review {
    public static void main(String[] args) {


        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan = new Scanner(System.in);

        System.out.println(1);
        String kelime1 = scan.next();

        System.out.println(2);
        String kelime2 = scan.next();

        System.out.println(3);
        String kelime3 = scan.next();

        System.out.println(4);
        String kelime4 = scan.next();

        String cumle = kelime1.substring(0,1).toUpperCase()+kelime1.substring(1).toLowerCase()+" " + kelime2.toLowerCase()+
                " " + kelime3.toLowerCase()+" "+kelime4.toLowerCase()+".";
        System.out.println(cumle);




    }
}
