package practice_basic_day03;

public class Q02_MethodCreation02Review {
    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {

        String str1 = "aabbcccccddddaaa";
        String str2 = "";

        System.out.println(birKereYazdir1(str1));

//        for (int i = 1; i < str1.length(); i++) {             //methodun içine atıyorum
//
//
//            if(!(str2.contains(str1.substring(i-1,i)))) {
//
//                str2 += str1.substring(i - 1, i);
//                //System.out.println(i);
//            }
//
//        }
//        System.out.println(str2);


    }




    private static String birKereYazdir1(String str1) {
        String str2="";

        for (int i = 1; i < str1.length(); i++) {


            if(!(str2.contains(str1.substring(i-1,i)))) {

                str2 += str1.substring(i - 1, i);
                //System.out.println(i);
            }

        }


        return str2;

    }
}
