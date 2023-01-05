package practice_basic_day02;

import java.util.Locale;

public class Q16_StringManipulation10Review {

    public static void main(String[] args) {

        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.


        String str1 = "Java ogrenmek123 Cok guzel@";

        String str2 ="";
        str2 = str1.replaceAll("\\d","").replaceAll("\\p{Punct}","");
        System.out.println(str2);

        System.out.println(str2.substring(0,1).toUpperCase(Locale.ROOT)+ str2.toLowerCase(Locale.ROOT).substring(1));

    }
}
