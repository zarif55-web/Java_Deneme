package practice_basic_day02;

import java.util.Scanner;

public class Q07_StringManipulation01Review {


    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    // 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
    // 1.yol: concat() function ile concatenate string1 and string2
    // 2.yol: operator kullanarak concatenate string1 and string2
    // konsolda yazdiriniz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1.");
        String str1 = scan.next();
        System.out.println("2.");
        String str2 = scan.next();

        //String isimSoyisim = str1+ " " +str2; //Birinci yol
        String isimSoyisim = str1.concat(" ").concat(str2);
        System.out.println(isimSoyisim.toUpperCase());

    }


}
