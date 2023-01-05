package practice_basic_day04;

public class Q09_ArraysReview {

    /*
     * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
     * yaziniz
     * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
     *
     * OUTPUT : Arraydeki cift sayilarin toplami : 30
     */
    public static void main(String[] args) {

        //Arraytoplama2D(int arr[][]);
        int arr [][] ={{1,3,6},{2,8},{5,7,9,14}};


        Arraytoplama2D(arr);

    }

    private static void Arraytoplama2D(int arr [][]) {

        int toplam =0;

        for ( int w[] : arr ) {
            for (int m : w) {
                if (m%2==0){
                    toplam +=m;
                }
            }
        }
        System.out.println(toplam);




    }
}
