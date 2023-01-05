package practice_basic_day02;

import java.util.Scanner;

public class Q01_NestedTernaryReview {

    public static void main(String[] args) {

        /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */


        Scanner scan = new Scanner(System.in);
        System.out.println("yaş");
        int age = scan.nextInt();


        if ( age<=18 && age>=0){
            System.out.println("oy kulanmaya uygun degil");
        }else if ( age>=18 && age<50 ) {
            System.out.println("bir kez oy kullanabilir");
        }
        else if ( age>=50 && age<70 ) {
            System.out.println("iki kez oy kullanabilir");
        }else if ( age>=70 ) {
            System.out.println("uc kez oy kullanabilir");
        }else {
            System.out.println("lütfen bir yaş giriniz");
        }
    }

}
