package practice_basic_day02;

import java.util.Scanner;

public class Q13_StringManipulation07Review {

    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("kelime");
        String str = scan.next();


            System.out.println(str.contains("xyz"));



    }
}
