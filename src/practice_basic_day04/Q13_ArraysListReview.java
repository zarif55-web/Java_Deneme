package practice_basic_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13_ArraysListReview {


    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */


    public static void main(String[] args) {

        int arr [] = {1,2,3,15,4,5,6,7,8};
        int n=2;

        List<Integer> newList = new ArrayList<>();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        while (n>0) {

            newList.add(arr[arr.length-n]);
            n--;


        }
        System.out.println(newList);







        }



    }

