package practice_basic_day02;

import java.util.Scanner;

public class Q10_StringManipulation04Review {
    public static void main(String[] args) {


    /*
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    Scanner scan= new Scanner(System.in);
        System.out.println("kelime");
        String kelime = scan.next();


        if (kelime.length()>2){
            for (int i = 0; i < 3; i++) {
                System.out.print(kelime.substring(kelime.length()-2));

            }
        }else {
            System.out.println(kelime);
        }








    }



}
