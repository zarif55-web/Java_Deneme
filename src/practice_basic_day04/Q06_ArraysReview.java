package practice_basic_day04;

public class Q06_ArraysReview {

    /*
     * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
     * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.

     */

    public static void main(String[] args) {

        int arr1[] []= { {0,2,-1}, {3,8,9}, {7} };
        int arr2[] []={ {-7,6,-9}, {0,12}, {19} };

        int toplam =0;


        for (int[] w : arr1){
            for (int  m: w){

                toplam+=m;

            }
        }
        System.out.println("arr1 toplamı"+toplam);

        for (int[] w : arr2){
            for (int  m: w){

                toplam+=m;

            }
        }
        System.out.println("arr1 + arr2 toplamı = "+toplam);

    }
}
