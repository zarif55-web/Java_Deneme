package practice_basic_day04;

public class Q04_ArraysReview {

    /*
     * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
     * istenenToplam=9;
     */

    public static void main(String[] args) {

        int arr[] = {5,7,-6,4,2,15,3,8,1};

        for ( int j=0 ; j< arr.length ; j++) {
            for (int i = j+ 1; i < arr.length; i++) {
                if (arr[j]+arr[i]==9) {
                    System.out.println(arr[j]+" "+arr[i]);


                }

            }
        }


    }
}
