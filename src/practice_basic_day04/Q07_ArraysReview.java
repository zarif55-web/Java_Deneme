package practice_basic_day04;

import java.util.Arrays;

public class Q07_ArraysReview {


    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D arrayinden min number print et
     */

    public static void main(String[] args) {


        int arr [][] = {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int min =Integer.MAX_VALUE;


        for ( int w[] : arr) {
            Arrays.sort(w);
            if (w[0]<min){
                min = w[0];
            }

        }
        System.out.println(min);
    }
}
