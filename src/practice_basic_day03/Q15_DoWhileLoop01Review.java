package practice_basic_day03;

import java.util.Scanner;

public class Q15_DoWhileLoop01Review {

    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String x= "x";


        do{
            System.out.println("giriş");
            x = scan.next().toLowerCase();
            if (!(x.equals("x"))) System.out.println("program çalışıyor");



        }while (!(x.equals("x")));
        System.out.println("program bitti");




    }
}
