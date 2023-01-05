package practice_basic_day02;

import java.util.Scanner;

public class Q08_StringManipulation02Review {

    public static void main(String[] args) {



        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("1");
        String str1 = scan.next();
        System.out.println("2.");
        String str2 = scan.next();
        String result = str1.concat(str2);
        String result2 = str1.substring(1).concat(str2.substring(1));

        System.out.println(result);
        System.out.println(result2);
    }
}
