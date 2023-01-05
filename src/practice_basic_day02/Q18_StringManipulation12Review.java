package practice_basic_day02;

import java.util.Scanner;

public class Q18_StringManipulation12Review {


    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("kelime");
        String str = scan.nextLine();

        System.out.println("bosluk karacteri var mı");
        System.out.println(str.contains(" "));

        System.out.println("girilen deger bos mu");
        System.out.println(str.isBlank());

    }
}
