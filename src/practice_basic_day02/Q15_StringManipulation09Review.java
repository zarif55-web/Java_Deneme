package practice_basic_day02;

import java.util.Scanner;

public class Q15_StringManipulation09Review {

    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("kelime");
        String klm = scan.next();


        if (klm.length()%2==1 && klm.length()>2){

            String ortaChar= klm.substring(klm.length()/2,klm.length()/2+1);
            System.out.println(ortaChar);
        }



    }


}
