package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysListReview {

    /*
     * Kullanicidan int  list uzunlugunu isteyin
     * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
     * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
     *
     * n = 5 icin (listin uzunlugu);
     * input { 1 , 2 , 2 , 3 , 4}
     * output {2}
     *
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("uzunluk?");
        int uzunluk = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("liste elemanları ekleyin");
        int i =0;
        do {
            list.add(scan.nextInt());
            i++;

        }while (i<uzunluk);
        System.out.println(list);


        tekrarlariYazdir(list);





    }

    private static void tekrarlariYazdir(List<Integer> list) {
        List<Integer> tekrarliList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)==list.get(j) && !tekrarliList.contains(list.get(i))) {
                    tekrarliList.add(list.get(i));


                }

            }

        }
        System.out.println(tekrarliList);


    }
}
