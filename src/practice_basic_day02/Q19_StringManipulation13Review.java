package practice_basic_day02;

import java.util.Scanner;

public class Q19_StringManipulation13Review {
    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin


    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("kelime 4 karacter");
        String str = scann.next();
        String str1 ="";


        for (int i = 0; i < str.length(); i++) {
            str1= str1.concat(str.substring(str.length()-i-1,str.length()-i));
            //System.out.println(str1);


        }
        System.out.println(str1);




    }
}
