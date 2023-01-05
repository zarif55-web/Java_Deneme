package practice_basic_day04;

public class Q05_ArraysReview {

     /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
     public static void main(String[] args) {
         int arr [] = {1,5,-3,8,6,13,8,15};
         int sayiAdeti = 0;

         for ( int w : arr) {
             if(w%3==0) {
                 System.out.println(w);
                 sayiAdeti++;
             }
         }
         System.out.println("kaç tanesi bölünebilyor = "+sayiAdeti);





     }



}
