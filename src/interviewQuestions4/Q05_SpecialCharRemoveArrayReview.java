package interviewQuestions4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05_SpecialCharRemoveArrayReview {

    static List<String> stringList = new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
    static int toplam = 0;


    public static void main(String[] args) {

         /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */


        System.out.println(getSum1(stringList));


    }

    private static int getSum1(List<String> stringList) {




        for (String w : stringList) {
            w = w.replace("$", "");
            toplam += Integer.valueOf(w);


        }
        if (toplam < 0) {
            return -1;
        } else {


            return toplam;

        }


    }


}
