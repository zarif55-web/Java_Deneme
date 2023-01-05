package practice_basic_day02;

public class Q12_StringManipulation06Review {
    public static void main(String[] args) {

        /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

          ORNEK:          INPUT     OUTPUT
                          goat        gat
                         photo        hoto
                         ghost        ghost
                         kalem        lem


		 */

        String klm= "kalem";

        if (klm.substring(0,2).equals("gh")) {
            System.out.println(klm);                                                     //( klm.substring(0,1).equals("g")) {

                                                                                    //System.out.println("g"+klm.substring(2));
        }else if (klm.substring(1,2).equals("h")){
            System.out.println(klm.substring(1));
        }else if ( klm.substring(0,1).equals("g")) {
            System.out.println("g"+klm.substring(2));
        }else {
            System.out.println(klm.substring(2));
        }



    }
}
