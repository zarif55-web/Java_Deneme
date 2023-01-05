package interviewQuestions4;

import java.util.ArrayList;
import java.util.List;

public class Q02_CreateRandomListReview {

    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemanının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

    public static void main(String[] args) {


        List<Integer> randomList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
           int eklenecek = ((int)(Math.random()*20));
           if( eklenecek%2==0){
               System.out.print(eklenecek+" ");
               randomList.add(111);
           }else {
               System.out.print(eklenecek+" ");
               randomList.add(eklenecek);
           }

        }
        System.out.println(randomList);




    }
}
