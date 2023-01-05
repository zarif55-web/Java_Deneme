package interviewQuestions4;

public class Q06_MultipleMethodVarargsReview {

    public static void main(String[] args) {

        /*
	Problem Tanımı :
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */


        System.out.println(ortala("ali", 12, 63, 80, 68, 45, 78));
        System.out.println(ortala("ali", 12, 63, 80, 68));
        System.out.println(ortala("ali", 10, 40, 10));
        System.out.println(ortala("ali", 12, 63, 80, 68, 45));

    }

    private static double ortala(String isim, int... notlar) {

        int toplam = 0;
        double ortala = 0;
        for (int w : notlar) {
            toplam += w;

        }
        ortala = toplam / notlar.length;

        return ortala;


    }
}


