package practice_basic_day04;

public class Q10_ArraysReview {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */

    public static void main(String[] args) {
        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        String strBosluksuz = str.replace(" ","");
        System.out.println(strBosluksuz.length());

    }
}
